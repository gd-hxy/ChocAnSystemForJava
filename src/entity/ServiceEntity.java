package entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
/**
 * service class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class ServiceEntity implements Serializable {
    private int serviceId;
    private String serviceName;
    private double serviceFee;
    private Set<ServiceEntity> serivcerecord;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Set<ServiceEntity> getSerivcerecord() {
        return serivcerecord;
    }

    public void setSerivcerecord(Set<ServiceEntity> serivcerecord) {
        this.serivcerecord = serivcerecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ServiceEntity that = (ServiceEntity) o;
        return serviceId == that.serviceId &&
                Double.compare(that.serviceFee, serviceFee) == 0 &&
                Objects.equals(serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName, serviceFee);
    }
}
