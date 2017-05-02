package com.example.android.justjava;
/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    int price = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button tambahBtn = (Button) findViewById(R.id.btn_plus);
        Button kurangBtn = (Button) findViewById(R.id.btn_minus);
        Button orderBtn  = (Button) findViewById(R.id.order_btn);

        tambahBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                quantity++;
                display();
            }
        });

        kurangBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                quantity--;
                display();
            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                displayPrice(price * quantity);
            }
        });
    }

    public void display(){
        TextView tvQty = (TextView) findViewById(R.id.quantity_text_view);
        tvQty.setText(Integer.toString(quantity));
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.tv_price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}