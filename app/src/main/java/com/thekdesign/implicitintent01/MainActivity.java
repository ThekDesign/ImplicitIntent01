package com.thekdesign.implicitintent01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_call_anyone, btn_call_friend, btn_map, btn_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_call_anyone = (Button) findViewById(R.id.btn_call_anyone);
        btn_call_friend = (Button) findViewById(R.id.btn_call_friend);
        btn_map = (Button) findViewById(R.id.btn_map);
        btn_web = (Button) findViewById(R.id.btn_web);

        btn_call_anyone.setOnClickListener(new CallAnyoneListener());
        btn_call_friend.setOnClickListener(new CallFriendListener());
        btn_map.setOnClickListener(new ShowMapListener());
        btn_web.setOnClickListener(new ShowWebListener());

    }

    private class CallAnyoneListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent i = new Intent(Intent.ACTION_DIAL);
            startActivity(i);
        }
    }

    private class CallFriendListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0980000000"));
            startActivity(i);
        }
    }

    private class ShowMapListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=115 Stateway Welkom Free State"));
            startActivity(i);
        }
    }

    private class ShowWebListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tw"));
            startActivity(i);
        }
    }
}
