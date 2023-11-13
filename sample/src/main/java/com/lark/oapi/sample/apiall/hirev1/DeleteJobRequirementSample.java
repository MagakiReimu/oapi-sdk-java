package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.DeleteJobRequirementReq;
import com.lark.oapi.service.hire.v1.model.DeleteJobRequirementResp;

// DELETE /open-apis/hire/v1/job_requirements/:job_requirement_id
public class DeleteJobRequirementSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeleteJobRequirementReq req = DeleteJobRequirementReq.newBuilder()
                .jobRequirementId("1616161616")
                .build();

        // 发起请求
        DeleteJobRequirementResp resp = client.hire().jobRequirement().delete(req);

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
