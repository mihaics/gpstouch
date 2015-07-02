/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mihai
 */
@Embeddable
public class RuleListPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "accountID")
    private String accountID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "deviceID")
    private String deviceID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "groupID")
    private String groupID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusCode")
    private int statusCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "ruleID")
    private String ruleID;

    public RuleListPK() {
    }

    public RuleListPK(String accountID, String deviceID, String groupID, int statusCode, String ruleID) {
        this.accountID = accountID;
        this.deviceID = deviceID;
        this.groupID = groupID;
        this.statusCode = statusCode;
        this.ruleID = ruleID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (deviceID != null ? deviceID.hashCode() : 0);
        hash += (groupID != null ? groupID.hashCode() : 0);
        hash += (int) statusCode;
        hash += (ruleID != null ? ruleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuleListPK)) {
            return false;
        }
        RuleListPK other = (RuleListPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.deviceID == null && other.deviceID != null) || (this.deviceID != null && !this.deviceID.equals(other.deviceID))) {
            return false;
        }
        if ((this.groupID == null && other.groupID != null) || (this.groupID != null && !this.groupID.equals(other.groupID))) {
            return false;
        }
        if (this.statusCode != other.statusCode) {
            return false;
        }
        if ((this.ruleID == null && other.ruleID != null) || (this.ruleID != null && !this.ruleID.equals(other.ruleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.RuleListPK[ accountID=" + accountID + ", deviceID=" + deviceID + ", groupID=" + groupID + ", statusCode=" + statusCode + ", ruleID=" + ruleID + " ]";
    }

}
