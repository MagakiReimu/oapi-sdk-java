package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.*;
import java.util.HashMap;

// GET /open-apis/im/v1/messages/:message_id/resources/:file_key
public class GetMessageResourceSample{

  public static void main(String arg[]) throws Exception {
	  // 构建client
	  Client client = Client.newBuilder("appId", "appSecret").build();

	  // 创建请求对象
	  GetMessageResourceReq req = GetMessageResourceReq.newBuilder()
			 .messageId("om_dc13264520392913993dd051dba21dcf")
			 .fileKey("file_456a92d6-c6ea-4de4-ac3f-7afcf44ac78g")
			 .type("image")
			 .build();

	  // 发起请求
	  GetMessageResourceResp resp = client.im().messageResource().get(req);

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
