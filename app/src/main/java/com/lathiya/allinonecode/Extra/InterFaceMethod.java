package com.lathiya.allinonecode.Extra;

public class InterFaceMethod {

//    Interface method
//
//    ADAPTER MA USES THAY
//
//if (context instanceof SelectedItemActivity) {
//        ((SelectedItemActivity)context).yourDesiredMethod();
//    }
//
//
//    OTHER METHOD
//    CREAT CLASS WITH INTERFACE
//    public interface RecyclerViewClickInterface {
//        void onItemClick(int position);
//        void onLongItemClick(int position);
//    }
//
//    IMPLIMATION USES THIS ACTIVITY
//implements RecyclerViewClickInterface
//
//    IMPLIMATION ADAPTER
//    private RecyclerViewClickInterface recyclerViewClickInterface;
//
//
//    public RecyclerAdapter(List<String> moviesList, RecyclerViewClickInterface recyclerViewClickInterface) {
//        this.moviesList = moviesList;
//        this.recyclerViewClickInterface = recyclerViewClickInterface;
//    }
//
//
//
//itemView.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            recyclerViewClickInterface.onItemClick(getAdapterPosition());
//        }
//    });
//
//
//	            itemView.setOnLongClickListener(new View.OnLongClickListener() {
//        @Override
//        public boolean onLongClick(View view) {
//            //                    moviesList.remove(getAdapterPosition());
//            //                    notifyItemRemoved(getAdapterPosition());
//
//
//            recyclerViewClickInterface.onLongItemClick(getAdapterPosition());
//
//
//            return true;
//        }
//    });
//
//
//
//    This is method main activity
////    These are the interface Methods from our custom RecyclerViewClickInterface
//    @Override
//    public void onItemClick(int position) {
//        Intent intent = new Intent(this, NewActivity.class);
//        intent.putExtra("MOVIE_NAME", moviesList.get(position));
//        startActivity(intent);
//    }
//
//
//    @Override
//    public void onLongItemClick(final int position) {
//        moviesList.remove(position);
//        recyclerAdapter.notifyItemRemoved(position);
//    }
//

}
