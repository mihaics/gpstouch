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
public class SystemAuditPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "accountID")
    private String accountID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "auditTime")
    private int auditTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "auditCode")
    private short auditCode;

    public SystemAuditPK() {
    }

    public SystemAuditPK(String accountID, int auditTime, short auditCode) {
        this.accountID = accountID;
        this.auditTime = auditTime;
        this.auditCode = auditCode;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(int auditTime) {
        this.auditTime = auditTime;
    }

    public short getAuditCode() {
        return auditCode;
    }

    public void setAuditCode(short auditCode) {
        this.auditCode = auditCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (int) auditTime;
        hash += (int) auditCode;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemAuditPK)) {
            return false;
        }
        SystemAuditPK other = (SystemAuditPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if (this.auditTime != other.auditTime) {
            return false;
        }
        if (this.auditCode != other.auditCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.SystemAuditPK[ accountID=" + accountID + ", auditTime=" + auditTime + ", auditCode=" + auditCode + " ]";
    }

}
