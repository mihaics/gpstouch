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
@Table(name = "ReportJob")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReportJob.findAll", query = "SELECT r FROM ReportJob r"),
    @NamedQuery(name = "ReportJob.findByAccountID", query = "SELECT r FROM ReportJob r WHERE r.reportJobPK.accountID = :accountID"),
    @NamedQuery(name = "ReportJob.findByReportJobID", query = "SELECT r FROM ReportJob r WHERE r.reportJobPK.reportJobID = :reportJobID"),
    @NamedQuery(name = "ReportJob.findByReportName", query = "SELECT r FROM ReportJob r WHERE r.reportName = :reportName"),
    @NamedQuery(name = "ReportJob.findByReportOption", query = "SELECT r FROM ReportJob r WHERE r.reportOption = :reportOption"),
    @NamedQuery(name = "ReportJob.findByDeviceID", query = "SELECT r FROM ReportJob r WHERE r.deviceID = :deviceID"),
    @NamedQuery(name = "ReportJob.findByGroupID", query = "SELECT r FROM ReportJob r WHERE r.groupID = :groupID"),
    @NamedQuery(name = "ReportJob.findByReportTimeFrom", query = "SELECT r FROM ReportJob r WHERE r.reportTimeFrom = :reportTimeFrom"),
    @NamedQuery(name = "ReportJob.findByReportTimeTo", query = "SELECT r FROM ReportJob r WHERE r.reportTimeTo = :reportTimeTo"),
    @NamedQuery(name = "ReportJob.findByReportFormat", query = "SELECT r FROM ReportJob r WHERE r.reportFormat = :reportFormat"),
    @NamedQuery(name = "ReportJob.findByRecipients", query = "SELECT r FROM ReportJob r WHERE r.recipients = :recipients"),
    @NamedQuery(name = "ReportJob.findByIntervalTag", query = "SELECT r FROM ReportJob r WHERE r.intervalTag = :intervalTag"),
    @NamedQuery(name = "ReportJob.findByLastReportTime", query = "SELECT r FROM ReportJob r WHERE r.lastReportTime = :lastReportTime"),
    @NamedQuery(name = "ReportJob.findByIsActive", query = "SELECT r FROM ReportJob r WHERE r.isActive = :isActive"),
    @NamedQuery(name = "ReportJob.findByDescription", query = "SELECT r FROM ReportJob r WHERE r.description = :description"),
    @NamedQuery(name = "ReportJob.findByLastUpdateTime", query = "SELECT r FROM ReportJob r WHERE r.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "ReportJob.findByCreationTime", query = "SELECT r FROM ReportJob r WHERE r.creationTime = :creationTime")})
public class ReportJob implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReportJobPK reportJobPK;
    @Size(max = 64)
    @Column(name = "reportName")
    private String reportName;
    @Size(max = 24)
    @Column(name = "reportOption")
    private String reportOption;
    @Size(max = 32)
    @Column(name = "deviceID")
    private String deviceID;
    @Size(max = 32)
    @Column(name = "groupID")
    private String groupID;
    @Size(max = 24)
    @Column(name = "reportTimeFrom")
    private String reportTimeFrom;
    @Size(max = 24)
    @Column(name = "reportTimeTo")
    private String reportTimeTo;
    @Size(max = 16)
    @Column(name = "reportFormat")
    private String reportFormat;
    @Size(max = 200)
    @Column(name = "recipients")
    private String recipients;
    @Size(max = 16)
    @Column(name = "intervalTag")
    private String intervalTag;
    @Column(name = "lastReportTime")
    private Integer lastReportTime;
    @Column(name = "isActive")
    private Short isActive;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public ReportJob() {
    }

    public ReportJob(ReportJobPK reportJobPK) {
        this.reportJobPK = reportJobPK;
    }

    public ReportJob(String accountID, String reportJobID) {
        this.reportJobPK = new ReportJobPK(accountID, reportJobID);
    }

    public ReportJobPK getReportJobPK() {
        return reportJobPK;
    }

    public void setReportJobPK(ReportJobPK reportJobPK) {
        this.reportJobPK = reportJobPK;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportOption() {
        return reportOption;
    }

    public void setReportOption(String reportOption) {
        this.reportOption = reportOption;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getReportTimeFrom() {
        return reportTimeFrom;
    }

    public void setReportTimeFrom(String reportTimeFrom) {
        this.reportTimeFrom = reportTimeFrom;
    }

    public String getReportTimeTo() {
        return reportTimeTo;
    }

    public void setReportTimeTo(String reportTimeTo) {
        this.reportTimeTo = reportTimeTo;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getIntervalTag() {
        return intervalTag;
    }

    public void setIntervalTag(String intervalTag) {
        this.intervalTag = intervalTag;
    }

    public Integer getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(Integer lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (reportJobPK != null ? reportJobPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportJob)) {
            return false;
        }
        ReportJob other = (ReportJob) object;
        if ((this.reportJobPK == null && other.reportJobPK != null) || (this.reportJobPK != null && !this.reportJobPK.equals(other.reportJobPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.ReportJob[ reportJobPK=" + reportJobPK + " ]";
    }

}
