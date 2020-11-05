//package com.lathiya.allinonecode.Firebase.FirebaseRecycleview;
//
//import android.app.Activity;
//import android.app.DownloadManager;
//import android.content.Context;
//import android.net.Uri;
//import android.os.Environment;
//import android.util.Log;
//import android.util.SparseArray;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.core.app.ShareCompat;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.firebase.ui.database.FirebaseRecyclerOptions;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.database.FirebaseDatabase;
//import com.movie.status.videosong.ModalAndAdapter.CategoriesModal;
//import com.movie.status.videosong.R;
//
//import at.huber.youtubeExtractor.YouTubeUriExtractor;
//import at.huber.youtubeExtractor.YtFile;
//
//public class VideioclickAdapter extends FirebaseRecyclerAdapter<CategoriesModal, com.movie.status.videosong.ModalAndAdapter.VideoClick.VideioclickAdapter.CATE> {
//
//    Context context;
//    /**
//     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
//     * {@link FirebaseRecyclerOptions} for configuration options.
//     *
//     * @param options
//     */
//    public VideioclickAdapter(@NonNull FirebaseRecyclerOptions<CategoriesModal> options, Context context) {
//        super(options);
//        this.context = context;
//    }
//
//    @Override
//    protected void onBindViewHolder(@NonNull CATE holder, final int position, @NonNull final CategoriesModal model) {
////        Collections.swap(Collections.singletonList(model.getName()), position, 0);
////        notifyItemMoved(position, 0);
//
//
//        holder.name.setText(model.getName());
//        holder.time.setText(model.getTime());
//        holder.next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "ok", Toast.LENGTH_SHORT).show();
////                Intent intent = new Intent(context, VideoPlaytwoActivity.class);
////                intent.putExtra("youtube_link", model.getLink());
////                intent.putExtra("SingerName", model.getSinger());
////                context.startActivity(intent);
//            }
//        });
//
//        holder.share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                share(model);
////                delete(model,position);
//            }
//        });
//
//
//
//        holder.download.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                download(model);
//            }
//        });
//
//        RequestOptions requestOptions = new RequestOptions();
//        requestOptions.placeholder(R.drawable.ic_dashboard_black_24dp);
//        requestOptions.error(R.drawable.ic_home_black_24dp);
//        Glide.with(context)
//                .load("https://i.ytimg.com/vi/" + model.getLink() + "/0.jpg")
//                .apply(requestOptions)
//                .into(holder.thumbh);
//
//
//    }
//
//
//
//    private void download(final CategoriesModal model) {
//
//        String downloadLink = "https://youtu.be/" + model.getLink();
//        Toast.makeText(context, "" + downloadLink, Toast.LENGTH_SHORT).show();
//        YouTubeUriExtractor youTubeUriExtractor = new YouTubeUriExtractor(context) {
//            @Override
//            public void onUrisAvailable(String videoId, String videoTitle, SparseArray<YtFile> ytFiles) {
//                if (ytFiles != null) {
//                    int tag = 22;
////                            if (ytFiles.get(tag).getUrl().equals("")) {
////                                Toast.makeText(context, "null", Toast.LENGTH_SHORT).show();
////                            } else {
//                    String newLink = ytFiles.get(tag).getUrl();
//                    Log.e("123: ", newLink);
//
//                    String title = model.getName();
//                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(newLink));
//                    request.setTitle(title);
//                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title + ".mp4");
//                    DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
//                    request.allowScanningByMediaScanner();
//                    request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);
//                    downloadManager.enqueue(request);
//                }
//
//            }
//        };
////                youTubeUriExtractor.execute("https://youtu.be/" + model.getLink());
//        youTubeUriExtractor.execute(downloadLink);
//    }
//
//    private void delete(CategoriesModal modal,int position) {
//
//        FirebaseDatabase.getInstance().getReference()
//                .child("Categroy Name").child("Hindi").child(getRef(position).getKey())
//                .removeValue()
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        Toast.makeText(context, "delete ok" +task, Toast.LENGTH_SHORT).show();
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(context, ""+e, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
//
//    private void share(CategoriesModal model) {
//
//        ShareCompat.IntentBuilder chooserTitle = ShareCompat.IntentBuilder.from((Activity) context).setType("text/plain").setChooserTitle(model.getName());
//        chooserTitle.setText("https://youtu.be/" + model.getLink()).startChooser();
//
//    }
//
//    @NonNull
//    @Override
//    public CATE onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_rv, parent, false);
//        return new CATE(view);
//    }
//
//    public class CATE extends RecyclerView.ViewHolder {
//        TextView name, link, time;
//        CardView next;
//        ImageView thumbh;
//        Button share, download;
//
//        public CATE(@NonNull View itemView) {
//            super(itemView);
//            name = itemView.findViewById(R.id.name);
//            time = itemView.findViewById(R.id.time);
//            next = itemView.findViewById(R.id.next);
//            thumbh = itemView.findViewById(R.id.thumbh);
//            share = itemView.findViewById(R.id.share);
//            download = itemView.findViewById(R.id.download);
//        }
//    }
//
//
//}
