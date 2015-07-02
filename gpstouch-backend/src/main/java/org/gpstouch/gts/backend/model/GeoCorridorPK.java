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
public class GeoCorridorPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "accountID")
    private String accountID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "corridorID")
    private String corridorID;

    public GeoCorridorPK() {
    }

    public GeoCorridorPK(String accountID, String corridorID) {
        this.accountID = accountID;
        this.corridorID = corridorID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getCorridorID() {
        return corridorID;
    }

    public void setCorridorID(String corridorID) {
        this.corridorID = corridorID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (corridorID != null ? corridorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoCorridorPK)) {
            return false;
        }
        GeoCorridorPK other = (GeoCorridorPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.corridorID == null && other.corridorID != null) || (this.corridorID != null && !this.corridorID.equals(other.corridorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.GeoCorridorPK[ accountID=" + accountID + ", corridorID=" + corridorID + " ]";
    }

}
