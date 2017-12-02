package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Win 8.1 Version 2 on 25/11/2017.
 */

public class RadioSend extends AppCompatActivity {
    private DatabaseReference mData;
    Button btnSend;
    EditText edtName,edtSdt,edtContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_sendradio);
        Init();
        mData = FirebaseDatabase.getInstance().getReference();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtName.getText().toString().equals("")==false&&edtSdt.getText().toString().equals("")==false
                        &&edtContent.getText().toString().equals("")==false){
                    String name = edtName.getText().toString();
                    String phone = edtSdt.getText().toString();
                    String content = edtContent.getText().toString();
                    SendRadio sendRadio = new SendRadio(name,phone,content);
                    mData.child("SendRadio").push().setValue(sendRadio);
//                    Toast.makeText(RadioSend.this, ""+name+" "+phone+" "+content, Toast.LENGTH_SHORT).show();
                    Toast.makeText(RadioSend.this, "Đã gửi. Cám ơn!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RadioSend.this, Radio.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(RadioSend.this, "Nhập vào đầy đủ các trường", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Init() {
        btnSend = findViewById(R.id.radioSend);
        edtName = findViewById(R.id.editName);
        edtSdt = findViewById(R.id.editPhone);
        edtContent = findViewById(R.id.editContent);
    }
//    private void upData() {
//        SendRadio sendRadio = new SendRadio("Lê Xuân Lợi","20","Hưng Yên","https://i.imgur.com/wKnbhkE.jpg","Chủ Nhiệm CLB","Đẹp trai, ghita hay");
//        mData.child("SendRadio").push().setValue(banChuNhiem);
//    }
}
