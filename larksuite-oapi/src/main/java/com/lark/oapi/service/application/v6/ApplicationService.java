// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.application.v6;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.application.v6.model.GetApplicationAppVersionReq;
import com.lark.oapi.service.application.v6.model.GetApplicationAppVersionResp;
import com.lark.oapi.service.application.v6.model.GetApplicationReq;
import com.lark.oapi.service.application.v6.model.GetApplicationResp;
import com.lark.oapi.service.application.v6.model.ListApplicationFeedbackReq;
import com.lark.oapi.service.application.v6.model.ListApplicationFeedbackResp;
import com.lark.oapi.service.application.v6.model.OverviewApplicationAppUsageReq;
import com.lark.oapi.service.application.v6.model.OverviewApplicationAppUsageResp;
import com.lark.oapi.service.application.v6.model.P1AppOpenV6;
import com.lark.oapi.service.application.v6.model.P1AppStatusChangedV6;
import com.lark.oapi.service.application.v6.model.P1AppUninstalledV6;
import com.lark.oapi.service.application.v6.model.P1OrderPaidV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationAppVersionAuditV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationAppVersionPublishApplyV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationAppVersionPublishRevokeV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationCreatedV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationFeedbackCreatedV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationFeedbackUpdatedV6;
import com.lark.oapi.service.application.v6.model.P2ApplicationVisibilityAddedV6;
import com.lark.oapi.service.application.v6.model.PatchApplicationAppVersionReq;
import com.lark.oapi.service.application.v6.model.PatchApplicationAppVersionResp;
import com.lark.oapi.service.application.v6.model.PatchApplicationFeedbackReq;
import com.lark.oapi.service.application.v6.model.PatchApplicationFeedbackResp;
import com.lark.oapi.service.application.v6.model.PatchApplicationReq;
import com.lark.oapi.service.application.v6.model.PatchApplicationResp;
import com.lark.oapi.service.application.v6.model.UnderauditlistApplicationReq;
import com.lark.oapi.service.application.v6.model.UnderauditlistApplicationResp;

public class ApplicationService {

  private final Application application; // 应用
  private final ApplicationAppUsage applicationAppUsage; // 应用使用情况
  private final ApplicationAppVersion applicationAppVersion; // 事件
  private final ApplicationFeedback applicationFeedback; // 应用反馈
  private final ApplicationVisibility applicationVisibility; // 事件

  public ApplicationService(Config config) {
    this.application = new Application(config);
    this.applicationAppUsage = new ApplicationAppUsage(config);
    this.applicationAppVersion = new ApplicationAppVersion(config);
    this.applicationFeedback = new ApplicationFeedback(config);
    this.applicationVisibility = new ApplicationVisibility(config);
  }

  /**
   * 应用
   *
   * @return
   */
  public Application application() {
    return application;
  }

  /**
   * 应用使用情况
   *
   * @return
   */
  public ApplicationAppUsage applicationAppUsage() {
    return applicationAppUsage;
  }

  /**
   * 事件
   *
   * @return
   */
  public ApplicationAppVersion applicationAppVersion() {
    return applicationAppVersion;
  }

  /**
   * 应用反馈
   *
   * @return
   */
  public ApplicationFeedback applicationFeedback() {
    return applicationFeedback;
  }

  /**
   * 事件
   *
   * @return
   */
  public ApplicationVisibility applicationVisibility() {
    return applicationVisibility;
  }

  public static class Application {

    private final Config config;

    public Application(Config config) {
      this.config = config;
    }

    /**
     * 获取应用信息，根据app_id获取应用的基础信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationSample.java</a>
     * ;
     */
    public GetApplicationResp get(GetApplicationReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取应用信息，根据app_id获取应用的基础信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationSample.java</a>
     * ;
     */
    public GetApplicationResp get(GetApplicationReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用分组信息，更新应用的分组信息（分组会影响应用在工作台中的分类情况，请谨慎更新）
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationSample.java</a>
     * ;
     */
    public PatchApplicationResp patch(PatchApplicationReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用分组信息，更新应用的分组信息（分组会影响应用在工作台中的分类情况，请谨慎更新）
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationSample.java</a>
     * ;
     */
    public PatchApplicationResp patch(PatchApplicationReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 查看待审核的应用列表，查看本企业下所有待审核的自建应用列表
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//UnderauditlistApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//UnderauditlistApplicationSample.java</a>
     * ;
     */
    public UnderauditlistApplicationResp underauditlist(UnderauditlistApplicationReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/underauditlist"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UnderauditlistApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UnderauditlistApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 查看待审核的应用列表，查看本企业下所有待审核的自建应用列表
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//UnderauditlistApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//UnderauditlistApplicationSample.java</a>
     * ;
     */
    public UnderauditlistApplicationResp underauditlist(UnderauditlistApplicationReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/underauditlist"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UnderauditlistApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UnderauditlistApplicationResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class ApplicationAppUsage {

    private final Config config;

    public ApplicationAppUsage(Config config) {
      this.config = config;
    }

    /**
     * 获取应用使用概览，查看应用在某一天/某一周/某一个月的使用数据，可以查看租户整体对应用的使用情况，也可以分部门查看。
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4.
     * 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;5. 按照部门查看数据时，会展示当前部门以及其子部门的整体使用情况;6. 调用频控为100次/分
     * ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//OverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//OverviewApplicationAppUsageSample.java</a>
     * ;
     */
    public OverviewApplicationAppUsageResp overview(OverviewApplicationAppUsageReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/application/v6/applications/:app_id/app_usage/overview"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      OverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          OverviewApplicationAppUsageResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取应用使用概览，查看应用在某一天/某一周/某一个月的使用数据，可以查看租户整体对应用的使用情况，也可以分部门查看。
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4.
     * 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;5. 按照部门查看数据时，会展示当前部门以及其子部门的整体使用情况;6. 调用频控为100次/分
     * ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//OverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//OverviewApplicationAppUsageSample.java</a>
     * ;
     */
    public OverviewApplicationAppUsageResp overview(OverviewApplicationAppUsageReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/application/v6/applications/:app_id/app_usage/overview"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      OverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          OverviewApplicationAppUsageResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class ApplicationAppVersion {

    private final Config config;

    public ApplicationAppVersion(Config config) {
      this.config = config;
    }

    /**
     * 获取应用版本信息，根据 app_id，version_id 获取对应应用版本的信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationAppVersionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationAppVersionSample.java</a>
     * ;
     */
    public GetApplicationAppVersionResp get(GetApplicationAppVersionReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id/app_versions/:version_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetApplicationAppVersionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetApplicationAppVersionResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取应用版本信息，根据 app_id，version_id 获取对应应用版本的信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationAppVersionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//GetApplicationAppVersionSample.java</a>
     * ;
     */
    public GetApplicationAppVersionResp get(GetApplicationAppVersionReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id/app_versions/:version_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetApplicationAppVersionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetApplicationAppVersionResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用审核状态，通过接口来更新应用版本的审核结果：通过后应用可以直接上架；拒绝后则开发者可以看到拒绝理由，并在修改后再次申请发布。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationAppVersionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationAppVersionSample.java</a>
     * ;
     */
    public PatchApplicationAppVersionResp patch(PatchApplicationAppVersionReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id/app_versions/:version_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationAppVersionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationAppVersionResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用审核状态，通过接口来更新应用版本的审核结果：通过后应用可以直接上架；拒绝后则开发者可以看到拒绝理由，并在修改后再次申请发布。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_version/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationAppVersionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationAppVersionSample.java</a>
     * ;
     */
    public PatchApplicationAppVersionResp patch(PatchApplicationAppVersionReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id/app_versions/:version_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationAppVersionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationAppVersionResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class ApplicationFeedback {

    private final Config config;

    public ApplicationFeedback(Config config) {
      this.config = config;
    }

    /**
     * 获取应用反馈列表，查询应用的反馈数据
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//ListApplicationFeedbackSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//ListApplicationFeedbackSample.java</a>
     * ;
     */
    public ListApplicationFeedbackResp list(ListApplicationFeedbackReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id/feedbacks"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListApplicationFeedbackResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListApplicationFeedbackResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取应用反馈列表，查询应用的反馈数据
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//ListApplicationFeedbackSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//ListApplicationFeedbackSample.java</a>
     * ;
     */
    public ListApplicationFeedbackResp list(ListApplicationFeedbackReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/application/v6/applications/:app_id/feedbacks"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListApplicationFeedbackResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListApplicationFeedbackResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用反馈，更新应用的反馈数据
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationFeedbackSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationFeedbackSample.java</a>
     * ;
     */
    public PatchApplicationFeedbackResp patch(PatchApplicationFeedbackReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id/feedbacks/:feedback_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationFeedbackResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationFeedbackResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新应用反馈，更新应用的反馈数据
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-feedback/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationFeedbackSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6//PatchApplicationFeedbackSample.java</a>
     * ;
     */
    public PatchApplicationFeedbackResp patch(PatchApplicationFeedbackReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/application/v6/applications/:app_id/feedbacks/:feedback_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchApplicationFeedbackResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchApplicationFeedbackResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class ApplicationVisibility {

    private final Config config;

    public ApplicationVisibility(Config config) {
      this.config = config;
    }
  }

  public abstract static class P2ApplicationCreatedV6Handler implements
      IEventHandler<P2ApplicationCreatedV6> {

    @Override
    public P2ApplicationCreatedV6 getEvent() {
      return new P2ApplicationCreatedV6();
    }
  }

  public abstract static class P2ApplicationAppVersionAuditV6Handler implements
      IEventHandler<P2ApplicationAppVersionAuditV6> {

    @Override
    public P2ApplicationAppVersionAuditV6 getEvent() {
      return new P2ApplicationAppVersionAuditV6();
    }
  }

  public abstract static class P2ApplicationAppVersionPublishApplyV6Handler implements
      IEventHandler<P2ApplicationAppVersionPublishApplyV6> {

    @Override
    public P2ApplicationAppVersionPublishApplyV6 getEvent() {
      return new P2ApplicationAppVersionPublishApplyV6();
    }
  }

  public abstract static class P2ApplicationAppVersionPublishRevokeV6Handler implements
      IEventHandler<P2ApplicationAppVersionPublishRevokeV6> {

    @Override
    public P2ApplicationAppVersionPublishRevokeV6 getEvent() {
      return new P2ApplicationAppVersionPublishRevokeV6();
    }
  }

  public abstract static class P2ApplicationFeedbackCreatedV6Handler implements
      IEventHandler<P2ApplicationFeedbackCreatedV6> {

    @Override
    public P2ApplicationFeedbackCreatedV6 getEvent() {
      return new P2ApplicationFeedbackCreatedV6();
    }
  }

  public abstract static class P2ApplicationFeedbackUpdatedV6Handler implements
      IEventHandler<P2ApplicationFeedbackUpdatedV6> {

    @Override
    public P2ApplicationFeedbackUpdatedV6 getEvent() {
      return new P2ApplicationFeedbackUpdatedV6();
    }
  }

  public abstract static class P2ApplicationVisibilityAddedV6Handler implements
      IEventHandler<P2ApplicationVisibilityAddedV6> {

    @Override
    public P2ApplicationVisibilityAddedV6 getEvent() {
      return new P2ApplicationVisibilityAddedV6();
    }
  }

  public abstract static class P1AppOpenV6Handler implements IEventHandler<P1AppOpenV6> {

    @Override
    public P1AppOpenV6 getEvent() {
      return new P1AppOpenV6();
    }
  }

  public abstract static class P1AppStatusChangedV6Handler implements
      IEventHandler<P1AppStatusChangedV6> {

    @Override
    public P1AppStatusChangedV6 getEvent() {
      return new P1AppStatusChangedV6();
    }
  }

  public abstract static class P1OrderPaidV6Handler implements IEventHandler<P1OrderPaidV6> {

    @Override
    public P1OrderPaidV6 getEvent() {
      return new P1OrderPaidV6();
    }
  }

  public abstract static class P1AppUninstalledV6Handler implements
      IEventHandler<P1AppUninstalledV6> {

    @Override
    public P1AppUninstalledV6 getEvent() {
      return new P1AppUninstalledV6();
    }
  }
}