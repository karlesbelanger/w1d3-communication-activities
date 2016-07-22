package ca.kgb.comactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView mTextViewUsername;
    private TextView mTextViewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mTextViewUsername = (TextView) findViewById(R.id.userName);
        mTextViewPassword = (TextView) findViewById(R.id.pswd);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        mTextViewUsername.setText(username);
        mTextViewPassword.setText(password);
    }

}
