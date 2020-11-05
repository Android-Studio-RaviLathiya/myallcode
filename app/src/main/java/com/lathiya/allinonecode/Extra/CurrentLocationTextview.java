package com.lathiya.allinonecode.Extra;

public class CurrentLocationTextview {

//    Currect location
//    Mobile currenct location
//    Note – uses permission in manifests
//<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
//<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
//
//
//    Youtube -https://www.youtube.com/watch?v=TnYXQHvuPIw
//    Github - https://github.com/mahalkarshubham/CurrentLocation-Country-State-City-PIN-Address/tree/master/app
//
//    xml
//
//            <LinearLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_marginLeft="05dp"
//    android:orientation="vertical">
//
//    <TextView
//    android:id="@+id/larea"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="area"
//    android:textColor="@color/black"
//    android:textSize="15dp" />
//
//
//    <TextView
//    android:id="@+id/lpincode"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="pincode"
//    android:textColor="@color/black"
//    android:textSize="15dp" />
//
//
//    <TextView
//    android:id="@+id/lcity"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="city"
//    android:textColor="@color/black"
//    android:textSize="15dp" />
//
//    <TextView
//    android:id="@+id/lstate"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="state"
//    android:textColor="@color/black"
//    android:textSize="15dp" />
//
//    <TextView
//    android:id="@+id/lcountry"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="Country"
//    android:textColor="@color/black"
//    android:textSize="15dp" />
//
//
//</LinearLayout>
//
//
//
//
//    Java file
//
//    Note- implements krva nu and method add pn krva ni
//
//    public class ShopAddressDetail extends AppCompatActivity implements LocationListener {
//
//
//        AHIYA ONCREAT NI METHOD AAVSE
//
//
//                lcity = findViewById(R.id.lcity);
//        lcountry = findViewById(R.id.lcountry);
//        lpincode = findViewById(R.id.lpincode);
//        lstate = findViewById(R.id.lstate);
//        larea = findViewById(R.id.larea);
//
//if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
//        && ActivityCompat.checkSelfPermission(getApplicationContext(),
//        android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,
//                    android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
//        }
//
//
//        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        locationEnabled();
//        getLocation();
//
//
//
//        AA METHOD BAHAR TYPING KRVI
//        private void locationEnabled() {
//            LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//            boolean gps_enabled = false;
//            boolean network_enabled = false;
//            try {
//                gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            try {
//                network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            if (!gps_enabled && !network_enabled) {
//                new AlertDialog.Builder(ShopAddressDetail.this)
//                        .setTitle("Enable GPS Service")
//                        .setMessage("We need your GPS location to show Near Places around you.")
//                        .setCancelable(false)
//                        .setPositiveButton("Enable", new
//                                DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
//                                        startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
//                                    }
//                                })
//                        .setNegativeButton("Cancel", null)
//                        .show();
//            }
//        }
//
//        void getLocation() {
//            try {
//                locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 500, 5, (LocationListener) this);
//            } catch (SecurityException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//        NOTE – IMPRIMENT KRVI NR METHOD JE ADD THAY EMA TYPING KRVU
//
//        @Override
//        public void onLocationChanged(Location location) {
//            try {
//                Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
//                List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
//
//                lcity.setText(addresses.get(0).getLocality());
//                lstate.setText(addresses.get(0).getAdminArea());
//                lcountry.setText(addresses.get(0).getCountryName());
//                lpincode.setText(addresses.get(0).getPostalCode());
//                larea.setText(addresses.get(0).getAddressLine(0));
//
//            } catch (Exception e) {
//            }
//
//        }
//
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//
//        }
//
//        @Override
//        public void onProviderDisabled(String provider) {
//
//        }
//    }
//
//

}
