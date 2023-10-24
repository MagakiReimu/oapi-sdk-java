package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.*;
import java.util.HashMap;

// POST /open-apis/contact/v3/unit/bind_department
public class BindDepartmentUnitSample{

  public static void main(String arg[]) throws Exception {
	  // 构建client
	  Client client = Client.newBuilder("appId", "appSecret").build();

	  // 创建请求对象
	  BindDepartmentUnitReq req = BindDepartmentUnitReq.newBuilder()
			.bindDepartmentUnitReqBody(BindDepartmentUnitReqBody.newBuilder()
				 .unitId("BU121")
				 .departmentId("od-4e6ac4d14bcd5071a37a39de902c7141")
				 .departmentIdType("open_department_id")
				  .build())
			 .build();

	  // 发起请求
	  BindDepartmentUnitResp resp = client.contact().unit().bindDepartment(req);

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
