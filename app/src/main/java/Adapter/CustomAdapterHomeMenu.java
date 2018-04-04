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

public class CustomAdapterHomeMenu extends ArrayAdapter{
    private Context context;
    private ArrayList<HomeMenu> homeMenus;

    public CustomAdapterHomeMenu(Context context, int textViewResourceId, ArrayList<HomeMenu> data) {
        super(context, textViewResourceId, data);

        this.context = context;
        homeMenus = data;
    }

    private class ViewHolder {
        TextView nameMenu;
        TextView descriptionMenu;
        ImageView iconMenu;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.layout_home_menu, null, true);

            holder = new ViewHolder();
            holder.nameMenu = (TextView) convertView.findViewById(R.id.tvNameMenu);
            holder.descriptionMenu = (TextView) convertView.findViewById(R.id.tvDescriptionMenu);
            holder.iconMenu = (ImageView) convertView.findViewById(R.id.ivIconMenu);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HomeMenu homeMenu = homeMenus.get(position);
        holder.nameMenu.setText("" + homeMenu.getNameMenu());
        holder.descriptionMenu.setText("" + homeMenu.getDescriptionMenu() + "\n");
        holder.iconMenu.setImageResource(homeMenu.getIconMenu());

        return convertView;
    }

    @Override
    public int getCount() {
        //jumlah total baris
        return homeMenus.size();
    }
}
