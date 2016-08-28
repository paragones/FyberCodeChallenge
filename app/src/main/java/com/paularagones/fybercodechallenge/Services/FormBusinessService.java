package com.paularagones.fybercodechallenge.Services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.paularagones.fybercodechallenge.Activities.ResponseActivity;
import com.paularagones.fybercodechallenge.Models.Authorization;
import com.paularagones.fybercodechallenge.Models.SystemConstants;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

/**
 * Created by Mack and Aragones on 27/08/2016.
 */
public class FormBusinessService {

    private static final String LOG_TAG = FormBusinessService.class.getSimpleName();

    public static boolean checkError(EditText editText) {
        boolean emptyField = false;

        if (editText.getText().toString().trim().equals("")) {
            editText.setError(SystemConstants.REQUIRED_FIELD);
            editText.requestFocus();
            emptyField = true;
        }
        return emptyField;
    }

    public static Authorization setupValues(String uId, String apiKey, int appId, String pub0) {
        Authorization authorization = new Authorization();
        authorization.setuId(uId);
        authorization.setApiKey(apiKey);
        authorization.setAppId(appId);
        authorization.setPub0(pub0);
        authorization.setTimestamp(setupTimeStamp());
        authorization.setHashkey(generateSha1(authorization.toString()));
        return authorization;
    }

    private static long setupTimeStamp() {
        Calendar calendar = Calendar.getInstance();
        long calendarMillis = calendar.getTimeInMillis() / 1000;
        Log.d(LOG_TAG, "timeStamp : " + calendarMillis);
        return calendarMillis;
    }

    public static void checkResponse(AppCompatActivity activity) {
        Intent mainIntent = new Intent(activity, ResponseActivity.class);
        activity.startActivity(mainIntent);
        activity.finish();
    }

    public static String generateSha1(String input) {
        MessageDigest mDigest = null;
        try {
            mDigest = MessageDigest.getInstance(SystemConstants.SHA_1);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

}
