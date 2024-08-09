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

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetProcessRespBody {
    /**
     * 流程实例ID
     * <p> 示例值：7278949005675988535
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 流程状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 业务类型ID
     * <p> 示例值：leave
     */
    @SerializedName("flow_template_id")
    private String flowTemplateId;
    /**
     * 业务类型名称
     * <p> 示例值：
     */
    @SerializedName("flow_template_name")
    private DataengineI18n flowTemplateName;
    /**
     * 流程定义ID
     * <p> 示例值：people_6961286846093788680_7081951411982077732
     */
    @SerializedName("flow_definition_id")
    private String flowDefinitionId;
    /**
     * 流程定义名称
     * <p> 示例值：
     */
    @SerializedName("flow_definition_name")
    private DataengineI18n flowDefinitionName;
    /**
     * 流程发起人ID
     * <p> 示例值：7124991993901827628
     */
    @SerializedName("initiator_id")
    private String initiatorId;
    /**
     * 流程发起人姓名
     * <p> 示例值：
     */
    @SerializedName("initiator_name")
    private DataengineI18n initiatorName;
    /**
     * 流程发起时间，Unix毫秒时间戳
     * <p> 示例值：1694769814036
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 流程结束时间，Unix毫秒时间戳
     * <p> 示例值：1694769814036
     */
    @SerializedName("complete_time")
    private String completeTime;
    /**
     * 发起单据地址
     * <p> 示例值：
     */
    @SerializedName("start_links")
    private ProcessLink startLinks;
    /**
     * 流程摘要，会随着流程流转发生变化
     * <p> 示例值：
     */
    @SerializedName("abstracts")
    private ProcessAbstractItem[] abstracts;
    /**
     * 待办列表
     * <p> 示例值：
     */
    @SerializedName("todos")
    private ProcessTodoItem[] todos;
    /**
     * 抄送列表
     * <p> 示例值：
     */
    @SerializedName("cc_list")
    private ProcessCcItem[] ccList;
    /**
     * 已办列表
     * <p> 示例值：
     */
    @SerializedName("done_list")
    private ProcessDoneItem[] doneList;
    /**
     * 普通流程或撤销流程等
     * <p> 示例值：1
     */
    @SerializedName("properties")
    private Integer properties;
    /**
     * 系统待办列表
     * <p> 示例值：
     */
    @SerializedName("system_todos")
    private ProcessSystemTodoItem[] systemTodos;
    /**
     * 系统已办列表
     * <p> 示例值：
     */
    @SerializedName("system_done_list")
    private ProcessSystemDoneItem[] systemDoneList;

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    public void setFlowTemplateId(String flowTemplateId) {
        this.flowTemplateId = flowTemplateId;
    }

    public DataengineI18n getFlowTemplateName() {
        return this.flowTemplateName;
    }

    public void setFlowTemplateName(DataengineI18n flowTemplateName) {
        this.flowTemplateName = flowTemplateName;
    }

    public String getFlowDefinitionId() {
        return this.flowDefinitionId;
    }

    public void setFlowDefinitionId(String flowDefinitionId) {
        this.flowDefinitionId = flowDefinitionId;
    }

    public DataengineI18n getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    public void setFlowDefinitionName(DataengineI18n flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    public String getInitiatorId() {
        return this.initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public DataengineI18n getInitiatorName() {
        return this.initiatorName;
    }

    public void setInitiatorName(DataengineI18n initiatorName) {
        this.initiatorName = initiatorName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCompleteTime() {
        return this.completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public ProcessLink getStartLinks() {
        return this.startLinks;
    }

    public void setStartLinks(ProcessLink startLinks) {
        this.startLinks = startLinks;
    }

    public ProcessAbstractItem[] getAbstracts() {
        return this.abstracts;
    }

    public void setAbstracts(ProcessAbstractItem[] abstracts) {
        this.abstracts = abstracts;
    }

    public ProcessTodoItem[] getTodos() {
        return this.todos;
    }

    public void setTodos(ProcessTodoItem[] todos) {
        this.todos = todos;
    }

    public ProcessCcItem[] getCcList() {
        return this.ccList;
    }

    public void setCcList(ProcessCcItem[] ccList) {
        this.ccList = ccList;
    }

    public ProcessDoneItem[] getDoneList() {
        return this.doneList;
    }

    public void setDoneList(ProcessDoneItem[] doneList) {
        this.doneList = doneList;
    }

    public Integer getProperties() {
        return this.properties;
    }

    public void setProperties(Integer properties) {
        this.properties = properties;
    }

    public ProcessSystemTodoItem[] getSystemTodos() {
        return this.systemTodos;
    }

    public void setSystemTodos(ProcessSystemTodoItem[] systemTodos) {
        this.systemTodos = systemTodos;
    }

    public ProcessSystemDoneItem[] getSystemDoneList() {
        return this.systemDoneList;
    }

    public void setSystemDoneList(ProcessSystemDoneItem[] systemDoneList) {
        this.systemDoneList = systemDoneList;
    }

}
