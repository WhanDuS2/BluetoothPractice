package com.thejoeunit.www.bluetoothpractice.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.thejoeunit.www.bluetoothpractice.R;
import com.thejoeunit.www.bluetoothpractice.data.BtDevice;

import java.util.List;

/**
 * Created by the on 2017-09-13.
 */

public class BtPairedDeviceAdapter extends ArrayAdapter<BtDevice> {

    Context mContext;
    List<BtDevice> mList;
    LayoutInflater inf;

    public BtPairedDeviceAdapter(Context context, List<BtDevice> list) {
        super(context, R.layout.btdevice_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.btdevice_list_item, null);
        }
        BtDevice data = mList.get(position);

        TextView deviceNameTxt = (TextView) row.findViewById(R.id.deviceNameTxt);
        TextView deviceAddressTxt = (TextView) row.findViewById(R.id.deviceAddressTxt);

        deviceNameTxt.setText(data.getDeviceName());
        deviceAddressTxt.setText(data.getDeviceAddress());

        return row;
    }
}

