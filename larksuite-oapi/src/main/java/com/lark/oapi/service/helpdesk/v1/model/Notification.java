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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;

public class Notification {

  /**
   * 非必填，创建成功后返回
   * <p> 示例值：6981801914270744596
   */
  @SerializedName("id")
  private String id;
  /**
   * 必填，任务名称
   * <p> 示例值：测试推送任务
   */
  @SerializedName("job_name")
  private String jobName;
  /**
   * 非必填，创建成功后返回
   * <p> 示例值：0
   */
  @SerializedName("status")
  private Integer status;
  /**
   * 非必填，创建人
   * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
   */
  @SerializedName("create_user")
  private NotificationUser createUser;
  /**
   * 非必填，创建时间（毫秒时间戳）
   * <p> 示例值：1626332244719
   */
  @SerializedName("created_at")
  private String createdAt;
  /**
   * 非必填，更新用户
   * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
   */
  @SerializedName("update_user")
  private NotificationUser updateUser;
  /**
   * 非必填，更新时间（毫秒时间戳）
   * <p> 示例值：1626332244719
   */
  @SerializedName("updated_at")
  private String updatedAt;
  /**
   * 非必填，目标推送用户总数
   * <p> 示例值：1
   */
  @SerializedName("target_user_count")
  private Integer targetUserCount;
  /**
   * 非必填，已推送用户总数
   * <p> 示例值：1
   */
  @SerializedName("sent_user_count")
  private Integer sentUserCount;
  /**
   * 非必填，已读用户总数
   * <p> 示例值：1
   */
  @SerializedName("read_user_count")
  private Integer readUserCount;
  /**
   * 非必填，推送任务触发时间（毫秒时间戳）
   * <p> 示例值：1626332244719
   */
  @SerializedName("send_at")
  private String sendAt;
  /**
   * 必填，推送内容，详见：https://open.feishu.cn/tool/cardbuilder?from=howtoguide
   * <p> 示例值：{   \"config\": {     \"wide_screen_mode\": true   },   \"elements\": [     {
   * \"tag\": \"div\",       \"text\": {         \"tag\": \"lark_md\",         \"content\":
   * \"[飞书](https://www.feishu.cn)整合即时沟通、日历、音视频会议、云文档、云盘、工作台等功能于一体，成就组织和个人，更高效、更愉悦。\"       }     }
   * ] }
   */
  @SerializedName("push_content")
  private String pushContent;
  /**
   * 必填，;0（定时推送：push_scope不能等于3） 1（新人入职推送：push_scope必须等于1或者3；new_staff_scope_type不能为空）
   * <p> 示例值：0
   */
  @SerializedName("push_type")
  private Integer pushType;
  /**
   * 必填，;推送范围（服务台私信） 0：组织内全部成员（user_list和department_list必须为空） 1：不推送任何成员（user_list和department_list必须为空，chat_list不可为空）
   * 2：推送到部分成员（user_list或department_list不能为空） 3：入职新人 以上四种状态，chat_list都相对独立，只有在推送范围为1时，必须需要设置chat_list
   * <p> 示例值：0
   */
  @SerializedName("push_scope_type")
  private Integer pushScopeType;
  /**
   * 非必填，;新人入职范围类型（push_type为1时生效） 0：组织内所有新人 1：组织内特定的部门（new_staff_scope_department_list 字段不能为空）
   * <p> 示例值：0
   */
  @SerializedName("new_staff_scope_type")
  private Integer newStaffScopeType;
  /**
   * 非必填，新人入职生效部门列表
   * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
   */
  @SerializedName("new_staff_scope_department_list")
  private NotificationDepartment[] newStaffScopeDepartmentList;
  /**
   * 非必填，push推送到成员列表
   * <p> 示例值：[{"user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}]
   */
  @SerializedName("user_list")
  private NotificationUser[] userList;
  /**
   * 非必填，push推送到的部门信息列表
   * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
   */
  @SerializedName("department_list")
  private NotificationDepartment[] departmentList;
  /**
   * 非必填，push推送到的会话列表(群)
   * <p> 示例值：[{"chat_id":"oc_7c1a2815c9846b5e518b950de0e62de8"}]
   */
  @SerializedName("chat_list")
  private NotificationChat[] chatList;
  /**
   * 非必填，预留扩展字段
   * <p> 示例值：{}
   */
  @SerializedName("ext")
  private String ext;

  // builder 开始
  public Notification() {
  }

  public Notification(Builder builder) {
    /**
     * 非必填，创建成功后返回
     * <p> 示例值：6981801914270744596
     */
    this.id = builder.id;
    /**
     * 必填，任务名称
     * <p> 示例值：测试推送任务
     */
    this.jobName = builder.jobName;
    /**
     * 非必填，创建成功后返回
     * <p> 示例值：0
     */
    this.status = builder.status;
    /**
     * 非必填，创建人
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     */
    this.createUser = builder.createUser;
    /**
     * 非必填，创建时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    this.createdAt = builder.createdAt;
    /**
     * 非必填，更新用户
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     */
    this.updateUser = builder.updateUser;
    /**
     * 非必填，更新时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    this.updatedAt = builder.updatedAt;
    /**
     * 非必填，目标推送用户总数
     * <p> 示例值：1
     */
    this.targetUserCount = builder.targetUserCount;
    /**
     * 非必填，已推送用户总数
     * <p> 示例值：1
     */
    this.sentUserCount = builder.sentUserCount;
    /**
     * 非必填，已读用户总数
     * <p> 示例值：1
     */
    this.readUserCount = builder.readUserCount;
    /**
     * 非必填，推送任务触发时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    this.sendAt = builder.sendAt;
    /**
     * 必填，推送内容，详见：https://open.feishu.cn/tool/cardbuilder?from=howtoguide
     * <p> 示例值：{   \"config\": {     \"wide_screen_mode\": true   },   \"elements\": [     {       \"tag\": \"div\",       \"text\": {         \"tag\": \"lark_md\",         \"content\": \"[飞书](https://www.feishu.cn)整合即时沟通、日历、音视频会议、云文档、云盘、工作台等功能于一体，成就组织和个人，更高效、更愉悦。\"       }     }   ] }
     */
    this.pushContent = builder.pushContent;
    /**
     * 必填，;0（定时推送：push_scope不能等于3） 1（新人入职推送：push_scope必须等于1或者3；new_staff_scope_type不能为空）
     * <p> 示例值：0
     */
    this.pushType = builder.pushType;
    /**
     * 必填，;推送范围（服务台私信） 0：组织内全部成员（user_list和department_list必须为空） 1：不推送任何成员（user_list和department_list必须为空，chat_list不可为空） 2：推送到部分成员（user_list或department_list不能为空） 3：入职新人 以上四种状态，chat_list都相对独立，只有在推送范围为1时，必须需要设置chat_list
     * <p> 示例值：0
     */
    this.pushScopeType = builder.pushScopeType;
    /**
     * 非必填，;新人入职范围类型（push_type为1时生效） 0：组织内所有新人 1：组织内特定的部门（new_staff_scope_department_list 字段不能为空）
     * <p> 示例值：0
     */
    this.newStaffScopeType = builder.newStaffScopeType;
    /**
     * 非必填，新人入职生效部门列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    this.newStaffScopeDepartmentList = builder.newStaffScopeDepartmentList;
    /**
     * 非必填，push推送到成员列表
     * <p> 示例值：[{"user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}]
     */
    this.userList = builder.userList;
    /**
     * 非必填，push推送到的部门信息列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    this.departmentList = builder.departmentList;
    /**
     * 非必填，push推送到的会话列表(群)
     * <p> 示例值：[{"chat_id":"oc_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    this.chatList = builder.chatList;
    /**
     * 非必填，预留扩展字段
     * <p> 示例值：{}
     */
    this.ext = builder.ext;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getJobName() {
    return this.jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public NotificationUser getCreateUser() {
    return this.createUser;
  }

  public void setCreateUser(NotificationUser createUser) {
    this.createUser = createUser;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NotificationUser getUpdateUser() {
    return this.updateUser;
  }

  public void setUpdateUser(NotificationUser updateUser) {
    this.updateUser = updateUser;
  }

  public String getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getTargetUserCount() {
    return this.targetUserCount;
  }

  public void setTargetUserCount(Integer targetUserCount) {
    this.targetUserCount = targetUserCount;
  }

  public Integer getSentUserCount() {
    return this.sentUserCount;
  }

  public void setSentUserCount(Integer sentUserCount) {
    this.sentUserCount = sentUserCount;
  }

  public Integer getReadUserCount() {
    return this.readUserCount;
  }

  public void setReadUserCount(Integer readUserCount) {
    this.readUserCount = readUserCount;
  }

  public String getSendAt() {
    return this.sendAt;
  }

  public void setSendAt(String sendAt) {
    this.sendAt = sendAt;
  }

  public String getPushContent() {
    return this.pushContent;
  }

  public void setPushContent(String pushContent) {
    this.pushContent = pushContent;
  }

  public Integer getPushType() {
    return this.pushType;
  }

  public void setPushType(Integer pushType) {
    this.pushType = pushType;
  }

  public Integer getPushScopeType() {
    return this.pushScopeType;
  }

  public void setPushScopeType(Integer pushScopeType) {
    this.pushScopeType = pushScopeType;
  }

  public Integer getNewStaffScopeType() {
    return this.newStaffScopeType;
  }

  public void setNewStaffScopeType(Integer newStaffScopeType) {
    this.newStaffScopeType = newStaffScopeType;
  }

  public NotificationDepartment[] getNewStaffScopeDepartmentList() {
    return this.newStaffScopeDepartmentList;
  }

  public void setNewStaffScopeDepartmentList(NotificationDepartment[] newStaffScopeDepartmentList) {
    this.newStaffScopeDepartmentList = newStaffScopeDepartmentList;
  }

  public NotificationUser[] getUserList() {
    return this.userList;
  }

  public void setUserList(NotificationUser[] userList) {
    this.userList = userList;
  }

  public NotificationDepartment[] getDepartmentList() {
    return this.departmentList;
  }

  public void setDepartmentList(NotificationDepartment[] departmentList) {
    this.departmentList = departmentList;
  }

  public NotificationChat[] getChatList() {
    return this.chatList;
  }

  public void setChatList(NotificationChat[] chatList) {
    this.chatList = chatList;
  }

  public String getExt() {
    return this.ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public static class Builder {

    /**
     * 非必填，创建成功后返回
     * <p> 示例值：6981801914270744596
     */
    private String id;
    /**
     * 必填，任务名称
     * <p> 示例值：测试推送任务
     */
    private String jobName;
    /**
     * 非必填，创建成功后返回
     * <p> 示例值：0
     */
    private Integer status;
    /**
     * 非必填，创建人
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     */
    private NotificationUser createUser;
    /**
     * 非必填，创建时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    private String createdAt;
    /**
     * 非必填，更新用户
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     */
    private NotificationUser updateUser;
    /**
     * 非必填，更新时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    private String updatedAt;
    /**
     * 非必填，目标推送用户总数
     * <p> 示例值：1
     */
    private Integer targetUserCount;
    /**
     * 非必填，已推送用户总数
     * <p> 示例值：1
     */
    private Integer sentUserCount;
    /**
     * 非必填，已读用户总数
     * <p> 示例值：1
     */
    private Integer readUserCount;
    /**
     * 非必填，推送任务触发时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     */
    private String sendAt;
    /**
     * 必填，推送内容，详见：https://open.feishu.cn/tool/cardbuilder?from=howtoguide
     * <p> 示例值：{   \"config\": {     \"wide_screen_mode\": true   },   \"elements\": [     {
     * \"tag\": \"div\",       \"text\": {         \"tag\": \"lark_md\",         \"content\":
     * \"[飞书](https://www.feishu.cn)整合即时沟通、日历、音视频会议、云文档、云盘、工作台等功能于一体，成就组织和个人，更高效、更愉悦。\"       }
     * }   ] }
     */
    private String pushContent;
    /**
     * 必填，;0（定时推送：push_scope不能等于3） 1（新人入职推送：push_scope必须等于1或者3；new_staff_scope_type不能为空）
     * <p> 示例值：0
     */
    private Integer pushType;
    /**
     * 必填，;推送范围（服务台私信） 0：组织内全部成员（user_list和department_list必须为空） 1：不推送任何成员（user_list和department_list必须为空，chat_list不可为空）
     * 2：推送到部分成员（user_list或department_list不能为空） 3：入职新人 以上四种状态，chat_list都相对独立，只有在推送范围为1时，必须需要设置chat_list
     * <p> 示例值：0
     */
    private Integer pushScopeType;
    /**
     * 非必填，;新人入职范围类型（push_type为1时生效） 0：组织内所有新人 1：组织内特定的部门（new_staff_scope_department_list 字段不能为空）
     * <p> 示例值：0
     */
    private Integer newStaffScopeType;
    /**
     * 非必填，新人入职生效部门列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    private NotificationDepartment[] newStaffScopeDepartmentList;
    /**
     * 非必填，push推送到成员列表
     * <p> 示例值：[{"user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}]
     */
    private NotificationUser[] userList;
    /**
     * 非必填，push推送到的部门信息列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    private NotificationDepartment[] departmentList;
    /**
     * 非必填，push推送到的会话列表(群)
     * <p> 示例值：[{"chat_id":"oc_7c1a2815c9846b5e518b950de0e62de8"}]
     */
    private NotificationChat[] chatList;
    /**
     * 非必填，预留扩展字段
     * <p> 示例值：{}
     */
    private String ext;

    /**
     * 非必填，创建成功后返回
     * <p> 示例值：6981801914270744596
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 必填，任务名称
     * <p> 示例值：测试推送任务
     *
     * @param jobName
     * @return
     */
    public Builder jobName(String jobName) {
      this.jobName = jobName;
      return this;
    }


    /**
     * 非必填，创建成功后返回
     * <p> 示例值：0
     *
     * @param status
     * @return
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }


    /**
     * 非必填，创建人
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     *
     * @param createUser
     * @return
     */
    public Builder createUser(NotificationUser createUser) {
      this.createUser = createUser;
      return this;
    }


    /**
     * 非必填，创建时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     *
     * @param createdAt
     * @return
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    /**
     * 非必填，更新用户
     * <p> 示例值：{"avatar_url":"","name":"","user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}
     *
     * @param updateUser
     * @return
     */
    public Builder updateUser(NotificationUser updateUser) {
      this.updateUser = updateUser;
      return this;
    }


    /**
     * 非必填，更新时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     *
     * @param updatedAt
     * @return
     */
    public Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }


    /**
     * 非必填，目标推送用户总数
     * <p> 示例值：1
     *
     * @param targetUserCount
     * @return
     */
    public Builder targetUserCount(Integer targetUserCount) {
      this.targetUserCount = targetUserCount;
      return this;
    }


    /**
     * 非必填，已推送用户总数
     * <p> 示例值：1
     *
     * @param sentUserCount
     * @return
     */
    public Builder sentUserCount(Integer sentUserCount) {
      this.sentUserCount = sentUserCount;
      return this;
    }


    /**
     * 非必填，已读用户总数
     * <p> 示例值：1
     *
     * @param readUserCount
     * @return
     */
    public Builder readUserCount(Integer readUserCount) {
      this.readUserCount = readUserCount;
      return this;
    }


    /**
     * 非必填，推送任务触发时间（毫秒时间戳）
     * <p> 示例值：1626332244719
     *
     * @param sendAt
     * @return
     */
    public Builder sendAt(String sendAt) {
      this.sendAt = sendAt;
      return this;
    }


    /**
     * 必填，推送内容，详见：https://open.feishu.cn/tool/cardbuilder?from=howtoguide
     * <p> 示例值：{   \"config\": {     \"wide_screen_mode\": true   },   \"elements\": [     {
     * \"tag\": \"div\",       \"text\": {         \"tag\": \"lark_md\",         \"content\":
     * \"[飞书](https://www.feishu.cn)整合即时沟通、日历、音视频会议、云文档、云盘、工作台等功能于一体，成就组织和个人，更高效、更愉悦。\"       }
     * }   ] }
     *
     * @param pushContent
     * @return
     */
    public Builder pushContent(String pushContent) {
      this.pushContent = pushContent;
      return this;
    }


    /**
     * 必填，;0（定时推送：push_scope不能等于3） 1（新人入职推送：push_scope必须等于1或者3；new_staff_scope_type不能为空）
     * <p> 示例值：0
     *
     * @param pushType
     * @return
     */
    public Builder pushType(Integer pushType) {
      this.pushType = pushType;
      return this;
    }


    /**
     * 必填，;推送范围（服务台私信） 0：组织内全部成员（user_list和department_list必须为空） 1：不推送任何成员（user_list和department_list必须为空，chat_list不可为空）
     * 2：推送到部分成员（user_list或department_list不能为空） 3：入职新人 以上四种状态，chat_list都相对独立，只有在推送范围为1时，必须需要设置chat_list
     * <p> 示例值：0
     *
     * @param pushScopeType
     * @return
     */
    public Builder pushScopeType(Integer pushScopeType) {
      this.pushScopeType = pushScopeType;
      return this;
    }


    /**
     * 非必填，;新人入职范围类型（push_type为1时生效） 0：组织内所有新人 1：组织内特定的部门（new_staff_scope_department_list 字段不能为空）
     * <p> 示例值：0
     *
     * @param newStaffScopeType
     * @return
     */
    public Builder newStaffScopeType(Integer newStaffScopeType) {
      this.newStaffScopeType = newStaffScopeType;
      return this;
    }


    /**
     * 非必填，新人入职生效部门列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     *
     * @param newStaffScopeDepartmentList
     * @return
     */
    public Builder newStaffScopeDepartmentList(
        NotificationDepartment[] newStaffScopeDepartmentList) {
      this.newStaffScopeDepartmentList = newStaffScopeDepartmentList;
      return this;
    }


    /**
     * 非必填，push推送到成员列表
     * <p> 示例值：[{"user_id":"ou_7277fd1262bfafc363d5b2a1f9c2ac90"}]
     *
     * @param userList
     * @return
     */
    public Builder userList(NotificationUser[] userList) {
      this.userList = userList;
      return this;
    }


    /**
     * 非必填，push推送到的部门信息列表
     * <p> 示例值：[{"department_id":"od_7c1a2815c9846b5e518b950de0e62de8"}]
     *
     * @param departmentList
     * @return
     */
    public Builder departmentList(NotificationDepartment[] departmentList) {
      this.departmentList = departmentList;
      return this;
    }


    /**
     * 非必填，push推送到的会话列表(群)
     * <p> 示例值：[{"chat_id":"oc_7c1a2815c9846b5e518b950de0e62de8"}]
     *
     * @param chatList
     * @return
     */
    public Builder chatList(NotificationChat[] chatList) {
      this.chatList = chatList;
      return this;
    }


    /**
     * 非必填，预留扩展字段
     * <p> 示例值：{}
     *
     * @param ext
     * @return
     */
    public Builder ext(String ext) {
      this.ext = ext;
      return this;
    }


    public Notification build() {
      return new Notification(this);
    }
  }
}
