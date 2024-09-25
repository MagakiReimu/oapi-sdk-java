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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class InterviewFeedbackFormModule {
    /**
     * 面试评价表模块ID
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("id")
    private String id;
    /**
     * 模块名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 模块描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n description;
    /**
     * 模块类型
     * <p> 示例值：
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 模块顺序
     * <p> 示例值：1
     */
    @SerializedName("sequence")
    private Integer sequence;
    /**
     * 模块权重
     * <p> 示例值：1
     */
    @SerializedName("weight")
    private Double weight;
    /**
     * 模块维度列表
     * <p> 示例值：
     */
    @SerializedName("dimensions")
    private InterviewFeedbackFormDimension[] dimensions;

    // builder 开始
    public InterviewFeedbackFormModule() {
    }

    public InterviewFeedbackFormModule(Builder builder) {
        /**
         * 面试评价表模块ID
         * <p> 示例值：6930815272790114324
         */
        this.id = builder.id;
        /**
         * 模块名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 模块描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 模块类型
         * <p> 示例值：
         */
        this.type = builder.type;
        /**
         * 模块顺序
         * <p> 示例值：1
         */
        this.sequence = builder.sequence;
        /**
         * 模块权重
         * <p> 示例值：1
         */
        this.weight = builder.weight;
        /**
         * 模块维度列表
         * <p> 示例值：
         */
        this.dimensions = builder.dimensions;
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

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public I18n getDescription() {
        return this.description;
    }

    public void setDescription(I18n description) {
        this.description = description;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public InterviewFeedbackFormDimension[] getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(InterviewFeedbackFormDimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public static class Builder {
        /**
         * 面试评价表模块ID
         * <p> 示例值：6930815272790114324
         */
        private String id;
        /**
         * 模块名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 模块描述
         * <p> 示例值：
         */
        private I18n description;
        /**
         * 模块类型
         * <p> 示例值：
         */
        private Integer type;
        /**
         * 模块顺序
         * <p> 示例值：1
         */
        private Integer sequence;
        /**
         * 模块权重
         * <p> 示例值：1
         */
        private Double weight;
        /**
         * 模块维度列表
         * <p> 示例值：
         */
        private InterviewFeedbackFormDimension[] dimensions;

        /**
         * 面试评价表模块ID
         * <p> 示例值：6930815272790114324
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 模块名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 模块描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n description) {
            this.description = description;
            return this;
        }


        /**
         * 模块类型
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }


        /**
         * 模块顺序
         * <p> 示例值：1
         *
         * @param sequence
         * @return
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }


        /**
         * 模块权重
         * <p> 示例值：1
         *
         * @param weight
         * @return
         */
        public Builder weight(Double weight) {
            this.weight = weight;
            return this;
        }


        /**
         * 模块维度列表
         * <p> 示例值：
         *
         * @param dimensions
         * @return
         */
        public Builder dimensions(InterviewFeedbackFormDimension[] dimensions) {
            this.dimensions = dimensions;
            return this;
        }


        public InterviewFeedbackFormModule build() {
            return new InterviewFeedbackFormModule(this);
        }
    }
}
