package com.paularagones.fybercodechallenge;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.paularagones.fybercodechallenge.Models.Authorization;
import com.paularagones.fybercodechallenge.Models.FyberResponse;
import com.paularagones.fybercodechallenge.Models.SystemConstants;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Paul.Aragones on 5/13/2016.
 */
public class FyberWebService {

    private static final String LOG_TAG = FyberWebService.class.getSimpleName();

    private final ApiServiceCalls apiServiceCalls;

    public FyberWebService() {
        apiServiceCalls = ApiConfig.getApiServiceCalls();
    }

    public void requestToFyberServer(Authorization authorization) {
            final Call<FyberResponse> fyberResponseCall = apiServiceCalls.getResponse(
                    String.valueOf(authorization.getAppId()),
                    authorization.getDeviceId(),
                    authorization.getGoogleAdId(),
                    authorization.getGoogleAdIdLimitedTracking(),
                    authorization.getIp(),
                    authorization.getLocale(),
                    String.valueOf(authorization.getOfferTypes()),
                    authorization.getOsVersion(),
                    String.valueOf(authorization.getPage()),
                    authorization.getPub0(),
                    String.valueOf(authorization.getTimestamp()),
                    authorization.getuId(),
                    authorization.getHashkey());

            fyberResponseCall.enqueue(new Callback<FyberResponse>() {
                @Override
                public void onResponse(Call<FyberResponse> call, Response<FyberResponse> response) {
                    FyberResponse fyberResponse = response.body();
                    Log.e(LOG_TAG, "onResponse success ");
                    Log.e(LOG_TAG, "fyberResponse : " + fyberResponse);

                    EventBus eventBus = EventBus.getDefault();

                    if (fyberResponse == null) {
                        fyberResponse = new FyberResponse();

                        try {

//                            Log.e(LOG_TAG, "response : " + response.errorBody().string());

                            JSONObject responseObject = new JSONObject(response.errorBody().string());

                            fyberResponse.setCode(responseObject.getString(SystemConstants.CODE));
                            fyberResponse.setMessage(responseObject.getString(SystemConstants.MESSAGE));

                        } catch (IOException e) {
                            Log.e(LOG_TAG, "response : ",e);
                        } catch (JSONException e) {
                            Log.e(LOG_TAG, "response Object : ",e);
                        }
//                        fyberResponse.setCode("ERROR");
//                        fyberResponse.setMessage("An invalid parameter was given in the request");
                    }
                        eventBus.postSticky(fyberResponse);
                }

                @Override
                public void onFailure(Call<FyberResponse> call, Throwable t) {
                    Log.e("onFailure", t.getMessage());
                    Log.e("onFailure", t.toString());
                }
            });

    }

}
