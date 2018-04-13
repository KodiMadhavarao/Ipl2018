package com.madhav.com.ipl2018.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhav on 4/13/2018.
 */

public class ImagesOfMatch {

    /**
     * pageInfo : {"page":0,"numPages":2,"pageSize":150,"numEntries":275}
     */

    @SerializedName("pageInfo")
    private PageInfo pageInfo;
    @SerializedName("content")
    private List<Content> content;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public static class PageInfo {
        /**
         * page : 0
         * numPages : 2
         * pageSize : 150
         * numEntries : 275
         */

        @SerializedName("page")
        private int page;
        @SerializedName("numPages")
        private int numPages;
        @SerializedName("pageSize")
        private int pageSize;
        @SerializedName("numEntries")
        private int numEntries;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getNumPages() {
            return numPages;
        }

        public void setNumPages(int numPages) {
            this.numPages = numPages;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getNumEntries() {
            return numEntries;
        }

        public void setNumEntries(int numEntries) {
            this.numEntries = numEntries;
        }
    }

    public static class Content {
        /**
         * id : 117485
         * accountId : 15
         * type : photo
         * title : Vivo IPL 2018 M5 - CSK v KKR
         * description : Sam Billings  of the Chennai Superkings at Press Conference during match five of the Vivo Indian Premier League 2018 (IPL 2018) between the Chennai Superkings and the Kolkata Knight Riders held at the M. A. Chidambaram Stadium in Chennai on the 10th April 2018.Photo by Saikat Das / IPL/ SPORTZPICS
         * date : Wed Apr 11 00:00:00 UTC 2018
         * location :
         * coordinates : null
         * commentsOn : false
         * copyright : Sportzpics / IPL
         * publishFrom : 1523387696771
         * publishTo : 0
         * tags : [{"id":25,"label":"gallery-photo"}]
         * platform : PULSE_FTP
         * language : en
         * additionalInfo : {}
         * canonicalUrl :
         * references : [{"label":null,"id":7898,"type":"CRICKET_MATCH"}]
         * related : []
         * metadata : {}
         * subtitle : null
         * variants : [{"width":4000,"height":2667,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/cedf1aec-c563-465f-92df-a8f24df6ac4a/SA-i-KAT_16507.JPG","tag":{"id":8,"label":"Full Width (Retina)"}},{"width":800,"height":1012,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/5b800ec6-4b93-4f37-bd5d-dddba1f343c7/SA-i-KAT_16507.JPG","tag":{"id":126,"label":"Cheer Card (Retina)"}},{"width":1600,"height":600,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/f9c4c313-d643-4838-a86f-cf25f64a26df/SA-i-KAT_16507.JPG","tag":{"id":18,"label":"Team Hero Venue"}},{"width":1000,"height":667,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/530c1dcb-0698-44d1-8823-6325cc95534d/SA-i-KAT_16507.JPG","tag":{"id":6,"label":"Full Width (Retina Mobile)"}},{"width":400,"height":400,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/89055bcb-2227-446f-b2c8-a57c13e1e911/SA-i-KAT_16507.JPG","tag":{"id":10,"label":"Square Thumbnail"}},{"width":1000,"height":750,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/043babec-fea0-4637-8503-ac31de3efd80/SA-i-KAT_16507.JPG","tag":{"id":15,"label":"Article - Standard (Retina)"}},{"width":240,"height":145,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/ad5a9cb3-8b83-4de5-b490-89afb278fe12/SA-i-KAT_16507.JPG","tag":{"id":118,"label":"Thumbnail Gallery - Small"}},{"width":1720,"height":860,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/e5ac4324-10cc-4a85-ac30-c5389c08fbf6/SA-i-KAT_16507.JPG","tag":{"id":122,"label":"HPTO (Retina Tablet)"}},{"width":500,"height":375,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/e8bb4570-4686-4bbe-bcf4-8535b06c29b9/SA-i-KAT_16507.JPG","tag":{"id":16,"label":"Article - Small (Retina)"}},{"width":1800,"height":400,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/00192e1f-efd8-43d3-8db3-54b384b048d5/SA-i-KAT_16507.JPG","tag":{"id":116,"label":"Thin hero - desktop"}},{"width":1366,"height":280,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/d3d04c5b-979c-4df4-8f7d-7dfabddcf19f/SA-i-KAT_16507.JPG","tag":{"id":114,"label":"Promo Banner Background - Wide"}},{"width":1300,"height":867,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/5fa7252e-8a71-47da-9b17-73010477f08b/SA-i-KAT_16507.JPG","tag":{"id":9,"label":"Full Width (Tablet)"}},{"width":500,"height":180,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/2d64d4a5-7410-444d-87ad-96f25c1e67c9/SA-i-KAT_16507.JPG","tag":{"id":11,"label":"Team Card (Retina Mobile)"}},{"width":1920,"height":450,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/921a2801-597e-41f5-98de-bb80df210bcf/SA-i-KAT_16507.JPG","tag":{"id":119,"label":"HPTO (X Wide)"}},{"width":1800,"height":800,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/85f9b438-5459-4756-a137-7ce69ee30170/SA-i-KAT_16507.JPG","tag":{"id":117,"label":"Hero - desktop"}},{"width":560,"height":560,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/97219ef7-3ac1-4434-98c9-57484e474c56/SA-i-KAT_16507.JPG","tag":{"id":3,"label":"Thumbnail - Mobile (Retina)"}},{"width":2600,"height":1733,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/379428d4-13d9-411b-a3a2-4bb844e2ea1e/SA-i-KAT_16507.JPG","tag":{"id":7,"label":"Full Width (Retina Tablet)"}},{"width":500,"height":375,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/aede8536-687d-4cfd-a499-ae8452ccd457/SA-i-KAT_16507.JPG","tag":{"id":14,"label":"Article - Standard"}},{"width":840,"height":280,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/d2f15b6c-a45a-4d42-88cf-a665248d258e/SA-i-KAT_16507.JPG","tag":{"id":107,"label":"In Numbers Background (Tablet)"}},{"width":860,"height":430,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/95dd09b1-8f8e-4d1b-a759-643877fe7c86/SA-i-KAT_16507.JPG","tag":{"id":121,"label":"HPTO (Tablet)"}},{"width":400,"height":506,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/58ef4ed6-6e53-4f23-9df6-a5fd0027e736/SA-i-KAT_16507.JPG","tag":{"id":125,"label":"Cheer Card"}},{"width":500,"height":500,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/895fc649-ff49-43e3-866d-dfda3079146a/SA-i-KAT_16507.JPG","tag":{"id":1,"label":"Default"}},{"width":500,"height":333,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/b983d70f-1230-456c-b7b7-98ba490dc4ff/SA-i-KAT_16507.JPG","tag":{"id":112,"label":"Full Width (Mobile) - No Watermark"}},{"width":350,"height":550,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/3585d166-fa64-4eae-bb38-f14a274f7c1e/SA-i-KAT_16507.JPG","tag":{"id":115,"label":"Gallery Thumbnail - Portrait"}},{"width":1920,"height":384,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/43db7ecb-adb3-40b6-8953-25e7596bbc21/SA-i-KAT_16507.JPG","tag":{"id":113,"label":"Promo Banner Background - X Wide"}},{"width":280,"height":280,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/7d616b68-bd7f-4396-be52-105f6b76d44f/SA-i-KAT_16507.JPG","tag":{"id":2,"label":"Thumbnail - Mobile"}},{"width":690,"height":190,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/00812855-b5ea-4de9-a0b1-8e7ae407b322/SA-i-KAT_16507.JPG","tag":{"id":108,"label":"In Numbers Background (Desktop)"}},{"width":640,"height":427,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/f5614a93-c844-4e6d-b12c-c71f2a83907d/SA-i-KAT_16507.JPG","tag":{"id":22,"label":"Watermarked Photo (Mobile)"}},{"width":1050,"height":700,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/90fe62f5-c892-4261-9f8d-30dbe4db9923/SA-i-KAT_16507.JPG","tag":{"id":21,"label":"Watermarked Photo"}},{"width":390,"height":219,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/b841a310-80e3-4c73-8d03-658996b405a1/SA-i-KAT_16507.JPG","tag":{"id":12,"label":"Thumbnail - Desktop"}},{"width":670,"height":800,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/0c5b8e48-76db-49b9-b463-eedbbb451eee/SA-i-KAT_16507.JPG","tag":{"id":19,"label":"Venue Seating Plan (Desktop)"}},{"width":700,"height":1100,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/ffbaa827-cf7d-4c21-be9f-20df50874c28/SA-i-KAT_16507.JPG","tag":{"id":111,"label":"Gallery Thumbnail - Portrait (Retina)"}},{"width":250,"height":188,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/0bb6a6ac-a654-4f03-bdd0-fb411da73fa1/SA-i-KAT_16507.JPG","tag":{"id":17,"label":"Article - Small"}},{"width":500,"height":600,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/ae26ab1f-f961-4c13-b4fc-c8c0bde2c015/SA-i-KAT_16507.JPG","tag":{"id":20,"label":"Venue Seating Plan (Mobile)"}},{"width":2000,"height":1333,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/19e76b94-42e9-4d8a-a6e7-8c12495227ec/SA-i-KAT_16507.JPG","tag":{"id":4,"label":"Full Width"}},{"width":1366,"height":450,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/8805f42c-ff15-4330-891c-5c69efb5c9a9/SA-i-KAT_16507.JPG","tag":{"id":120,"label":"HPTO (Wide)"}},{"width":500,"height":333,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/93bd77b1-93f5-42ca-9cbb-69639799b3dc/SA-i-KAT_16507.JPG","tag":{"id":5,"label":"Full Width (Mobile)"}},{"width":780,"height":439,"url":"https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/6add70ec-d4a8-4d1d-a5f6-cf031caf676f/SA-i-KAT_16507.JPG","tag":{"id":13,"label":"Thumbnail - Desktop (Retina)"}}]
         * imageUrl : https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/baea10ee-483c-48d7-a4db-def57eac058e/SA-i-KAT_16507.JPG
         */

        @SerializedName("id")
        private int id;
        @SerializedName("accountId")
        private int accountId;
        @SerializedName("type")
        private String type;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;
        @SerializedName("date")
        private String date;
        @SerializedName("location")
        private String location;
        @SerializedName("coordinates")
        private Object coordinates;
        @SerializedName("commentsOn")
        private boolean commentsOn;
        @SerializedName("copyright")
        private String copyright;
        @SerializedName("publishFrom")
        private long publishFrom;
        @SerializedName("publishTo")
        private int publishTo;
        @SerializedName("platform")
        private String platform;
        @SerializedName("language")
        private String language;
        @SerializedName("additionalInfo")
        private AdditionalInfo additionalInfo;
        @SerializedName("canonicalUrl")
        private String canonicalUrl;
        @SerializedName("metadata")
        private Metadata metadata;
        @SerializedName("subtitle")
        private Object subtitle;
        @SerializedName("imageUrl")
        private String imageUrl;
        @SerializedName("tags")
        private List<Tags> tags;
        @SerializedName("references")
        private List<References> references;
        @SerializedName("related")
        private List<?> related;
        @SerializedName("variants")
        private List<Variants> variants;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAccountId() {
            return accountId;
        }

        public void setAccountId(int accountId) {
            this.accountId = accountId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public Object getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Object coordinates) {
            this.coordinates = coordinates;
        }

        public boolean isCommentsOn() {
            return commentsOn;
        }

        public void setCommentsOn(boolean commentsOn) {
            this.commentsOn = commentsOn;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public long getPublishFrom() {
            return publishFrom;
        }

        public void setPublishFrom(long publishFrom) {
            this.publishFrom = publishFrom;
        }

        public int getPublishTo() {
            return publishTo;
        }

        public void setPublishTo(int publishTo) {
            this.publishTo = publishTo;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public AdditionalInfo getAdditionalInfo() {
            return additionalInfo;
        }

        public void setAdditionalInfo(AdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public String getCanonicalUrl() {
            return canonicalUrl;
        }

        public void setCanonicalUrl(String canonicalUrl) {
            this.canonicalUrl = canonicalUrl;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public Object getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(Object subtitle) {
            this.subtitle = subtitle;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public List<Tags> getTags() {
            return tags;
        }

        public void setTags(List<Tags> tags) {
            this.tags = tags;
        }

        public List<References> getReferences() {
            return references;
        }

        public void setReferences(List<References> references) {
            this.references = references;
        }

        public List<?> getRelated() {
            return related;
        }

        public void setRelated(List<?> related) {
            this.related = related;
        }

        public List<Variants> getVariants() {
            return variants;
        }

        public void setVariants(List<Variants> variants) {
            this.variants = variants;
        }

        public static class AdditionalInfo {
        }

        public static class Metadata {
        }

        public static class Tags {
            /**
             * id : 25
             * label : gallery-photo
             */

            @SerializedName("id")
            private int id;
            @SerializedName("label")
            private String label;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }
        }

        public static class References {
            /**
             * label : null
             * id : 7898
             * type : CRICKET_MATCH
             */

            @SerializedName("label")
            private Object label;
            @SerializedName("id")
            private int id;
            @SerializedName("type")
            private String type;

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class Variants {
            /**
             * width : 4000
             * height : 2667
             * url : https://iplplatform-static-files.s3.amazonaws.com/IPL/photo/2018/04/10/cedf1aec-c563-465f-92df-a8f24df6ac4a/SA-i-KAT_16507.JPG
             * tag : {"id":8,"label":"Full Width (Retina)"}
             */

            @SerializedName("width")
            private int width;
            @SerializedName("height")
            private int height;
            @SerializedName("url")
            private String url;
            @SerializedName("tag")
            private Tag tag;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public Tag getTag() {
                return tag;
            }

            public void setTag(Tag tag) {
                this.tag = tag;
            }

            public static class Tag {
                /**
                 * id : 8
                 * label : Full Width (Retina)
                 */

                @SerializedName("id")
                private int id;
                @SerializedName("label")
                private String label;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }
            }
        }
    }
}