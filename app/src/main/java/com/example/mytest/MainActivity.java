package com.example.mytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BasicActivity {
    private TextView tv;
    private EditText edlog;
    private EditText edpassword;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.主界面);
        edlog = (EditText) findViewById(R.id.account);
        edpassword = (EditText) findViewById(R.id.password);
        bt = (Button) findViewById(R.id.log);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountNumber = edlog.getText().toString();//获取输入的账户；
                String accountPassword = edpassword.getText().toString();//获取输入的密码；
                boolean isAccount = false;
                boolean isPassword = false;
                for (String a : InformationCollector.logAccount) {
                    if (a.equals(accountNumber)) isAccount = true;
                }//判断账户是否正确
                for (String a : InformationCollector.logPassword) {
                    if (a.equals(accountPassword)) isPassword = true;
                }//判断密码是否正确；
                if (isAccount && isPassword) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else if (!isAccount && isPassword)
                    Toast.makeText(MainActivity.this, "账户错误", Toast.LENGTH_LONG).show();
                else if (!isPassword && isAccount)
                    Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_LONG).show();
                else {
                    AlertDialog.Builder tips = new AlertDialog.Builder(MainActivity.this);
                    tips.setTitle("注意");
                    tips.setMessage("您的账户和密码均错误，可能未注册");
                    tips.setPositiveButton("注册一个", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                            startActivity(intent);//跳转至登录界面；
                        }
                    });
                    tips.setNegativeButton("重新输入", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "那你继续输吧", Toast.LENGTH_LONG).show();
                        }
                    });
                    tips.show();
                }
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
                Toast.makeText(MainActivity.this, "退出程序", Toast.LENGTH_LONG).show();
                back();
                break;
            case R.id.back:
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return true;
    }

    //实现菜单的点击效果；

}