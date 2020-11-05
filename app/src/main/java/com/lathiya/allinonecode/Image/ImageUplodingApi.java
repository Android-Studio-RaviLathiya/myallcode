package com.lathiya.allinonecode.Image;

public class ImageUplodingApi {
//
//    IMAGE UPLODING
//2 TAYPE
//1 multipart
//    MODAL CLASS
//    @Multipart
//    @POST("Users/profileUpdate")
//    Call<CommonModel> updateprofiles(@Part("name") RequestBody name,
//                                     @Part("email") RequestBody email,
//                                     @Part("dob") RequestBody dob,
////                                     @Part MultipartBody.Part parts,
//                                     @Part ("profile_pic") RequestBody profile_pic,
//                                     @Part("user_id") RequestBody user_id);
//
//
//
//    API CALL
//    File file = new File(aphoto);
//    RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
//    MultipartBody.Part parts = MultipartBody.Part.createFormData("newimage", file.getName(), requestBody);
//    RequestBody profile_pic = RequestBody.create(MediaType.parse("multipart/form-data"), "" + file.getName());
//
//    RequestBody user_name = RequestBody.create(MediaType.parse("multipart/form-data"), "" + aname);
//    RequestBody user_email = RequestBody.create(MediaType.parse("multipart/form-data"), "" + aemail);
//    RequestBody user_date = RequestBody.create(MediaType.parse("multipart/form-data"), "" + adate);
//    RequestBody user_ids = RequestBody.create(MediaType.parse("multipart/form-data"), "" + userid);
//
//
//
//2 bitmap {MODAL CLASS REGULAR}
//    OK RESUL CODE
//    String filePath = data.getStringExtra(ImageSelectActivity.RESULT_FILE_PATH);
//
//    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//    Bitmap bm = BitmapFactory.decodeFile(filePath);
//bm.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//    byte[] imagebytes = byteArrayOutputStream.toByteArray();
//    imageString = Base64.encodeToString(imagebytes, Base64.DEFAULT);
//
//    Uri uri = Uri.parse(filePath);
//img_view.setImageURI(uri);
//
//    {IMAGESTRING PASS API STRING}
//



}
