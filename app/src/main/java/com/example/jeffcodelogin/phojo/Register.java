package com.example.jeffcodelogin.phojo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jeffcodelogin.R;

public class Register extends BaseActivity implements View.OnClickListener {

    Button bRegister;
    EditText etFirstName, etMiddleName, etLastName, etUsername, etPassword, uTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFirstName = (EditText) findViewById(R.id.etFirstName) ;
        etMiddleName = (EditText) findViewById(R.id.etMiddleName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);
        uTag = (EditText) findViewById(R.id.uTag);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bRegister:
                String firstname = etFirstName.getText().toString();
                String middleinitial = etMiddleName.getText().toString();
                String lastname = etLastName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String userTag = uTag.getText().toString();

                User registeredData = new User(firstname, middleinitial, lastname, username, password, userTag);
                OperationResult result = UserLocalStore.registerUser(this, registeredData);
                if(result.isError()){
                    showError(view, result.getMessage());
                }else{
                    showSuccess(view, result.getMessage());
                }
                break;

        }
    }
}