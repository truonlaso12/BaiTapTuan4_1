package com.phuoctruong.bai3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inform("Thông báo", "Đăng Ký Thành Công");
            }
        });

    }
    public  void inform(String title, String mess){
        android.app.AlertDialog.Builder adg = new android.app.AlertDialog.Builder(this);
        adg.setTitle(title);
        adg.setMessage(mess);
        adg.setIcon(R.drawable.ic_action_inform);
        adg.setPositiveButton("Quay Lại Trang Đăng Nhập", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {
              Intent mh1 = new  Intent(MainActivity2.this,MainActivity.class);
              startActivity(mh1);
          }
      });
        adg.show();
    }
}