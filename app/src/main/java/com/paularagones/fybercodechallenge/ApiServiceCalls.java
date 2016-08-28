package com.paularagones.fybercodechallenge;


import com.paularagones.fybercodechallenge.Models.Authorization;
import com.paularagones.fybercodechallenge.Models.FyberResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Paul.Aragones on 5/13/2016.
 */
public interface ApiServiceCalls {

    @GET("offers.json")
    Call<FyberResponse> getResponse(@Query("appid") String appId,
                                    @Query("device_id") String deviceId,
                                    @Query("google_ad_id") String googleAdId,
                                    @Query("google_ad_id_limited_tracking_enabled") String googleAdIdLimited,
                                    @Query("ip") String ip,
                                    @Query("locale") String locale,
                                    @Query("offer_types") String offerTypes,
                                    @Query("os_version") String osVersion,
                                    @Query("page") String page,
                                    @Query("pub0") String pub0,
                                    @Query("timestamp") String timestamp,
                                    @Query("uid") String uid,
                                    @Query("hashkey") String hashkey
                                    );

//    @GET("offers.json?appid=2070&device_id=2b6f0cc904d137be2e1730235f5664094b831186&google_ad_id=38400000-8cf0-11bd-b23e-10b96e40000d&google_ad_id_limited_tracking_enabled=false&ip=109.235.143.113&locale=DE&offer_types=112&os_version=4.1.1&page=2&pub0=campaign2&timestamp=1472337398&uid=spiderman&hashkey=e50d30f9163d516cefb96fe4fa6ac2351e60ee86")
//    Call<FyberResponse> getResponse();



}
