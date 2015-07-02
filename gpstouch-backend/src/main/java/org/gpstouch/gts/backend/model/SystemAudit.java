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
@Table(name = "SystemAudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemAudit.findAll", query = "SELECT s FROM SystemAudit s"),
    @NamedQuery(name = "SystemAudit.findByAccountID", query = "SELECT s FROM SystemAudit s WHERE s.systemAuditPK.accountID = :accountID"),
    @NamedQuery(name = "SystemAudit.findByAuditTime", query = "SELECT s FROM SystemAudit s WHERE s.systemAuditPK.auditTime = :auditTime"),
    @NamedQuery(name = "SystemAudit.findByAuditCode", query = "SELECT s FROM SystemAudit s WHERE s.systemAuditPK.auditCode = :auditCode"),
    @NamedQuery(name = "SystemAudit.findByUserID", query = "SELECT s FROM SystemAudit s WHERE s.userID = :userID"),
    @NamedQuery(name = "SystemAudit.findByDeviceID", query = "SELECT s FROM SystemAudit s WHERE s.deviceID = :deviceID"),
    @NamedQuery(name = "SystemAudit.findByIpAddress", query = "SELECT s FROM SystemAudit s WHERE s.ipAddress = :ipAddress"),
    @NamedQuery(name = "SystemAudit.findByPrivateLabelName", query = "SELECT s FROM SystemAudit s WHERE s.privateLabelName = :privateLabelName"),
    @NamedQuery(name = "SystemAudit.findByDescription", query = "SELECT s FROM SystemAudit s WHERE s.description = :description"),
    @NamedQuery(name = "SystemAudit.findByCreationTime", query = "SELECT s FROM SystemAudit s WHERE s.creationTime = :creationTime")})
public class SystemAudit implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SystemAuditPK systemAuditPK;
    @Size(max = 32)
    @Column(name = "userID")
    private String userID;
    @Size(max = 32)
    @Column(name = "deviceID")
    private String deviceID;
    @Size(max = 32)
    @Column(name = "ipAddress")
    private String ipAddress;
    @Size(max = 32)
    @Column(name = "privateLabelName")
    private String privateLabelName;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Column(name = "creationTime")
    private Integer creationTime;
    @Lob
    @Size(max = 65535)
    @Column(name = "notes")
    private String notes;

    public SystemAudit() {
    }

    public SystemAudit(SystemAuditPK systemAuditPK) {
        this.systemAuditPK = systemAuditPK;
    }

    public SystemAudit(String accountID, int auditTime, short auditCode) {
        this.systemAuditPK = new SystemAuditPK(accountID, auditTime, auditCode);
    }

    public SystemAuditPK getSystemAuditPK() {
        return systemAuditPK;
    }

    public void setSystemAuditPK(SystemAuditPK systemAuditPK) {
        this.systemAuditPK = systemAuditPK;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPrivateLabelName() {
        return privateLabelName;
    }

    public void setPrivateLabelName(String privateLabelName) {
        this.privateLabelName = privateLabelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemAuditPK != null ? systemAuditPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemAudit)) {
            return false;
        }
        SystemAudit other = (SystemAudit) object;
        if ((this.systemAuditPK == null && other.systemAuditPK != null) || (this.systemAuditPK != null && !this.systemAuditPK.equals(other.systemAuditPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.SystemAudit[ systemAuditPK=" + systemAuditPK + " ]";
    }

}
