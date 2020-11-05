package com.lathiya.allinonecode.RecycleView;

public class SliderItemDeletandUndu {
//
//    Swipe Open Manu
//
//            Link = https://www.journaldev.com/23164/android-recyclerview-swipe-to-delete-undo
//    implementation
//
//    implementation 'com.android.support:design:28.0.0'
//
//    Main activity
//
//    Sem main activity in xml
//    Java item
//    Sem java item
//    Xml item
//    Sem xml itme
//
//    Adapter add
//    METHO BANVA NI ADAPTER MA
//
////size jova mate
//    @Override public int getItemCount() { return data.size(); }
//
//    //removeitem mate(delet)
//    public void removeItem(int position) { data.remove(position); notifyItemRemoved(position); }
//
//    //undu(delet item pachi lava mate)
//    public void restoreItem(String item, int position) { data.add(position, item); notifyItemInserted(position); }
//
//    //list add krva mayte
//    public ArrayList<String> getData() { return data; }
//
//
//    MAIN ACTIVITY MA METHOD ADD KRVA NI
//
//    enableSwipeToDeleteAndUndo();
//
//
//    private void enableSwipeToDeleteAndUndo() {
//        SwipeToDeleteCallback swipeToDeleteCallback = new SwipeToDeleteCallback(this) {
//            @Override
//            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//
//
//                final int position = viewHolder.getAdapterPosition();
//                final Item xyz = adapter.getData().get(position);
//
//                adapter.removeItem(position);
//
//                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Delet Item.", Snackbar.LENGTH_LONG).setDuration(5000);
//
//                snackbar.setAction("UNDO", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                        adapter.restoreItem(xyz, position);
//                        rv.scrollToPosition(position);
//                    }
//                });
//
//                snackbar.setActionTextColor(Color.BLUE);
//
//
//                snackbar.show();
//
//            }
//        };
//
//        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeToDeleteCallback);
//        itemTouchhelper.attachToRecyclerView(rv);
//    }
//
//
//    EXTRA CLASS ADD KRVA NO
//    abstract public class SwipeToDeleteCallback extends ItemTouchHelper.Callback { Context mContext; private Paint mClearPaint; private ColorDrawable mBackground; private int backgroundColor; private Drawable deleteDrawable; private int intrinsicWidth; private int intrinsicHeight; SwipeToDeleteCallback(Context context) { mContext = context; mBackground = new ColorDrawable(); backgroundColor = Color.parseColor("#b80f0a"); mClearPaint = new Paint(); mClearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR)); deleteDrawable = ContextCompat.getDrawable(mContext, R.drawable.ic_delete); intrinsicWidth = deleteDrawable.getIntrinsicWidth(); intrinsicHeight = deleteDrawable.getIntrinsicHeight(); } @Override public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) { return makeMovementFlags(0, ItemTouchHelper.LEFT); } @Override public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) { return false; } @Override public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) { super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive); View itemView = viewHolder.itemView; int itemHeight = itemView.getHeight(); boolean isCancelled = dX == 0 && !isCurrentlyActive; if (isCancelled) { clearCanvas(c, itemView.getRight() + dX, (float) itemView.getTop(), (float) itemView.getRight(), (float) itemView.getBottom()); super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive); return; } mBackground.setColor(backgroundColor); mBackground.setBounds(itemView.getRight() + (int) dX, itemView.getTop(), itemView.getRight(), itemView.getBottom()); mBackground.draw(c); int deleteIconTop = itemView.getTop() + (itemHeight - intrinsicHeight) / 2; int deleteIconMargin = (itemHeight - intrinsicHeight) / 2; int deleteIconLeft = itemView.getRight() - deleteIconMargin - intrinsicWidth; int deleteIconRight = itemView.getRight() - deleteIconMargin; int deleteIconBottom = deleteIconTop + intrinsicHeight; deleteDrawable.setBounds(deleteIconLeft, deleteIconTop, deleteIconRight, deleteIconBottom); deleteDrawable.draw(c); super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive); } private void clearCanvas(Canvas c, Float left, Float top, Float right, Float bottom) { c.drawRect(left, top, right, bottom, mClearPaint); } @Override public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) { return 0.7f; }

    }
