/*
 *
 *  * Copyright (C) 2015 Square, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.lark.oapi.okhttp.internal.ws;

import com.lark.oapi.okio.Buffer;
import com.lark.oapi.okio.ByteString;

public final class WebSocketProtocol {

    /**
     * Magic value which must be appended to the key in a response header.
     */
    static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

  /*
  Each frame starts with two bytes of data.

   0 1 2 3 4 5 6 7    0 1 2 3 4 5 6 7
  +-+-+-+-+-------+  +-+-------------+
  |F|R|R|R| OP    |  |M| LENGTH      |
  |I|S|S|S| CODE  |  |A|             |
  |N|V|V|V|       |  |S|             |
  | |1|2|3|       |  |K|             |
  +-+-+-+-+-------+  +-+-------------+
  */

    /**
     * Byte 0 flag for whether this is the final fragment in a message.
     */
    static final int B0_FLAG_FIN = 0b10000000;
    /**
     * Byte 0 reserved flag 1. Must be 0 unless negotiated otherwise.
     */
    static final int B0_FLAG_RSV1 = 0b01000000;
    /**
     * Byte 0 reserved flag 2. Must be 0 unless negotiated otherwise.
     */
    static final int B0_FLAG_RSV2 = 0b00100000;
    /**
     * Byte 0 reserved flag 3. Must be 0 unless negotiated otherwise.
     */
    static final int B0_FLAG_RSV3 = 0b00010000;
    /**
     * Byte 0 mask for the frame opcode.
     */
    static final int B0_MASK_OPCODE = 0b00001111;
    /**
     * Flag in the opcode which indicates a control frame.
     */
    static final int OPCODE_FLAG_CONTROL = 0b00001000;

    /**
     * Byte 1 flag for whether the payload data is masked. <p> If this flag is set, the next four
     * bytes represent the mask key. These bytes appear after any additional bytes specified by {@link
     * #B1_MASK_LENGTH}.
     */
    static final int B1_FLAG_MASK = 0b10000000;
    /**
     * Byte 1 mask for the payload length. <p> If this value is {@link #PAYLOAD_SHORT}, the next two
     * bytes represent the length. If this value is {@link #PAYLOAD_LONG}, the next eight bytes
     * represent the length.
     */
    static final int B1_MASK_LENGTH = 0b01111111;

    static final int OPCODE_CONTINUATION = 0x0;
    static final int OPCODE_TEXT = 0x1;
    static final int OPCODE_BINARY = 0x2;

    static final int OPCODE_CONTROL_CLOSE = 0x8;
    static final int OPCODE_CONTROL_PING = 0x9;
    static final int OPCODE_CONTROL_PONG = 0xa;

    /**
     * Maximum length of frame payload. Larger payloads, if supported by the frame type, can use the
     * special values {@link #PAYLOAD_SHORT} or {@link #PAYLOAD_LONG}.
     */
    static final long PAYLOAD_BYTE_MAX = 125L;
    /**
     * Maximum length of close message in bytes.
     */
    static final long CLOSE_MESSAGE_MAX = PAYLOAD_BYTE_MAX - 2;
    /**
     * Value for {@link #B1_MASK_LENGTH} which indicates the next two bytes are the unsigned length.
     */
    static final int PAYLOAD_SHORT = 126;
    /**
     * Maximum length of a frame payload to be denoted as {@link #PAYLOAD_SHORT}.
     */
    static final long PAYLOAD_SHORT_MAX = 0xffffL;
    /**
     * Value for {@link #B1_MASK_LENGTH} which indicates the next eight bytes are the unsigned
     * length.
     */
    static final int PAYLOAD_LONG = 127;

    /**
     * Used when an unchecked exception was thrown in a listener.
     */
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    /**
     * Used when an empty close frame was received (i.e., without a status code).
     */
    static final int CLOSE_NO_STATUS_CODE = 1005;

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    static void toggleMask(Buffer.UnsafeCursor cursor, byte[] key) {
        int keyIndex = 0;
        int keyLength = key.length;
        do {
            byte[] buffer = cursor.data;
            for (int i = cursor.start, end = cursor.end; i < end; i++, keyIndex++) {
                keyIndex %= keyLength; // Reassign to prevent overflow breaking counter.
                buffer[i] = (byte) (buffer[i] ^ key[keyIndex]);
            }
        } while (cursor.next() != -1);
    }

    static String closeCodeExceptionMessage(int code) {
        if (code < 1000 || code >= 5000) {
            return "Code must be in range [1000,5000): " + code;
        } else if ((code >= 1004 && code <= 1006) || (code >= 1012 && code <= 2999)) {
            return "Code " + code + " is reserved and may not be used.";
        } else {
            return null;
        }
    }

    static void validateCloseCode(int code) {
        String message = closeCodeExceptionMessage(code);
        if (message != null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static String acceptHeader(String key) {
        return ByteString.encodeUtf8(key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
    }
}
