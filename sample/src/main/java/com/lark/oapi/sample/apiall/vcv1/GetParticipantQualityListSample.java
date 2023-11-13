package com.lark.oapi.sample.apiall.vcv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.vc.v1.model.GetParticipantQualityListReq;
import com.lark.oapi.service.vc.v1.model.GetParticipantQualityListResp;

// GET /open-apis/vc/v1/participant_quality_list
public class GetParticipantQualityListSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetParticipantQualityListReq req = GetParticipantQualityListReq.newBuilder()
                .meetingStartTime("1655276858")
                .meetingEndTime("1655276858")
                .meetingNo("123456789")
                .joinTime("1655276858")
                .userId("ou_3ec3f6a28a0d08c45d895276e8e5e19b")
                .roomId("omm_eada1d61a550955240c28757e7dec3af")
                .pageSize(20)
                .pageToken("")
                .userIdType("user_id")
                .build();

        // 发起请求
        GetParticipantQualityListResp resp = client.vc().participantQualityList().get(req);

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
