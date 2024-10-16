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

package com.lark.oapi.service.helpdesk.v1.resource;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;

import java.io.ByteArrayOutputStream;

import com.lark.oapi.service.helpdesk.v1.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AgentSkill {
    private static final Logger log = LoggerFactory.getLogger(AgentSkill.class);
    private final Config config;

    public AgentSkill(Config config) {
        this.config = config;
    }


    /**
     * 创建客服技能，该接口用于创建客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentSkillSample.java</a> ;
     */
    public CreateAgentSkillResp create(CreateAgentSkillReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/helpdesk/v1/agent_skills"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        CreateAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 创建客服技能，该接口用于创建客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentSkillSample.java</a> ;
     */
    public CreateAgentSkillResp create(CreateAgentSkillReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/helpdesk/v1/agent_skills"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        CreateAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 删除客服技能，该接口用于删除客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/DeleteAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/DeleteAgentSkillSample.java</a> ;
     */
    public DeleteAgentSkillResp delete(DeleteAgentSkillReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        DeleteAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 删除客服技能，该接口用于删除客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/DeleteAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/DeleteAgentSkillSample.java</a> ;
     */
    public DeleteAgentSkillResp delete(DeleteAgentSkillReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        DeleteAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取客服技能，该接口用于获取客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/GetAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/GetAgentSkillSample.java</a> ;
     */
    public GetAgentSkillResp get(GetAgentSkillReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取客服技能，该接口用于获取客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/GetAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/GetAgentSkillSample.java</a> ;
     */
    public GetAgentSkillResp get(GetAgentSkillReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取全部客服技能，获取全部客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillSample.java</a> ;
     */
    public ListAgentSkillResp list(RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skills"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , null);

        // 反序列化
        ListAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills"
                    , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));

            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        return resp;
    }

    /**
     * 获取全部客服技能，获取全部客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillSample.java</a> ;
     */
    public ListAgentSkillResp list() throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skills"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , null);

        // 反序列化
        ListAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills"
                    , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));

            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        return resp;
    }

    /**
     * 更新客服技能，该接口用于更新客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/PatchAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/PatchAgentSkillSample.java</a> ;
     */
    public PatchAgentSkillResp patch(PatchAgentSkillReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        PatchAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 更新客服技能，该接口用于更新客服技能
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/PatchAgentSkillSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/PatchAgentSkillSample.java</a> ;
     */
    public PatchAgentSkillResp patch(PatchAgentSkillReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        PatchAgentSkillResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchAgentSkillResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skills/:agent_skill_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
