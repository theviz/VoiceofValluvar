package com.example.voiceofvalluvar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        if(bottomNavigationView != null) {
            bottomNavigationView.setOnItemSelectedListener(
                    new BottomNavigationView.OnItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.home:
                                    Log.v("V", "Home");
                                    return true;
                                case R.id.books_tab:
                                    Log.v("V", "Books");
                                    return true;
                                case R.id.people_tab:
                                    Log.v("V", "People");
                                    return true;
                                case R.id.videos_tab:
                                    Log.v("V", "Videos");
                                    return true;
                                case R.id.profile_tab:
                                    Log.v("V", "Profile");
                                    return true;
                            }
                            return false;
                        }
                    });
        }
    }
}