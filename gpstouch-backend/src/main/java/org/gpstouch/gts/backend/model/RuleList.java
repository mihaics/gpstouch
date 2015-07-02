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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "RuleList")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RuleList.findAll", query = "SELECT r FROM RuleList r"),
    @NamedQuery(name = "RuleList.findByAccountID", query = "SELECT r FROM RuleList r WHERE r.ruleListPK.accountID = :accountID"),
    @NamedQuery(name = "RuleList.findByDeviceID", query = "SELECT r FROM RuleList r WHERE r.ruleListPK.deviceID = :deviceID"),
    @NamedQuery(name = "RuleList.findByGroupID", query = "SELECT r FROM RuleList r WHERE r.ruleListPK.groupID = :groupID"),
    @NamedQuery(name = "RuleList.findByStatusCode", query = "SELECT r FROM RuleList r WHERE r.ruleListPK.statusCode = :statusCode"),
    @NamedQuery(name = "RuleList.findByRuleID", query = "SELECT r FROM RuleList r WHERE r.ruleListPK.ruleID = :ruleID"),
    @NamedQuery(name = "RuleList.findByLastUpdateTime", query = "SELECT r FROM RuleList r WHERE r.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "RuleList.findByCreationTime", query = "SELECT r FROM RuleList r WHERE r.creationTime = :creationTime")})
public class RuleList implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RuleListPK ruleListPK;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public RuleList() {
    }

    public RuleList(RuleListPK ruleListPK) {
        this.ruleListPK = ruleListPK;
    }

    public RuleList(String accountID, String deviceID, String groupID, int statusCode, String ruleID) {
        this.ruleListPK = new RuleListPK(accountID, deviceID, groupID, statusCode, ruleID);
    }

    public RuleListPK getRuleListPK() {
        return ruleListPK;
    }

    public void setRuleListPK(RuleListPK ruleListPK) {
        this.ruleListPK = ruleListPK;
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
        hash += (ruleListPK != null ? ruleListPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuleList)) {
            return false;
        }
        RuleList other = (RuleList) object;
        if ((this.ruleListPK == null && other.ruleListPK != null) || (this.ruleListPK != null && !this.ruleListPK.equals(other.ruleListPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.RuleList[ ruleListPK=" + ruleListPK + " ]";
    }

}
