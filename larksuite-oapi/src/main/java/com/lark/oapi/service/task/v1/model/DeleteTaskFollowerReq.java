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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class DeleteTaskFollowerReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 任务 ID
   * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
   */
  @Path
  @SerializedName("task_id")
  private String taskId;
  /**
   * 任务关注人 ID（Open ID或User ID，由user_id_type指定）
   * <p> 示例值：ou_87e1a581b36ecc4862cbfbce473f346a
   */
  @Path
  @SerializedName("follower_id")
  private String followerId;

  // builder 开始
  public DeleteTaskFollowerReq() {
  }
  public DeleteTaskFollowerReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 任务 ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    this.taskId = builder.taskId;
    /**
     * 任务关注人 ID（Open ID或User ID，由user_id_type指定）
     * <p> 示例值：ou_87e1a581b36ecc4862cbfbce473f346a
     */
    this.followerId = builder.followerId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getFollowerId() {
    return this.followerId;
  }

  public void setFollowerId(String followerId) {
    this.followerId = followerId;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private String taskId; // 任务 ID
    private String followerId; // 任务关注人 ID（Open ID或User ID，由user_id_type指定）

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.task.v1.enums.DeleteTaskFollowerUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.task.v1.enums.DeleteTaskFollowerUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 任务 ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     *
     * @param taskId
     * @return
     */
    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }


    /**
     * 任务关注人 ID（Open ID或User ID，由user_id_type指定）
     * <p> 示例值：ou_87e1a581b36ecc4862cbfbce473f346a
     *
     * @param followerId
     * @return
     */
    public Builder followerId(String followerId) {
      this.followerId = followerId;
      return this;
    }

    public DeleteTaskFollowerReq build() {
      return new DeleteTaskFollowerReq(this);
    }
  }
}
