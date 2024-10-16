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

public class GetShiftRespBody {
    /**
     * 班次Id
     * <p> 示例值：6919358778597097404
     */
    @SerializedName("shift_id")
    private String shiftId;
    /**
     * 班次名称
     * <p> 示例值：早班
     */
    @SerializedName("shift_name")
    private String shiftName;
    /**
     * 打卡次数
     * <p> 示例值：1
     */
    @SerializedName("punch_times")
    private Integer punchTimes;
    /**
     * 排班组子负责人id列表
     * <p> 示例值：
     */
    @SerializedName("sub_shift_leader_ids")
    private String[] subShiftLeaderIds;
    /**
     * 是否弹性打卡
     * <p> 示例值：false
     */
    @SerializedName("is_flexible")
    private Boolean isFlexible;
    /**
     * 弹性打卡时间，设置【上班最多可晚到】与【下班最多可早走】时间，如果不设置flexible_rule则生效
     * <p> 示例值：60
     */
    @SerializedName("flexible_minutes")
    private Integer flexibleMinutes;
    /**
     * 弹性打卡时间设置
     * <p> 示例值：
     */
    @SerializedName("flexible_rule")
    private FlexibleRule[] flexibleRule;
    /**
     * 不需要打下班卡
     * <p> 示例值：true
     */
    @SerializedName("no_need_off")
    private Boolean noNeedOff;
    /**
     * 打卡规则
     * <p> 示例值：
     */
    @SerializedName("punch_time_rule")
    private PunchTimeRule[] punchTimeRule;
    /**
     * 晚走晚到规则
     * <p> 示例值：
     */
    @SerializedName("late_off_late_on_rule")
    private LateOffLateOnRule[] lateOffLateOnRule;
    /**
     * 休息规则
     * <p> 示例值：
     */
    @SerializedName("rest_time_rule")
    private RestRule[] restTimeRule;
    /**
     * 打卡规则
     * <p> 示例值：
     */
    @SerializedName("overtime_rule")
    private OvertimeRule[] overtimeRule;
    /**
     * 日期类型，【是否弹性打卡 = ture】时，不可设置为“休息日”  可选值：1：工作日 2：休息日     示例值：（默认值）1
     * <p> 示例值：1
     */
    @SerializedName("day_type")
    private Integer dayType;
    /**
     * 班外休息规则
     * <p> 示例值：
     */
    @SerializedName("overtime_rest_time_rule")
    private RestRule[] overtimeRestTimeRule;
    /**
     * 晚到多久记为严重迟到（优先级比原有字段高）
     * <p> 示例值：40
     */
    @SerializedName("late_minutes_as_serious_late")
    private Integer lateMinutesAsSeriousLate;
    /**
     * 半天分割规则
     * <p> 示例值：
     */
    @SerializedName("shift_middle_time_rule")
    private ShiftMiddleTimeRule shiftMiddleTimeRule;
    /**
     * 应出勤配置
     * <p> 示例值：
     */
    @SerializedName("shift_attendance_time_config")
    private ShiftAttendanceTimeConfig shiftAttendanceTimeConfig;
    /**
     * 晚走次日晚到配置规则
     * <p> 示例值：
     */
    @SerializedName("late_off_late_on_setting")
    private LateOffLateOnSetting lateOffLateOnSetting;
    /**
     * 班次id(更新班次时需要传递)
     * <p> 示例值：6919358778597097404
     */
    @SerializedName("id")
    private String id;

    public String getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getShiftName() {
        return this.shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public Integer getPunchTimes() {
        return this.punchTimes;
    }

    public void setPunchTimes(Integer punchTimes) {
        this.punchTimes = punchTimes;
    }

    public String[] getSubShiftLeaderIds() {
        return this.subShiftLeaderIds;
    }

    public void setSubShiftLeaderIds(String[] subShiftLeaderIds) {
        this.subShiftLeaderIds = subShiftLeaderIds;
    }

    public Boolean getIsFlexible() {
        return this.isFlexible;
    }

    public void setIsFlexible(Boolean isFlexible) {
        this.isFlexible = isFlexible;
    }

    public Integer getFlexibleMinutes() {
        return this.flexibleMinutes;
    }

    public void setFlexibleMinutes(Integer flexibleMinutes) {
        this.flexibleMinutes = flexibleMinutes;
    }

    public FlexibleRule[] getFlexibleRule() {
        return this.flexibleRule;
    }

    public void setFlexibleRule(FlexibleRule[] flexibleRule) {
        this.flexibleRule = flexibleRule;
    }

    public Boolean getNoNeedOff() {
        return this.noNeedOff;
    }

    public void setNoNeedOff(Boolean noNeedOff) {
        this.noNeedOff = noNeedOff;
    }

    public PunchTimeRule[] getPunchTimeRule() {
        return this.punchTimeRule;
    }

    public void setPunchTimeRule(PunchTimeRule[] punchTimeRule) {
        this.punchTimeRule = punchTimeRule;
    }

    public LateOffLateOnRule[] getLateOffLateOnRule() {
        return this.lateOffLateOnRule;
    }

    public void setLateOffLateOnRule(LateOffLateOnRule[] lateOffLateOnRule) {
        this.lateOffLateOnRule = lateOffLateOnRule;
    }

    public RestRule[] getRestTimeRule() {
        return this.restTimeRule;
    }

    public void setRestTimeRule(RestRule[] restTimeRule) {
        this.restTimeRule = restTimeRule;
    }

    public OvertimeRule[] getOvertimeRule() {
        return this.overtimeRule;
    }

    public void setOvertimeRule(OvertimeRule[] overtimeRule) {
        this.overtimeRule = overtimeRule;
    }

    public Integer getDayType() {
        return this.dayType;
    }

    public void setDayType(Integer dayType) {
        this.dayType = dayType;
    }

    public RestRule[] getOvertimeRestTimeRule() {
        return this.overtimeRestTimeRule;
    }

    public void setOvertimeRestTimeRule(RestRule[] overtimeRestTimeRule) {
        this.overtimeRestTimeRule = overtimeRestTimeRule;
    }

    public Integer getLateMinutesAsSeriousLate() {
        return this.lateMinutesAsSeriousLate;
    }

    public void setLateMinutesAsSeriousLate(Integer lateMinutesAsSeriousLate) {
        this.lateMinutesAsSeriousLate = lateMinutesAsSeriousLate;
    }

    public ShiftMiddleTimeRule getShiftMiddleTimeRule() {
        return this.shiftMiddleTimeRule;
    }

    public void setShiftMiddleTimeRule(ShiftMiddleTimeRule shiftMiddleTimeRule) {
        this.shiftMiddleTimeRule = shiftMiddleTimeRule;
    }

    public ShiftAttendanceTimeConfig getShiftAttendanceTimeConfig() {
        return this.shiftAttendanceTimeConfig;
    }

    public void setShiftAttendanceTimeConfig(ShiftAttendanceTimeConfig shiftAttendanceTimeConfig) {
        this.shiftAttendanceTimeConfig = shiftAttendanceTimeConfig;
    }

    public LateOffLateOnSetting getLateOffLateOnSetting() {
        return this.lateOffLateOnSetting;
    }

    public void setLateOffLateOnSetting(LateOffLateOnSetting lateOffLateOnSetting) {
        this.lateOffLateOnSetting = lateOffLateOnSetting;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
