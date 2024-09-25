package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.CreateReferralAccountReq;
import com.lark.oapi.service.hire.v1.model.CreateReferralAccountReqBody;
import com.lark.oapi.service.hire.v1.model.CreateReferralAccountResp;
import com.lark.oapi.service.hire.v1.model.Mobile;

// POST /open-apis/hire/v1/referral_account
public class CreateReferralAccountSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateReferralAccountReq req = CreateReferralAccountReq.newBuilder()
                .userIdType("user_id")
                .createReferralAccountReqBody(CreateReferralAccountReqBody.newBuilder()
                        .mobile(Mobile.newBuilder().build())
                        .email("hire@open.com")
                        .build())
                .build();

        // 发起请求
        CreateReferralAccountResp resp = client.hire().v1().referralAccount().create(req);

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
