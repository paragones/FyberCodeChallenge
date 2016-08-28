package com.paularagones.fybercodechallenge.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created by Mack and Aragones on 27/08/2016.
 */
public class FyberResponse {

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("count")
    @Expose
    private int count;

    @SerializedName("pages")
    @Expose
    private int pages;

    @SerializedName("information")
    @Expose
    private Information information;

    @SerializedName("offers")
    @Expose
    private String[] offers;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public String[] getOffers() {
        return offers;
    }

    public void setOffers(String[] offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "FyberResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", count=" + count +
                ", pages=" + pages +
                ", information=" + information +
                ", offers=" + Arrays.toString(offers) +
                '}';
    }
}
