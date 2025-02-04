package com.lark.oapi.sample.apiall.corehrv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v2.model.*;

import java.util.HashMap;

import com.lark.oapi.service.corehr.v2.model.Enum;

// DELETE /open-apis/corehr/v2/cost_centers/:cost_center_id
public class DeleteCostCenterSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeleteCostCenterReq req = DeleteCostCenterReq.newBuilder()
                .costCenterId("6862995757234914824")
                .deleteCostCenterReqBody(DeleteCostCenterReqBody.newBuilder()
                        .operationReason("随着组织架构调整，该成本中心不再使用")
                        .build())
                .build();

        // 发起请求
        DeleteCostCenterResp resp = client.corehr().v2().costCenter().delete(req);

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
