package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    private String TAG = "Exercise12";
    private TextView viewcount_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_chatroom, null);
        int ans = getViewCount(view);
        System.out.println("View count = " +  ans);
        setContentView(R.layout.activity_viewcount);
        viewcount_tv = findViewById(R.id.viewcount_tv);
        String aans = String.valueOf(ans);
        viewcount_tv.setText("ViewCounts:   " + aans);
    }

   public static int getViewCount(View view) {
        //todo 补全你的代码
       int ans = 0;
       if (view instanceof ViewGroup) {
           ViewGroup vp = (ViewGroup) view;
           int childcount = vp.getChildCount();
           for (int i = 0; i < childcount; i++) {
               View viewchild = vp.getChildAt(i);
               ans += getViewCount(viewchild);
           }
       }
       ans += 1;
       return ans;
    }

}
