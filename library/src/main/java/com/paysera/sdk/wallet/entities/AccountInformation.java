package com.paysera.sdk.wallet.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class AccountInformation {

    public static final String TYPE_LOCAL = "local";
    public static final String TYPE_TECHNICAL = "technical";
    public static final String TYPE_CARD = "card";

    @SerializedName("number")
    private String accountNumber;
    private String ownerDisplayName;
    private String description;
    private String ownerTitle;
    private Integer userId;
    private String type;
    private List<String> ibans = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerDisplayName() {
        return ownerDisplayName;
    }

    public void setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
    }

    public String getOwnerTitle() {
        return ownerTitle;
    }

    public void setOwnerTitle(String ownerTitle) {
        this.ownerTitle = ownerTitle;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getIbans() {
        return ibans;
    }

    public void setIbans(List<String> ibans) {
        this.ibans = ibans;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
