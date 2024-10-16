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

package com.lark.oapi.service.bitable.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;

import java.util.Map;

import com.lark.oapi.core.response.BaseResponse;

public class AppRoleTableRole {
    /**
     * 数据表权限，`协作者可编辑自己的记录`和`可编辑指定字段`是`可编辑记录`的特殊情况，可通过指定`rec_rule`或`field_perm`参数实现相同的效果
     * <p> 示例值：0
     */
    @SerializedName("table_perm")
    private Integer tablePerm;
    /**
     * 数据表名
     * <p> 示例值：数据表1
     */
    @SerializedName("table_name")
    private String tableName;
    /**
     * 数据表ID
     * <p> 示例值：tblKz5D60T4JlfcT
     */
    @SerializedName("table_id")
    private String tableId;
    /**
     * 记录筛选条件，在table_perm为1或2时有意义，用于指定可编辑或可阅读某些记录
     * <p> 示例值：
     */
    @SerializedName("rec_rule")
    private AppRoleTableRoleRecRule recRule;
    /**
     * 字段权限，仅在table_perm为2时有意义，设置字段可编辑或可阅读。类型为 map，key 是字段名，value 是字段权限;;**value 枚举值有：**;- `1`：可阅读;- `2`：可编辑
     * <p> 示例值：{"姓名": 1, "年龄": 2}
     */
    @SerializedName("field_perm")
    private Map<String, Integer> fieldPerm;
    /**
     * 新增记录权限，仅在table_perm为2时有意义，用于设置记录是否可以新增。
     * <p> 示例值：true
     */
    @SerializedName("allow_add_record")
    private Boolean allowAddRecord;
    /**
     * 删除记录权限，仅在table_perm为2时有意义，用于设置记录是否可以删除
     * <p> 示例值：true
     */
    @SerializedName("allow_delete_record")
    private Boolean allowDeleteRecord;

    // builder 开始
    public AppRoleTableRole() {
    }

    public AppRoleTableRole(Builder builder) {
        /**
         * 数据表权限，`协作者可编辑自己的记录`和`可编辑指定字段`是`可编辑记录`的特殊情况，可通过指定`rec_rule`或`field_perm`参数实现相同的效果
         * <p> 示例值：0
         */
        this.tablePerm = builder.tablePerm;
        /**
         * 数据表名
         * <p> 示例值：数据表1
         */
        this.tableName = builder.tableName;
        /**
         * 数据表ID
         * <p> 示例值：tblKz5D60T4JlfcT
         */
        this.tableId = builder.tableId;
        /**
         * 记录筛选条件，在table_perm为1或2时有意义，用于指定可编辑或可阅读某些记录
         * <p> 示例值：
         */
        this.recRule = builder.recRule;
        /**
         * 字段权限，仅在table_perm为2时有意义，设置字段可编辑或可阅读。类型为 map，key 是字段名，value 是字段权限;;**value 枚举值有：**;- `1`：可阅读;- `2`：可编辑
         * <p> 示例值：{"姓名": 1, "年龄": 2}
         */
        this.fieldPerm = builder.fieldPerm;
        /**
         * 新增记录权限，仅在table_perm为2时有意义，用于设置记录是否可以新增。
         * <p> 示例值：true
         */
        this.allowAddRecord = builder.allowAddRecord;
        /**
         * 删除记录权限，仅在table_perm为2时有意义，用于设置记录是否可以删除
         * <p> 示例值：true
         */
        this.allowDeleteRecord = builder.allowDeleteRecord;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getTablePerm() {
        return this.tablePerm;
    }

    public void setTablePerm(Integer tablePerm) {
        this.tablePerm = tablePerm;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public AppRoleTableRoleRecRule getRecRule() {
        return this.recRule;
    }

    public void setRecRule(AppRoleTableRoleRecRule recRule) {
        this.recRule = recRule;
    }

    public Map<String, Integer> getFieldPerm() {
        return this.fieldPerm;
    }

    public void setFieldPerm(Map<String, Integer> fieldPerm) {
        this.fieldPerm = fieldPerm;
    }

    public Boolean getAllowAddRecord() {
        return this.allowAddRecord;
    }

    public void setAllowAddRecord(Boolean allowAddRecord) {
        this.allowAddRecord = allowAddRecord;
    }

    public Boolean getAllowDeleteRecord() {
        return this.allowDeleteRecord;
    }

    public void setAllowDeleteRecord(Boolean allowDeleteRecord) {
        this.allowDeleteRecord = allowDeleteRecord;
    }

    public static class Builder {
        /**
         * 数据表权限，`协作者可编辑自己的记录`和`可编辑指定字段`是`可编辑记录`的特殊情况，可通过指定`rec_rule`或`field_perm`参数实现相同的效果
         * <p> 示例值：0
         */
        private Integer tablePerm;
        /**
         * 数据表名
         * <p> 示例值：数据表1
         */
        private String tableName;
        /**
         * 数据表ID
         * <p> 示例值：tblKz5D60T4JlfcT
         */
        private String tableId;
        /**
         * 记录筛选条件，在table_perm为1或2时有意义，用于指定可编辑或可阅读某些记录
         * <p> 示例值：
         */
        private AppRoleTableRoleRecRule recRule;
        /**
         * 字段权限，仅在table_perm为2时有意义，设置字段可编辑或可阅读。类型为 map，key 是字段名，value 是字段权限;;**value 枚举值有：**;- `1`：可阅读;- `2`：可编辑
         * <p> 示例值：{"姓名": 1, "年龄": 2}
         */
        private Map<String, Integer> fieldPerm;
        /**
         * 新增记录权限，仅在table_perm为2时有意义，用于设置记录是否可以新增。
         * <p> 示例值：true
         */
        private Boolean allowAddRecord;
        /**
         * 删除记录权限，仅在table_perm为2时有意义，用于设置记录是否可以删除
         * <p> 示例值：true
         */
        private Boolean allowDeleteRecord;

        /**
         * 数据表权限，`协作者可编辑自己的记录`和`可编辑指定字段`是`可编辑记录`的特殊情况，可通过指定`rec_rule`或`field_perm`参数实现相同的效果
         * <p> 示例值：0
         *
         * @param tablePerm
         * @return
         */
        public Builder tablePerm(Integer tablePerm) {
            this.tablePerm = tablePerm;
            return this;
        }

        /**
         * 数据表权限，`协作者可编辑自己的记录`和`可编辑指定字段`是`可编辑记录`的特殊情况，可通过指定`rec_rule`或`field_perm`参数实现相同的效果
         * <p> 示例值：0
         *
         * @param tablePerm {@link com.lark.oapi.service.bitable.v1.enums.AppRoleTableRoleTablePermEnum}
         * @return
         */
        public Builder tablePerm(com.lark.oapi.service.bitable.v1.enums.AppRoleTableRoleTablePermEnum tablePerm) {
            this.tablePerm = tablePerm.getValue();
            return this;
        }


        /**
         * 数据表名
         * <p> 示例值：数据表1
         *
         * @param tableName
         * @return
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }


        /**
         * 数据表ID
         * <p> 示例值：tblKz5D60T4JlfcT
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }


        /**
         * 记录筛选条件，在table_perm为1或2时有意义，用于指定可编辑或可阅读某些记录
         * <p> 示例值：
         *
         * @param recRule
         * @return
         */
        public Builder recRule(AppRoleTableRoleRecRule recRule) {
            this.recRule = recRule;
            return this;
        }


        /**
         * 字段权限，仅在table_perm为2时有意义，设置字段可编辑或可阅读。类型为 map，key 是字段名，value 是字段权限;;**value 枚举值有：**;- `1`：可阅读;- `2`：可编辑
         * <p> 示例值：{"姓名": 1, "年龄": 2}
         *
         * @param fieldPerm
         * @return
         */
        public Builder fieldPerm(Map<String, Integer> fieldPerm) {
            this.fieldPerm = fieldPerm;
            return this;
        }


        /**
         * 新增记录权限，仅在table_perm为2时有意义，用于设置记录是否可以新增。
         * <p> 示例值：true
         *
         * @param allowAddRecord
         * @return
         */
        public Builder allowAddRecord(Boolean allowAddRecord) {
            this.allowAddRecord = allowAddRecord;
            return this;
        }


        /**
         * 删除记录权限，仅在table_perm为2时有意义，用于设置记录是否可以删除
         * <p> 示例值：true
         *
         * @param allowDeleteRecord
         * @return
         */
        public Builder allowDeleteRecord(Boolean allowDeleteRecord) {
            this.allowDeleteRecord = allowDeleteRecord;
            return this;
        }


        public AppRoleTableRole build() {
            return new AppRoleTableRole(this);
        }
    }
}
