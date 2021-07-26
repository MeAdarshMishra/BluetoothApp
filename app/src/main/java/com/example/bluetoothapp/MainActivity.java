package com.example.bluetoothapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.toggleButton);
        bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                bluetoothAdapter.enable();
            }
            else {
                bluetoothAdapter.disable();
            }
        });
    }
}