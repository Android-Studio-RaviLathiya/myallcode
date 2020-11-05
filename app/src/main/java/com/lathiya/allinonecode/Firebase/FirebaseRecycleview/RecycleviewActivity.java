//package com.lathiya.allinonecode.Firebase.FirebaseRecycleview;
//
//import android.app.Dialog;
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.firebase.ui.database.FirebaseRecyclerOptions;
//import com.google.firebase.database.FirebaseDatabase;
//import com.movie.status.videosong.ModalAndAdapter.CategoriesAdapter;
//import com.movie.status.videosong.ModalAndAdapter.CategoriesModal;
//import com.movie.status.videosong.util.Util;
//
//public class RecycleviewActivity extends AppCompatActivity {
//
//    private RecyclerView rv;
//    private CategoriesAdapter categoriesAdapter;
//    private Dialog dialog;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycleview);
//        init();
//
//        dialog = Util.startLoader(this);
//        FirebaseRecyclerOptions<CategoriesModal> options =
//                new FirebaseRecyclerOptions.Builder<CategoriesModal>()
////                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Categroy Name").child("Bhajan").child("Gujarati").child("Gita Rabari"), CategoriesModal.class)
//                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Categroy Name").child("Mix Song"), CategoriesModal.class)
//                        .build();
//        Util.stopLoader(dialog);
//
//
//
//        categoriesAdapter = new CategoriesAdapter(options,this);
//        rv.setAdapter(categoriesAdapter);
//
//    }
//
//    private void init() {
//
//        rv = findViewById(R.id.rv);
//        rv.setLayoutManager(new LinearLayoutManager(this));
//
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        categoriesAdapter.startListening();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        categoriesAdapter.stopListening();
//    }
//}
