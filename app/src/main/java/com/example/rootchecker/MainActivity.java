package com.example.rootchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.rootchecker.helper.RootUtil;
/**
 * @author yogitad
 * @since 12-08-2021
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call method to check device is rooted
        if (RootUtil.getInstance().isDeviceRooted()) {
            Toast.makeText(this, getString(R.string.str_device_rooted_msg), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.str_device_not_rooted_msg), Toast.LENGTH_SHORT).show();
        }
    }
}