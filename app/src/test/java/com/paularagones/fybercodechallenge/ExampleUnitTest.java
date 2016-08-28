package com.paularagones.fybercodechallenge;

import com.paularagones.fybercodechallenge.Models.Authorization;
import com.paularagones.fybercodechallenge.Models.FyberResponse;
import com.paularagones.fybercodechallenge.Models.SystemConstants;
import com.paularagones.fybercodechallenge.Services.FormBusinessService;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    private Authorization authorization;
    private ApiServiceCalls apiServiceCalls;

    @Before
    public void setAuthorization() {
        System.out.println("setAuthorization");
        authorization = new Authorization();
        authorization.setuId(SystemConstants.SAMPLE_UID);
        authorization.setApiKey(SystemConstants.SAMPLE_API_KEY);
        authorization.setAppId(SystemConstants.SAMPLE_APP_ID);
        authorization.setPub0(SystemConstants.SAMPLE_PUB_0);
        authorization.setTimestamp(SystemConstants.SAMPLE_TIMESTAMP);
        authorization.setHashkey(SystemConstants.SAMPLE_HASHKEY);

        apiServiceCalls = ApiConfig.getApiServiceCalls();

    }

    @Test
    public void testCorrectHashKey() throws Exception {
        String hashkey = FormBusinessService.generateSha1(authorization.toString());

        assertEquals(SystemConstants.SAMPLE_HASHKEY, hashkey);
    }

    @Test
    public void testCorrectResponse() throws Exception {
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

        try {
            Response<FyberResponse> response = fyberResponseCall.execute();

            if (response.isSuccessful()) {
                FyberResponse fyberResponse = response.body();

                System.out.println("onResponse");

                assertEquals("NO_CONTENT", fyberResponse.getCode());
                assertEquals("Successful request, but no offers are currently available for this user.", fyberResponse.getMessage());
                assertEquals(0, fyberResponse.getCount());
                assertEquals(0, fyberResponse.getPages());
                assertEquals("VC Backend Test", fyberResponse.getInformation().getAppName());
                assertEquals("2070", fyberResponse.getInformation().getAppId());
                assertEquals("VCS Coins", fyberResponse.getInformation().getVirtualCurrency());
                assertEquals("DE", fyberResponse.getInformation().getCountry());
                assertEquals("DE", fyberResponse.getInformation().getLanguage());
                assertEquals("http://offer.fyber.com/mobile/support?appid=2070&client=api&uid=spiderman", fyberResponse.getInformation().getSupportUrl());
                assertEquals("false", String.valueOf(fyberResponse.getInformation().isVirtualCurrencySaleEnabled()));

            }

        } catch (IOException e) {
            fail("Should not throw " + e);
        }


    }
    @Test
    public void testFunctionalCorrectResponse() throws Exception {
        System.out.println("testFunctionalCorrectResponse");

        String hashkey = FormBusinessService.generateSha1(authorization.toString());
        assertEquals(SystemConstants.SAMPLE_HASHKEY, hashkey);
        authorization.setHashkey(hashkey);

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

        try {
            Response<FyberResponse> response = fyberResponseCall.execute();

            if (response.isSuccessful()) {
                FyberResponse fyberResponse = response.body();
                assertEquals("NO_CONTENT", fyberResponse.getCode());
                assertEquals("Successful request, but no offers are currently available for this user.", fyberResponse.getMessage());
                assertEquals(0, fyberResponse.getCount());
                assertEquals(0, fyberResponse.getPages());
                assertEquals("VC Backend Test", fyberResponse.getInformation().getAppName());
                assertEquals("2070", fyberResponse.getInformation().getAppId());
                assertEquals("VCS Coins", fyberResponse.getInformation().getVirtualCurrency());
                assertEquals("DE", fyberResponse.getInformation().getCountry());
                assertEquals("DE", fyberResponse.getInformation().getLanguage());
                assertEquals("http://offer.fyber.com/mobile/support?appid=2070&client=api&uid=spiderman", fyberResponse.getInformation().getSupportUrl());
                assertEquals("false", String.valueOf(fyberResponse.getInformation().isVirtualCurrencySaleEnabled()));

            }

        } catch (IOException e) {
            fail("Should not throw " + e);
        }


    }
}