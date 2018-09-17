package com.stu.helloword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     private Button mybtn1,alertBTN;//定义一个按钮

    //创建时调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybtn1=findViewById(R.id.textView);
        alertBTN=findViewById(R.id.alert);

        //
        OnClick onclick=new OnClick();

        mybtn1.setOnClickListener(onclick);
        alertBTN.setOnClickListener(onclick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.textView:
                    Intent Intent=new Intent(MainActivity.this,TextViewActivity.class);
                    startActivity(Intent);
                    break;
                case R.id.alert:
                    //弹窗
                    Intent Intent1=new Intent(MainActivity.this,AlertActivity.class);
                    startActivity(Intent1);
                    break;

            }
        }
    }
    //

}
