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
@Table(name = "Rule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rule.findAll", query = "SELECT r FROM Rule r"),
    @NamedQuery(name = "Rule.findByAccountID", query = "SELECT r FROM Rule r WHERE r.rulePK.accountID = :accountID"),
    @NamedQuery(name = "Rule.findByRuleID", query = "SELECT r FROM Rule r WHERE r.rulePK.ruleID = :ruleID"),
    @NamedQuery(name = "Rule.findByIsCronRule", query = "SELECT r FROM Rule r WHERE r.isCronRule = :isCronRule"),
    @NamedQuery(name = "Rule.findByRuleTag", query = "SELECT r FROM Rule r WHERE r.ruleTag = :ruleTag"),
    @NamedQuery(name = "Rule.findByActionMask", query = "SELECT r FROM Rule r WHERE r.actionMask = :actionMask"),
    @NamedQuery(name = "Rule.findByCannedActions", query = "SELECT r FROM Rule r WHERE r.cannedActions = :cannedActions"),
    @NamedQuery(name = "Rule.findByPriority", query = "SELECT r FROM Rule r WHERE r.priority = :priority"),
    @NamedQuery(name = "Rule.findByNotifyEmail", query = "SELECT r FROM Rule r WHERE r.notifyEmail = :notifyEmail"),
    @NamedQuery(name = "Rule.findByUseEmailWrapper", query = "SELECT r FROM Rule r WHERE r.useEmailWrapper = :useEmailWrapper"),
    @NamedQuery(name = "Rule.findByRuleDisable", query = "SELECT r FROM Rule r WHERE r.ruleDisable = :ruleDisable"),
    @NamedQuery(name = "Rule.findByRuleEnable", query = "SELECT r FROM Rule r WHERE r.ruleEnable = :ruleEnable"),
    @NamedQuery(name = "Rule.findByIsActive", query = "SELECT r FROM Rule r WHERE r.isActive = :isActive"),
    @NamedQuery(name = "Rule.findByDescription", query = "SELECT r FROM Rule r WHERE r.description = :description"),
    @NamedQuery(name = "Rule.findByLastUpdateTime", query = "SELECT r FROM Rule r WHERE r.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "Rule.findByCreationTime", query = "SELECT r FROM Rule r WHERE r.creationTime = :creationTime")})
public class Rule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RulePK rulePK;
    @Column(name = "isCronRule")
    private Short isCronRule;
    @Size(max = 24)
    @Column(name = "ruleTag")
    private String ruleTag;
    @Lob
    @Size(max = 65535)
    @Column(name = "selector")
    private String selector;
    @Column(name = "actionMask")
    private Integer actionMask;
    @Size(max = 80)
    @Column(name = "cannedActions")
    private String cannedActions;
    @Column(name = "priority")
    private Short priority;
    @Size(max = 128)
    @Column(name = "notifyEmail")
    private String notifyEmail;
    @Lob
    @Size(max = 65535)
    @Column(name = "emailSubject")
    private String emailSubject;
    @Lob
    @Size(max = 65535)
    @Column(name = "emailText")
    private String emailText;
    @Lob
    @Size(max = 65535)
    @Column(name = "smsText")
    private String smsText;
    @Column(name = "useEmailWrapper")
    private Short useEmailWrapper;
    @Size(max = 64)
    @Column(name = "ruleDisable")
    private String ruleDisable;
    @Size(max = 64)
    @Column(name = "ruleEnable")
    private String ruleEnable;
    @Lob
    @Size(max = 65535)
    @Column(name = "sendCommand")
    private String sendCommand;
    @Column(name = "isActive")
    private Short isActive;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public Rule() {
    }

    public Rule(RulePK rulePK) {
        this.rulePK = rulePK;
    }

    public Rule(String accountID, String ruleID) {
        this.rulePK = new RulePK(accountID, ruleID);
    }

    public RulePK getRulePK() {
        return rulePK;
    }

    public void setRulePK(RulePK rulePK) {
        this.rulePK = rulePK;
    }

    public Short getIsCronRule() {
        return isCronRule;
    }

    public void setIsCronRule(Short isCronRule) {
        this.isCronRule = isCronRule;
    }

    public String getRuleTag() {
        return ruleTag;
    }

    public void setRuleTag(String ruleTag) {
        this.ruleTag = ruleTag;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Integer getActionMask() {
        return actionMask;
    }

    public void setActionMask(Integer actionMask) {
        this.actionMask = actionMask;
    }

    public String getCannedActions() {
        return cannedActions;
    }

    public void setCannedActions(String cannedActions) {
        this.cannedActions = cannedActions;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public String getNotifyEmail() {
        return notifyEmail;
    }

    public void setNotifyEmail(String notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public Short getUseEmailWrapper() {
        return useEmailWrapper;
    }

    public void setUseEmailWrapper(Short useEmailWrapper) {
        this.useEmailWrapper = useEmailWrapper;
    }

    public String getRuleDisable() {
        return ruleDisable;
    }

    public void setRuleDisable(String ruleDisable) {
        this.ruleDisable = ruleDisable;
    }

    public String getRuleEnable() {
        return ruleEnable;
    }

    public void setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
    }

    public String getSendCommand() {
        return sendCommand;
    }

    public void setSendCommand(String sendCommand) {
        this.sendCommand = sendCommand;
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
        hash += (rulePK != null ? rulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rule)) {
            return false;
        }
        Rule other = (Rule) object;
        if ((this.rulePK == null && other.rulePK != null) || (this.rulePK != null && !this.rulePK.equals(other.rulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Rule[ rulePK=" + rulePK + " ]";
    }

}
