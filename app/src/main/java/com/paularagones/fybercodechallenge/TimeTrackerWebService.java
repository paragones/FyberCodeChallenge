//package com.paularagones.fybercodechallenge;
//
//import android.util.Log;
//
//import com.pointwest.timetrackermobilelog.Utilities.RetrofitErrorHandler;
//import com.squareup.okhttp.OkHttpClient;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
//import retrofit.RestAdapter;
//import retrofit.android.AndroidLog;
//import retrofit.client.OkClient;
//
///**
// * Created by paul.aragones on 4/30/15.
// */
//public class TimeTrackerWebService {
//
//
//    final private static String TEST_BASE_URL = "https://spreadsheets.google.com/feeds/list";
//
//    /** todo use the base url spreadsheets.google.com for demo version only */
//    final private static String BASE_URL = "https://spreadsheets.google.com/feeds/list";
//
//    /** todo use this url for the live version */
////    final private static String BASE_URL = "http://172.17.24.26:758/Service1.svc";
//
//
//    private static final String LOG_TAG = TimeTrackerWebService.class.getSimpleName();
////    final private static String BASE_URL = "https://proxy.pointwest.com.ph/titoapi";
//
//    public static TimeTrackerWebServiceMethods webServiceTestMethods;
//    public static TimeTrackerWebServiceMethods webServiceMethods;
//    public static ExecutorService mExecutorService;
//
//
//    private OkHttpClient getClient() {
//        OkHttpClient client = new OkHttpClient();
//        client.setConnectTimeout(5, TimeUnit.MINUTES);
//        client.setReadTimeout(5, TimeUnit.MINUTES);
//        return client;
//    }
//
//    public static TimeTrackerWebServiceMethods getWebServiceTestMethods() {
//
////        Log.e("TimeTrackerWsMethods", "getWebServiceTestMethods");
//
//        if (webServiceTestMethods == null){
//            RestAdapter restAdapter = new RestAdapter.Builder()
//                    .setEndpoint(TEST_BASE_URL)
//                    .setLogLevel(RestAdapter.LogLevel.FULL)
//                    .setLog(new AndroidLog("LogLevel_FULL"))
//                    .setErrorHandler(new RetrofitErrorHandler())
//                    .build();
//
//            webServiceTestMethods = restAdapter.create(TimeTrackerWebServiceMethods.class);
//        }
//
////        Log.e("TimeTrackerWsMethods", "webServiceMethods : " + webServiceMethods);
//
//        return webServiceTestMethods;
//    }
//
//    public static TimeTrackerWebServiceMethods getWebServiceMethods() {
//
////        Log.e("TimeTrackerWsMethods", "getWebServiceMethods called");
//        final OkHttpClient okHttpClient = new OkHttpClient();
//        okHttpClient.setReadTimeout(1, TimeUnit.MINUTES);
//        okHttpClient.setConnectTimeout(1, TimeUnit.MINUTES);
//
//
//        if (webServiceMethods == null){
////            Log.e(LOG_TAG, "webServiceMethods == null ");
//
//            mExecutorService = Executors.newCachedThreadPool();
//
//            RestAdapter restAdapter = new RestAdapter.Builder()
//                    .setEndpoint(BASE_URL)
//                    .setClient(new OkClient(okHttpClient))
//                    .setLogLevel(RestAdapter.LogLevel.FULL)
////                    .setExecutors(mExecutorService, new MainThreadExecutor())
//                    .setLog(new RestAdapter.Log() {
//                        @Override
//                        public void log(String msg) {
//                            Log.e("RestAdapter", msg);
//                        }
//                    })
//                    .build();
//
//            webServiceMethods = restAdapter.create(TimeTrackerWebServiceMethods.class);
//        } else {
////            Log.e(LOG_TAG, "webServiceMethods != null ");
//        }
//
////        Log.e("TimeTrackerWsMethods", "webServiceMethods : " + webServiceMethods);
////        Log.e("TimeTrackerWsMethods", "BASE_URL : " + BASE_URL );
//
//        return webServiceMethods;
//    }
//
//    public static void stopAll() {
////        List<Runnable> pendingAndOngoing = mExecutorService.shutdownNow();
//
//    }
//}
