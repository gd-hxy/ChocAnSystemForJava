package entity;

import java.io.Serializable;

public class providerList implements Serializable {
    private String serviceDate;
    private String localTime;
    private String memberName;
    private int memberId;
    private int serviceId;
    private double shouldPay;
    private int queryMemberNumber;
    private double totalFee;

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public int getQueryMemberNumber() {
        return queryMemberNumber;
    }

    public void setQueryMemberNumber(int queryMemberNumber) {
        this.queryMemberNumber = queryMemberNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }
}
