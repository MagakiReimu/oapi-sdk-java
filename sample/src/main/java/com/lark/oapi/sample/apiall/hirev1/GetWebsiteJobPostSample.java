package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.GetWebsiteJobPostReq;
import com.lark.oapi.service.hire.v1.model.GetWebsiteJobPostResp;

// GET /open-apis/hire/v1/websites/:website_id/job_posts/:job_post_id
public class GetWebsiteJobPostSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetWebsiteJobPostReq req = GetWebsiteJobPostReq.newBuilder()
                .websiteId("111")
                .jobPostId("111")
                .userIdType("open_id")
                .departmentIdType("open_department_id")
                .jobLevelIdType("people_admin_job_level_id")
                .build();

        // 发起请求
        GetWebsiteJobPostResp resp = client.hire().v1().websiteJobPost().get(req);

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
