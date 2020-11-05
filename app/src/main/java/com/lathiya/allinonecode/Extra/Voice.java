package com.lathiya.allinonecode.Extra;

public class Voice {

//    Voice
//
//    Koi pn message voice krva mate
//
//    TextToSpeech tts;
//
//
//  btn_next.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
////                onBackPressed();
//            String str=  et_firstname.getText().toString();
//            tts.speak(str, TextToSpeech.QUEUE_FLUSH,null);
//        }
//    });
//    Intent i =new Intent();
//        i.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
//    startActivityForResult(i, 1);
//
//}
//
//
//METHOD
//
//@Override
//protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        // TODO Auto-generated method stub
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==1)
//        {
//        if(resultCode==TextToSpeech.Engine.CHECK_VOICE_DATA_PASS)
//        {
//        tts= new TextToSpeech(this,this);
//        }
//        else
//        {
//        Intent i=new Intent();
//        i.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
//        startActivity(i);
//        }
//        }
//        }
//
//@SuppressLint("WrongConstant")
//@Override
//public void onInit(int status) {
//        // TODO Auto-generated method stub
//        if(status==TextToSpeech.SUCCESS)
//        {
//        Toast.makeText(getApplicationContext(), "engine installed",1000).show();
//        }
//        if(status==TextToSpeech.ERROR)
//        {
//        Toast.makeText(getApplicationContext(), "engine not installed", 1000).show();
//        }
//        }
//
//        Voice messge edittext ma typing krva mate
//
//
//        btn_next.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
////                onBackPressed();
//        voice_to_text();
//        }
//        });
//
//        }
//
//private void voice_to_text() {
//        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
//        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
////        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
//        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
//        "Announement Say Something!!");
//        try {
//        startActivityForResult(intent, VOICE_CODE);
//        } catch (ActivityNotFoundException e) {
//
//        }
//        }
//
//// receive voice input and set it to textbox
//
//@Override
//protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        switch (requestCode) {
//        case VOICE_CODE: {
//        if (resultCode == RESULT_OK && null != data) {
//
//        ArrayList<String> result = data
//        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//        et_announcent_note.setText(result.get(0));
//        }
//        break;
//        }
//
//        }
//        }
//
//
//
//
//

        }
