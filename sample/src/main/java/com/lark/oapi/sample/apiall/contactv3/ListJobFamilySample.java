package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.ListJobFamilyReq;
import com.lark.oapi.service.contact.v3.model.ListJobFamilyResp;

// GET /open-apis/contact/v3/job_families
public class ListJobFamilySample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListJobFamilyReq req = ListJobFamilyReq.newBuilder()
                .pageSize(10)
                .pageToken("")
                .name("2-2")
                .build();

        // 发起请求
        ListJobFamilyResp resp = client.contact().jobFamily().list(req);

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
