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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
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

public class AgentSchedules {
    /**
     * status of agent
     * <p> 示例值：
     */
    @SerializedName("status")
    private Integer status;
    /**
     * agent info
     * <p> 示例值：
     */
    @SerializedName("agent")
    private AgentUser agent;
    /**
     * day schedule
     * <p> 示例值：
     */
    @SerializedName("schedule")
    private WeekdaySchedule[] schedule;
    /**
     * agent skills
     * <p> 示例值：
     */
    @SerializedName("agent_skills")
    private AgentSkillLessInfo[] agentSkills;

    // builder 开始
    public AgentSchedules() {
    }

    public AgentSchedules(Builder builder) {
        /**
         * status of agent
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         * agent info
         * <p> 示例值：
         */
        this.agent = builder.agent;
        /**
         * day schedule
         * <p> 示例值：
         */
        this.schedule = builder.schedule;
        /**
         * agent skills
         * <p> 示例值：
         */
        this.agentSkills = builder.agentSkills;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AgentUser getAgent() {
        return this.agent;
    }

    public void setAgent(AgentUser agent) {
        this.agent = agent;
    }

    public WeekdaySchedule[] getSchedule() {
        return this.schedule;
    }

    public void setSchedule(WeekdaySchedule[] schedule) {
        this.schedule = schedule;
    }

    public AgentSkillLessInfo[] getAgentSkills() {
        return this.agentSkills;
    }

    public void setAgentSkills(AgentSkillLessInfo[] agentSkills) {
        this.agentSkills = agentSkills;
    }

    public static class Builder {
        /**
         * status of agent
         * <p> 示例值：
         */
        private Integer status;
        /**
         * agent info
         * <p> 示例值：
         */
        private AgentUser agent;
        /**
         * day schedule
         * <p> 示例值：
         */
        private WeekdaySchedule[] schedule;
        /**
         * agent skills
         * <p> 示例值：
         */
        private AgentSkillLessInfo[] agentSkills;

        /**
         * status of agent
         * <p> 示例值：
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }


        /**
         * agent info
         * <p> 示例值：
         *
         * @param agent
         * @return
         */
        public Builder agent(AgentUser agent) {
            this.agent = agent;
            return this;
        }


        /**
         * day schedule
         * <p> 示例值：
         *
         * @param schedule
         * @return
         */
        public Builder schedule(WeekdaySchedule[] schedule) {
            this.schedule = schedule;
            return this;
        }


        /**
         * agent skills
         * <p> 示例值：
         *
         * @param agentSkills
         * @return
         */
        public Builder agentSkills(AgentSkillLessInfo[] agentSkills) {
            this.agentSkills = agentSkills;
            return this;
        }


        public AgentSchedules build() {
            return new AgentSchedules(this);
        }
    }
}
