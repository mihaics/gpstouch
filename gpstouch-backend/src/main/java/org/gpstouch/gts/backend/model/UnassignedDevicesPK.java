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
public class UnassignedDevicesPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "serverID")
    private String serverID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "mobileID")
    private String mobileID;

    public UnassignedDevicesPK() {
    }

    public UnassignedDevicesPK(String serverID, String mobileID) {
        this.serverID = serverID;
        this.mobileID = mobileID;
    }

    public String getServerID() {
        return serverID;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public String getMobileID() {
        return mobileID;
    }

    public void setMobileID(String mobileID) {
        this.mobileID = mobileID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serverID != null ? serverID.hashCode() : 0);
        hash += (mobileID != null ? mobileID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnassignedDevicesPK)) {
            return false;
        }
        UnassignedDevicesPK other = (UnassignedDevicesPK) object;
        if ((this.serverID == null && other.serverID != null) || (this.serverID != null && !this.serverID.equals(other.serverID))) {
            return false;
        }
        if ((this.mobileID == null && other.mobileID != null) || (this.mobileID != null && !this.mobileID.equals(other.mobileID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.UnassignedDevicesPK[ serverID=" + serverID + ", mobileID=" + mobileID + " ]";
    }

}
