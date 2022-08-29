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

package com.lark.oapi.service.search.v2;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.search.v2.model.CreateDataSourceItemReq;
import com.lark.oapi.service.search.v2.model.CreateDataSourceItemResp;
import com.lark.oapi.service.search.v2.model.CreateDataSourceReq;
import com.lark.oapi.service.search.v2.model.CreateDataSourceResp;
import com.lark.oapi.service.search.v2.model.CreateSchemaReq;
import com.lark.oapi.service.search.v2.model.CreateSchemaResp;
import com.lark.oapi.service.search.v2.model.DeleteDataSourceItemReq;
import com.lark.oapi.service.search.v2.model.DeleteDataSourceItemResp;
import com.lark.oapi.service.search.v2.model.DeleteDataSourceReq;
import com.lark.oapi.service.search.v2.model.DeleteDataSourceResp;
import com.lark.oapi.service.search.v2.model.DeleteSchemaReq;
import com.lark.oapi.service.search.v2.model.DeleteSchemaResp;
import com.lark.oapi.service.search.v2.model.GetDataSourceItemReq;
import com.lark.oapi.service.search.v2.model.GetDataSourceItemResp;
import com.lark.oapi.service.search.v2.model.GetDataSourceReq;
import com.lark.oapi.service.search.v2.model.GetDataSourceResp;
import com.lark.oapi.service.search.v2.model.GetSchemaReq;
import com.lark.oapi.service.search.v2.model.GetSchemaResp;
import com.lark.oapi.service.search.v2.model.ListDataSourceReq;
import com.lark.oapi.service.search.v2.model.ListDataSourceResp;
import com.lark.oapi.service.search.v2.model.PatchDataSourceReq;
import com.lark.oapi.service.search.v2.model.PatchDataSourceResp;
import com.lark.oapi.service.search.v2.model.PatchSchemaReq;
import com.lark.oapi.service.search.v2.model.PatchSchemaResp;

public class SearchService {

  private final DataSource dataSource; // 数据源
  private final DataSourceItem dataSourceItem; // 数据项
  private final Schema schema; // 数据范式

  public SearchService(Config config) {
    this.dataSource = new DataSource(config);
    this.dataSourceItem = new DataSourceItem(config);
    this.schema = new Schema(config);
  }

  /**
   * 数据源
   *
   * @return
   */
  public DataSource dataSource() {
    return dataSource;
  }

  /**
   * 数据项
   *
   * @return
   */
  public DataSourceItem dataSourceItem() {
    return dataSourceItem;
  }

  /**
   * 数据范式
   *
   * @return
   */
  public Schema schema() {
    return schema;
  }

  public static class DataSource {

    private final Config config;

    public DataSource(Config config) {
      this.config = config;
    }

    /**
     * 创建数据源，创建一个数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceSample.java</a>
     * ;
     */
    public CreateDataSourceResp create(CreateDataSourceReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/data_sources"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 创建数据源，创建一个数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceSample.java</a>
     * ;
     */
    public CreateDataSourceResp create(CreateDataSourceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/data_sources"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据源，删除一个已存在的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceSample.java</a>
     * ;
     */
    public DeleteDataSourceResp delete(DeleteDataSourceReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据源，删除一个已存在的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceSample.java</a>
     * ;
     */
    public DeleteDataSourceResp delete(DeleteDataSourceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据源，获取已经创建的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceSample.java</a>
     * ;
     */
    public GetDataSourceResp get(GetDataSourceReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据源，获取已经创建的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceSample.java</a>
     * ;
     */
    public GetDataSourceResp get(GetDataSourceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 批量获取数据源，批量获取创建的数据源信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//ListDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//ListDataSourceSample.java</a>
     * ;
     */
    public ListDataSourceResp list(ListDataSourceReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 批量获取数据源，批量获取创建的数据源信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//ListDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//ListDataSourceSample.java</a>
     * ;
     */
    public ListDataSourceResp list(ListDataSourceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 修改数据源，更新一个已经存在的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchDataSourceSample.java</a>
     * ;
     */
    public PatchDataSourceResp patch(PatchDataSourceReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 修改数据源，更新一个已经存在的数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchDataSourceSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchDataSourceSample.java</a>
     * ;
     */
    public PatchDataSourceResp patch(PatchDataSourceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/search/v2/data_sources/:data_source_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchDataSourceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          PatchDataSourceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class DataSourceItem {

    private final Config config;

    public DataSourceItem(Config config) {
      this.config = config;
    }

    /**
     * 索引数据项，索引一条数据记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceItemSample.java</a>
     * ;
     */
    public CreateDataSourceItemResp create(CreateDataSourceItemReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/data_sources/:data_source_id/items"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 索引数据项，索引一条数据记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateDataSourceItemSample.java</a>
     * ;
     */
    public CreateDataSourceItemResp create(CreateDataSourceItemReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/data_sources/:data_source_id/items"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据项，删除数据项
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceItemSample.java</a>
     * ;
     */
    public DeleteDataSourceItemResp delete(DeleteDataSourceItemReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/data_sources/:data_source_id/items/:item_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据项，删除数据项
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteDataSourceItemSample.java</a>
     * ;
     */
    public DeleteDataSourceItemResp delete(DeleteDataSourceItemReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/data_sources/:data_source_id/items/:item_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据项，获取单个数据记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceItemSample.java</a>
     * ;
     */
    public GetDataSourceItemResp get(GetDataSourceItemReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources/:data_source_id/items/:item_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据项，获取单个数据记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/data_source-item/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceItemSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetDataSourceItemSample.java</a>
     * ;
     */
    public GetDataSourceItemResp get(GetDataSourceItemReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/data_sources/:data_source_id/items/:item_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDataSourceItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDataSourceItemResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Schema {

    private final Config config;

    public Schema(Config config) {
      this.config = config;
    }

    /**
     * 创建数据范式，创建一个数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateSchemaSample.java</a>
     * ;
     */
    public CreateSchemaResp create(CreateSchemaReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/schemas"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 创建数据范式，创建一个数据源
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//CreateSchemaSample.java</a>
     * ;
     */
    public CreateSchemaResp create(CreateSchemaReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/search/v2/schemas"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据范式，删除已存在的数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteSchemaSample.java</a>
     * ;
     */
    public DeleteSchemaResp delete(DeleteSchemaReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除数据范式，删除已存在的数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//DeleteSchemaSample.java</a>
     * ;
     */
    public DeleteSchemaResp delete(DeleteSchemaReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      DeleteSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据范式，获取单个数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetSchemaSample.java</a>
     * ;
     */
    public GetSchemaResp get(GetSchemaReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取数据范式，获取单个数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//GetSchemaSample.java</a>
     * ;
     */
    public GetSchemaResp get(GetSchemaReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 修改数据范式，修改数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchSchemaSample.java</a>
     * ;
     */
    public PatchSchemaResp patch(PatchSchemaReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 修改数据范式，修改数据范式
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/search-v2/schema/patch</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchSchemaSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/searchv2//PatchSchemaSample.java</a>
     * ;
     */
    public PatchSchemaResp patch(PatchSchemaReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/search/v2/schemas/:schema_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchSchemaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchSchemaResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

}