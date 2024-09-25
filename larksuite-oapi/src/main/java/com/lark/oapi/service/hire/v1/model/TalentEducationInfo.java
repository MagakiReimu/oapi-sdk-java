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

public class TalentEducationInfo {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    @SerializedName("id")
    private String id;
    /**
     * 学位
     * <p> 示例值：1
     */
    @SerializedName("degree")
    private Integer degree;
    /**
     * 学校
     * <p> 示例值：湘港大学
     */
    @SerializedName("school")
    private String school;
    /**
     * 专业
     * <p> 示例值：考古
     */
    @SerializedName("field_of_study")
    private String fieldOfStudy;
    /**
     * 开始时间
     * <p> 示例值：1990-01
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 结束时间
     * <p> 示例值：1994-01
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 结束时间-新，无「至今」传值。建议使用此字段，避免模糊的毕业时间影响候选人筛选
     * <p> 示例值：1687180087000
     */
    @SerializedName("end_time_v2")
    private String endTimeV2;
    /**
     * 学历类型
     * <p> 示例值：1
     */
    @SerializedName("education_type")
    private Integer educationType;
    /**
     * 成绩排名
     * <p> 示例值：5
     */
    @SerializedName("academic_ranking")
    private Integer academicRanking;
    /**
     * 教育经历标签
     * <p> 示例值：
     */
    @SerializedName("tag_list")
    private Integer[] tagList;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data_list")
    private TalentCustomizedDataChild[] customizedDataList;

    // builder 开始
    public TalentEducationInfo() {
    }

    public TalentEducationInfo(Builder builder) {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        this.id = builder.id;
        /**
         * 学位
         * <p> 示例值：1
         */
        this.degree = builder.degree;
        /**
         * 学校
         * <p> 示例值：湘港大学
         */
        this.school = builder.school;
        /**
         * 专业
         * <p> 示例值：考古
         */
        this.fieldOfStudy = builder.fieldOfStudy;
        /**
         * 开始时间
         * <p> 示例值：1990-01
         */
        this.startTime = builder.startTime;
        /**
         * 结束时间
         * <p> 示例值：1994-01
         */
        this.endTime = builder.endTime;
        /**
         * 结束时间-新，无「至今」传值。建议使用此字段，避免模糊的毕业时间影响候选人筛选
         * <p> 示例值：1687180087000
         */
        this.endTimeV2 = builder.endTimeV2;
        /**
         * 学历类型
         * <p> 示例值：1
         */
        this.educationType = builder.educationType;
        /**
         * 成绩排名
         * <p> 示例值：5
         */
        this.academicRanking = builder.academicRanking;
        /**
         * 教育经历标签
         * <p> 示例值：
         */
        this.tagList = builder.tagList;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedDataList = builder.customizedDataList;
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

    public Integer getDegree() {
        return this.degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFieldOfStudy() {
        return this.fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTimeV2() {
        return this.endTimeV2;
    }

    public void setEndTimeV2(String endTimeV2) {
        this.endTimeV2 = endTimeV2;
    }

    public Integer getEducationType() {
        return this.educationType;
    }

    public void setEducationType(Integer educationType) {
        this.educationType = educationType;
    }

    public Integer getAcademicRanking() {
        return this.academicRanking;
    }

    public void setAcademicRanking(Integer academicRanking) {
        this.academicRanking = academicRanking;
    }

    public Integer[] getTagList() {
        return this.tagList;
    }

    public void setTagList(Integer[] tagList) {
        this.tagList = tagList;
    }

    public TalentCustomizedDataChild[] getCustomizedDataList() {
        return this.customizedDataList;
    }

    public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
        this.customizedDataList = customizedDataList;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        private String id;
        /**
         * 学位
         * <p> 示例值：1
         */
        private Integer degree;
        /**
         * 学校
         * <p> 示例值：湘港大学
         */
        private String school;
        /**
         * 专业
         * <p> 示例值：考古
         */
        private String fieldOfStudy;
        /**
         * 开始时间
         * <p> 示例值：1990-01
         */
        private String startTime;
        /**
         * 结束时间
         * <p> 示例值：1994-01
         */
        private String endTime;
        /**
         * 结束时间-新，无「至今」传值。建议使用此字段，避免模糊的毕业时间影响候选人筛选
         * <p> 示例值：1687180087000
         */
        private String endTimeV2;
        /**
         * 学历类型
         * <p> 示例值：1
         */
        private Integer educationType;
        /**
         * 成绩排名
         * <p> 示例值：5
         */
        private Integer academicRanking;
        /**
         * 教育经历标签
         * <p> 示例值：
         */
        private Integer[] tagList;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private TalentCustomizedDataChild[] customizedDataList;

        /**
         * ID
         * <p> 示例值：6891560630172518670
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 学位
         * <p> 示例值：1
         *
         * @param degree
         * @return
         */
        public Builder degree(Integer degree) {
            this.degree = degree;
            return this;
        }


        /**
         * 学校
         * <p> 示例值：湘港大学
         *
         * @param school
         * @return
         */
        public Builder school(String school) {
            this.school = school;
            return this;
        }


        /**
         * 专业
         * <p> 示例值：考古
         *
         * @param fieldOfStudy
         * @return
         */
        public Builder fieldOfStudy(String fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }


        /**
         * 开始时间
         * <p> 示例值：1990-01
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 结束时间
         * <p> 示例值：1994-01
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 结束时间-新，无「至今」传值。建议使用此字段，避免模糊的毕业时间影响候选人筛选
         * <p> 示例值：1687180087000
         *
         * @param endTimeV2
         * @return
         */
        public Builder endTimeV2(String endTimeV2) {
            this.endTimeV2 = endTimeV2;
            return this;
        }


        /**
         * 学历类型
         * <p> 示例值：1
         *
         * @param educationType
         * @return
         */
        public Builder educationType(Integer educationType) {
            this.educationType = educationType;
            return this;
        }


        /**
         * 成绩排名
         * <p> 示例值：5
         *
         * @param academicRanking
         * @return
         */
        public Builder academicRanking(Integer academicRanking) {
            this.academicRanking = academicRanking;
            return this;
        }


        /**
         * 教育经历标签
         * <p> 示例值：
         *
         * @param tagList
         * @return
         */
        public Builder tagList(Integer[] tagList) {
            this.tagList = tagList;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedDataList
         * @return
         */
        public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
            this.customizedDataList = customizedDataList;
            return this;
        }


        public TalentEducationInfo build() {
            return new TalentEducationInfo(this);
        }
    }
}
