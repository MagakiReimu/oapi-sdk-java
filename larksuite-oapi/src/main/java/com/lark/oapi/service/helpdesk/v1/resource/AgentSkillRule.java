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

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.helpdesk.v1.model.ListAgentSkillRuleResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class AgentSkillRule {
    private static final Logger log = LoggerFactory.getLogger(AgentSkillRule.class);
    private final Config config;

    public AgentSkillRule(Config config) {
        this.config = config;
    }


    /**
     * 获取客服技能列表，该接口用于获取全部客服技能。仅支持自建应用。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill_rule/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill_rule/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillRuleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillRuleSample.java</a> ;
     */
    public ListAgentSkillRuleResp list(RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skill_rules"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , null);

        // 反序列化
        ListAgentSkillRuleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentSkillRuleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skill_rules"
                    , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));

            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        return resp;
    }

    /**
     * 获取客服技能列表，该接口用于获取全部客服技能。仅支持自建应用。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill_rule/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_skill_rule/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillRuleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentSkillRuleSample.java</a> ;
     */
    public ListAgentSkillRuleResp list() throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_skill_rules"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , null);

        // 反序列化
        ListAgentSkillRuleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentSkillRuleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_skill_rules"
                    , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));

            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        return resp;
    }
}
