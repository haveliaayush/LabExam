package com.example.labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String text;
    TextToSpeech tts;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int status) {
//                if (status != TextToSpeech.ERROR)
//                    tts.setLanguage(Locale.US);
//            }
//        });

    }

    public void textToSpeech(View view){
//        switch(view.getId()) {
//            case R.id.btn_edu:
//                text = "Education";
//                break;
//            case R.id.btn_morn:
//                text = "Morning";
//                break;
//            case R.id.btn_noon:
//                text = "Noon";
//                break;
//            case R.id.btn_over:
//                text = "Overcome";
//                break;
//            case R.id.btn_temp:
//                text = "Temperature";
//                break;
//            case R.id.btn_temple:
//                text = "Temple";
//                break;
//            case R.id.btn_think:
//                text = "Thinking";
//                break;
//            case R.id.btn_words:
//                text = "Words";
//                break;
//        }

        switch(view.getId()) {
            case R.id.btn_edu:
                player = MediaPlayer.create(getApplicationContext(), R.raw.edu);
                break;
            case R.id.btn_morn:
                player = MediaPlayer.create(getApplicationContext(), R.raw.morn);
                break;
            case R.id.btn_noon:
                player = MediaPlayer.create(getApplicationContext(), R.raw.noon);
                break;
            case R.id.btn_over:
                player = MediaPlayer.create(getApplicationContext(), R.raw.over);
                break;
            case R.id.btn_temp:
                player = MediaPlayer.create(getApplicationContext(), R.raw.temp);
                break;
            case R.id.btn_temple:
                player = MediaPlayer.create(getApplicationContext(), R.raw.temple);
                break;
            case R.id.btn_think:
                player = MediaPlayer.create(getApplicationContext(), R.raw.think);
                break;
            case R.id.btn_words:
                player = MediaPlayer.create(getApplicationContext(), R.raw.word);
                break;
        }

        player.start();1
//        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
