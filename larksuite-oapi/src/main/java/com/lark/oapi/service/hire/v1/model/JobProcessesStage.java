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

public class JobProcessesStage {
    /**
     * ID
     * <p> 示例值：123123123123123
     */
    @SerializedName("id")
    private String id;
    /**
     * 中文名称
     * <p> 示例值：名字
     */
    @SerializedName("zh_name")
    private String zhName;
    /**
     * 英文名称
     * <p> 示例值：name
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 1=筛选型, 2=评估型, 3=笔试型, 4=面试型, 5=Offer型, 6=待入职, 7=已入职, 8=其它类型, 255=系统默认，后端模型中并没有该字段，仅用于前端显示,
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;

    // builder 开始
    public JobProcessesStage() {
    }

    public JobProcessesStage(Builder builder) {
        /**
         * ID
         * <p> 示例值：123123123123123
         */
        this.id = builder.id;
        /**
         * 中文名称
         * <p> 示例值：名字
         */
        this.zhName = builder.zhName;
        /**
         * 英文名称
         * <p> 示例值：name
         */
        this.enName = builder.enName;
        /**
         * 1=筛选型, 2=评估型, 3=笔试型, 4=面试型, 5=Offer型, 6=待入职, 7=已入职, 8=其它类型, 255=系统默认，后端模型中并没有该字段，仅用于前端显示,
         * <p> 示例值：1
         */
        this.type = builder.type;
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

    public String getZhName() {
        return this.zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：123123123123123
         */
        private String id;
        /**
         * 中文名称
         * <p> 示例值：名字
         */
        private String zhName;
        /**
         * 英文名称
         * <p> 示例值：name
         */
        private String enName;
        /**
         * 1=筛选型, 2=评估型, 3=笔试型, 4=面试型, 5=Offer型, 6=待入职, 7=已入职, 8=其它类型, 255=系统默认，后端模型中并没有该字段，仅用于前端显示,
         * <p> 示例值：1
         */
        private Integer type;

        /**
         * ID
         * <p> 示例值：123123123123123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 中文名称
         * <p> 示例值：名字
         *
         * @param zhName
         * @return
         */
        public Builder zhName(String zhName) {
            this.zhName = zhName;
            return this;
        }


        /**
         * 英文名称
         * <p> 示例值：name
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 1=筛选型, 2=评估型, 3=笔试型, 4=面试型, 5=Offer型, 6=待入职, 7=已入职, 8=其它类型, 255=系统默认，后端模型中并没有该字段，仅用于前端显示,
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }


        public JobProcessesStage build() {
            return new JobProcessesStage(this);
        }
    }
}
