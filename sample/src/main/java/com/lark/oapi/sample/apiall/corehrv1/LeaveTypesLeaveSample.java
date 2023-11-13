package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.LeaveTypesLeaveReq;
import com.lark.oapi.service.corehr.v1.model.LeaveTypesLeaveResp;

// GET /open-apis/corehr/v1/leaves/leave_types
public class LeaveTypesLeaveSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        LeaveTypesLeaveReq req = LeaveTypesLeaveReq.newBuilder()
                .pageToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9")
                .pageSize("100")
                .status("1")
                .userIdType("people_corehr_id")
                .build();

        // 发起请求
        LeaveTypesLeaveResp resp = client.corehr().leave().leaveTypes(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
