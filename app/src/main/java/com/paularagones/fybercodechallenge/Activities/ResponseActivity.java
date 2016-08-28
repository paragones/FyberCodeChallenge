package com.paularagones.fybercodechallenge.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import com.paularagones.fybercodechallenge.Models.FyberResponse;
import com.paularagones.fybercodechallenge.Models.SystemConstants;
import com.paularagones.fybercodechallenge.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.lang.reflect.Array;
import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResponseActivity extends AppCompatActivity {

    @Bind(R.id.responseResult)
    TextView responseResult;

    @Bind(R.id.code)
    TextView code;

    @Bind(R.id.message)
    TextView  message;

    @Bind(R.id.count)
    TextView count;

    @Bind(R.id.pages)
    TextView pages;

    @Bind(R.id.count_label)
    TextView countLabel;

    @Bind(R.id.pages_label)
    TextView pagesLabel;

    @Bind(R.id.information)
    TableLayout information;

    @Bind(R.id.app_name)
    TextView appName;

    @Bind(R.id.app_id)
    TextView appId;

    @Bind(R.id.virtual_currency)
    TextView virtualCurrency;

    @Bind(R.id.virtual_currency_sale_enabled)
    TextView vCSEnabled;

    @Bind(R.id.country)
    TextView country;

    @Bind(R.id.language)
    TextView language;

    @Bind(R.id.support_url)
    TextView supportUrl;

    @Bind(R.id.offers)
    TextView offers;

    @Bind(R.id.go_back_button)
    Button goBackButton;

    private AppCompatActivity appCompatActivity;
    private EventBus eventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        eventBus = EventBus.getDefault();
        eventBus.register(this);
        appCompatActivity = this;
        setTitle(getResources().getString(R.string.response_result));

    }

    @Subscribe(sticky = true)
    public void onEvent(FyberResponse fyberResponse) {
        setContentView(R.layout.activity_response);
        ButterKnife.bind(this);

        code.setText(fyberResponse.getCode());
        message.setText(fyberResponse.getMessage());

        if(fyberResponse.getCode().equals(SystemConstants.NO_CONTENT)) {
            responseResult.setText(getResources().getString(R.string.response_success));

            if (fyberResponse.getCount() == 0) count.setText("0");
            if (fyberResponse.getPages() == 0) pages.setText("0");

            appName.setText(fyberResponse.getInformation().getAppName());
            appId.setText(fyberResponse.getInformation().getAppId());
            virtualCurrency.setText(fyberResponse.getInformation().getVirtualCurrency());
            vCSEnabled.setText(String.valueOf(fyberResponse.getInformation().isVirtualCurrencySaleEnabled()));
            country.setText(fyberResponse.getInformation().getCountry());
            language.setText(fyberResponse.getInformation().getLanguage());
            supportUrl.setText(fyberResponse.getInformation().getSupportUrl());

            if (fyberResponse.getOffers().length == 0) offers.setText(R.string.no_offers);
            else offers.setText(Arrays.toString(fyberResponse.getOffers()));

        } else {
            responseResult.setText(getResources().getString(R.string.response_failure));
            information.setVisibility(View.GONE);
            count.setVisibility(View.GONE);
            pages.setVisibility(View.GONE);
            countLabel.setVisibility(View.GONE);
            pagesLabel.setVisibility(View.GONE);

        }

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(appCompatActivity, FormActivity.class);
                appCompatActivity.startActivity(mainIntent);
                appCompatActivity.finish();
            }
        });

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        eventBus.removeAllStickyEvents();
        eventBus.unregister(this);
    }
}
