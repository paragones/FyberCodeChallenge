package com.paularagones.fybercodechallenge.Models;

/**
 * Created by Mack and Aragones on 27/08/2016.
 */
public class Authorization {

    private int appId;
    private String deviceId;
    private String googleAdId;
    private String googleAdIdLimitedTracking;
    private String ip;
    private String locale;
    private int offerTypes;
    private String osVersion;
    private int page;
    private String pub0;
    private long timestamp;
    private String uId;
    private String hashkey;
    private String apiKey;

    public Authorization() {
        setDeviceId(SystemConstants.DEVICE_ID);
        setGoogleAdId(SystemConstants.GOOGLE_AD_ID);
        setGoogleAdIdLimitedTracking(SystemConstants.GOOGLE_AD_ID_LIMITED_TRACKING);
        setIp(SystemConstants.IP);
        setLocale(SystemConstants.LOCALE);
        setOfferTypes(SystemConstants.OFFER_TYPES);
        setOsVersion(SystemConstants.OS_VERSION);
        setPage(SystemConstants.PAGE);
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGoogleAdId() {
        return googleAdId;
    }

    public void setGoogleAdId(String googleAdId) {
        this.googleAdId = googleAdId;
    }

    public String getGoogleAdIdLimitedTracking() {
        return googleAdIdLimitedTracking;
    }

    public void setGoogleAdIdLimitedTracking(String googleAdIdLimitedTracking) {
        this.googleAdIdLimitedTracking = googleAdIdLimitedTracking;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public int getOfferTypes() {
        return offerTypes;
    }

    public void setOfferTypes(int offerTypes) {
        this.offerTypes = offerTypes;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPub0() {
        return pub0;
    }

    public void setPub0(String pub0) {
        this.pub0 = pub0;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getHashkey() {
        return hashkey;
    }

    public void setHashkey(String hashkey) {
        this.hashkey = hashkey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return  "appid=" + appId +
                "&device_id=" + deviceId +
                "&google_ad_id=" + googleAdId +
                "&google_ad_id_limited_tracking_enabled=" + googleAdIdLimitedTracking +
                "&ip=" + ip +
                "&locale=" + locale +
                "&offer_types=" + offerTypes +
                "&os_version=" + osVersion +
                "&page=" + page +
                "&pub0=" + pub0 +
                "&timestamp=" + timestamp +
                "&uid=" + uId +
                "&" + apiKey;
    }


//    @Override
//    public String toString() {
//        return "appid=2070" +
//                "&device_id=2b6f0cc904d137be2e1730235f5664094b831186" +
//                "&google_ad_id=38400000-8cf0-11bd-b23e-10b96e40000d" +
//                "&google_ad_id_limited_tracking_enabled=false" +
//                "&ip=109.235.143.113" +
//                "&locale=DE" +
//                "&offer_types=112" +
//                "&os_version=4.1.1" +
//                "&page=2" +
//                "&pub0=campaign2" +
//                "&timestamp=1472338623" +
//                "&uid=spiderman&1c915e3b5d42d05136185030892fbb846c278927";
//    }
}
