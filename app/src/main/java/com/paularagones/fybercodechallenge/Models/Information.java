package com.paularagones.fybercodechallenge.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mack and Aragones on 27/08/2016.
 */
public class Information {

    @SerializedName("app_name")
    @Expose
    private String appName;

    @SerializedName("appid")
    @Expose
    private String appId;

    @SerializedName("virtual_currency")
    @Expose
    private String virtualCurrency;

    @SerializedName("virtual_currency_sale_enabled")
    @Expose
    private boolean virtualCurrencySaleEnabled;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("support_url")
    @Expose
    private String supportUrl;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVirtualCurrency() {
        return virtualCurrency;
    }

    public void setVirtualCurrency(String virtualCurrency) {
        this.virtualCurrency = virtualCurrency;
    }

    public boolean isVirtualCurrencySaleEnabled() {
        return virtualCurrencySaleEnabled;
    }

    public void setVirtualCurrencySaleEnabled(boolean virtualCurrencySaleEnabled) {
        this.virtualCurrencySaleEnabled = virtualCurrencySaleEnabled;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    @Override
    public String toString() {
        return "Information{" +
                "appName='" + appName + '\'' +
                ", appId='" + appId + '\'' +
                ", virtualCurrency='" + virtualCurrency + '\'' +
                ", virtualCurrencySaleEnabled=" + virtualCurrencySaleEnabled +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", supportUrl='" + supportUrl + '\'' +
                '}';
    }
}
