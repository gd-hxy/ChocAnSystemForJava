package entity;

import java.io.Serializable;
import java.util.Objects;
/**
 * providerType class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class ProvidertypeEntity implements Serializable {
    private int providertypeId;
    private String providertypeName;
    private String description;

    public int getProvidertypeId() {
        return providertypeId;
    }

    public void setProvidertypeId(int providertypeId) {
        this.providertypeId = providertypeId;
    }

    public String getProvidertypeName() {
        return providertypeName;
    }

    public void setProvidertypeName(String providertypeName) {
        this.providertypeName = providertypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ProvidertypeEntity that = (ProvidertypeEntity) o;
        return providertypeId == that.providertypeId &&
                Objects.equals(providertypeName, that.providertypeName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providertypeId, providertypeName, description);
    }
}
