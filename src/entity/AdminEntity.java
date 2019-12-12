package entity;

import java.io.Serializable;
import java.util.Objects;
/**
 * Admin class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class AdminEntity implements Serializable {
    private int adminId;
    private String adminName;
    private String adminPass;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        AdminEntity that = (AdminEntity) o;
        return adminId == that.adminId &&
                Objects.equals(adminName, that.adminName) &&
                Objects.equals(adminPass, that.adminPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminName, adminPass);
    }
}
