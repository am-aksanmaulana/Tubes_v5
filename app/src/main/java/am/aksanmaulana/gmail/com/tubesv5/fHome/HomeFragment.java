package am.aksanmaulana.gmail.com.tubesv5.fHome;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CustomAdapterHomeMenu;
import Adapter.CustomAdapterUserUmkm;
import Adapter.HomeMenu;
import Adapter.UserUmkm;
import am.aksanmaulana.gmail.com.tubesv5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    CustomAdapterHomeMenu customAdapterHomeMenu = null;
    ListView listHomeMenu = null;
    ArrayList<HomeMenu> homeMenus = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        homeMenus.add(new HomeMenu("Ajuan Pinjaman", "Ajukan pinjaman dana, kemudian tunggu investor untuk memberi pinjaman", R.drawable.ic_note_add_black_48dp));
        homeMenus.add(new HomeMenu("Lihat Pinjaman", "Lihat dana pinjaman dari investor", R.drawable.ic_archive_black_48dp));
        homeMenus.add(new HomeMenu("Bayar Pinjaman", "Bayar pinjaman dana kepada investor", R.drawable.ic_credit_card_black_48dp));
        homeMenus.add(new HomeMenu("Lihat Laporan", "Laporan semua transaksi", R.drawable.ic_description_black_48dp));
        homeMenus.add(new HomeMenu("Belanja", "Belanja antar pelaku UMKM dengan menggunakan DuitKu", R.drawable.ic_shopping_cart_black_24dp));
        customAdapterHomeMenu= new CustomAdapterHomeMenu(getActivity(),R.layout.layout_home_menu,homeMenus);

        listHomeMenu = (ListView) v.findViewById(R.id.lvHomeMenu);
        listHomeMenu.setAdapter(customAdapterHomeMenu);

        listHomeMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                HomeMenu dataContact = homeMenus.get(position);
                Toast t = Toast.makeText(getActivity(), "Pesan: " + dataContact.getNameMenu(),      Toast.LENGTH_LONG);
                t.show();

                //Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                //.setAction("No action", null).show();

                /*
                DetailedContact detailedContact = new DetailedContact();
                Bundle mBundle = new Bundle();
                Log.i("check", "usernama-to-contact-detail : " +dataContact.getUsername());
                mBundle.putString("username", dataContact.getUsername());
                detailedContact.setArguments(mBundle);

                FragmentManager mFragmentManager = getFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager
                        .beginTransaction()
                        .replace(R.id.mainLayout, detailedContact, DetailedContact.class.getSimpleName());
                mFragmentTransaction.addToBackStack(null).commit();
                */
            }
        });

        return v;
    }

}
