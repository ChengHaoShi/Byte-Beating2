package chapter.android.aweme.ss.com.homework.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import chapter.android.aweme.ss.com.homework.Exercises3;
import chapter.android.aweme.ss.com.homework.R;
import chapter.android.aweme.ss.com.homework.model.Message;

public class MessageAdapter extends BaseAdapter {

    private LinkedList<Message> mData;
    private Context mContext;

    public MessageAdapter(LinkedList<Message> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.im_list_item, parent, false);
//        ImageView iv_aIcon = (ImageView) convertView.findViewById(R.id.iv_aIcon);
        TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
        TextView tv_description = (TextView) convertView.findViewById(R.id.tv_description);
        TextView tv_time = (TextView) convertView.findViewById(R.id.tv_time);
//        iv_aIcon.setImageBitmap(mData.get(position).getaIcon());
        tv_title.setText(mData.get(position).getTitle());
        tv_description.setText(mData.get(position).getDescription());
        tv_time.setText(mData.get(position).getTime());
        return convertView;
    }
}
