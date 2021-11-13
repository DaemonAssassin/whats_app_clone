package com.gmail.mateendev3.listviewconcepts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<SingleViewListView> {

    public ListViewAdapter( Context context, List<SingleViewListView> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View recycledView = convertView;
        if (recycledView == null) {
            recycledView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_single_element, parent, false
            );
        }

        SingleViewListView currentInstance = getItem(position);

        TextView mName = recycledView.findViewById(R.id.lv_titleTV);
        TextView mMessage = recycledView.findViewById(R.id.lv_messageTV);
        TextView mTime = recycledView.findViewById(R.id.lv_timeTV);
        ImageView mProfileImage = recycledView.findViewById(R.id.lv_image);
        ImageView mMutedPinnedImage = recycledView.findViewById(R.id.iv_muted_pin_action);

        mName.setText(currentInstance.getName());
        mMessage.setText(currentInstance.getMessage());
        mTime.setText(currentInstance.getTime());
        mProfileImage.setImageResource(currentInstance.getProfileImage());
        if (currentInstance.hasMutedPinnedImage())
            mMutedPinnedImage.setImageResource(currentInstance.getMutedPinedImage());

        return recycledView;
    }
}
