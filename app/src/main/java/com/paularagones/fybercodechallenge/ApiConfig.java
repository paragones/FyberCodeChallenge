package com.paularagones.fybercodechallenge;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Paul.Aragones on 27/08/2016.
 */
public class ApiConfig {

    final private static String BASE_URL = "http://api.fyber.com/feed/v1/";

    private static ApiServiceCalls apiServiceCalls;

    public static ApiServiceCalls getApiServiceCalls() {

        if (apiServiceCalls == null) {

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiServiceCalls = retrofit.create(ApiServiceCalls.class);
        }

        return apiServiceCalls;

    }

}
