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
public class ReportJobPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "accountID")
    private String accountID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "reportJobID")
    private String reportJobID;

    public ReportJobPK() {
    }

    public ReportJobPK(String accountID, String reportJobID) {
        this.accountID = accountID;
        this.reportJobID = reportJobID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getReportJobID() {
        return reportJobID;
    }

    public void setReportJobID(String reportJobID) {
        this.reportJobID = reportJobID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (reportJobID != null ? reportJobID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportJobPK)) {
            return false;
        }
        ReportJobPK other = (ReportJobPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.reportJobID == null && other.reportJobID != null) || (this.reportJobID != null && !this.reportJobID.equals(other.reportJobID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.ReportJobPK[ accountID=" + accountID + ", reportJobID=" + reportJobID + " ]";
    }

}
