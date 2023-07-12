package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.ObjectFieldData;
import com.lark.oapi.service.corehr.v1.model.SubmitOffboardingReq;
import com.lark.oapi.service.corehr.v1.model.SubmitOffboardingReqBody;
import com.lark.oapi.service.corehr.v1.model.SubmitOffboardingResp;

// POST /open-apis/corehr/v1/offboardings/submit
public class SubmitOffboardingSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        SubmitOffboardingReq req = SubmitOffboardingReq.newBuilder()
                .userIdType("people_corehr_id")
                .submitOffboardingReqBody(SubmitOffboardingReqBody.newBuilder()
                        .offboardingMode(1)
                        .employmentId("6982509313466189342")
                        .offboardingDate("2022-05-18")
                        .offboardingReasonUniqueIdentifier("reason_for_offboarding_option8")
                        .offboardingReasonExplanation("离职原因说明")
                        .initiatorId("6982509313466189341")
                        .addBlockList(false)
                        .blockReason("红线")
                        .blockReasonExplanation("xx 年 xx 月 xx 日因 xx 原因红线")
                        .customFields(new ObjectFieldData[]{})
                        .build())
                .build();

        // 发起请求
        SubmitOffboardingResp resp = client.corehr().offboarding().submit(req);

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
