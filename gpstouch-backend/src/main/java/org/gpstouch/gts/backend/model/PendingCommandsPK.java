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
public class PendingCommandsPK implements Serializable {
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
    @Column(name = "queueTime")
    private int queueTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sendState")
    private short sendState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "commandType")
    private String commandType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "commandID")
    private String commandID;

    public PendingCommandsPK() {
    }

    public PendingCommandsPK(String accountID, String deviceID, int queueTime, short sendState, String commandType, String commandID) {
        this.accountID = accountID;
        this.deviceID = deviceID;
        this.queueTime = queueTime;
        this.sendState = sendState;
        this.commandType = commandType;
        this.commandID = commandID;
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

    public int getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(int queueTime) {
        this.queueTime = queueTime;
    }

    public short getSendState() {
        return sendState;
    }

    public void setSendState(short sendState) {
        this.sendState = sendState;
    }

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public String getCommandID() {
        return commandID;
    }

    public void setCommandID(String commandID) {
        this.commandID = commandID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        hash += (deviceID != null ? deviceID.hashCode() : 0);
        hash += (int) queueTime;
        hash += (int) sendState;
        hash += (commandType != null ? commandType.hashCode() : 0);
        hash += (commandID != null ? commandID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PendingCommandsPK)) {
            return false;
        }
        PendingCommandsPK other = (PendingCommandsPK) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        if ((this.deviceID == null && other.deviceID != null) || (this.deviceID != null && !this.deviceID.equals(other.deviceID))) {
            return false;
        }
        if (this.queueTime != other.queueTime) {
            return false;
        }
        if (this.sendState != other.sendState) {
            return false;
        }
        if ((this.commandType == null && other.commandType != null) || (this.commandType != null && !this.commandType.equals(other.commandType))) {
            return false;
        }
        if ((this.commandID == null && other.commandID != null) || (this.commandID != null && !this.commandID.equals(other.commandID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.PendingCommandsPK[ accountID=" + accountID + ", deviceID=" + deviceID + ", queueTime=" + queueTime + ", sendState=" + sendState + ", commandType=" + commandType + ", commandID=" + commandID + " ]";
    }

}
