//package com.paularagones.fybercodechallenge;
//
//import android.util.Log;
//
//import com.google.gson.Gson;
//import com.pointwest.timetrackermobilelog.Activities.ChooseActivity;
//import com.pointwest.timetrackermobilelog.Activities.DemoActivity;
//import com.pointwest.timetrackermobilelog.Activities.MainActivity;
//import com.pointwest.timetrackermobilelog.Fragments.MainFragment;
//import com.pointwest.timetrackermobilelog.Models.ProfileInformation;
//import com.pointwest.timetrackermobilelog.Models.ProjectTask;
//import com.pointwest.timetrackermobilelog.Models.SuccessSubmissionChecker;
//import com.pointwest.timetrackermobilelog.TestModels.ProjectTaskTestList;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.List;
//
//import retrofit.Callback;
//import retrofit.RetrofitError;
//import retrofit.client.Response;
//
///**
// * Created by paul.aragones on 5/8/15.
// */
//public class ProjectTaskWebManager {
//    private static String LOG_TAG = ProjectTaskWebManager.class.getSimpleName();
//    private static TimeTrackerWebServiceMethods timeTrackerWebServiceTestMethods;
//    private static TimeTrackerWebServiceMethods timeTrackerWebServiceMethods;
//    private static SuccessSubmissionChecker successSubmissionChecker;
//    private static Gson gson = new Gson();
//
//    public ProjectTaskWebManager() {
//        //Log.e(LOG_TAG, "ProjectTaskManager declaration");
//        timeTrackerWebServiceTestMethods = TimeTrackerWebService.getWebServiceTestMethods();
//        timeTrackerWebServiceMethods = TimeTrackerWebService.getWebServiceMethods();
//        //Log.e(LOG_TAG, "timeTrackerWebServiceTestMethods : " + timeTrackerWebServiceTestMethods);
//    }
//
//
//
//    public void getTestProjectTaskDataFromWebservice(final DemoActivity.ProjectTasksAcquistionCallback projectTasksAcquistionCallback) {
//
//        Log.e(LOG_TAG, "getTestProjectTaskDataFromWebservice called");
//
//        timeTrackerWebServiceTestMethods.getProjectTaskTestData(new Callback<ProjectTaskTestList>() {
//
//            @Override
//            public void success(com.pointwest.timetrackermobilelog.TestModels.ProjectTaskTestList projectTaskTestList, Response response) {
//                //Log.e(LOG_TAG, "getTestProjectTaskDataFromWebservice success");
//                projectTasksAcquistionCallback.onProjectTasksDownloaded(projectTaskTestList);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "getTestProjectTaskDataFromWebservice " + error.getLocalizedMessage());
//                error.printStackTrace();
//
//            }
//        });
//    }
//
//    /** Todo FOR THE DEMO VERSION  ONLY */
//
//    public void getProjectTaskDataFromWebserviceForToday(ProfileInformation profileInformation, final MainActivity.ProjectTasksAcquistionCallback projectTasksAcquistionCallback) {
//
//        Log.e(LOG_TAG, "getProjectTaskDataFromWebserviceForToday started");
//
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
//        String date = df.format(c.getTime());
//
////        Log.e(LOG_TAG, "username : " + username + ", date : " +date);
//
//        timeTrackerWebServiceMethods.getProjectTaskData(new Callback<ProjectTaskTestList>() {
//            @Override
//            public void success(ProjectTaskTestList projectTaskTestList, Response response) {
//                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice success");
//                projectTasksAcquistionCallback.onDownloadedProjectTaskForToday(projectTaskTestList);
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "getProjectTaskDataFromWebservice failed");
//                Log.e(LOG_TAG, " Error : "+ error.getMessage());
//                Log.e(LOG_TAG, " Error : "+ error.toString());
//                projectTasksAcquistionCallback.onConnectionErrorForToday(error.getLocalizedMessage());
//            }
//        });
//    }
//
//    public void getProjectTaskDataFromWebserviceForYesterday(ProfileInformation profileInformation, final MainActivity.ProjectTasksAcquistionCallback projectTasksAcquistionCallback) {
//
////        Log.e(LOG_TAG, "getProjectTaskDataFromWebserviceForYesterday started");
//
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
//
//        c.add(Calendar.DATE, -1);
//        String yesterday = df.format(c.getTime());
//
//        timeTrackerWebServiceMethods.getProjectTaskData(new Callback<ProjectTaskTestList>() {
//                    @Override
//                    public void success(ProjectTaskTestList projectTaskTestList, Response response) {
////                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice success");
//                        projectTasksAcquistionCallback.onDownloadedProjectTaskForYesterday(projectTaskTestList);
//
//                    }
//
//                    @Override
//                    public void failure(RetrofitError error) {
//                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice failed");
//                        Log.e(LOG_TAG, " Error : "+ error.getMessage());
//                        Log.e(LOG_TAG, " Error : "+ error.toString());
//                        projectTasksAcquistionCallback.onConnectionErrorForYesterday(error.getLocalizedMessage());
//                    }
//                });
//    }
//
//    /** Todo DEMO VERSI0N ENDS HERE */
//
//
//    /** Todo The ones below needs to be uncommented for the LIVE VERSION */
////    public void getProjectTaskDataFromWebserviceForToday(ProfileInformation profileInformation, final MainActivity.ProjectTasksAcquistionCallback projectTasksAcquistionCallback) {
////
//////        Log.e(LOG_TAG, "getProjectTaskDataFromWebserviceForToday started");
////
////        Calendar c = Calendar.getInstance();
////        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
////        String date = df.format(c.getTime());
////
//////        Log.e(LOG_TAG, "username : " + username + ", date : " +date);
////
////        timeTrackerWebServiceMethods.getProjectTaskData(date, profileInformation.getUsername(), profileInformation.getAppToken(), new Callback<ProjectTaskList>() {
////            @Override
////            public void success(ProjectTaskList projectTaskList, Response response) {
//////                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice success");
////                projectTasksAcquistionCallback.onDownloadedProjectTaskForToday(projectTaskList);
////
////            }
////
////            @Override
////            public void failure(RetrofitError error) {
////                Log.e(LOG_TAG, "getProjectTaskDataFromWebservice failed");
////                Log.e(LOG_TAG, " Error : ", error);
////                projectTasksAcquistionCallback.onConnectionErrorForToday(error.getLocalizedMessage());
////            }
////        });
////    }
////
////    public void getProjectTaskDataFromWebserviceForYesterday(ProfileInformation profileInformation, final MainActivity.ProjectTasksAcquistionCallback projectTasksAcquistionCallback) {
////
//////        Log.e(LOG_TAG, "getProjectTaskDataFromWebserviceForYesterday started");
////
////        Calendar c = Calendar.getInstance();
////        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
////
////        c.add(Calendar.DATE, -1);
////        String yesterday = df.format(c.getTime());
////
////        timeTrackerWebServiceMethods.getProjectTaskData(yesterday, profileInformation.getUsername(), profileInformation.getAppToken(),
////                new Callback<ProjectTaskList>() {
////                    @Override
////                    public void success(ProjectTaskList projectTaskList, Response response) {
//////                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice success");
////                        projectTasksAcquistionCallback.onDownloadedProjectTaskForYesterday(projectTaskList);
////
////                    }
////
////                    @Override
////                    public void failure(RetrofitError error) {
////                        Log.e(LOG_TAG, "getProjectTaskDataFromWebservice failed");
////                        Log.e(LOG_TAG, " Error : ", error);
////                        projectTasksAcquistionCallback.onConnectionErrorForYesterday(error.getLocalizedMessage());
////                    }
////                });
////    }
//
//    public void submitProjectTasks(List<ProjectTask> projectTasks, final MainActivity.SuccessCallback successCallback) {
//        Log.e(LOG_TAG, "submitProjectTasks started");
//
//        Log.e(LOG_TAG, "projectTasks : " + projectTasks);
//
//
//        timeTrackerWebServiceMethods.insertLoggedHours(projectTasks, new Callback<SuccessSubmissionChecker>() {
//            @Override
//            public void success(SuccessSubmissionChecker successSubmissionChecker, Response response) {
//                Log.e(LOG_TAG, "submitProjectTasks success");
//                successCallback.onSaveSuccess(successSubmissionChecker);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "submitProjectTasks failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                successCallback.onSaveFailure(error.getLocalizedMessage());
//
//            }
//        });
//
//    }
//
//    public void submitProjectTasksOffline(List<ProjectTask> projectTasks) {
//        Log.e(LOG_TAG, "submitProjectTasks started");
//
//        Log.e(LOG_TAG, "projectTasks : " + projectTasks);
//
//
//        timeTrackerWebServiceMethods.insertLoggedHours(projectTasks, new Callback<SuccessSubmissionChecker>() {
//            @Override
//            public void success(SuccessSubmissionChecker successSubmissionChecker, Response response) {
//                Log.e(LOG_TAG, "submitProjectTasks success");
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "submitProjectTasks failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                Log.e(LOG_TAG, " Error : " + error.getLocalizedMessage());
//
//            }
//        });
//
//    }
//
////    public void attemptLoginFromWebserviceToLogin(ProfileInformation profileInformation, final LoginActivity.LoginChecker loginChecker) {
//    public void attemptLoginFromWebserviceToLogin(ProfileInformation profileInformation, final ChooseActivity.LoginChecker loginChecker) {
//
////        Log.e(LOG_TAG, "attemptLoginFromWebserviceToLogin started");
//
//        timeTrackerWebServiceMethods.attemptLoginToTimeTrackerServer(profileInformation, new Callback<ProfileInformation>() {
//
//            @Override
//            public void success(ProfileInformation profileInformation, Response response) {
////                Log.e(LOG_TAG, "attemptLoginFromWebservice success");
//                loginChecker.onLoginSuccess(profileInformation);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "attemptLoginToLogin failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                loginChecker.onLoginFailure(error.getLocalizedMessage());
////              error.printStackTrace();
//            }
//        });
//    }
//
//    public void attemptLoginFromMainActivity(ProfileInformation profileInformation, final MainActivity.LoginChecker loginChecker) {
//        Log.e(LOG_TAG, "attempt Login From Main Activity started");
//
//        timeTrackerWebServiceMethods.attemptLoginToTimeTrackerServer(profileInformation, new Callback<ProfileInformation>() {
//
//            @Override
//            public void success(ProfileInformation profileInformation, Response response) {
//                Log.e(LOG_TAG, "attempt Login From Main Activity success");
//                loginChecker.onLoginSuccess(profileInformation);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "attempt Login From Main Activity failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                loginChecker.onLoginFailure(error.getLocalizedMessage());
////              error.printStackTrace();
//            }
//        });
//    }
//
//    public void attemptLoginAndSubmitFromMainActivity(ProfileInformation profileInformation, final MainActivity.LoginAndSaveChecker loginAndSaveChecker) {
//
//        Log.e(LOG_TAG, "attempt Login And Submit From Main Activity started");
//
//        timeTrackerWebServiceMethods.attemptLoginToTimeTrackerServer(profileInformation, new Callback<ProfileInformation>() {
//
//            @Override
//            public void success(ProfileInformation profileInformation, Response response) {
//                Log.e(LOG_TAG, "attemptLoginAndSubmitFromMainActivity success");
//                loginAndSaveChecker.onLoginAndSaveSuccess(profileInformation);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "attemptLoginAndSubmitFromMainActivity failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                loginAndSaveChecker.onLoginAndSaveFailure(error.getLocalizedMessage());
////              error.printStackTrace();
//            }
//        });
//    }
//
//    public void attemptLoginFromMainFragment(ProfileInformation profileInformation, final ProjectTask projectTask, final MainFragment.LoginChecker loginChecker) {
//        Log.e(LOG_TAG, "attemptLoginFromWebserviceToLogin started");
//
//        timeTrackerWebServiceMethods.attemptLoginToTimeTrackerServer(profileInformation, new Callback<ProfileInformation>() {
//
//            @Override
//            public void success(ProfileInformation profileInformation, Response response) {
//                Log.e(LOG_TAG, "attemptLoginFromWebservice success");
//                loginChecker.onLoginSuccess(profileInformation, projectTask);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "attemptLoginFromWebservice failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                loginChecker.onLoginFailure(error.getLocalizedMessage());
////              error.printStackTrace();
//            }
//        });
//    }
//
//    public void submitProjectTaskFromDatabase(List<ProjectTask> projectTasks, final MainActivity.SuccessCallbackFromDatabase successCallback) {
//        Log.e(LOG_TAG, "** submitProjectTask started **");
//
//
//        timeTrackerWebServiceMethods.insertLoggedHours(projectTasks, new Callback<SuccessSubmissionChecker>() {
//            @Override
//            public void success(SuccessSubmissionChecker successSubmissionCheckerFromWebService, Response response) {
//                Log.e(LOG_TAG, "** submitProjectTaskFromDatabase success **");
//                successCallback.onDatabaseSavedSuccess(successSubmissionCheckerFromWebService);
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "** submitProjectTaskFromDatabase failure **");
//                Log.e(LOG_TAG, " Error : ", error);
//                successCallback.onDatabaseSavedFailure(error.getLocalizedMessage());
//            }
//        });
//    }
//
//    public void deleteLoggedHour(final ProjectTask projectTask, final MainFragment.DeleteCheckerCallback deleteCallback) {
//        Log.e(LOG_TAG, "** deleteLoggedHour started **");
//
//         timeTrackerWebServiceMethods.deleteLoggedHour(projectTask, new Callback<SuccessSubmissionChecker>() {
//             @Override
//             public void success(SuccessSubmissionChecker submissionChecker, Response response) {
//                 Log.e(LOG_TAG, " ** deleteLoggedHour success **");
//                 deleteCallback.onDeleteSuccess(projectTask, submissionChecker);
//             }
//
//             @Override
//             public void failure(RetrofitError error) {
//                 Log.e(LOG_TAG, " ** deleteLoggedHour failure **");
//                 Log.e(LOG_TAG, " Error : ", error);
//                 deleteCallback.onDeleteFailure(projectTask, error.getLocalizedMessage());
//             }
//         });
//    }
//
//    public void logout(ProfileInformation profileInformation) {
//        Log.e(LOG_TAG, "logout started");
//        Log.e(LOG_TAG, "app id : " + profileInformation.getAppId());
//        Log.e(LOG_TAG, "username : " + profileInformation.getUsername());
//
//        timeTrackerWebServiceMethods.logout(profileInformation, new Callback<ProfileInformation>() {
//            @Override
//            public void success(ProfileInformation profileInformation, Response response) {
//                Log.e(LOG_TAG, "logout success");
//                Log.e(LOG_TAG, " success : " + profileInformation.isSuccessful());
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e(LOG_TAG, "logout failure");
//                Log.e(LOG_TAG, " Error : ", error);
//                Log.e(LOG_TAG, " Error : " + error.getLocalizedMessage());
//            }
//        });
//
//    }
//
//
//
//}
