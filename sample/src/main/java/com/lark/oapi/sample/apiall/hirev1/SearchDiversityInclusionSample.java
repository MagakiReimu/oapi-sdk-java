package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.SearchDiversityInclusionReq;
import com.lark.oapi.service.hire.v1.model.SearchDiversityInclusionReqBody;
import com.lark.oapi.service.hire.v1.model.SearchDiversityInclusionResp;

// POST /open-apis/hire/v1/applications/diversity_inclusions/search
public class SearchDiversityInclusionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        SearchDiversityInclusionReq req = SearchDiversityInclusionReq.newBuilder()
                .searchDiversityInclusionReqBody(SearchDiversityInclusionReqBody.newBuilder()
                        .talentIds(new String[]{})
                        .applicationIds(new String[]{})
                        .build())
                .build();

        // 发起请求
        SearchDiversityInclusionResp resp = client.hire().v1().diversityInclusion().search(req);

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
