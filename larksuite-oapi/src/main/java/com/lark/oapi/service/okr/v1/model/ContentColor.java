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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class ContentColor {
    /**
     * 红 取值范围[0,255]
     * <p> 示例值：216
     */
    @SerializedName("red")
    private Integer red;
    /**
     * 绿 取值范围[0,255]
     * <p> 示例值：191
     */
    @SerializedName("green")
    private Integer green;
    /**
     * 蓝 取值范围[0,255]
     * <p> 示例值：188
     */
    @SerializedName("blue")
    private Integer blue;
    /**
     * 透明度 取值范围[0,1]
     * <p> 示例值：0.1
     */
    @SerializedName("alpha")
    private Double alpha;

    // builder 开始
    public ContentColor() {
    }

    public ContentColor(Builder builder) {
        /**
         * 红 取值范围[0,255]
         * <p> 示例值：216
         */
        this.red = builder.red;
        /**
         * 绿 取值范围[0,255]
         * <p> 示例值：191
         */
        this.green = builder.green;
        /**
         * 蓝 取值范围[0,255]
         * <p> 示例值：188
         */
        this.blue = builder.blue;
        /**
         * 透明度 取值范围[0,1]
         * <p> 示例值：0.1
         */
        this.alpha = builder.alpha;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getRed() {
        return this.red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Integer getGreen() {
        return this.green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getBlue() {
        return this.blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    public Double getAlpha() {
        return this.alpha;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public static class Builder {
        /**
         * 红 取值范围[0,255]
         * <p> 示例值：216
         */
        private Integer red;
        /**
         * 绿 取值范围[0,255]
         * <p> 示例值：191
         */
        private Integer green;
        /**
         * 蓝 取值范围[0,255]
         * <p> 示例值：188
         */
        private Integer blue;
        /**
         * 透明度 取值范围[0,1]
         * <p> 示例值：0.1
         */
        private Double alpha;

        /**
         * 红 取值范围[0,255]
         * <p> 示例值：216
         *
         * @param red
         * @return
         */
        public Builder red(Integer red) {
            this.red = red;
            return this;
        }


        /**
         * 绿 取值范围[0,255]
         * <p> 示例值：191
         *
         * @param green
         * @return
         */
        public Builder green(Integer green) {
            this.green = green;
            return this;
        }


        /**
         * 蓝 取值范围[0,255]
         * <p> 示例值：188
         *
         * @param blue
         * @return
         */
        public Builder blue(Integer blue) {
            this.blue = blue;
            return this;
        }


        /**
         * 透明度 取值范围[0,1]
         * <p> 示例值：0.1
         *
         * @param alpha
         * @return
         */
        public Builder alpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }


        public ContentColor build() {
            return new ContentColor(this);
        }
    }
}
