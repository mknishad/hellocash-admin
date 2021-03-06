package com.telvo.telvoterminaladmin.model.agent.action;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.telvo.telvoterminaladmin.model.agent.login.Commission;

import java.io.Serializable;

/**
 * Created by invar on 30-Oct-17.
 */

public class ConfirmWithdrawResponse implements Serializable {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("balance")
    @Expose
    private Double balance;

    @SerializedName("commission")
    @Expose
    private Commission commission;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }
}