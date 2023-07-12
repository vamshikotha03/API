package com.keshtechnologies.Model;

import lombok.Data;

import java.security.PrivateKey;
import java.util.Date;

@Data
public class SubmissionModel {
    private String date;
    private String vendorName;
    private String vendorCompanyName;
    private String vendorMailId;
    private String vendorPhoneNumber;
    private String implementation;
    private String client;
    private boolean submitted;
    private String workType;
    private String type;
    private String payRate;
    private String status;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorCompanyName() {
        return vendorCompanyName;
    }

    public void setVendorCompanyName(String vendorCompanyName) {
        this.vendorCompanyName = vendorCompanyName;
    }

    public String getVendorMailId() {
        return vendorMailId;
    }

    public void setVendorMailId(String vendorMailId) {
        this.vendorMailId = vendorMailId;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubmissionModel{" +
                "date=" + date +
                ", vendorName='" + vendorName + '\'' +
                ", vendorCompanyName='" + vendorCompanyName + '\'' +
                ", vendorMailId='" + vendorMailId + '\'' +
                ", vendorPhoneNumber='" + vendorPhoneNumber + '\'' +
                ", implementation='" + implementation + '\'' +
                ", client='" + client + '\'' +
                ", submitted=" + submitted +
                ", workType='" + workType + '\'' +
                ", type='" + type + '\'' +
                ", payRate='" + payRate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
