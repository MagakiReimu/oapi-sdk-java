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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2FilePermissionMemberRemovedV1Data {

  @SerializedName("file_type")
  private String fileType;
  @SerializedName("file_token")
  private String fileToken;
  @SerializedName("operator_id")
  private UserId operatorId;
  @SerializedName("user_list")
  private UserId[] userList;
  @SerializedName("chat_list")
  private String[] chatList;
  @SerializedName("open_department_id_list")
  private String[] openDepartmentIdList;
  @SerializedName("subscriber_id_list")
  private UserId[] subscriberIdList;

  public String getFileType() {
    return this.fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getFileToken() {
    return this.fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public UserId getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(UserId operatorId) {
    this.operatorId = operatorId;
  }

  public UserId[] getUserList() {
    return this.userList;
  }

  public void setUserList(UserId[] userList) {
    this.userList = userList;
  }

  public String[] getChatList() {
    return this.chatList;
  }

  public void setChatList(String[] chatList) {
    this.chatList = chatList;
  }

  public String[] getOpenDepartmentIdList() {
    return this.openDepartmentIdList;
  }

  public void setOpenDepartmentIdList(String[] openDepartmentIdList) {
    this.openDepartmentIdList = openDepartmentIdList;
  }

  public UserId[] getSubscriberIdList() {
    return this.subscriberIdList;
  }

  public void setSubscriberIdList(UserId[] subscriberIdList) {
    this.subscriberIdList = subscriberIdList;
  }

}
