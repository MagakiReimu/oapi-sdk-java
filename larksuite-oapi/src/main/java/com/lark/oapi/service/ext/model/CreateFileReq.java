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

package com.lark.oapi.service.ext.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CreateFileReq {

  @Path
  @SerializedName("folderToken")
  private String folderToken;

  @Body
  @SerializedName("body")
  private CreateFileReqBody body;

  private CreateFileReq(Builder builder) {
    folderToken = builder.folderToken;
    body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static final class Builder {

    private String folderToken;
    private CreateFileReqBody body;

    private Builder() {
    }

    public Builder folderToken(String folderToken) {
      this.folderToken = folderToken;
      return this;
    }

    public Builder body(CreateFileReqBody body) {
      this.body = body;
      return this;
    }

    public CreateFileReq build() {
      return new CreateFileReq(this);
    }
  }
}
