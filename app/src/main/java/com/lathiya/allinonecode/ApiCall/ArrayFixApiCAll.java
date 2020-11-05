package com.lathiya.allinonecode.ApiCall;

public class ArrayFixApiCAll {

//    Api call
//
//    { 'data': [{ 'type': 'articles', 'id': '1', 'attributes': { 'title': 'JSON:API paints my bikeshed!', 'body': 'The shortest article. Ever.', 'created': '2015-05-22T14:56:29.000Z', 'updated': '2015-05-22T14:56:28.000Z' }, 'relationships': { 'author': { 'data': {'id': '42', 'type': 'people'} } } }], 'included': [ { 'type': 'people', 'id': '42', 'attributes': { 'name': 'John', 'age': 80, 'gender': 'male' } } ] }
//    MODEL
//    @SerializedName("data")
//    @Expose
//    public List<data> data;
//
//    public class data implements Serializable {
//
//        @SerializedName("type")
//        @Expose
//        public String type;
//
//        @SerializedName("id")
//        @Expose
//        public String id;
//
//        @SerializedName("attributes")
//        @Expose
//        public attributes attributes;
//
//        public class attributes implements Serializable {
//
//            @SerializedName("title")
//            @Expose
//            public String title;
//
//            @SerializedName("body")
//            @Expose
//            public String body;
//
//            @SerializedName("created")
//            @Expose
//            public String created;
//
//            @SerializedName("updated")
//            @Expose
//            public String updated;
//
//        }
//
//        @SerializedName("relationships")
//        @Expose
//        public relationships relationships;
//
//        public class relationships implements Serializable {
//
//            @SerializedName("author")
//            @Expose
//            public author author;
//
//            public class author implements Serializable {
//
//                @SerializedName("data")
//                @Expose
//                public datas data;
//
//                public class datas implements Serializable {
//
//                    @SerializedName("id")
//                    @Expose
//                    public String ids;
//
//                    @SerializedName("type")
//                    @Expose
//                    public String types;
//
//                }
//
//            }
//        }
//    }
//
//    @SerializedName("included")
//    @Expose
//    public List<included> included;
//
//    public class included implements Serializable {
//
//        @SerializedName("type")
//        @Expose
//        public String intype;
//
//        @SerializedName("id")
//        @Expose
//        public String inid;
//
//
//        @SerializedName("attributes")
//        @Expose
//        public attributes attributes;
//
//        public class attributes implements Serializable {
//
//            @SerializedName("name")
//            @Expose
//            public String name;
//
//            @SerializedName("age")
//            @Expose
//            public String age;
//
//            @SerializedName("gender")
//            @Expose
//            public String gender;
//        }
//
//
//    }
//
//
//    ADAPTER
//holder.tv.setText(tryone.get(position).relationships.author.data.types + "");
//
//    ACTIVITY
//tv.setText("ok "+response.body().data.get(0).relationships.author.data.ids);
//tv.setText("ok "+response.body().included.get(0).attributes.gender);
//

}
