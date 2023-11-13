package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.GetByApplicationEmployeeReq;
import com.lark.oapi.service.hire.v1.model.GetByApplicationEmployeeResp;

// GET /open-apis/hire/v1/employees/get_by_application
public class GetByApplicationEmployeeSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetByApplicationEmployeeReq req = GetByApplicationEmployeeReq.newBuilder()
                .applicationId("123")
                .userIdType("open_id")
                .departmentIdType("people_admin_department_id")
                .build();

        // 发起请求
        GetByApplicationEmployeeResp resp = client.hire().employee().getByApplication(req);

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
