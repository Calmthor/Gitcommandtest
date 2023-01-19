package com.example.mytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends BasicActivity {
    private static TextView tv;
    private static EditText edAccount;
    private static EditText edPassword;
    private static Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = (TextView) findViewById(R.id.tips);
        edAccount = (EditText) findViewById(R.id.logAccount);
        edPassword = (EditText) findViewById(R.id.logPassword);
        bt = (Button) findViewById(R.id.back);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = edAccount.getText().toString();
                String password = edPassword.getText().toString();
                InformationCollector.addInformation(account, password);//储存注册信息；
                Toast.makeText(ThirdActivity.this, "注册成功", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenus, menu);
        return true;
    }//加载菜单；

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.out:
                Toast.makeText(ThirdActivity.this, "退出程序", Toast.LENGTH_LONG).show();
                back();
                break;
            case R.id.back:
                Toast.makeText(ThirdActivity.this, "返回", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return true;
    }
}