package entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
/**
 * provider class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class ProviderEntity implements Serializable {
    private int providerId;
    private String providerName;
    private String providerAddress;
    private String providerCity;
    private String providerCountry;
    private String providerZip;
    private String providerState;
    private String providerPass;
    private Set<ServicerecordEntity> servicerecord;
    private ProvidertypeEntity providertypeEntity;

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

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public String getProviderCountry() {
        return providerCountry;
    }

    public void setProviderCountry(String providerCountry) {
        this.providerCountry = providerCountry;
    }

    public String getProviderZip() {
        return providerZip;
    }

    public void setProviderZip(String providerZip) {
        this.providerZip = providerZip;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    public Set<ServicerecordEntity> getServicerecord() {
        return servicerecord;
    }

    public void setServicerecord(Set<ServicerecordEntity> servicerecord) {
        this.servicerecord = servicerecord;
    }

    public String getProviderPass() {
        return providerPass;
    }

    public void setProviderPass(String providerPass) {
        this.providerPass = providerPass;
    }

    public ProvidertypeEntity getProvidertypeEntity() {
        return providertypeEntity;
    }

    public void setProvidertypeEntity(ProvidertypeEntity providertypeEntity) {
        this.providertypeEntity = providertypeEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ProviderEntity that = (ProviderEntity) o;
        return providerId == that.providerId &&
                Objects.equals(providerName, that.providerName) &&
                Objects.equals(providerAddress, that.providerAddress) &&
                Objects.equals(providerCity, that.providerCity) &&
                Objects.equals(providerCountry, that.providerCountry) &&
                Objects.equals(providerZip, that.providerZip) &&
                Objects.equals(providerState, that.providerState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerName, providerAddress, providerCity, providerCountry, providerZip, providerState);
    }
}
