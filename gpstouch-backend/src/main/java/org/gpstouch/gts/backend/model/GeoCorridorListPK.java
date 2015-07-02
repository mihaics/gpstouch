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
public class GeoCorridorListPK implements Serializable {
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "sortID")
    private int sortID;

    public GeoCorridorListPK() {
    }

    public GeoCorridorListPK(String accountID, String corridorID, int sortID) {
        this.accountID = accountID;
        this.corridorID = corridorID;
        this.sortID = sortID;
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

    public int getSortID() {
        return sortID;
    }

    public void setSortID(int sortID) {
        this.sortID = sortID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (corridorID != null ? corridorID.hashCode() : 0);
        hash += (int) sortID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoCorridorListPK)) {
            return false;
        }
        GeoCorridorListPK other = (GeoCorridorListPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.corridorID == null && other.corridorID != null) || (this.corridorID != null && !this.corridorID.equals(other.corridorID))) {
            return false;
        }
        if (this.sortID != other.sortID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.GeoCorridorListPK[ accountID=" + accountID + ", corridorID=" + corridorID + ", sortID=" + sortID + " ]";
    }

}
