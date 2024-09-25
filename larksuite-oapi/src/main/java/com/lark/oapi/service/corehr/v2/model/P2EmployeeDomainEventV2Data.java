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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class P2EmployeeDomainEventV2Data {
    /**
     * 事件类型
     * <p> 示例值：1
     */
    @SerializedName("event_type")
    private Integer eventType;
    /**
     * 子事件类型
     * <p> 示例值：1001
     */
    @SerializedName("sub_event_type")
    private Integer subEventType;
    /**
     * 操作用户 ID
     * <p> 示例值：7216228370772919852
     */
    @SerializedName("operator_user_id")
    private String operatorUserId;
    /**
     * 业务场景
     * <p> 示例值：OpenAPIAddEmployee
     */
    @SerializedName("opt_scene")
    private String optScene;
    /**
     * 操作描述
     * <p> 示例值：开放平台创建任职记录V1接口入职员工
     */
    @SerializedName("opt_desc")
    private String optDesc;
    /**
     * 操作时间
     * <p> 示例值：1697701824
     */
    @SerializedName("opt_time")
    private String optTime;
    /**
     * 操作ID
     * <p> 示例值：7291571779879978540
     */
    @SerializedName("opt_id")
    private String optId;
    /**
     * 被操作人的雇佣 ID
     * <p> 示例值：7324965529786844716
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 变更数据
     * <p> 示例值：
     */
    @SerializedName("data")
    private EmployeeDomainEventData[] data;

    public Integer getEventType() {
        return this.eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Integer getSubEventType() {
        return this.subEventType;
    }

    public void setSubEventType(Integer subEventType) {
        this.subEventType = subEventType;
    }

    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getOptScene() {
        return this.optScene;
    }

    public void setOptScene(String optScene) {
        this.optScene = optScene;
    }

    public String getOptDesc() {
        return this.optDesc;
    }

    public void setOptDesc(String optDesc) {
        this.optDesc = optDesc;
    }

    public String getOptTime() {
        return this.optTime;
    }

    public void setOptTime(String optTime) {
        this.optTime = optTime;
    }

    public String getOptId() {
        return this.optId;
    }

    public void setOptId(String optId) {
        this.optId = optId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public EmployeeDomainEventData[] getData() {
        return this.data;
    }

    public void setData(EmployeeDomainEventData[] data) {
        this.data = data;
    }

}
