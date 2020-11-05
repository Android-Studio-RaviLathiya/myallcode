package com.lathiya.allinonecode.PopupMenu;

public class Popapmenu {

//    Popupmenu
//
//    How to creat menu
//    Res right click to new and click to new resors file to selec main manu
//    Niche ni said open thase menu and right click to open new and new manu resour
//    And typin
//
//<item
//    android:id="@+id/edit"
//    android:title="Edit" />
//<item
//    android:id="@+id/dalet"
//    android:title="Dalet" />
//<item
//    android:id="@+id/call"
//    android:title="Call" />
//
//    Aane aedepter ma set kravu hoi to
//    Niche ni method ma delet pn krel che
//
//btn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            PopupMenu popupMenu = new PopupMenu(context, v);
//            popupMenu.inflate(R.menu.popu);
//            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                @Override
//                public boolean onMenuItemClick(MenuItem item) {
//
//
//                    if (item.getItemId() == R.id.edit) {
//
//                    }
//                    if (item.getItemId() == R.id.dalet) {
//                        db.execSQL("delete from contact where id = '" + contecItems.get(position).getId() + "'");
//                        contecItems.remove(position);
//                        notifyDataSetChanged();
//                        Toast.makeText(context, "Delet Number", Toast.LENGTH_SHORT).show();
//
//                    }
//
//                    return false;
//                }
//            });
//            popupMenu.show();
//        }
//    });
//
//return view;
//
//    java  activity ma set krvu hoi to
//
//    PopupMenu popupMenu = new PopupMenu(BusinessProfile.this, v);
//popupMenu.getMenuInflater().inflate(R.menu.logout_update, popupMenu.getMenu());
//
//popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//        @Override
//        public boolean onMenuItemClick(MenuItem item) {
//
//
//            if (item.getItemId() == R.id.updatepass) {
//                startActivity(new Intent(BusinessProfile.this, UpdatePassActivity.class));
//            }
//            if (item.getItemId() == R.id.logout) {
//
//                MyPrefrence.setLogin(false);
//                startActivity(new Intent(BusinessProfile.this, LoginActivity.class));
//                finish();
//            }
//            return false;
//        }
//    });
//
//
//popupMenu.show();
//
//
//    Popumanu  with icone in adepter
//
//
//
//holder.more.setOnClickListener(new View.OnClickListener() {
//        @SuppressLint("RestrictedApi")
//        @Override
//        public void onClick(View v) {
//
//            MenuBuilder menuBuilder = new MenuBuilder(mContext);
//            new SupportMenuInflater(mContext).inflate(R.menu.calleditdelet, menuBuilder);
//            menuBuilder.setCallback(new MenuBuilder.Callback() {
//                @Override
//                public boolean onMenuItemSelected(MenuBuilder menu, MenuItem menuItem) {
//                    // your "setOnMenuItemClickListener" code goes here
//                    switch (menuItem.getItemId()) {
//                        case R.id.call:
//
//
//                            Intent intent = new Intent(mContext, CallActivity.class);
//                            intent.putExtra("name", memberDetailList.get(position).name);
//                            intent.putExtra("mobile", memberDetailList.get(position).mobile);
//                            mContext.startActivity(intent);
//
//                            return true;
//
//                        case R.id.edit:
//                            // do something 2
//                            return true;
//
//                        case R.id.delet:
//                            // do something 2
//                            return true;
//
//                    }
//                    return false;
//                }
//
//                @Override
//                public void onMenuModeChange(MenuBuilder menu) {
//                }
//            });
//            MenuPopupHelper menuHelper = new MenuPopupHelper(mContext, menuBuilder, v);
//            menuHelper.setForceShowIcon(true); // show icons!!!!!!!!
//            menuHelper.show();
//
//
//        }
//    });


}
