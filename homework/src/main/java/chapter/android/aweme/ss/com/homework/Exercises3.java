package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import chapter.android.aweme.ss.com.homework.adapter.MessageAdapter;
import chapter.android.aweme.ss.com.homework.model.Message;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Message> mData = null;
    private Context mContext;
    private MessageAdapter mAdapter = null;
    private ListView list_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        mContext = Exercises3.this;
        list_message = (ListView) findViewById(R.id.lv_list);
        mData = new LinkedList<Message>();
        mData.add(new Message("0", "123", "123"));
        mData.add(new Message("1", "123", "123"));
        mData.add(new Message("2", "123", "123"));
        mData.add(new Message("3", "123", "123"));
        mData.add(new Message("4", "123", "123"));
        mData.add(new Message("5", "123", "123"));
        mData.add(new Message("6", "123", "123"));
        mData.add(new Message("7", "123", "123"));
        mData.add(new Message("8", "123", "123"));
        mData.add(new Message("9", "123", "123"));
        mData.add(new Message("10", "123", "123"));
        mData.add(new Message("11", "123", "123"));
        mAdapter = new MessageAdapter((LinkedList<Message>) mData, mContext);
        list_message.setAdapter(mAdapter);
        list_message.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(mContext,"你点击了第" + position + "项，" + "跳转到主页面",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }
}
