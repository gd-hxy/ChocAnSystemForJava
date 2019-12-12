package entity;

import java.io.Serializable;

public class outLine implements Serializable {
    private int providerId;
    private String providerName;
    private int QueryAmount;
    private double totalFee;

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getQueryAmount() {
        return QueryAmount;
    }

    public void setQueryAmount(int queryAmount) {
        QueryAmount = queryAmount;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }
}
