package com.lathiya.allinonecode.Extra;

public class TextViewMethod {

//    TEXT VIEW
//
//<TextView
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:text="A light blue shadow."
//    android:shadowColor="#00ccff"
//    android:shadowRadius="2"
//    android:shadowDx="1"
//    android:shadowDy="1"
//            />
//    This results in:
//
//
//
//
//<TextView
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:minLines="1"
//    android:maxLines="2"
//            />
//
//
//<TextView
//    ...
//    android:ellipsize="end"
//    android:singleLine="true"
//            />
//    Following values are available for ellipsize: start for ...bccc, end for aaab..., middle for aa...cc, and marquee for aaabbbccc sliding from left to right. Example:
//
//
//
//
//<TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:lineSpacingMultiplier="1.1"
//    android:textAllCaps="true"
//            />
//
//
//    TextView view = (TextView)findViewById(R.id.sampleText);
//    String formattedText = "This <i>is</i> a <b>test</b> of <a href='http://foo.com'>html</a>";
//// or getString(R.string.htmlFormattedText);
//
//if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//        view.setText(Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY));
//    } else {
//        view.setText(Html.fromHtml(formattedText));
//    }
//    You can read more about the html modes here.
//    This results in:
//
//
//
//
//<TextView
//    android:id="@+id/custom_font"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:autoLink="all"
//    android:linksClickable="true"
//            />
//    This results in:
//
//
//
//<TextView xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:gravity="center"
//    android:text="@string/my_contacts"
//    android:drawableRight="@drawable/ic_action_add_group"
//    android:drawablePadding="8dp"
//            />
//    Which results in:
//
//
//
//<EditText
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="@string/user_name"
//    android:drawableLeft="@drawable/ic_action_person"
//    android:drawablePadding="8dp"
//            />
//    Which results in:
//
//
//
//
//
//    extView textView = (TextView) findViewById(R.id.textView);
//textView.setText("Hey @sarah, where did @jim go? #lost");
//// Style clickable spans based on pattern
//new PatternEditableBuilder().
//    addPattern(Pattern.compile("\\@(\\w+)"), Color.BLUE,
//            new PatternEditableBuilder.SpannableClickedListener() {
//        @Override
//        public void onSpanClicked(String text) {
//            Toast.makeText(MainActivity.this, "Clicked username: " + text,
//                    Toast.LENGTH_SHORT).show();
//        }
//    }).into(textView);
//    and this results in the following:
//
//

}
