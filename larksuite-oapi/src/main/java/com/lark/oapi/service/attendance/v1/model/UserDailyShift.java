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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class UserDailyShift {
    /**
     * 考勤组 ID，获取方式：1）[创建或修改考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/create) 2）[按名称查询考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/search) 3）[获取打卡结果](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/user_task/query)
     * <p> 示例值：6737202939523236110
     */
    @SerializedName("group_id")
    private String groupId;
    /**
     * 班次 ID，获取方式：1）[按名称查询班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/query) 2）[创建班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/create)
     * <p> 示例值：6753520403404030215
     */
    @SerializedName("shift_id")
    private String shiftId;
    /**
     * 月份
     * <p> 示例值：202101
     */
    @SerializedName("month")
    private Integer month;
    /**
     * 用户 ID
     * <p> 示例值：abd754f7
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 日期
     * <p> 示例值：21
     */
    @SerializedName("day_no")
    private Integer dayNo;
    /**
     * 是否清空班次 (此字段优先于 shift_id，若为true ，shift_id 将失效)
     * <p> 示例值：true
     */
    @SerializedName("is_clear_schedule")
    private Boolean isClearSchedule;

    // builder 开始
    public UserDailyShift() {
    }

    public UserDailyShift(Builder builder) {
        /**
         * 考勤组 ID，获取方式：1）[创建或修改考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/create) 2）[按名称查询考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/search) 3）[获取打卡结果](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/user_task/query)
         * <p> 示例值：6737202939523236110
         */
        this.groupId = builder.groupId;
        /**
         * 班次 ID，获取方式：1）[按名称查询班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/query) 2）[创建班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/create)
         * <p> 示例值：6753520403404030215
         */
        this.shiftId = builder.shiftId;
        /**
         * 月份
         * <p> 示例值：202101
         */
        this.month = builder.month;
        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         */
        this.userId = builder.userId;
        /**
         * 日期
         * <p> 示例值：21
         */
        this.dayNo = builder.dayNo;
        /**
         * 是否清空班次 (此字段优先于 shift_id，若为true ，shift_id 将失效)
         * <p> 示例值：true
         */
        this.isClearSchedule = builder.isClearSchedule;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public Integer getMonth() {
        return this.month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getDayNo() {
        return this.dayNo;
    }

    public void setDayNo(Integer dayNo) {
        this.dayNo = dayNo;
    }

    public Boolean getIsClearSchedule() {
        return this.isClearSchedule;
    }

    public void setIsClearSchedule(Boolean isClearSchedule) {
        this.isClearSchedule = isClearSchedule;
    }

    public static class Builder {
        /**
         * 考勤组 ID，获取方式：1）[创建或修改考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/create) 2）[按名称查询考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/search) 3）[获取打卡结果](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/user_task/query)
         * <p> 示例值：6737202939523236110
         */
        private String groupId;
        /**
         * 班次 ID，获取方式：1）[按名称查询班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/query) 2）[创建班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/create)
         * <p> 示例值：6753520403404030215
         */
        private String shiftId;
        /**
         * 月份
         * <p> 示例值：202101
         */
        private Integer month;
        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         */
        private String userId;
        /**
         * 日期
         * <p> 示例值：21
         */
        private Integer dayNo;
        /**
         * 是否清空班次 (此字段优先于 shift_id，若为true ，shift_id 将失效)
         * <p> 示例值：true
         */
        private Boolean isClearSchedule;

        /**
         * 考勤组 ID，获取方式：1）[创建或修改考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/create) 2）[按名称查询考勤组](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/group/search) 3）[获取打卡结果](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/user_task/query)
         * <p> 示例值：6737202939523236110
         *
         * @param groupId
         * @return
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }


        /**
         * 班次 ID，获取方式：1）[按名称查询班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/query) 2）[创建班次](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/shift/create)
         * <p> 示例值：6753520403404030215
         *
         * @param shiftId
         * @return
         */
        public Builder shiftId(String shiftId) {
            this.shiftId = shiftId;
            return this;
        }


        /**
         * 月份
         * <p> 示例值：202101
         *
         * @param month
         * @return
         */
        public Builder month(Integer month) {
            this.month = month;
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 日期
         * <p> 示例值：21
         *
         * @param dayNo
         * @return
         */
        public Builder dayNo(Integer dayNo) {
            this.dayNo = dayNo;
            return this;
        }


        /**
         * 是否清空班次 (此字段优先于 shift_id，若为true ，shift_id 将失效)
         * <p> 示例值：true
         *
         * @param isClearSchedule
         * @return
         */
        public Builder isClearSchedule(Boolean isClearSchedule) {
            this.isClearSchedule = isClearSchedule;
            return this;
        }


        public UserDailyShift build() {
            return new UserDailyShift(this);
        }
    }
}
