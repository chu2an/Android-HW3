package app.iecs.fcu.android_hw3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ShowMePlease extends AppCompatActivity {

    EditText myName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_please);

        myName = (EditText)findViewById(R.id.smp_et_name);
        Button back = (Button)findViewById(R.id.smp_bt_back);
        back.setOnClickListener(IWillBeBack);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String gettheName = myName.getText().toString();
        Toast.makeText(this, "Hello "+gettheName, Toast.LENGTH_LONG).show();
    }

    private OnClickListener IWillBeBack = new OnClickListener() {
        @Override
        public void onClick(View v) {
            String theName = myName.getText().toString();
            if (theName.length() <= 0){
                Toast.makeText(ShowMePlease.this, "You must enter your name in the EditText.", Toast.LENGTH_SHORT).show();
                theName = myName.getText().toString();
            }
            else{
                finish();
            }
        }
    };


}
