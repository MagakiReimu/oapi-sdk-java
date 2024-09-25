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

public class BaseAddressV2 {
    /**
     * ID
     * <p> 示例值：6583482347283472832
     */
    @SerializedName("id")
    private String id;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 区域信息
     * <p> 示例值：
     */
    @SerializedName("district")
    private BaseLocation district;
    /**
     * 城市信息
     * <p> 示例值：
     */
    @SerializedName("city")
    private BaseLocation city;
    /**
     * 省信息
     * <p> 示例值：
     */
    @SerializedName("state")
    private BaseLocation state;
    /**
     * 国家信息
     * <p> 示例值：
     */
    @SerializedName("country")
    private BaseLocation country;

    // builder 开始
    public BaseAddressV2() {
    }

    public BaseAddressV2(Builder builder) {
        /**
         * ID
         * <p> 示例值：6583482347283472832
         */
        this.id = builder.id;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 区域信息
         * <p> 示例值：
         */
        this.district = builder.district;
        /**
         * 城市信息
         * <p> 示例值：
         */
        this.city = builder.city;
        /**
         * 省信息
         * <p> 示例值：
         */
        this.state = builder.state;
        /**
         * 国家信息
         * <p> 示例值：
         */
        this.country = builder.country;
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

    public BaseLocation getDistrict() {
        return this.district;
    }

    public void setDistrict(BaseLocation district) {
        this.district = district;
    }

    public BaseLocation getCity() {
        return this.city;
    }

    public void setCity(BaseLocation city) {
        this.city = city;
    }

    public BaseLocation getState() {
        return this.state;
    }

    public void setState(BaseLocation state) {
        this.state = state;
    }

    public BaseLocation getCountry() {
        return this.country;
    }

    public void setCountry(BaseLocation country) {
        this.country = country;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：6583482347283472832
         */
        private String id;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 区域信息
         * <p> 示例值：
         */
        private BaseLocation district;
        /**
         * 城市信息
         * <p> 示例值：
         */
        private BaseLocation city;
        /**
         * 省信息
         * <p> 示例值：
         */
        private BaseLocation state;
        /**
         * 国家信息
         * <p> 示例值：
         */
        private BaseLocation country;

        /**
         * ID
         * <p> 示例值：6583482347283472832
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 名称
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
         * 区域信息
         * <p> 示例值：
         *
         * @param district
         * @return
         */
        public Builder district(BaseLocation district) {
            this.district = district;
            return this;
        }


        /**
         * 城市信息
         * <p> 示例值：
         *
         * @param city
         * @return
         */
        public Builder city(BaseLocation city) {
            this.city = city;
            return this;
        }


        /**
         * 省信息
         * <p> 示例值：
         *
         * @param state
         * @return
         */
        public Builder state(BaseLocation state) {
            this.state = state;
            return this;
        }


        /**
         * 国家信息
         * <p> 示例值：
         *
         * @param country
         * @return
         */
        public Builder country(BaseLocation country) {
            this.country = country;
            return this;
        }


        public BaseAddressV2 build() {
            return new BaseAddressV2(this);
        }
    }
}
