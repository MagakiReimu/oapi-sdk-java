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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class ProgressItem {
    /**
     * 进度条项状态
     * <p> 示例值：RUNNING
     */
    @SerializedName("progress_item_state")
    private String progressItemState;
    /**
     * 进度条项内容
     * <p> 示例值：抽取字段
     */
    @SerializedName("content")
    private String content;
    /**
     * 选中的技能 id
     * <p> 示例值：skill_43ec7b438a59
     */
    @SerializedName("skill_id")
    private String skillId;
    /**
     * 节点 id
     * <p> 示例值：7316877623309058067
     */
    @SerializedName("node_id")
    private String nodeId;
    /**
     * 节点类型
     * <p> 示例值：skill-selector
     */
    @SerializedName("node_type")
    private String nodeType;
    /**
     * 节点输入，调试模式返回
     * <p> 示例值：{}
     */
    @SerializedName("input")
    private String input;
    /**
     * 节点输出，调试模式返回
     * <p> 示例值：{}
     */
    @SerializedName("output")
    private String output;
    /**
     * 节点的时间以及 Token 消耗
     * <p> 示例值：
     */
    @SerializedName("usages")
    private String[] usages;
    /**
     * 技能选择策略
     * <p> 示例值：AUTO
     */
    @SerializedName("skill_strategy")
    private String skillStrategy;

    // builder 开始
    public ProgressItem() {
    }

    public ProgressItem(Builder builder) {
        /**
         * 进度条项状态
         * <p> 示例值：RUNNING
         */
        this.progressItemState = builder.progressItemState;
        /**
         * 进度条项内容
         * <p> 示例值：抽取字段
         */
        this.content = builder.content;
        /**
         * 选中的技能 id
         * <p> 示例值：skill_43ec7b438a59
         */
        this.skillId = builder.skillId;
        /**
         * 节点 id
         * <p> 示例值：7316877623309058067
         */
        this.nodeId = builder.nodeId;
        /**
         * 节点类型
         * <p> 示例值：skill-selector
         */
        this.nodeType = builder.nodeType;
        /**
         * 节点输入，调试模式返回
         * <p> 示例值：{}
         */
        this.input = builder.input;
        /**
         * 节点输出，调试模式返回
         * <p> 示例值：{}
         */
        this.output = builder.output;
        /**
         * 节点的时间以及 Token 消耗
         * <p> 示例值：
         */
        this.usages = builder.usages;
        /**
         * 技能选择策略
         * <p> 示例值：AUTO
         */
        this.skillStrategy = builder.skillStrategy;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProgressItemState() {
        return this.progressItemState;
    }

    public void setProgressItemState(String progressItemState) {
        this.progressItemState = progressItemState;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSkillId() {
        return this.skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return this.output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String[] getUsages() {
        return this.usages;
    }

    public void setUsages(String[] usages) {
        this.usages = usages;
    }

    public String getSkillStrategy() {
        return this.skillStrategy;
    }

    public void setSkillStrategy(String skillStrategy) {
        this.skillStrategy = skillStrategy;
    }

    public static class Builder {
        /**
         * 进度条项状态
         * <p> 示例值：RUNNING
         */
        private String progressItemState;
        /**
         * 进度条项内容
         * <p> 示例值：抽取字段
         */
        private String content;
        /**
         * 选中的技能 id
         * <p> 示例值：skill_43ec7b438a59
         */
        private String skillId;
        /**
         * 节点 id
         * <p> 示例值：7316877623309058067
         */
        private String nodeId;
        /**
         * 节点类型
         * <p> 示例值：skill-selector
         */
        private String nodeType;
        /**
         * 节点输入，调试模式返回
         * <p> 示例值：{}
         */
        private String input;
        /**
         * 节点输出，调试模式返回
         * <p> 示例值：{}
         */
        private String output;
        /**
         * 节点的时间以及 Token 消耗
         * <p> 示例值：
         */
        private String[] usages;
        /**
         * 技能选择策略
         * <p> 示例值：AUTO
         */
        private String skillStrategy;

        /**
         * 进度条项状态
         * <p> 示例值：RUNNING
         *
         * @param progressItemState
         * @return
         */
        public Builder progressItemState(String progressItemState) {
            this.progressItemState = progressItemState;
            return this;
        }

        /**
         * 进度条项状态
         * <p> 示例值：RUNNING
         *
         * @param progressItemState {@link com.lark.oapi.service.aily.v1.enums.ProgressItemProgressItemStateEnum}
         * @return
         */
        public Builder progressItemState(com.lark.oapi.service.aily.v1.enums.ProgressItemProgressItemStateEnum progressItemState) {
            this.progressItemState = progressItemState.getValue();
            return this;
        }


        /**
         * 进度条项内容
         * <p> 示例值：抽取字段
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 选中的技能 id
         * <p> 示例值：skill_43ec7b438a59
         *
         * @param skillId
         * @return
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        /**
         * 节点 id
         * <p> 示例值：7316877623309058067
         *
         * @param nodeId
         * @return
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }


        /**
         * 节点类型
         * <p> 示例值：skill-selector
         *
         * @param nodeType
         * @return
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }


        /**
         * 节点输入，调试模式返回
         * <p> 示例值：{}
         *
         * @param input
         * @return
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }


        /**
         * 节点输出，调试模式返回
         * <p> 示例值：{}
         *
         * @param output
         * @return
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }


        /**
         * 节点的时间以及 Token 消耗
         * <p> 示例值：
         *
         * @param usages
         * @return
         */
        public Builder usages(String[] usages) {
            this.usages = usages;
            return this;
        }


        /**
         * 技能选择策略
         * <p> 示例值：AUTO
         *
         * @param skillStrategy
         * @return
         */
        public Builder skillStrategy(String skillStrategy) {
            this.skillStrategy = skillStrategy;
            return this;
        }

        /**
         * 技能选择策略
         * <p> 示例值：AUTO
         *
         * @param skillStrategy {@link com.lark.oapi.service.aily.v1.enums.ProgressItemSkillSelectStrategyEnum}
         * @return
         */
        public Builder skillStrategy(com.lark.oapi.service.aily.v1.enums.ProgressItemSkillSelectStrategyEnum skillStrategy) {
            this.skillStrategy = skillStrategy.getValue();
            return this;
        }


        public ProgressItem build() {
            return new ProgressItem(this);
        }
    }
}
