package com.stu.helloword;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertActivity extends AppCompatActivity {

    private Button basicBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        Onclick onclick=new Onclick();
        basicBTN=findViewById(R.id.basicAlert);
        basicBTN.setOnClickListener(onclick);

    }

    class  Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.basicAlert:
                    //基本的弹窗
                    AlertDialog.Builder builder=new AlertDialog.Builder(AlertActivity.this);
                    builder.setTitle("hello").setMessage("text").show();
                    break;
            }
        }
    }
}
