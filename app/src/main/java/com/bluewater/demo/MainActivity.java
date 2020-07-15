package com.bluewater.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bluewater.okhttputilslib.CallBackUtil;
import com.bluewater.okhttputilslib.OkhttpUtil;

import java.util.HashMap;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity
{
    private String url = "https://www.baidu.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGet(View view)
    {
        getData(url);
    }

    public void onClickPost(View view)
    {
        postData(url);
    }

    private void getData(String url)
    {
        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString()
        {
            @Override
            public void onFailure(Call call, Exception e)
            {
            }

            @Override
            public void onResponse(String response)
            {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                Log.d("demo", response);
            }
        });
    }

    private void postData(String url)
    {
        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("title", "title");
        paramsMap.put("desc", "desc");
        OkhttpUtil.okHttpPost(url, paramsMap, new CallBackUtil.CallBackString()
        {
            @Override
            public void onFailure(Call call, Exception e)
            {

            }

            @Override
            public void onResponse(String response)
            {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                Log.d("demo", response);
            }
        });
    }



}