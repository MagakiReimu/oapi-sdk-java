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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class BottomBorderStyle {
    /**
     * 边框样式
     * <p> 示例值：
     */
    @SerializedName("style")
    private String style;
    /**
     * 边框颜色
     * <p> 示例值：#ff00ff
     */
    @SerializedName("color")
    private String color;

    // builder 开始
    public BottomBorderStyle() {
    }

    public BottomBorderStyle(Builder builder) {
        /**
         * 边框样式
         * <p> 示例值：
         */
        this.style = builder.style;
        /**
         * 边框颜色
         * <p> 示例值：#ff00ff
         */
        this.color = builder.color;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Builder {
        /**
         * 边框样式
         * <p> 示例值：
         */
        private String style;
        /**
         * 边框颜色
         * <p> 示例值：#ff00ff
         */
        private String color;

        /**
         * 边框样式
         * <p> 示例值：
         *
         * @param style
         * @return
         */
        public Builder style(String style) {
            this.style = style;
            return this;
        }

        /**
         * 边框样式
         * <p> 示例值：
         *
         * @param style {@link com.lark.oapi.service.sheets.v3.enums.BottomBorderStyleBorderStyleEnum}
         * @return
         */
        public Builder style(com.lark.oapi.service.sheets.v3.enums.BottomBorderStyleBorderStyleEnum style) {
            this.style = style.getValue();
            return this;
        }


        /**
         * 边框颜色
         * <p> 示例值：#ff00ff
         *
         * @param color
         * @return
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }


        public BottomBorderStyle build() {
            return new BottomBorderStyle(this);
        }
    }
}
