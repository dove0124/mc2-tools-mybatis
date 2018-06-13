package cn.mybatis.dove.model.entity;

import java.io.Serializable;
import java.util.Date;

public class RuleType implements Serializable {
    private Long id;

    private String ruleTypeName;

    private String ruleTypeDes;

    private String ruleTypePic;

    private Long tenantId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleTypeName() {
        return ruleTypeName;
    }

    public void setRuleTypeName(String ruleTypeName) {
        this.ruleTypeName = ruleTypeName == null ? null : ruleTypeName.trim();
    }

    public String getRuleTypeDes() {
        return ruleTypeDes;
    }

    public void setRuleTypeDes(String ruleTypeDes) {
        this.ruleTypeDes = ruleTypeDes == null ? null : ruleTypeDes.trim();
    }

    public String getRuleTypePic() {
        return ruleTypePic;
    }

    public void setRuleTypePic(String ruleTypePic) {
        this.ruleTypePic = ruleTypePic == null ? null : ruleTypePic.trim();
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleTypeName=").append(ruleTypeName);
        sb.append(", ruleTypeDes=").append(ruleTypeDes);
        sb.append(", ruleTypePic=").append(ruleTypePic);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}