package entity;

import java.io.Serializable;
import java.util.Objects;
/**
 * operator class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class OperatorEntity implements Serializable {
    private int operatorId;
    private String operatorName;
    private String operatorPass;

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorPass() {
        return operatorPass;
    }

    public void setOperatorPass(String operatorPass) {
        this.operatorPass = operatorPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        OperatorEntity that = (OperatorEntity) o;
        return operatorId == that.operatorId &&
                Objects.equals(operatorName, that.operatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatorId, operatorName);
    }
}
