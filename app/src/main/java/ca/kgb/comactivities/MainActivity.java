package ca.kgb.comactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String loginCredential = "Karles";
    private String passwordCredential = "4444";
    private EditText edTxtLoggin;
    private EditText edTxtPass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkCredential(View view) {
        edTxtLoggin = (EditText) findViewById(R.id.loggin);
        edTxtPass = (EditText) findViewById(R.id.password);
        String logIn = edTxtLoggin.getText().toString();
        String password = edTxtPass.getText().toString();
        Log.d(TAG, "checkCredential: " + logIn + " " + password);
        if(logIn == loginCredential && password == passwordCredential){
            edTxtLoggin.setText("Congradulation you have logged in");
        }else{
            edTxtLoggin.setText("Wrong username or password entered!");
        }
        Intent intent = new Intent(this, DetailsActivity.class);

        intent.putExtra("username", logIn);
        intent.putExtra("password", password);

        startActivity(intent);
    }
}
