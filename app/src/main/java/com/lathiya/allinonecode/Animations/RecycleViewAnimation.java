package com.lathiya.allinonecode.Animations;

public class RecycleViewAnimation {
//    Recycle view animation
//
//    Three method typing in adepter
//
//    Step 1
//    private int lastPosition = -1;
//
//    Step 2
//    setAnimation(holder.itemView,position);
//
//
//    Step 3
//    public  void setAnimation (View viewToAnimate, int position){
//
//        if (position > lastPosition){
//
//            ScaleAnimation animation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,
//                    Animation.RELATIVE_TO_SELF,0.5f,
//                    Animation.RELATIVE_TO_SELF,0.5f);
//
//            animation.setDuration(1500);
//            viewToAnimate.setAnimation(animation);
//            lastPosition = position;
//        }
//    }
//
//
//
//this methos is postion in adepter
//
//package com.example.wallpaperapplication.Adepter_item;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.ScaleAnimation;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.example.wallpaperapplication.MyPefrence;
//import com.example.wallpaperapplication.R;
//import com.example.wallpaperapplication.viewpagerh.ViewPagerActivity;
//
//import java.util.ArrayList;
//
//    public class ListAdepter extends RecyclerView.Adapter<ListAdepter.MYHOLDER> {
//        ArrayList<ListItem> listItems;
//
//        Context context;
//        private MyPefrence MyPrefrence;
//        private int lastPosition = -1;     step 1
//
//        public ListAdepter(ArrayList<ListItem> listItems, Context context) {
//            this.listItems = listItems;
//            this.context = context;
//
//        }
//
//        @NonNull
//        @Override
//        public MYHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(context).inflate(R.layout.list_h_item, parent, false);
//            return new MYHOLDER(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull MYHOLDER holder, final int position) {
//
//            Glide.with(context).load(listItems.get(position).getPath()).into(holder.img);
//            holder.img.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    Intent intent = new Intent(context, ViewPagerActivity.class);
//                    intent.putExtra("data", listItems.get(position).getPath());
//                    MyPrefrence.setlist(listItems);
//                    intent.putExtra("pos",position);
//                    context.startActivity(intent);
//
//                }
//            });
//
//
//
//            setAnimation(holder.itemView,position);     step 2
//
//        }
//
//        public  void setAnimation (View viewToAnimate, int position){
//
//            if (position > lastPosition){
//
//                ScaleAnimation animation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,
//                        Animation.RELATIVE_TO_SELF,0.5f,
//                        Animation.RELATIVE_TO_SELF,0.5f);
//
//                animation.setDuration(1500);
//                viewToAnimate.setAnimation(animation);
//                lastPosition = position;
//            }
//        }                              step 3
//
//
//        @Override
//        public int getItemCount() {
//            return listItems.size();
//        }
//
//
//        public class MYHOLDER extends RecyclerView.ViewHolder {
//            ImageView img;
//
//            public MYHOLDER(@NonNull View itemView) {
//                super(itemView);
//                img = itemView.findViewById(R.id.img);
//            }
//        }
//    }
//


}
