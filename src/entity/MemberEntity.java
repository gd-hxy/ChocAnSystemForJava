package entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
/**
 * member class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class MemberEntity implements Serializable {
    private int memberId;
    private String memberName;
    private String memberAddress;
    private String memberCity;
    private String memberCountry;
    private String memberZip;
    private String memberState;
    private double memberFee;
    private String memberPass;
    private Set<ServicerecordEntity> servicerecord;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberCity() {
        return memberCity;
    }

    public void setMemberCity(String memberCity) {
        this.memberCity = memberCity;
    }

    public String getMemberCountry() {
        return memberCountry;
    }

    public void setMemberCountry(String memberCountry) {
        this.memberCountry = memberCountry;
    }

    public String getMemberZip() {
        return memberZip;
    }

    public void setMemberZip(String memberZip) {
        this.memberZip = memberZip;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    public double getMemberFee() {
        return memberFee;
    }

    public void setMemberFee(double memberFee) {
        this.memberFee = memberFee;
    }

    public Set<ServicerecordEntity> getServicerecord() {
        return servicerecord;
    }

    public void setServicerecord(Set<ServicerecordEntity> servicerecord) {
        this.servicerecord = servicerecord;
    }

    public String getMemberPass() {
        return memberPass;
    }

    public void setMemberPass(String memberPass) {
        this.memberPass = memberPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        MemberEntity that = (MemberEntity) o;
        return memberId == that.memberId &&
                Double.compare(that.memberFee, memberFee) == 0 &&
                Objects.equals(memberName, that.memberName) &&
                Objects.equals(memberAddress, that.memberAddress) &&
                Objects.equals(memberCity, that.memberCity) &&
                Objects.equals(memberCountry, that.memberCountry) &&
                Objects.equals(memberZip, that.memberZip) &&
                Objects.equals(memberState, that.memberState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName, memberAddress, memberCity, memberCountry, memberZip, memberState, memberFee);
    }
}
