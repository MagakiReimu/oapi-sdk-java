package com.lark.oapi.sample.apiall.taskv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.task.v2.model.DeleteCommentReq;
import com.lark.oapi.service.task.v2.model.DeleteCommentResp;

// DELETE /open-apis/task/v2/comments/:comment_id
public class DeleteCommentSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeleteCommentReq req = DeleteCommentReq.newBuilder()
                .commentId("7198104824246747156")
                .build();

        // 发起请求
        DeleteCommentResp resp = client.task().v2().comment().delete(req);

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
