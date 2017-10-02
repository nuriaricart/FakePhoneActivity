package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FakePhoneActivity extends AppCompatActivity {

    private TextView text_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        text_phone = (TextView) findViewById(R.id.text_phone);


    }

    public void num1 (View v){
        Button btn_1 = (Button) v;
        text_phone.setText("1");
    }

    public void clicat (View v){
        Button boto = (Button) v; //converteix a botó el View v
        //amb aquest botó creat ja podem fer les diverses funcions
        Log.i ("click", "Has clicat el botó");
    }
}
