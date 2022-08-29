// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.speech_to_text.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.speech_to_text.v1.model.FileRecognizeSpeechReq;
import com.lark.oapi.service.speech_to_text.v1.model.FileRecognizeSpeechResp;
import com.lark.oapi.service.speech_to_text.v1.model.StreamRecognizeSpeechReq;
import com.lark.oapi.service.speech_to_text.v1.model.StreamRecognizeSpeechResp;

public class SpeechToTextService {

  private final Speech speech; // 语音识别

  public SpeechToTextService(Config config) {
    this.speech = new Speech(config);
  }

  /**
   * 语音识别
   *
   * @return
   */
  public Speech speech() {
    return speech;
  }

  public static class Speech {

    private final Config config;

    public Speech(Config config) {
      this.config = config;
    }

    /**
     * 语音文件识别 (ASR)，语音文件识别接口，上传整段语音文件进行一次性识别。接口适合 60 秒以内音频识别
     * <p> 单租户限流：20QPS，同租户下的应用没有限流，共享本租户的 20QPS 限流 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/file_recognize">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/file_recognize</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//FileRecognizeSpeechSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//FileRecognizeSpeechSample.java</a>
     * ;
     */
    public FileRecognizeSpeechResp fileRecognize(FileRecognizeSpeechReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/speech_to_text/v1/speech/file_recognize"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      FileRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          FileRecognizeSpeechResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 语音文件识别 (ASR)，语音文件识别接口，上传整段语音文件进行一次性识别。接口适合 60 秒以内音频识别
     * <p> 单租户限流：20QPS，同租户下的应用没有限流，共享本租户的 20QPS 限流 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/file_recognize">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/file_recognize</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//FileRecognizeSpeechSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//FileRecognizeSpeechSample.java</a>
     * ;
     */
    public FileRecognizeSpeechResp fileRecognize(FileRecognizeSpeechReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/speech_to_text/v1/speech/file_recognize"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      FileRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          FileRecognizeSpeechResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 语音流式识别 (ASR)，语音流式接口，将整个音频文件分片进行传入模型。能够实时返回数据。建议每个音频分片的大小为 100-200ms
     * <p> 单租户限流：20 路（一个 stream_id 称为一路会话），同租户下的应用没有限流，共享本租户的 20路限流 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/stream_recognize">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/stream_recognize</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//StreamRecognizeSpeechSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//StreamRecognizeSpeechSample.java</a>
     * ;
     */
    public StreamRecognizeSpeechResp streamRecognize(StreamRecognizeSpeechReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/speech_to_text/v1/speech/stream_recognize"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      StreamRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StreamRecognizeSpeechResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 语音流式识别 (ASR)，语音流式接口，将整个音频文件分片进行传入模型。能够实时返回数据。建议每个音频分片的大小为 100-200ms
     * <p> 单租户限流：20 路（一个 stream_id 称为一路会话），同租户下的应用没有限流，共享本租户的 20路限流 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/stream_recognize">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/ai/speech_to_text-v1/speech/stream_recognize</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//StreamRecognizeSpeechSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/speech_to_textv1//StreamRecognizeSpeechSample.java</a>
     * ;
     */
    public StreamRecognizeSpeechResp streamRecognize(StreamRecognizeSpeechReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/speech_to_text/v1/speech/stream_recognize"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      StreamRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StreamRecognizeSpeechResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

}