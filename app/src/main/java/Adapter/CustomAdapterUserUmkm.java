package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import am.aksanmaulana.gmail.com.tubesv5.R;

/**
 * Created by aksanmaulana on 4/4/2018.
 */

public class CustomAdapterUserUmkm extends ArrayAdapter{

    private Context context;
    private ArrayList<UserUmkm> userUmkms;

    public CustomAdapterUserUmkm(Context context, int textViewResourceId, ArrayList<UserUmkm> data) {
        super(context, textViewResourceId, data);

        this.context = context;
        userUmkms = data;
    }

    private class ViewHolder {
        TextView nameUser;
        TextView businessTypeUser;
        TextView businessUser;
        ImageView ivImageUser;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.layout_user_umkm_list, null, true);

            holder = new ViewHolder();
            holder.nameUser = (TextView) convertView.findViewById(R.id.tvNameUser);
            holder.businessTypeUser = (TextView) convertView.findViewById(R.id.tvBusinessType);
            holder.businessUser = (TextView) convertView.findViewById(R.id.tvBusiness);
            holder.ivImageUser = (ImageView) convertView.findViewById(R.id.ivImageUser);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        UserUmkm userUmkm = userUmkms.get(position);
        holder.nameUser.setText("" + userUmkm.getNameUser());
        holder.businessTypeUser.setText("" + userUmkm.getBusinessTypeUser());
        holder.businessUser.setText("" + userUmkm.getBusinessUser() + "\n");
        holder.ivImageUser.setImageResource(userUmkm.getImageUser());

        return convertView;
    }

    @Override
    public int getCount() {
        //jumlah total baris
        return userUmkms.size();
    }
}

