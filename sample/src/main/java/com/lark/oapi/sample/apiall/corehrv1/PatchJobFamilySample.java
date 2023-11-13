package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.*;

// PATCH /open-apis/corehr/v1/job_families/:job_family_id
public class PatchJobFamilySample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchJobFamilyReq req = PatchJobFamilyReq.newBuilder()
                .jobFamilyId("1616161616")
                .clientToken("12454646")
                .jobFamily(JobFamily.newBuilder()
                        .name(new I18n[]{})
                        .active(true)
                        .parentId("4698020757495316313")
                        .effectiveTime("2020-05-01 00:00:00")
                        .expirationTime("2020-05-02 00:00:00")
                        .code("123456")
                        .customFields(new ObjectFieldData[]{})
                        .build())
                .build();

        // 发起请求
        PatchJobFamilyResp resp = client.corehr().jobFamily().patch(req);

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
