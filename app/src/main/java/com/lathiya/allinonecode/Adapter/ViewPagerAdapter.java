package com.lathiya.allinonecode.Adapter;

public class ViewPagerAdapter {


//
//    public class ViewPagerVAdepter extends PagerAdapter {
//
//        Context context;
//        ArrayList<ListVItem> listVItems;
//        ImageView img;
//        LinearLayout home, sharedata, download, dp, fav, account;
//
//
//        public ViewPagerVAdepter(Context context, ArrayList<ListVItem> listVItems) {
//            this.context = context;
//            this.listVItems = listVItems;
//        }
//
//        @Override
//        public int getCount() {
//            return listVItems.size();
//        }
//
//        @Override
//        public void destroyItem(ViewGroup collection, int position, Object view) {
//            collection.removeView((View) view);
//        }
//
//        @Override
//        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//            return view == object;
//        }
//
//        @Override
//        public Object instantiateItem(@NonNull ViewGroup collection, int position) {
//            LayoutInflater inflater = LayoutInflater.from(context);
//            final ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.viewpagerv_item, collection, false);
//            collection.addView(layout);
//            final String album = listVItems.get(position).getPath();
//
//            img = layout.findViewById(R.id.img);
//            home = layout.findViewById(R.id.home);
//            sharedata = layout.findViewById(R.id.sharedata);
//            download = layout.findViewById(R.id.download);
//            dp = layout.findViewById(R.id.dp);
//            account = layout.findViewById(R.id.account);
//            fav = layout.findViewById(R.id.fav);
//
//            finish
//
//            Ahiya sudhi j che aagal to seton click ni method che
//
//
//            AnimationDrawable animationDrawable;
//
//            RelativeLayout my = layout.findViewById(R.id.my);
//
//            animationDrawable = (AnimationDrawable) my.getBackground();
//            animationDrawable.setEnterFadeDuration(2000);
//            animationDrawable.setExitFadeDuration(2000);
//            animationDrawable.start();
//
//            download.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                }
//            });
//
//            fav.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    context.startActivity(new Intent(context, FavouriteFragment.class));
//                }
//            });
//
////        account.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                context.startActivity(new Intent(context, AccountFragment.class));
////            }
////        });
//
//
//            home.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
////                context.startActivity(new Intent(context, MainActivity.class));
//                    Intent intent = new Intent(context, MainActivity.class);
//                    context.startActivity(intent);
//                }
//
//            });
//
//            sharedata.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    sharedata();
//                }
//            });
//
//
//            Glide.with(context).load(album).into(img);
//
//            return layout;
//        }
//
//        private void sharedata() {
//
//            String shareBody = "uid";
//            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
//            sharingIntent.setType("*/*");
//            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
//            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
//            context.startActivity(Intent.createChooser(sharingIntent, context.getResources().getString(R.string.app_name)));
//        }
//    }
//

}
