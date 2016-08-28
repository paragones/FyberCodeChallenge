package com.paularagones.fybercodechallenge.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.paularagones.fybercodechallenge.FyberWebService;
import com.paularagones.fybercodechallenge.Models.Authorization;
import com.paularagones.fybercodechallenge.R;
import com.paularagones.fybercodechallenge.Services.FormBusinessService;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.uid)
    EditText uid;

    @Bind(R.id.api_key)
    EditText apiKey;

    @Bind(R.id.app_id)
    EditText appId;

    @Bind(R.id.pub_0)
    EditText pub0;

    @Bind(R.id.submit_button)
    Button submitButton;

    Authorization authorization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        setContentView(R.layout.activity_form);
        setTitle(getResources().getString(R.string.app_name));
        ButterKnife.bind(this);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (!FormBusinessService.checkError(uid) && !FormBusinessService.checkError(apiKey) && !FormBusinessService.checkError(appId) && !FormBusinessService.checkError(pub0)) {
            authorization = FormBusinessService.setupValues(uid.getText().toString(), apiKey.getText().toString(), Integer.parseInt(appId.getText().toString()), pub0.getText().toString());
            FyberWebService fyberWebService = new FyberWebService();
            fyberWebService.requestToFyberServer(authorization);
            FormBusinessService.checkResponse(this);
        }
    }




}
