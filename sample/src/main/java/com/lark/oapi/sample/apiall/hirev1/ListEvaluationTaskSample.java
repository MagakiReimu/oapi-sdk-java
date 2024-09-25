package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.ListEvaluationTaskReq;
import com.lark.oapi.service.hire.v1.model.ListEvaluationTaskResp;

// GET /open-apis/hire/v1/evaluation_tasks
public class ListEvaluationTaskSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListEvaluationTaskReq req = ListEvaluationTaskReq.newBuilder()
                .pageSize(10)
                .pageToken("eyJvZmZzZXQiOjEwLCJ0aW1lc3RhbXAiOjE2Mjc1NTUyMjM2NzIsImlkIjpudWxsfQ==")
                .userId("ou_e6139117c300506837def50545420c6a")
                .activityStatus(1)
                .userIdType("user_id")
                .build();

        // 发起请求
        ListEvaluationTaskResp resp = client.hire().v1().evaluationTask().list(req);

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
