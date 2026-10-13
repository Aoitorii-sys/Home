
package com.example.homepage;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BUTTON 1: Explore
        View superButton = findViewById(R.id.superButton);

        if (superButton != null) {
            superButton.setOnClickListener(view ->
                    showMessage("Welcome to HASHBOX!")
            );
        }

        // BUTTON 2: Classic Tee - P499
        View btnBuy1 = findViewById(R.id.btn_buy1);

        if (btnBuy1 != null) {
            btnBuy1.setOnClickListener(view ->
                    showMessage("Classic Tee - P499 selected!")
            );
        }

        // BUTTON 3: Urban Fit - P599
        View btnBuy2 = findViewById(R.id.btn_buy2);

        if (btnBuy2 != null) {
            btnBuy2.setOnClickListener(view ->
                    showMessage("Urban Fit - P599 selected!")
            );
        }

        // BUTTON 4: Premium Tee - P699
        View btnBuy3 = findViewById(R.id.btn_buy3);

        if (btnBuy3 != null) {
            btnBuy3.setOnClickListener(view ->
                    showMessage("Premium Tee - P699 selected!")
            );
        }

        // BUTTON 5: Shop Now
        View btnShopNow = findViewById(R.id.btn_shop_now);

        if (btnShopNow != null) {
            btnShopNow.setOnClickListener(view ->
                    showMessage("Welcome to the HASHBOX collection!")
            );
        }
    }

    // Function to display messages
    private void showMessage(String message) {
        Toast.makeText(
                MainActivity.this,
                message,
                Toast.LENGTH_SHORT
        ).show();
    }
}
