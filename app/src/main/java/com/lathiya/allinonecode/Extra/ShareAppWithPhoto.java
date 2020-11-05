package com.lathiya.allinonecode.Extra;

public class ShareAppWithPhoto {

//    Share code
//    TOOL > FIREBASE > dynamic link > add to dynamic link >
//            1 > coonect your app to firebase
//2> add dynamic Links you app
//
//    FAREBSE OPEN PROJECT > GROW > DYNAMIC LINKS > CREAT NEW DAYNAMIC LINK
//
//    Share button click
//     share.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            /*THIS IS DYNAMIC LINK CREAT*/
//
//            DynamicLink dynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink()
//                    .setLink(Uri.parse("https://www.phoenixlab.in/"))
//                    .setDynamicLinkDomain("counttoearn.page.link")
//                    // Open links with this app on Android
//                    .setAndroidParameters(new DynamicLink.AndroidParameters.Builder().build())
//                    // Open links with com.example.ios on iOS
//                    .setIosParameters(new DynamicLink.IosParameters.Builder("com.example.ios").build())
//                    .buildDynamicLink();
//
//            Uri dynamicLinkUri = dynamicLink.getUri();
//
//
//            /*THIS IS MANUAL SET URL AND OTHER DITAIL*/
//
//            String shareLinkText = "https://counttoearn.page.link/?" +                  /*FIRE BASE LINK LINK*/
//                    "link=https://www.phoenixlab.in/" +                               /*WEBSITE LINK*/
//                    "&apn=" + getPackageName() +                                            /*SHARE ANY PRODUT OR APPLICATION LINK*/
//                    "&st=" + "Count To Earn" +                                              /*YOUR ANY NAME*/
//                    "&sd=" + "Add referral code is " + referralCode + " and earn Upto Rs.10" +  /*ANY DISCREEPCTON LINK*/
//                    "&si=" + "http://162.241.174.134/assets/img/logo.png";                   /*PHOTO LINK*/
//
//            /*SHORT LINK SHARE CODE */
//            Task<ShortDynamicLink> shortLinkTask = FirebaseDynamicLinks.getInstance().createDynamicLink()
////                        .setLongLink(dynamicLink.getUri()) /*THIS IS DYNAMIC LINK CREAT*/
//                    .setLongLink(Uri.parse(shareLinkText)) /*THIS IS MANUAL SET URL AND OTHER DITAIL*/
//                    .buildShortDynamicLink()
//                    .addOnCompleteListener(MainActivity.this, new OnCompleteListener<ShortDynamicLink>() {
//                        @Override
//                        public void onComplete(@NonNull Task<ShortDynamicLink> task) {
//                            if (task.isSuccessful()) {
//                                // Short link created
//                                Uri shortLink = task.getResult().getShortLink();
//                                Uri flowchartLink = task.getResult().getPreviewLink();
//                                Log.e("short", "" + shortLink);
//
//                                Intent intent = new Intent();
//                                intent.setAction(Intent.ACTION_SEND);
//                                intent.putExtra(Intent.EXTRA_TEXT, shortLink.toString());
//                                intent.setType("text/plain");
//                                startActivity(intent);
//
//
//                            } else {
//
//
//                            }
//                        }
//                    });
//        }
//    });
//
//
//    SPLASH ACTIVITY
//
//FirebaseDynamicLinks.getInstance()
//        .getDynamicLink(getIntent())
//            .addOnSuccessListener(this, new OnSuccessListener<PendingDynamicLinkData>() {
//        @Override
//        public void onSuccess(PendingDynamicLinkData pendingDynamicLinkData) {
//            // Get deep link from result (may be null if no link is found)
//            Uri deepLink = null;
//            if (pendingDynamicLinkData != null) {
//                deepLink = pendingDynamicLinkData.getLink();
//                Log.e("Link",""+deepLink.toString());
//            }
//
//
//            // Handle the deep link. For example, open the linked
//            // content, or apply promotional credit to the user's
//            // account.
//            // ...
//
//            // ...
//        }
//    })
//            .addOnFailureListener(this, new OnFailureListener() {
//        @Override
//        public void onFailure(@NonNull Exception e) {
//            Log.w("TAG", "getDynamicLink:onFailure", e);
//        }
//    });
//

}
