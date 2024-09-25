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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class LocationInfo {
    /**
     * 开关状态
     * <p> 示例值：
     */
    @SerializedName("status")
    private Integer status;
    /**
     * <p> 示例值：
     */
    @SerializedName("geofences")
    private Area[] geofences;

    // builder 开始
    public LocationInfo() {
    }

    public LocationInfo(Builder builder) {
        /**
         * 开关状态
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         *
         * <p> 示例值：
         */
        this.geofences = builder.geofences;
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

    public Area[] getGeofences() {
        return this.geofences;
    }

    public void setGeofences(Area[] geofences) {
        this.geofences = geofences;
    }

    public static class Builder {
        /**
         * 开关状态
         * <p> 示例值：
         */
        private Integer status;
        /**
         * <p> 示例值：
         */
        private Area[] geofences;

        /**
         * 开关状态
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
         * <p> 示例值：
         *
         * @param geofences
         * @return
         */
        public Builder geofences(Area[] geofences) {
            this.geofences = geofences;
            return this;
        }


        public LocationInfo build() {
            return new LocationInfo(this);
        }
    }
}
