/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "SessionStats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SessionStats.findAll", query = "SELECT s FROM SessionStats s"),
    @NamedQuery(name = "SessionStats.findByAccountID", query = "SELECT s FROM SessionStats s WHERE s.sessionStatsPK.accountID = :accountID"),
    @NamedQuery(name = "SessionStats.findByDeviceID", query = "SELECT s FROM SessionStats s WHERE s.sessionStatsPK.deviceID = :deviceID"),
    @NamedQuery(name = "SessionStats.findByTimestamp", query = "SELECT s FROM SessionStats s WHERE s.sessionStatsPK.timestamp = :timestamp"),
    @NamedQuery(name = "SessionStats.findByIpAddress", query = "SELECT s FROM SessionStats s WHERE s.ipAddress = :ipAddress"),
    @NamedQuery(name = "SessionStats.findByIsDuplex", query = "SELECT s FROM SessionStats s WHERE s.isDuplex = :isDuplex"),
    @NamedQuery(name = "SessionStats.findByBytesRead", query = "SELECT s FROM SessionStats s WHERE s.bytesRead = :bytesRead"),
    @NamedQuery(name = "SessionStats.findByBytesWritten", query = "SELECT s FROM SessionStats s WHERE s.bytesWritten = :bytesWritten"),
    @NamedQuery(name = "SessionStats.findByBytesOverhead", query = "SELECT s FROM SessionStats s WHERE s.bytesOverhead = :bytesOverhead"),
    @NamedQuery(name = "SessionStats.findByBytesRounded", query = "SELECT s FROM SessionStats s WHERE s.bytesRounded = :bytesRounded"),
    @NamedQuery(name = "SessionStats.findByEventsReceived", query = "SELECT s FROM SessionStats s WHERE s.eventsReceived = :eventsReceived"),
    @NamedQuery(name = "SessionStats.findByCreationTime", query = "SELECT s FROM SessionStats s WHERE s.creationTime = :creationTime")})
public class SessionStats implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SessionStatsPK sessionStatsPK;
    @Size(max = 32)
    @Column(name = "ipAddress")
    private String ipAddress;
    @Column(name = "isDuplex")
    private Short isDuplex;
    @Column(name = "bytesRead")
    private Integer bytesRead;
    @Column(name = "bytesWritten")
    private Integer bytesWritten;
    @Column(name = "bytesOverhead")
    private Integer bytesOverhead;
    @Column(name = "bytesRounded")
    private Integer bytesRounded;
    @Column(name = "eventsReceived")
    private Integer eventsReceived;
    @Column(name = "creationTime")
    private Integer creationTime;

    public SessionStats() {
    }

    public SessionStats(SessionStatsPK sessionStatsPK) {
        this.sessionStatsPK = sessionStatsPK;
    }

    public SessionStats(String accountID, String deviceID, int timestamp) {
        this.sessionStatsPK = new SessionStatsPK(accountID, deviceID, timestamp);
    }

    public SessionStatsPK getSessionStatsPK() {
        return sessionStatsPK;
    }

    public void setSessionStatsPK(SessionStatsPK sessionStatsPK) {
        this.sessionStatsPK = sessionStatsPK;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Short getIsDuplex() {
        return isDuplex;
    }

    public void setIsDuplex(Short isDuplex) {
        this.isDuplex = isDuplex;
    }

    public Integer getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(Integer bytesRead) {
        this.bytesRead = bytesRead;
    }

    public Integer getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Integer bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Integer getBytesOverhead() {
        return bytesOverhead;
    }

    public void setBytesOverhead(Integer bytesOverhead) {
        this.bytesOverhead = bytesOverhead;
    }

    public Integer getBytesRounded() {
        return bytesRounded;
    }

    public void setBytesRounded(Integer bytesRounded) {
        this.bytesRounded = bytesRounded;
    }

    public Integer getEventsReceived() {
        return eventsReceived;
    }

    public void setEventsReceived(Integer eventsReceived) {
        this.eventsReceived = eventsReceived;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionStatsPK != null ? sessionStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessionStats)) {
            return false;
        }
        SessionStats other = (SessionStats) object;
        if ((this.sessionStatsPK == null && other.sessionStatsPK != null) || (this.sessionStatsPK != null && !this.sessionStatsPK.equals(other.sessionStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.SessionStats[ sessionStatsPK=" + sessionStatsPK + " ]";
    }

}
