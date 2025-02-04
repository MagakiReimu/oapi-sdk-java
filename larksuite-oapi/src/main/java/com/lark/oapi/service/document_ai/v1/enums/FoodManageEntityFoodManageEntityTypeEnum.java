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

package com.lark.oapi.service.document_ai.v1.enums;

/**
 * 识别的字段种类
 */
public enum FoodManageEntityFoodManageEntityTypeEnum {
    VALIDITYPERIOD("validity_period"), // 有效期
    ISSUSER("issuer"), // 签发人
    ISSUINGAUTHORITY("issuing_authority"), // 发证机关
    COMPLAINTSHOTLINE("complaints_hotline"), // 投诉举报电话
    LICENSENUMBER("license_number"), // 许可证编号
    DOMICILE("domicile"), // 住所
    LEGALREPRESENTATIVE("legal_representative"), // 法定代表人(负责人)
    CREDITCODE("credit_code"), // 社会信用代码(身份证号)
    OPERATOR("operator"), // 经营者名称
    PREMISE("premise"), // 经营场所
    DALIYSUPERVISOR("daily_supervisor"), // 日常监督管理人员
    DAILYSUPERVISORYAUTHORITIES("daily_supervisory_authorities"), // 日常监督管理机构
    MAINBODY("main_body"), // 主体业态
    OPERATINGITEM("operating_item"), // 经营项目
    ;
    private String value;

    FoodManageEntityFoodManageEntityTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}