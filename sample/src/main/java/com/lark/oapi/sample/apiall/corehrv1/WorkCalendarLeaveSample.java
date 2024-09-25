package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.WkOption;
import com.lark.oapi.service.corehr.v1.model.WorkCalendarFilter;
import com.lark.oapi.service.corehr.v1.model.WorkCalendarLeaveReq;
import com.lark.oapi.service.corehr.v1.model.WorkCalendarLeaveResp;

// POST /open-apis/corehr/v1/leaves/work_calendar
public class WorkCalendarLeaveSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        WorkCalendarLeaveReq req = WorkCalendarLeaveReq.newBuilder()
                .workCalendarFilter(WorkCalendarFilter.newBuilder()
                        .wkCalendarIds(new String[]{})
                        .wkCalendarIdGt("12344")
                        .wkOption(WkOption.newBuilder().build())
                        .onlyEnable(true)
                        .build())
                .build();

        // 发起请求
        WorkCalendarLeaveResp resp = client.corehr().v1().leave().workCalendar(req);

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
