package com.flir.flir_app_11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;



public class LiveStream extends AppCompatActivity {

    VideoView videoView;
    Button visible_camera_button, infrared_camera_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_stream);
        visible_camera_button = (Button) findViewById(R.id.VisibleCamera);
        infrared_camera_button = (Button) findViewById(R.id.InfraredCamera);


        visible_camera_button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                        String videoRtspUrl = "rtsp://172.20.10.7/stream2";
                        videoView = (VideoView) findViewById(R.id.htmlView);
                        videoView.setVideoPath(videoRtspUrl);
                        videoView.requestFocus();
                        videoView.start();
            }
        });

       

    }
}



