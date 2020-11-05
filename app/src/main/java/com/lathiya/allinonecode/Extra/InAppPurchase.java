package com.lathiya.allinonecode.Extra;

public class InAppPurchase {
//    Inapp purches
//
//
////app purches
//    implementation 'com.anjlab.android.iab.v3:library:1.0.44'
//
//
//
//            implements BillingProcessor.IBillingHandle
//
//    BillingProcessor bp;
//    String key = "bhagvat_gita_month";
//    String listion_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk4RRYg/UdhNY1dso//kPOq+CHNptGK1Pbsz9viEuAw239G+3wxhsOdsfYwC1MA6KluS86Xtvvu3f0UncVZpyd18pb0kt82Qh3taOELUOt+yQTnS6KwhMT1DwhwZe4YvbzWG8kX0Kgyzl86lRqynvJ+cE+A1nnjx0DNWtDiBiBFIFrPtu5u7hTHG89Udy80VaB3/FdjczYFPSZFsQkAj/ky7lfdnctABBVfzQppikH5NHNBHQvjWSS7GyCQSRAEEJlDZZqGbfXZZIbdBtGevbOgSVdP62EAFTJd7LLSvl3t8egMlf3QOtoCfA+5mrDBYSURDL25poTfScZB32eAhXcQIDAQAB";
//
//
//    ONCREAT
//            bp = new BillingProcessor(this, listion_key, this);
//
//
//    SER CLICK LISNER
//bp.purchase(Entry2.this,key);
//
//
//    METHOD
//
//    @Override
//    public void onProductPurchased(String productId, TransactionDetails details) {
//        Toast.makeText(this, "You purchased something0", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onPurchaseHistoryRestored() {
//        Toast.makeText(this, "Restored", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    public void onBillingError(int errorCode, Throwable error) {
//        Toast.makeText(this, "Something went to wrong  "+ errorCode , Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    public void onBillingInitialized() {
//        Toast.makeText(this, "BillingInitialized", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (!bp.handleActivityResult(requestCode, resultCode, data)) {
//            super.onActivityResult(requestCode, resultCode, data);
//        }
//    }
//
//    @Override
//    public void onDestroy() {
//        if (bp != null) {
//            bp.release();
//        }
//        super.onDestroy();
//    }



}
