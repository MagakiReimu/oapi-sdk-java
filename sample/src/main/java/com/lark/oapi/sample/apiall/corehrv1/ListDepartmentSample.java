package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.ListDepartmentReq;
import com.lark.oapi.service.corehr.v1.model.ListDepartmentResp;

// GET /open-apis/corehr/v1/departments
public class ListDepartmentSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListDepartmentReq req = ListDepartmentReq.newBuilder()
                .pageToken("")
                .pageSize("100")
                .departmentIdList(new String[]{})
                .nameList(new String[]{})
                .userIdType("people_corehr_id")
                .departmentIdType("people_corehr_department_id")
                .build();

        // 发起请求
        ListDepartmentResp resp = client.corehr().department().list(req);

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
