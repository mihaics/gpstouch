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
public class AntxPK implements Serializable {
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
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fieldID")
    private int fieldID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "channelID")
    private int channelID;

    public AntxPK() {
    }

    public AntxPK(String accountID, String deviceID, int timestamp, int fieldID, int channelID) {
        this.accountID = accountID;
        this.deviceID = deviceID;
        this.timestamp = timestamp;
        this.fieldID = fieldID;
        this.channelID = channelID;
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (deviceID != null ? deviceID.hashCode() : 0);
        hash += (int) timestamp;
        hash += (int) fieldID;
        hash += (int) channelID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntxPK)) {
            return false;
        }
        AntxPK other = (AntxPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.deviceID == null && other.deviceID != null) || (this.deviceID != null && !this.deviceID.equals(other.deviceID))) {
            return false;
        }
        if (this.timestamp != other.timestamp) {
            return false;
        }
        if (this.fieldID != other.fieldID) {
            return false;
        }
        if (this.channelID != other.channelID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.AntxPK[ accountID=" + accountID + ", deviceID=" + deviceID + ", timestamp=" + timestamp + ", fieldID=" + fieldID + ", channelID=" + channelID + " ]";
    }

}
