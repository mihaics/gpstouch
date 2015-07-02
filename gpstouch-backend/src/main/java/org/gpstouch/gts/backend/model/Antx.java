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
@Table(name = "Antx")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antx.findAll", query = "SELECT a FROM Antx a"),
    @NamedQuery(name = "Antx.findByAccountID", query = "SELECT a FROM Antx a WHERE a.antxPK.accountID = :accountID"),
    @NamedQuery(name = "Antx.findByDeviceID", query = "SELECT a FROM Antx a WHERE a.antxPK.deviceID = :deviceID"),
    @NamedQuery(name = "Antx.findByTimestamp", query = "SELECT a FROM Antx a WHERE a.antxPK.timestamp = :timestamp"),
    @NamedQuery(name = "Antx.findByFieldID", query = "SELECT a FROM Antx a WHERE a.antxPK.fieldID = :fieldID"),
    @NamedQuery(name = "Antx.findByChannelID", query = "SELECT a FROM Antx a WHERE a.antxPK.channelID = :channelID"),
    @NamedQuery(name = "Antx.findByType", query = "SELECT a FROM Antx a WHERE a.type = :type"),
    @NamedQuery(name = "Antx.findByData0", query = "SELECT a FROM Antx a WHERE a.data0 = :data0"),
    @NamedQuery(name = "Antx.findByData1", query = "SELECT a FROM Antx a WHERE a.data1 = :data1"),
    @NamedQuery(name = "Antx.findByData2", query = "SELECT a FROM Antx a WHERE a.data2 = :data2"),
    @NamedQuery(name = "Antx.findByData3", query = "SELECT a FROM Antx a WHERE a.data3 = :data3"),
    @NamedQuery(name = "Antx.findByData4", query = "SELECT a FROM Antx a WHERE a.data4 = :data4"),
    @NamedQuery(name = "Antx.findByCreationTime", query = "SELECT a FROM Antx a WHERE a.creationTime = :creationTime")})
public class Antx implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AntxPK antxPK;
    @Column(name = "type")
    private Short type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "data0")
    private Double data0;
    @Column(name = "data1")
    private Double data1;
    @Column(name = "data2")
    private Double data2;
    @Column(name = "data3")
    private Double data3;
    @Column(name = "data4")
    private Double data4;
    @Column(name = "creationTime")
    private Integer creationTime;

    public Antx() {
    }

    public Antx(AntxPK antxPK) {
        this.antxPK = antxPK;
    }

    public Antx(String accountID, String deviceID, int timestamp, int fieldID, int channelID) {
        this.antxPK = new AntxPK(accountID, deviceID, timestamp, fieldID, channelID);
    }

    public AntxPK getAntxPK() {
        return antxPK;
    }

    public void setAntxPK(AntxPK antxPK) {
        this.antxPK = antxPK;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Double getData0() {
        return data0;
    }

    public void setData0(Double data0) {
        this.data0 = data0;
    }

    public Double getData1() {
        return data1;
    }

    public void setData1(Double data1) {
        this.data1 = data1;
    }

    public Double getData2() {
        return data2;
    }

    public void setData2(Double data2) {
        this.data2 = data2;
    }

    public Double getData3() {
        return data3;
    }

    public void setData3(Double data3) {
        this.data3 = data3;
    }

    public Double getData4() {
        return data4;
    }

    public void setData4(Double data4) {
        this.data4 = data4;
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
        hash += (antxPK != null ? antxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Antx)) {
            return false;
        }
        Antx other = (Antx) object;
        if ((this.antxPK == null && other.antxPK != null) || (this.antxPK != null && !this.antxPK.equals(other.antxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Antx[ antxPK=" + antxPK + " ]";
    }

}
