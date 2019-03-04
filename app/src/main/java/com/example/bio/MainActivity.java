package com.example.bio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView =(ImageView)findViewById(R.id.imgView);

        imgView.setOnClickListener((View.OnClickListener) this);

     }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgView:
                Intent image =new Intent(MainActivity.this,Detail.class);
                 startActivity(image);
                 break;
        }

    }
}
