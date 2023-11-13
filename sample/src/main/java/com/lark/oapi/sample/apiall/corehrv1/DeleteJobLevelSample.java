package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.DeleteJobLevelReq;
import com.lark.oapi.service.corehr.v1.model.DeleteJobLevelResp;

// DELETE /open-apis/corehr/v1/job_levels/:job_level_id
public class DeleteJobLevelSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeleteJobLevelReq req = DeleteJobLevelReq.newBuilder()
                .jobLevelId("5423452542")
                .build();

        // 发起请求
        DeleteJobLevelResp resp = client.corehr().jobLevel().delete(req);

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
