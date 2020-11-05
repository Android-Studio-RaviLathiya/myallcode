package com.lathiya.allinonecode.Extra;

public class GoogleMap {

//    Google map
//    Website - https://www.youtube.com/watch?v=p8p8zB93CnA
//    Step 1
//    Manifests in to right click and new in to google into google map activity….
//
//    Step 2
//
//    Value in to google map
//
//    Google map ma your api ni jagiya pr tmari api nakhvi EX- <string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">YOUR API</string>
//
//
//    How to creat API
//    Google map ni andar j link aapeli che ae likn ne koi pn browjer ma open krvi and creat kri ne api banavi levi psi ahiya copy kri levi
//& api ek ma j chle bija project ma na chale
//
//
//    Step 3
//    Edit
//    implementation'com.karumi:dexter:5.0.0'
//    implementation 'com.google.android.gms:play-services-maps:17.0.0'
//    implementation 'com.google.android.gms:play-services-location:17.0.0'
//
//
//    step 4
//
//    permission
//
//            <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
//
//
//    Step 5
//    Java Activity (Map Activity typing same)
//
//package com.example.nnewsapplication;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.core.app.ActivityCompat;
//import androidx.fragment.app.FragmentActivity;
//
//import android.Manifest;
//import android.app.AlertDialog;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.location.Location;
//import android.location.LocationManager;
//import android.os.Bundle;
//import android.provider.Settings;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.location.LocationRequest;
//import com.google.android.gms.location.LocationServices;
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;
//import com.karumi.dexter.Dexter;
//import com.karumi.dexter.PermissionToken;
//import com.karumi.dexter.listener.PermissionDeniedResponse;
//import com.karumi.dexter.listener.PermissionGrantedResponse;
//import com.karumi.dexter.listener.PermissionRequest;
//import com.karumi.dexter.listener.single.PermissionListener;
//
//    public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks,
//            GoogleApiClient.OnConnectionFailedListener,
//            com.google.android.gms.location.LocationListener {
//
//        private GoogleMap mMap;
//
//        private GoogleApiClient mGoogleApiClient;
//        private Location mLocation;
//        private LocationManager mLocationManager;
//        private LocationRequest mLocationRequest;
//        private com.google.android.gms.location.LocationListener listener;
//        private long UPDATE_INTERVAL = 2000;
//        private long FASTESR_INTERVAL = 5000;
//        private LocationManager locationManager;
//        private LatLng latLng;
//        private boolean isPermission;
//        Button ok, back;
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_maps);
//
//            ok = findViewById(R.id.ok);
//            back = findViewById(R.id.back);
//
//            back.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    onBackPressed();
//                }
//            });
//            ok.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    onBackPressed();
//
//
//                }
//            });
//            if (requestSinglePermission()) {
//                // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                        .findFragmentById(R.id.map);
//                mapFragment.getMapAsync(this);
//
//                mGoogleApiClient = new GoogleApiClient.Builder(this)
//                        .addConnectionCallbacks(this)
//                        .addOnConnectionFailedListener(this)
//                        .addApi(LocationServices.API)
//                        .build();
//
//                mLocationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
//
//                checkLocation();
//            }
//        }
//
//        private boolean checkLocation() {
//
//
//            if (!isLocationEnabled()) {
//                showAlert();
//
//            }
//            return isLocationEnabled();
//        }
//
//
//        private void showAlert() {
//
//            final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//            dialog.setTitle("Enable Location")
//                    .setMessage("You Locations Settings is set to 'off' .\nPlease Enable Location to " + "use this app")
//                    .setPositiveButton("Location Settings", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//                            startActivity(myIntent);
//                        }
//                    })
//                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    });
//            dialog.show();
//        }
//
//        private boolean isLocationEnabled() {
//
//            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//            return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
//                    locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//        }
//
//
//        private boolean requestSinglePermission() {
//
//            Dexter.withActivity(this)
//                    .withPermission(Manifest.permission.ACCESS_FINE_LOCATION)
//                    .withListener(new PermissionListener() {
//                        @Override
//                        public void onPermissionGranted(PermissionGrantedResponse response) {
//                            isPermission = true;
//                        }
//
//                        @Override
//                        public void onPermissionDenied(PermissionDeniedResponse response) {
//                            if (response.isPermanentlyDenied()) {
//                                isPermission = false;
//                            }
//                        }
//
//                        @Override
//                        public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
//
//                        }
//
//
//                    }).check();
//
//            return isPermission;
//
//
//        }
//
//
//        /**
//         * Manipulates the map once available.
//         * This callback is triggered when the map is ready to be used.
//         * This is where we can add markers or lines, add listeners or move the camera. In this case,
//         * we just add a marker near Sydney, Australia.
//         * If Google Play services is not installed on the device, the user will be prompted to install
//         * it inside the SupportMapFragment. This method will only be triggered once the user has
//         * installed Google Play services and returned to the app.
//         */
//        @Override
//        public void onMapReady(GoogleMap googleMap) {
//            mMap = googleMap;
//
//            if (latLng != null) {
//                // Add a marker in Sydney and move the camera
////        LatLng sydney = new LatLng(-34, 151);
////        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
////        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//
//                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 17));
//                MarkerOptions options = new MarkerOptions().position(latLng).title("Marker in Currents Location");
//                options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
//                mMap.addMarker(options);
//            }
//
//        }
//
//        @Override
//        public void onConnected(@Nullable Bundle bundle) {
//            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
//                    != PackageManager.PERMISSION_GRANTED &&
//                    ActivityCompat.checkSelfPermission(this,
//                            Manifest.permission.ACCESS_FINE_LOCATION) !=
//                            PackageManager.PERMISSION_GRANTED) {
//                return;
//            }
//
//            startLocationUpdates();
//
//            mLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
//
//            if (mLocation == null) {
//                startLocationUpdates();
//
//            } else {
//                Toast.makeText(this, "Location not Delected", Toast.LENGTH_SHORT).show();
//            }
//        }
//
//        private void startLocationUpdates() {
//            mLocationRequest = LocationRequest.create()
//                    .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
//                    .setInterval(UPDATE_INTERVAL)
//                    .setFastestInterval(FASTESR_INTERVAL);
//
//            if (ActivityCompat.checkSelfPermission(this,
//                    Manifest.permission.ACCESS_FINE_LOCATION) !=
//                    PackageManager.PERMISSION_GRANTED &&
//                    ActivityCompat.checkSelfPermission(this,
//                            Manifest.permission.ACCESS_COARSE_LOCATION) !=
//                            PackageManager.PERMISSION_GRANTED) {
//                return;
//            }
//            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient,
//                    mLocationRequest, this);
//
//        }
//
//        @Override
//        public void onConnectionSuspended(int i) {
//
//        }
//
//        @Override
//        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//
//        }
//
//        @Override
//        public void onLocationChanged(Location location) {
//            String msg = "Updated Location: " +
//                    Double.toString(location.getLatitude()) + "," +
//                    Double.toString(location.getLongitude());
//            Toast.makeText(this, "Updated Location", Toast.LENGTH_SHORT).show();
//
//
//            latLng = new LatLng(location.getLatitude(), location.getLongitude());
//
//
//            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                    .findFragmentById(R.id.map);
//            mapFragment.getMapAsync(this);
//
//
//        }
//
//        @Override
//        protected void onStart() {
//            super.onStart();
//
//            if (mGoogleApiClient != null) {
//                mGoogleApiClient.connect();
//            }
//        }
//
//        @Override
//        protected void onStop() {
//            super.onStop();
//
//            if (mGoogleApiClient.isConnected()) {
//                mGoogleApiClient.disconnect();
//            }
//        }
//
//
//    }
//
//
//
//    ok finish this project
//            extra
//
//    jo market no color change krvo hoi to aa method ma thay
//
//  if (latLng != null) {
//        // Add a marker in Sydney and move the camera
////        LatLng sydney = new LatLng(-34, 151);
////        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
////        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//
//        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 17));
//        MarkerOptions options = new MarkerOptions().position(latLng).title("Marker in Currents Location");
//        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
//        mMap.addMarker(options);
//    }
//

}
