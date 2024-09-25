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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateRoleAssignAuthorizationReqBody {
    /**
     * 授权
     * <p> 示例值：67489937334909845
     */
    @SerializedName("assigned_organization_items")
    private AssignedOrganizationWithCode[][] assignedOrganizationItems;

    // builder 开始
    public UpdateRoleAssignAuthorizationReqBody() {
    }

    public UpdateRoleAssignAuthorizationReqBody(Builder builder) {
        /**
         * 授权
         * <p> 示例值：67489937334909845
         */
        this.assignedOrganizationItems = builder.assignedOrganizationItems;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public AssignedOrganizationWithCode[][] getAssignedOrganizationItems() {
        return this.assignedOrganizationItems;
    }

    public void setAssignedOrganizationItems(AssignedOrganizationWithCode[][] assignedOrganizationItems) {
        this.assignedOrganizationItems = assignedOrganizationItems;
    }

    public static class Builder {
        /**
         * 授权
         * <p> 示例值：67489937334909845
         */
        private AssignedOrganizationWithCode[][] assignedOrganizationItems;

        /**
         * 授权
         * <p> 示例值：67489937334909845
         *
         * @param assignedOrganizationItems
         * @return
         */
        public Builder assignedOrganizationItems(AssignedOrganizationWithCode[][] assignedOrganizationItems) {
            this.assignedOrganizationItems = assignedOrganizationItems;
            return this;
        }


        public UpdateRoleAssignAuthorizationReqBody build() {
            return new UpdateRoleAssignAuthorizationReqBody(this);
        }
    }
}
