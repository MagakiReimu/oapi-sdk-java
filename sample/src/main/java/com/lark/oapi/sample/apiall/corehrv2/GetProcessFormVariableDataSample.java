package com.lark.oapi.sample.apiall.corehrv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v2.model.GetProcessFormVariableDataReq;
import com.lark.oapi.service.corehr.v2.model.GetProcessFormVariableDataResp;

// GET /open-apis/corehr/v2/processes/:process_id/form_variable_data
public class GetProcessFormVariableDataSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetProcessFormVariableDataReq req = GetProcessFormVariableDataReq.newBuilder()
                .processId("7341373094948242956")
                .userIdType("people_corehr_id")
                .departmentIdType("people_corehr_department_id")
                .build();

        // 发起请求
        GetProcessFormVariableDataResp resp = client.corehr().v2().processFormVariableData().get(req);

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
