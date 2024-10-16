package com.lark.oapi.sample.apiall.taskv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.task.v2.model.*;

import java.util.HashMap;

// PATCH /open-apis/task/v2/tasklists/:tasklist_guid/activity_subscriptions/:activity_subscription_guid
public class PatchTasklistActivitySubscriptionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchTasklistActivitySubscriptionReq req = PatchTasklistActivitySubscriptionReq.newBuilder()
                .tasklistGuid("33991879-704f-444f-81d7-55a6aa7be80c")
                .activitySubscriptionGuid("f5ca6747-5ac3-422e-a97e-972c1b2c24f3")
                .userIdType("open_id")
                .patchTasklistActivitySubscriptionReqBody(PatchTasklistActivitySubscriptionReqBody.newBuilder()
                        .activitySubscription(TasklistActivitySubscription.newBuilder().build())
                        .updateFields(new String[]{})
                        .build())
                .build();

        // 发起请求
        PatchTasklistActivitySubscriptionResp resp = client.task().v2().tasklistActivitySubscription().patch(req);

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
