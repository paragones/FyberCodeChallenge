//package com.paularagones.fybercodechallenge;
//
//import com.pointwest.timetrackermobilelog.Models.ProfileInformation;
//import com.pointwest.timetrackermobilelog.Models.ProjectTask;
//import com.pointwest.timetrackermobilelog.Models.SuccessSubmissionChecker;
//import com.pointwest.timetrackermobilelog.TestModels.ProjectTaskTestList;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import java.util.List;
//
//import retrofit.Callback;
//import retrofit.http.Body;
//import retrofit.http.GET;
//import retrofit.http.Headers;
//import retrofit.http.POST;
//import retrofit.http.PUT;
//import retrofit.http.RestMethod;
//
///**
// * Created by paul.aragones on 4/30/15.
// */
//
//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.RUNTIME)
//@RestMethod(value = "DELETE", hasBody = true)
//@interface MY_DELETE {
//    String value();
//}
//
//public interface TimeTrackerWebServiceMethods {
//
//    @Headers("Content-Type: application/json")
//    @POST("/Login")
//    void attemptLoginToTimeTrackerServer(@Body ProfileInformation profileInformation, Callback<ProfileInformation> projectTaskTestListCallback);
//
//    @GET("/1jIqTL3qNCN1ErPIEfro6opZ6WzvWZLMj7l_UDBHTIEk/od6/public/values?alt=json")
//    void getProjectTaskTestData(Callback<ProjectTaskTestList> projectTaskTestListCallback);
//
//    /** Todo Testing for the DEMO Version */
//    @GET("/1jIqTL3qNCN1ErPIEfro6opZ6WzvWZLMj7l_UDBHTIEk/od6/public/values?alt=json")
//    void getProjectTaskData(Callback<ProjectTaskTestList> projectTaskTestListCallback);
//
//    /** TOdo this has to be uncommented for the Live Version **/
////    @GET("/GetEmployeeDailyLogs/{DATE}/{USERNAME}/{APPID}")
////    void getProjectTaskData(@Path("DATE") String date,
////                            @Path("USERNAME") String username,
////                            @Path("APPID") String appId,
////                            Callback<ProjectTaskList> projectTaskListCallback);
//
//    @Headers("Content-Type: application/json")
//    @PUT("/SaveLoggedHours")
//    void insertLoggedHours(@Body List<ProjectTask> projectTasks, Callback<SuccessSubmissionChecker> successSubmissionCheckerCallback);
//
//    @Headers("Content-Type: application/json")
//    @PUT("/SaveLoggedHours")
//    void insertLoggedHour(@Body ProjectTask projectTask, Callback<SuccessSubmissionChecker> callback);
//
//    @Headers("Content-Type: application/json")
//    @MY_DELETE("/DeleteLoggedHours")
//    void deleteLoggedHour(@Body ProjectTask projectTask, Callback<SuccessSubmissionChecker> successSubmissionCheckerCallback);
//
//    @Headers("Content-Type: application/json")
//    @POST("/LogOut")
//    void logout(@Body ProfileInformation profileInformation, Callback<ProfileInformation> callback);
//
//
////    @GET("/GetEmployeeDailyLogs/checks/allan.aloran/username/password/4-29-2015")
////    void getProjectTaskData(Callback<ProjectTaskList> projectTaskListCallback);
//}
