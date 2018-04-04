package am.aksanmaulana.gmail.com.tubesv5.fUserUmkm;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CustomAdapterUserUmkm;
import Adapter.UserUmkm;
import am.aksanmaulana.gmail.com.tubesv5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserUmkmFragment extends Fragment {

    CustomAdapterUserUmkm customAdapterUserUmkm = null;
    ListView lvUserUmkm = null;
    ArrayList<UserUmkm> userUmkms = new ArrayList<>();

    public UserUmkmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_user_umkm, container, false);

        userUmkms.add(new UserUmkm("Aksan Maulana", "Laki-laki", "Purwakarta", "0857 xxxx xxxx", "aksan@gmail.com", R.drawable.ic_person_black_24dp, "Perdagangan", "Keripik Manis"));
        userUmkms.add(new UserUmkm("Maulana Aksan", "Laki-laki", "Purwakarta", "0857 xxxx xxxx", "aksan@gmail.com", R.drawable.ic_person_black_24dp, "Perdagangan", "Keripik Manis"));
        userUmkms.add(new UserUmkm("Muhammad Rizky", "Laki-laki", "Purwakarta", "0857 xxxx xxxx", "aksan@gmail.com", R.drawable.ic_person_black_24dp, "Perdagangan", "Keripik Manis"));
        customAdapterUserUmkm= new CustomAdapterUserUmkm(getActivity(),R.layout.layout_user_umkm_list,userUmkms);

        lvUserUmkm = (ListView) v.findViewById(R.id.lvUserUmkm);
        lvUserUmkm.setAdapter(customAdapterUserUmkm);

        lvUserUmkm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                UserUmkm dataContact = userUmkms.get(position);
                Toast t = Toast.makeText(getActivity(), "Pesan: " + dataContact.getNameUser(),      Toast.LENGTH_LONG);
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here
        inflater.inflate(R.menu.sort_user, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mAllType:

                // Do Activity menu item stuff here
                return true;

            case R.id.mPertanian:

                // Not implemented here
                return true;

            case R.id.mJasa:

                // Not implemented here
                return true;

            case R.id.mPerdagangan:

                // Not implemented here
                return true;

            case R.id.mManufaktur:

                // Not implemented here
                return true;
            default:
                break;
        }

        return false;
    }

}
