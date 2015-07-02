/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "PendingCommands")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PendingCommands.findAll", query = "SELECT p FROM PendingCommands p"),
    @NamedQuery(name = "PendingCommands.findByAccountID", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.accountID = :accountID"),
    @NamedQuery(name = "PendingCommands.findByDeviceID", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.deviceID = :deviceID"),
    @NamedQuery(name = "PendingCommands.findByQueueTime", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.queueTime = :queueTime"),
    @NamedQuery(name = "PendingCommands.findBySequence", query = "SELECT p FROM PendingCommands p WHERE p.sequence = :sequence"),
    @NamedQuery(name = "PendingCommands.findBySendMethod", query = "SELECT p FROM PendingCommands p WHERE p.sendMethod = :sendMethod"),
    @NamedQuery(name = "PendingCommands.findBySendTime", query = "SELECT p FROM PendingCommands p WHERE p.sendTime = :sendTime"),
    @NamedQuery(name = "PendingCommands.findByAckTime", query = "SELECT p FROM PendingCommands p WHERE p.ackTime = :ackTime"),
    @NamedQuery(name = "PendingCommands.findByAckResponse", query = "SELECT p FROM PendingCommands p WHERE p.ackResponse = :ackResponse"),
    @NamedQuery(name = "PendingCommands.findByDeleteOnAck", query = "SELECT p FROM PendingCommands p WHERE p.deleteOnAck = :deleteOnAck"),
    @NamedQuery(name = "PendingCommands.findByLastUpdateTime", query = "SELECT p FROM PendingCommands p WHERE p.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "PendingCommands.findByCreationTime", query = "SELECT p FROM PendingCommands p WHERE p.creationTime = :creationTime"),
    @NamedQuery(name = "PendingCommands.findBySendState", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.sendState = :sendState"),
    @NamedQuery(name = "PendingCommands.findByCommandType", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.commandType = :commandType"),
    @NamedQuery(name = "PendingCommands.findByCommandID", query = "SELECT p FROM PendingCommands p WHERE p.pendingCommandsPK.commandID = :commandID"),
    @NamedQuery(name = "PendingCommands.findByCommandArgs", query = "SELECT p FROM PendingCommands p WHERE p.commandArgs = :commandArgs"),
    @NamedQuery(name = "PendingCommands.findByDeleteAfter", query = "SELECT p FROM PendingCommands p WHERE p.deleteAfter = :deleteAfter")})
public class PendingCommands implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PendingCommandsPK pendingCommandsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sequence")
    private short sequence;
    @Lob
    @Column(name = "commandBytes")
    private byte[] commandBytes;
    @Size(max = 16)
    @Column(name = "sendMethod")
    private String sendMethod;
    @Column(name = "sendTime")
    private Integer sendTime;
    @Column(name = "ackTime")
    private Integer ackTime;
    @Column(name = "ackResponse")
    private Short ackResponse;
    @Column(name = "deleteOnAck")
    private Short deleteOnAck;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;
    @Size(max = 256)
    @Column(name = "commandArgs")
    private String commandArgs;
    @Column(name = "deleteAfter")
    private Short deleteAfter;

    public PendingCommands() {
    }

    public PendingCommands(PendingCommandsPK pendingCommandsPK) {
        this.pendingCommandsPK = pendingCommandsPK;
    }

    public PendingCommands(PendingCommandsPK pendingCommandsPK, short sequence) {
        this.pendingCommandsPK = pendingCommandsPK;
        this.sequence = sequence;
    }

    public PendingCommands(String accountID, String deviceID, int queueTime, short sendState, String commandType, String commandID) {
        this.pendingCommandsPK = new PendingCommandsPK(accountID, deviceID, queueTime, sendState, commandType, commandID);
    }

    public PendingCommandsPK getPendingCommandsPK() {
        return pendingCommandsPK;
    }

    public void setPendingCommandsPK(PendingCommandsPK pendingCommandsPK) {
        this.pendingCommandsPK = pendingCommandsPK;
    }

    public short getSequence() {
        return sequence;
    }

    public void setSequence(short sequence) {
        this.sequence = sequence;
    }

    public byte[] getCommandBytes() {
        return commandBytes;
    }

    public void setCommandBytes(byte[] commandBytes) {
        this.commandBytes = commandBytes;
    }

    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getAckTime() {
        return ackTime;
    }

    public void setAckTime(Integer ackTime) {
        this.ackTime = ackTime;
    }

    public Short getAckResponse() {
        return ackResponse;
    }

    public void setAckResponse(Short ackResponse) {
        this.ackResponse = ackResponse;
    }

    public Short getDeleteOnAck() {
        return deleteOnAck;
    }

    public void setDeleteOnAck(Short deleteOnAck) {
        this.deleteOnAck = deleteOnAck;
    }

    public Integer getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Integer lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public String getCommandArgs() {
        return commandArgs;
    }

    public void setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
    }

    public Short getDeleteAfter() {
        return deleteAfter;
    }

    public void setDeleteAfter(Short deleteAfter) {
        this.deleteAfter = deleteAfter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pendingCommandsPK != null ? pendingCommandsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PendingCommands)) {
            return false;
        }
        PendingCommands other = (PendingCommands) object;
        if ((this.pendingCommandsPK == null && other.pendingCommandsPK != null) || (this.pendingCommandsPK != null && !this.pendingCommandsPK.equals(other.pendingCommandsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.PendingCommands[ pendingCommandsPK=" + pendingCommandsPK + " ]";
    }

}
