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

package com.lark.oapi.service.aily.v1.model;

import com.google.gson.annotations.SerializedName;

public class Knowledge {
    /**
     * 知识ID
     * <p> 示例值：spring_03c49e32bb__c_sdb_aadgfh
     */
    @SerializedName("id")
    private String id;
    /**
     * 知识库ID
     * <p> 示例值：knowledge_aadgd7ozoxseilqpor
     */
    @SerializedName("knowledge_base_id")
    private String knowledgeBaseId;
    /**
     * 学习状态
     * <p> 示例值：
     */
    @SerializedName("status")
    private String status;
    /**
     * 知识标题
     * <p> 示例值：title
     */
    @SerializedName("title")
    private String title;
    /**
     * 知识类型
     * <p> 示例值：
     */
    @SerializedName("type")
    private String type;
    /**
     * 文件信息
     * <p> 示例值：
     */
    @SerializedName("file")
    private AilyKnowledgeFile file;
    /**
     * 飞书云文档信息
     * <p> 示例值：
     */
    @SerializedName("docs")
    private AilyKnowledgeDocs docs;
    /**
     * 飞书知识空间信息
     * <p> 示例值：
     */
    @SerializedName("wiki_space")
    private AilyKnowledgeWikiSpace wikiSpace;
    /**
     * 飞书文件夹信息
     * <p> 示例值：
     */
    @SerializedName("folder")
    private AilyKnowledgeFolder folder;
    /**
     * 飞书服务台信息
     * <p> 示例值：
     */
    @SerializedName("helpdesk")
    private AilyKnowledgeHelpdesk helpdesk;
    /**
     * 智能伙伴数据表
     * <p> 示例值：
     */
    @SerializedName("datatable")
    private AilyKnowledgeDatatable datatable;
    /**
     * 智能伙伴分析表
     * <p> 示例值：
     */
    @SerializedName("dataset")
    private AilyKnowledgeDataset dataset;
    /**
     * 网页信息
     * <p> 示例值：
     */
    @SerializedName("web")
    private AilyKnowledgeWeb web;
    /**
     * 切片数量
     * <p> 示例值：1
     */
    @SerializedName("chunk_count")
    private Integer chunkCount;
    /**
     * 创建时间
     * <p> 示例值：1715247397
     */
    @SerializedName("create_time")
    private Integer createTime;
    /**
     * 更新时间
     * <p> 示例值：1715247397
     */
    @SerializedName("update_time")
    private Integer updateTime;
    /**
     * 学习失败提示
     * <p> 示例值：success
     */
    @SerializedName("fail_message")
    private String failMessage;

    // builder 开始
    public Knowledge() {
    }

    public Knowledge(Builder builder) {
        /**
         * 知识ID
         * <p> 示例值：spring_03c49e32bb__c_sdb_aadgfh
         */
        this.id = builder.id;
        /**
         * 知识库ID
         * <p> 示例值：knowledge_aadgd7ozoxseilqpor
         */
        this.knowledgeBaseId = builder.knowledgeBaseId;
        /**
         * 学习状态
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         * 知识标题
         * <p> 示例值：title
         */
        this.title = builder.title;
        /**
         * 知识类型
         * <p> 示例值：
         */
        this.type = builder.type;
        /**
         * 文件信息
         * <p> 示例值：
         */
        this.file = builder.file;
        /**
         * 飞书云文档信息
         * <p> 示例值：
         */
        this.docs = builder.docs;
        /**
         * 飞书知识空间信息
         * <p> 示例值：
         */
        this.wikiSpace = builder.wikiSpace;
        /**
         * 飞书文件夹信息
         * <p> 示例值：
         */
        this.folder = builder.folder;
        /**
         * 飞书服务台信息
         * <p> 示例值：
         */
        this.helpdesk = builder.helpdesk;
        /**
         * 智能伙伴数据表
         * <p> 示例值：
         */
        this.datatable = builder.datatable;
        /**
         * 智能伙伴分析表
         * <p> 示例值：
         */
        this.dataset = builder.dataset;
        /**
         * 网页信息
         * <p> 示例值：
         */
        this.web = builder.web;
        /**
         * 切片数量
         * <p> 示例值：1
         */
        this.chunkCount = builder.chunkCount;
        /**
         * 创建时间
         * <p> 示例值：1715247397
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间
         * <p> 示例值：1715247397
         */
        this.updateTime = builder.updateTime;
        /**
         * 学习失败提示
         * <p> 示例值：success
         */
        this.failMessage = builder.failMessage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AilyKnowledgeFile getFile() {
        return this.file;
    }

    public void setFile(AilyKnowledgeFile file) {
        this.file = file;
    }

    public AilyKnowledgeDocs getDocs() {
        return this.docs;
    }

    public void setDocs(AilyKnowledgeDocs docs) {
        this.docs = docs;
    }

    public AilyKnowledgeWikiSpace getWikiSpace() {
        return this.wikiSpace;
    }

    public void setWikiSpace(AilyKnowledgeWikiSpace wikiSpace) {
        this.wikiSpace = wikiSpace;
    }

    public AilyKnowledgeFolder getFolder() {
        return this.folder;
    }

    public void setFolder(AilyKnowledgeFolder folder) {
        this.folder = folder;
    }

    public AilyKnowledgeHelpdesk getHelpdesk() {
        return this.helpdesk;
    }

    public void setHelpdesk(AilyKnowledgeHelpdesk helpdesk) {
        this.helpdesk = helpdesk;
    }

    public AilyKnowledgeDatatable getDatatable() {
        return this.datatable;
    }

    public void setDatatable(AilyKnowledgeDatatable datatable) {
        this.datatable = datatable;
    }

    public AilyKnowledgeDataset getDataset() {
        return this.dataset;
    }

    public void setDataset(AilyKnowledgeDataset dataset) {
        this.dataset = dataset;
    }

    public AilyKnowledgeWeb getWeb() {
        return this.web;
    }

    public void setWeb(AilyKnowledgeWeb web) {
        this.web = web;
    }

    public Integer getChunkCount() {
        return this.chunkCount;
    }

    public void setChunkCount(Integer chunkCount) {
        this.chunkCount = chunkCount;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getFailMessage() {
        return this.failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    public static class Builder {
        /**
         * 知识ID
         * <p> 示例值：spring_03c49e32bb__c_sdb_aadgfh
         */
        private String id;
        /**
         * 知识库ID
         * <p> 示例值：knowledge_aadgd7ozoxseilqpor
         */
        private String knowledgeBaseId;
        /**
         * 学习状态
         * <p> 示例值：
         */
        private String status;
        /**
         * 知识标题
         * <p> 示例值：title
         */
        private String title;
        /**
         * 知识类型
         * <p> 示例值：
         */
        private String type;
        /**
         * 文件信息
         * <p> 示例值：
         */
        private AilyKnowledgeFile file;
        /**
         * 飞书云文档信息
         * <p> 示例值：
         */
        private AilyKnowledgeDocs docs;
        /**
         * 飞书知识空间信息
         * <p> 示例值：
         */
        private AilyKnowledgeWikiSpace wikiSpace;
        /**
         * 飞书文件夹信息
         * <p> 示例值：
         */
        private AilyKnowledgeFolder folder;
        /**
         * 飞书服务台信息
         * <p> 示例值：
         */
        private AilyKnowledgeHelpdesk helpdesk;
        /**
         * 智能伙伴数据表
         * <p> 示例值：
         */
        private AilyKnowledgeDatatable datatable;
        /**
         * 智能伙伴分析表
         * <p> 示例值：
         */
        private AilyKnowledgeDataset dataset;
        /**
         * 网页信息
         * <p> 示例值：
         */
        private AilyKnowledgeWeb web;
        /**
         * 切片数量
         * <p> 示例值：1
         */
        private Integer chunkCount;
        /**
         * 创建时间
         * <p> 示例值：1715247397
         */
        private Integer createTime;
        /**
         * 更新时间
         * <p> 示例值：1715247397
         */
        private Integer updateTime;
        /**
         * 学习失败提示
         * <p> 示例值：success
         */
        private String failMessage;

        /**
         * 知识ID
         * <p> 示例值：spring_03c49e32bb__c_sdb_aadgfh
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 知识库ID
         * <p> 示例值：knowledge_aadgd7ozoxseilqpor
         *
         * @param knowledgeBaseId
         * @return
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }


        /**
         * 学习状态
         * <p> 示例值：
         *
         * @param status
         * @return
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }


        /**
         * 知识标题
         * <p> 示例值：title
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 知识类型
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 文件信息
         * <p> 示例值：
         *
         * @param file
         * @return
         */
        public Builder file(AilyKnowledgeFile file) {
            this.file = file;
            return this;
        }


        /**
         * 飞书云文档信息
         * <p> 示例值：
         *
         * @param docs
         * @return
         */
        public Builder docs(AilyKnowledgeDocs docs) {
            this.docs = docs;
            return this;
        }


        /**
         * 飞书知识空间信息
         * <p> 示例值：
         *
         * @param wikiSpace
         * @return
         */
        public Builder wikiSpace(AilyKnowledgeWikiSpace wikiSpace) {
            this.wikiSpace = wikiSpace;
            return this;
        }


        /**
         * 飞书文件夹信息
         * <p> 示例值：
         *
         * @param folder
         * @return
         */
        public Builder folder(AilyKnowledgeFolder folder) {
            this.folder = folder;
            return this;
        }


        /**
         * 飞书服务台信息
         * <p> 示例值：
         *
         * @param helpdesk
         * @return
         */
        public Builder helpdesk(AilyKnowledgeHelpdesk helpdesk) {
            this.helpdesk = helpdesk;
            return this;
        }


        /**
         * 智能伙伴数据表
         * <p> 示例值：
         *
         * @param datatable
         * @return
         */
        public Builder datatable(AilyKnowledgeDatatable datatable) {
            this.datatable = datatable;
            return this;
        }


        /**
         * 智能伙伴分析表
         * <p> 示例值：
         *
         * @param dataset
         * @return
         */
        public Builder dataset(AilyKnowledgeDataset dataset) {
            this.dataset = dataset;
            return this;
        }


        /**
         * 网页信息
         * <p> 示例值：
         *
         * @param web
         * @return
         */
        public Builder web(AilyKnowledgeWeb web) {
            this.web = web;
            return this;
        }


        /**
         * 切片数量
         * <p> 示例值：1
         *
         * @param chunkCount
         * @return
         */
        public Builder chunkCount(Integer chunkCount) {
            this.chunkCount = chunkCount;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：1715247397
         *
         * @param createTime
         * @return
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：1715247397
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 学习失败提示
         * <p> 示例值：success
         *
         * @param failMessage
         * @return
         */
        public Builder failMessage(String failMessage) {
            this.failMessage = failMessage;
            return this;
        }


        public Knowledge build() {
            return new Knowledge(this);
        }
    }
}
