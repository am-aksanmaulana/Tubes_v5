package am.aksanmaulana.gmail.com.tubesv5;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import Helper.BottomNavigationViewHelper;
import am.aksanmaulana.gmail.com.tubesv5.fDuitKu.DuitKuFragment;
import am.aksanmaulana.gmail.com.tubesv5.fHome.HomeFragment;
import am.aksanmaulana.gmail.com.tubesv5.fProfile.ProfileFragment;
import am.aksanmaulana.gmail.com.tubesv5.fUserUmkm.UserUmkmFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navHome:
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentManager fmHome = getFragmentManager();
                    fmHome.beginTransaction()
                            .replace(R.id.content, homeFragment)
                            .commit();
                    return true;
                case R.id.navUserUmkm:
                    UserUmkmFragment userUmkmFragment = new UserUmkmFragment();
                    FragmentManager fmUserUmkm = getFragmentManager();
                    fmUserUmkm.beginTransaction()
                            .replace(R.id.content, userUmkmFragment)
                            .commit();
                    return true;
                case R.id.navDuitKu:
                    DuitKuFragment duitKuFragment = new DuitKuFragment();
                    FragmentManager fmDuitKu = getFragmentManager();
                    fmDuitKu.beginTransaction()
                            .replace(R.id.content, duitKuFragment)
                            .commit();
                    return true;
                case R.id.navProfile:
                    ProfileFragment profileFragment = new ProfileFragment();
                    FragmentManager fmProfile = getFragmentManager();
                    fmProfile.beginTransaction()
                            .replace(R.id.content, profileFragment)
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fmHome = getFragmentManager();
        fmHome.beginTransaction()
                .replace(R.id.content, homeFragment)
                .commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.disableShiftMode(navigation);
    }

}
