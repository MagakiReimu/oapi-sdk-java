package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.*;

import java.util.HashMap;

// PUT /open-apis/hire/v1/external_interviews/:external_interview_id
public class UpdateExternalInterviewSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        UpdateExternalInterviewReq req = UpdateExternalInterviewReq.newBuilder()
                .externalInterviewId("6960663240925956660")
                .externalInterview(ExternalInterview.newBuilder()
                        .externalApplicationId("6960663240925956437")
                        .participateStatus(1)
                        .beginTime(1618500278)
                        .endTime(1618500278)
                        .interviewAssessments(new ExternalInterviewAssessment[]{})
                        .build())
                .build();

        // 发起请求
        UpdateExternalInterviewResp resp = client.hire().v1().externalInterview().update(req);

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
