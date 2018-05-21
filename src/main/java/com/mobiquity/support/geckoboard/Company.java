package com.mobiquity.support.geckoboard;

import java.util.Date;

public class Company {
    
        private int companyId,informationId;
        private String companyID, companyNaam, companyLogin, companyPassword,companyUrl,healthStatus;
        private String companyCallsPerMinute, companyAverageResponseTime, companyErrorsPerMinute,MaxCallsPerMinute,MaxAverageResponseTime,MaxErrorsPerMinute;
        private String companyAdress, companyLocation, companyPhoneNumber, companyEmail;
	private Date date;

    public Company(){}

    public Company(int companyId, String companyNaam, String companyLogin, String companyPassword, String companyUrl, String companyCallsPerMinute, String companyAverageResponseTime,String companyErrorsPerMinute, String MaxCallsPerMinute, String MaxAverageResponseTime, String MaxErrorsPerMinute, String companyAdress, String companyLocation, String companyPhoneNumber, String companyEmail) {
        this.companyId = companyId;
        this.companyNaam = companyNaam;
        this.companyLogin = companyLogin;
        this.companyPassword = companyPassword;
        this.companyUrl = companyUrl;
        this.companyCallsPerMinute = companyCallsPerMinute;
        this.companyAverageResponseTime = companyAverageResponseTime;
        this.companyErrorsPerMinute = companyErrorsPerMinute;
        this.MaxCallsPerMinute = MaxCallsPerMinute;
        this.MaxAverageResponseTime = MaxAverageResponseTime;
        this.MaxErrorsPerMinute = MaxErrorsPerMinute;
        this.companyAdress = companyAdress;
        this.companyLocation = companyLocation;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyEmail = companyEmail;
    }
    
    public Company(String  companyID){
        this.companyID = companyID;
    }

     public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }
    
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNaam() {
        return companyNaam;
    }

    public void setCompanyNaam(String companyNaam) {
        this.companyNaam = companyNaam;
    }

    public String getCompanyLogin() {
        return companyLogin;
    }

    public void setCompanyLogin(String companyLogin) {
        this.companyLogin = companyLogin;
    }

    public String getCompanyPassword() {
        return companyPassword;
    }

    public void setCompanyPassword(String companyPassword) {
        this.companyPassword = companyPassword;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getCompanyCallsPerMinute() {
        return companyCallsPerMinute;
    }

    public void setCompanyCallsPerMinute(String companyCallsPerMinute) {
        this.companyCallsPerMinute = companyCallsPerMinute;
    }

    public String getCompanyAverageResponseTime() {
        return companyAverageResponseTime;
    }

    public void setCompanyAverageResponseTime(String companyAverageResponseTime) {
        this.companyAverageResponseTime = companyAverageResponseTime;
    }

    public String getCompanyErrorsPerMinute() {
        return companyErrorsPerMinute;
    }

    public void setCompanyErrorsPerMinute(String companyErrorsPerMinute) {
        this.companyErrorsPerMinute = companyErrorsPerMinute;
    }

    public String getMaxCallsPerMinute() {
        return MaxCallsPerMinute;
    }

    public void setMaxCallsPerMinute(String MaxCallsPerMinute) {
        this.MaxCallsPerMinute = MaxCallsPerMinute;
    }

    public String getMaxAverageResponseTime() {
        return MaxAverageResponseTime;
    }

    public void setMaxAverageResponseTime(String MaxAverageResponseTime) {
        this.MaxAverageResponseTime = MaxAverageResponseTime;
    }

    public String getMaxErrorsPerMinute() {
        return MaxErrorsPerMinute;
    }

    public void setMaxErrorsPerMinute(String MaxErrorsPerMinute) {
        this.MaxErrorsPerMinute = MaxErrorsPerMinute;
    }
    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInformationId() {
        return informationId;
    }

    public void setInformationId(int informationId) {
        this.informationId = informationId;
    }
    
     public String getHealthStatus() {
         return healthStatus;
     }

     public void setHealthStatus(String healthStatus) {
         this.healthStatus = healthStatus;
     }
}
