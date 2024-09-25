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

public class LocationDto {
    /**
     * 国家信息列表,仅当 location_type=1 时返回
     * <p> 示例值：
     */
    @SerializedName("country")
    private LocationCountry country;
    /**
     * 省份/州信息列表,仅当 location_type=2 时返回
     * <p> 示例值：
     */
    @SerializedName("state")
    private LocationState state;
    /**
     * 市信息列表，仅当 location_type=3 时返回
     * <p> 示例值：
     */
    @SerializedName("city")
    private LocationCity city;
    /**
     * 区/县信息列表，仅当 location_type=4 时返回
     * <p> 示例值：
     */
    @SerializedName("district")
    private LocationDistrict district;

    // builder 开始
    public LocationDto() {
    }

    public LocationDto(Builder builder) {
        /**
         * 国家信息列表,仅当 location_type=1 时返回
         * <p> 示例值：
         */
        this.country = builder.country;
        /**
         * 省份/州信息列表,仅当 location_type=2 时返回
         * <p> 示例值：
         */
        this.state = builder.state;
        /**
         * 市信息列表，仅当 location_type=3 时返回
         * <p> 示例值：
         */
        this.city = builder.city;
        /**
         * 区/县信息列表，仅当 location_type=4 时返回
         * <p> 示例值：
         */
        this.district = builder.district;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public LocationCountry getCountry() {
        return this.country;
    }

    public void setCountry(LocationCountry country) {
        this.country = country;
    }

    public LocationState getState() {
        return this.state;
    }

    public void setState(LocationState state) {
        this.state = state;
    }

    public LocationCity getCity() {
        return this.city;
    }

    public void setCity(LocationCity city) {
        this.city = city;
    }

    public LocationDistrict getDistrict() {
        return this.district;
    }

    public void setDistrict(LocationDistrict district) {
        this.district = district;
    }

    public static class Builder {
        /**
         * 国家信息列表,仅当 location_type=1 时返回
         * <p> 示例值：
         */
        private LocationCountry country;
        /**
         * 省份/州信息列表,仅当 location_type=2 时返回
         * <p> 示例值：
         */
        private LocationState state;
        /**
         * 市信息列表，仅当 location_type=3 时返回
         * <p> 示例值：
         */
        private LocationCity city;
        /**
         * 区/县信息列表，仅当 location_type=4 时返回
         * <p> 示例值：
         */
        private LocationDistrict district;

        /**
         * 国家信息列表,仅当 location_type=1 时返回
         * <p> 示例值：
         *
         * @param country
         * @return
         */
        public Builder country(LocationCountry country) {
            this.country = country;
            return this;
        }


        /**
         * 省份/州信息列表,仅当 location_type=2 时返回
         * <p> 示例值：
         *
         * @param state
         * @return
         */
        public Builder state(LocationState state) {
            this.state = state;
            return this;
        }


        /**
         * 市信息列表，仅当 location_type=3 时返回
         * <p> 示例值：
         *
         * @param city
         * @return
         */
        public Builder city(LocationCity city) {
            this.city = city;
            return this;
        }


        /**
         * 区/县信息列表，仅当 location_type=4 时返回
         * <p> 示例值：
         *
         * @param district
         * @return
         */
        public Builder district(LocationDistrict district) {
            this.district = district;
            return this;
        }


        public LocationDto build() {
            return new LocationDto(this);
        }
    }
}
