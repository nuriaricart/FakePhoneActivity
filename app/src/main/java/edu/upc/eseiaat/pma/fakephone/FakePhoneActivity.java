package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    private TextView text_phone;
    private String pn;
    private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        text_phone = (TextView) findViewById(R.id.text_phone);
        pn = "";

    }

    public void click_num (View v){
        Button btn = (Button) v;
        String phone_number = btn.getText().toString();
        pn = pn + phone_number;
        text_phone.setText(pn);
    }

    public void clear (View v){
        Button boto = (Button) v;
        text_phone.setText("");
        pn = "";
        //converteix a botó el View v
        //amb aquest botó creat ja podem fer les diverses funcions
        Log.i ("click", "Has clicat el botó");
    }

    public void call (View v){
        Button boto = (Button) v;
        if (pn == ""){
            Toast.makeText(this, getText(R.string.number), Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, getText(R.string.calling) + " " + pn , Toast.LENGTH_SHORT).show();
    }
}
