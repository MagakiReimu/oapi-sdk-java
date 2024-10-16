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

public class AgentSkill {
    /**
     * 技能id
     * <p> 示例值：test-skill-id
     */
    @SerializedName("id")
    private String id;
    /**
     * helpdesk id
     * <p> 示例值：
     */
    @SerializedName("helpdesk_id")
    private String helpdeskId;
    /**
     * 技能名
     * <p> 示例值：skill-name
     */
    @SerializedName("name")
    private String name;
    /**
     * 技能rules
     * <p> 示例值：
     */
    @SerializedName("rules")
    private AgentSkillRule[] rules;
    /**
     * 具有此技能的客服ids
     * <p> 示例值：["ou_ea21d7f018e1155d960e40d33191f966"]
     */
    @SerializedName("agent_ids")
    private String[] agentIds;
    /**
     * 默认技能
     * <p> 示例值：false
     */
    @SerializedName("is_default")
    private Boolean isDefault;
    /**
     * 客服 info
     * <p> 示例值：
     */
    @SerializedName("agents")
    private Agent[] agents;

    // builder 开始
    public AgentSkill() {
    }

    public AgentSkill(Builder builder) {
        /**
         * 技能id
         * <p> 示例值：test-skill-id
         */
        this.id = builder.id;
        /**
         * helpdesk id
         * <p> 示例值：
         */
        this.helpdeskId = builder.helpdeskId;
        /**
         * 技能名
         * <p> 示例值：skill-name
         */
        this.name = builder.name;
        /**
         * 技能rules
         * <p> 示例值：
         */
        this.rules = builder.rules;
        /**
         * 具有此技能的客服ids
         * <p> 示例值：["ou_ea21d7f018e1155d960e40d33191f966"]
         */
        this.agentIds = builder.agentIds;
        /**
         * 默认技能
         * <p> 示例值：false
         */
        this.isDefault = builder.isDefault;
        /**
         * 客服 info
         * <p> 示例值：
         */
        this.agents = builder.agents;
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

    public String getHelpdeskId() {
        return this.helpdeskId;
    }

    public void setHelpdeskId(String helpdeskId) {
        this.helpdeskId = helpdeskId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgentSkillRule[] getRules() {
        return this.rules;
    }

    public void setRules(AgentSkillRule[] rules) {
        this.rules = rules;
    }

    public String[] getAgentIds() {
        return this.agentIds;
    }

    public void setAgentIds(String[] agentIds) {
        this.agentIds = agentIds;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Agent[] getAgents() {
        return this.agents;
    }

    public void setAgents(Agent[] agents) {
        this.agents = agents;
    }

    public static class Builder {
        /**
         * 技能id
         * <p> 示例值：test-skill-id
         */
        private String id;
        /**
         * helpdesk id
         * <p> 示例值：
         */
        private String helpdeskId;
        /**
         * 技能名
         * <p> 示例值：skill-name
         */
        private String name;
        /**
         * 技能rules
         * <p> 示例值：
         */
        private AgentSkillRule[] rules;
        /**
         * 具有此技能的客服ids
         * <p> 示例值：["ou_ea21d7f018e1155d960e40d33191f966"]
         */
        private String[] agentIds;
        /**
         * 默认技能
         * <p> 示例值：false
         */
        private Boolean isDefault;
        /**
         * 客服 info
         * <p> 示例值：
         */
        private Agent[] agents;

        /**
         * 技能id
         * <p> 示例值：test-skill-id
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * helpdesk id
         * <p> 示例值：
         *
         * @param helpdeskId
         * @return
         */
        public Builder helpdeskId(String helpdeskId) {
            this.helpdeskId = helpdeskId;
            return this;
        }


        /**
         * 技能名
         * <p> 示例值：skill-name
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 技能rules
         * <p> 示例值：
         *
         * @param rules
         * @return
         */
        public Builder rules(AgentSkillRule[] rules) {
            this.rules = rules;
            return this;
        }


        /**
         * 具有此技能的客服ids
         * <p> 示例值：["ou_ea21d7f018e1155d960e40d33191f966"]
         *
         * @param agentIds
         * @return
         */
        public Builder agentIds(String[] agentIds) {
            this.agentIds = agentIds;
            return this;
        }


        /**
         * 默认技能
         * <p> 示例值：false
         *
         * @param isDefault
         * @return
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }


        /**
         * 客服 info
         * <p> 示例值：
         *
         * @param agents
         * @return
         */
        public Builder agents(Agent[] agents) {
            this.agents = agents;
            return this;
        }


        public AgentSkill build() {
            return new AgentSkill(this);
        }
    }
}
