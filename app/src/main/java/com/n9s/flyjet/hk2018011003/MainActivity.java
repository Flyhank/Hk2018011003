package com.n9s.flyjet.hk2018011003;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);

            Log.d("MSG", "取得一個Message");    //Debug 除錯訊息

            Bundle bd = msg.getData();
            String str = bd.getString("data");
            Log.d("MSG", "data:"+ str);
        }
    };

    public void click1(View v)
    {
        Message msg = new Message();
        Bundle bd = new Bundle();
        bd.putString("data", "MyData");
        msg.setData(bd);
        handler.sendMessage(msg);
    }
}
