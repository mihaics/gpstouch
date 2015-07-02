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
@Table(name = "UnassignedDevices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnassignedDevices.findAll", query = "SELECT u FROM UnassignedDevices u"),
    @NamedQuery(name = "UnassignedDevices.findByServerID", query = "SELECT u FROM UnassignedDevices u WHERE u.unassignedDevicesPK.serverID = :serverID"),
    @NamedQuery(name = "UnassignedDevices.findByMobileID", query = "SELECT u FROM UnassignedDevices u WHERE u.unassignedDevicesPK.mobileID = :mobileID"),
    @NamedQuery(name = "UnassignedDevices.findByTimestamp", query = "SELECT u FROM UnassignedDevices u WHERE u.timestamp = :timestamp"),
    @NamedQuery(name = "UnassignedDevices.findByIpAddress", query = "SELECT u FROM UnassignedDevices u WHERE u.ipAddress = :ipAddress"),
    @NamedQuery(name = "UnassignedDevices.findByIsDuplex", query = "SELECT u FROM UnassignedDevices u WHERE u.isDuplex = :isDuplex"),
    @NamedQuery(name = "UnassignedDevices.findByLatitude", query = "SELECT u FROM UnassignedDevices u WHERE u.latitude = :latitude"),
    @NamedQuery(name = "UnassignedDevices.findByLongitude", query = "SELECT u FROM UnassignedDevices u WHERE u.longitude = :longitude"),
    @NamedQuery(name = "UnassignedDevices.findByData", query = "SELECT u FROM UnassignedDevices u WHERE u.data = :data"),
    @NamedQuery(name = "UnassignedDevices.findByCreationTime", query = "SELECT u FROM UnassignedDevices u WHERE u.creationTime = :creationTime")})
public class UnassignedDevices implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnassignedDevicesPK unassignedDevicesPK;
    @Column(name = "timestamp")
    private Integer timestamp;
    @Size(max = 32)
    @Column(name = "ipAddress")
    private String ipAddress;
    @Column(name = "isDuplex")
    private Short isDuplex;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Size(max = 255)
    @Column(name = "data")
    private String data;
    @Column(name = "creationTime")
    private Integer creationTime;

    public UnassignedDevices() {
    }

    public UnassignedDevices(UnassignedDevicesPK unassignedDevicesPK) {
        this.unassignedDevicesPK = unassignedDevicesPK;
    }

    public UnassignedDevices(String serverID, String mobileID) {
        this.unassignedDevicesPK = new UnassignedDevicesPK(serverID, mobileID);
    }

    public UnassignedDevicesPK getUnassignedDevicesPK() {
        return unassignedDevicesPK;
    }

    public void setUnassignedDevicesPK(UnassignedDevicesPK unassignedDevicesPK) {
        this.unassignedDevicesPK = unassignedDevicesPK;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        hash += (unassignedDevicesPK != null ? unassignedDevicesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnassignedDevices)) {
            return false;
        }
        UnassignedDevices other = (UnassignedDevices) object;
        if ((this.unassignedDevicesPK == null && other.unassignedDevicesPK != null) || (this.unassignedDevicesPK != null && !this.unassignedDevicesPK.equals(other.unassignedDevicesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.UnassignedDevices[ unassignedDevicesPK=" + unassignedDevicesPK + " ]";
    }

}
