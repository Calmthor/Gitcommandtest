package com.example.mytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends BasicActivity {
    private List<myItem> list = new ArrayList<myItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initMyItems();
        myAdapter myAdapters = new myAdapter(SecondActivity.this, R.layout.lisitem, list);
        ListView listView = (ListView) findViewById(R.id.myList);
        listView.setAdapter(myAdapters);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                myItem myItems = list.get(position);
                Toast.makeText(SecondActivity.this, myItems.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initMyItems() {
        for (int i = 0; i < 24; i++)
            list.add(new myItem("Fine", R.drawable.ic_launcher_foreground));
    }//加入ListView的数据；

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenus, menu);
        return true;
    }//加载菜单；

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.out:
                Toast.makeText(SecondActivity.this, "退出程序", Toast.LENGTH_LONG).show();
                back();
                break;
            case R.id.back:
                Toast.makeText(SecondActivity.this, "返回", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return true;
    }
}