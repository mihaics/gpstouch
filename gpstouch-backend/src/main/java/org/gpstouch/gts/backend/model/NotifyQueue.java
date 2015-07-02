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
import javax.persistence.Lob;
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
@Table(name = "NotifyQueue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NotifyQueue.findAll", query = "SELECT n FROM NotifyQueue n"),
    @NamedQuery(name = "NotifyQueue.findByAccountID", query = "SELECT n FROM NotifyQueue n WHERE n.notifyQueuePK.accountID = :accountID"),
    @NamedQuery(name = "NotifyQueue.findByDeviceID", query = "SELECT n FROM NotifyQueue n WHERE n.notifyQueuePK.deviceID = :deviceID"),
    @NamedQuery(name = "NotifyQueue.findByRuleID", query = "SELECT n FROM NotifyQueue n WHERE n.notifyQueuePK.ruleID = :ruleID"),
    @NamedQuery(name = "NotifyQueue.findByTimestamp", query = "SELECT n FROM NotifyQueue n WHERE n.notifyQueuePK.timestamp = :timestamp"),
    @NamedQuery(name = "NotifyQueue.findByStatusCode", query = "SELECT n FROM NotifyQueue n WHERE n.notifyQueuePK.statusCode = :statusCode"),
    @NamedQuery(name = "NotifyQueue.findByMessageID", query = "SELECT n FROM NotifyQueue n WHERE n.messageID = :messageID"),
    @NamedQuery(name = "NotifyQueue.findByPriority", query = "SELECT n FROM NotifyQueue n WHERE n.priority = :priority"),
    @NamedQuery(name = "NotifyQueue.findBySender", query = "SELECT n FROM NotifyQueue n WHERE n.sender = :sender"),
    @NamedQuery(name = "NotifyQueue.findByRecipients", query = "SELECT n FROM NotifyQueue n WHERE n.recipients = :recipients"),
    @NamedQuery(name = "NotifyQueue.findByLastUpdateTime", query = "SELECT n FROM NotifyQueue n WHERE n.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "NotifyQueue.findByCreationTime", query = "SELECT n FROM NotifyQueue n WHERE n.creationTime = :creationTime")})
public class NotifyQueue implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotifyQueuePK notifyQueuePK;
    @Size(max = 24)
    @Column(name = "messageID")
    private String messageID;
    @Column(name = "priority")
    private Integer priority;
    @Size(max = 64)
    @Column(name = "sender")
    private String sender;
    @Size(max = 128)
    @Column(name = "recipients")
    private String recipients;
    @Lob
    @Size(max = 65535)
    @Column(name = "subject")
    private String subject;
    @Lob
    @Size(max = 65535)
    @Column(name = "message")
    private String message;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public NotifyQueue() {
    }

    public NotifyQueue(NotifyQueuePK notifyQueuePK) {
        this.notifyQueuePK = notifyQueuePK;
    }

    public NotifyQueue(String accountID, String deviceID, String ruleID, int timestamp, int statusCode) {
        this.notifyQueuePK = new NotifyQueuePK(accountID, deviceID, ruleID, timestamp, statusCode);
    }

    public NotifyQueuePK getNotifyQueuePK() {
        return notifyQueuePK;
    }

    public void setNotifyQueuePK(NotifyQueuePK notifyQueuePK) {
        this.notifyQueuePK = notifyQueuePK;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notifyQueuePK != null ? notifyQueuePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotifyQueue)) {
            return false;
        }
        NotifyQueue other = (NotifyQueue) object;
        if ((this.notifyQueuePK == null && other.notifyQueuePK != null) || (this.notifyQueuePK != null && !this.notifyQueuePK.equals(other.notifyQueuePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.NotifyQueue[ notifyQueuePK=" + notifyQueuePK + " ]";
    }

}
