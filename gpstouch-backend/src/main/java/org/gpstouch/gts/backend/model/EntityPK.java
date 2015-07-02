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
public class EntityPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "accountID")
    private String accountID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "entityID")
    private String entityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entityType")
    private int entityType;

    public EntityPK() {
    }

    public EntityPK(String accountID, String entityID, int entityType) {
        this.accountID = accountID;
        this.entityID = entityID;
        this.entityType = entityType;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (entityID != null ? entityID.hashCode() : 0);
        hash += (int) entityType;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityPK)) {
            return false;
        }
        EntityPK other = (EntityPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.entityID == null && other.entityID != null) || (this.entityID != null && !this.entityID.equals(other.entityID))) {
            return false;
        }
        if (this.entityType != other.entityType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.EntityPK[ accountID=" + accountID + ", entityID=" + entityID + ", entityType=" + entityType + " ]";
    }

}
