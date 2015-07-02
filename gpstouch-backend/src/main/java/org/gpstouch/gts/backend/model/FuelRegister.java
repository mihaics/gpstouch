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
@Table(name = "FuelRegister")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FuelRegister.findAll", query = "SELECT f FROM FuelRegister f"),
    @NamedQuery(name = "FuelRegister.findByAccountID", query = "SELECT f FROM FuelRegister f WHERE f.fuelRegisterPK.accountID = :accountID"),
    @NamedQuery(name = "FuelRegister.findByDeviceID", query = "SELECT f FROM FuelRegister f WHERE f.fuelRegisterPK.deviceID = :deviceID"),
    @NamedQuery(name = "FuelRegister.findByTimestamp", query = "SELECT f FROM FuelRegister f WHERE f.fuelRegisterPK.timestamp = :timestamp"),
    @NamedQuery(name = "FuelRegister.findByStatusCode", query = "SELECT f FROM FuelRegister f WHERE f.statusCode = :statusCode"),
    @NamedQuery(name = "FuelRegister.findByLatitude", query = "SELECT f FROM FuelRegister f WHERE f.latitude = :latitude"),
    @NamedQuery(name = "FuelRegister.findByLongitude", query = "SELECT f FROM FuelRegister f WHERE f.longitude = :longitude"),
    @NamedQuery(name = "FuelRegister.findByFuelLevel", query = "SELECT f FROM FuelRegister f WHERE f.fuelLevel = :fuelLevel"),
    @NamedQuery(name = "FuelRegister.findByIsIncrease", query = "SELECT f FROM FuelRegister f WHERE f.isIncrease = :isIncrease"),
    @NamedQuery(name = "FuelRegister.findByFuelTotal", query = "SELECT f FROM FuelRegister f WHERE f.fuelTotal = :fuelTotal"),
    @NamedQuery(name = "FuelRegister.findByOdometerKM", query = "SELECT f FROM FuelRegister f WHERE f.odometerKM = :odometerKM"),
    @NamedQuery(name = "FuelRegister.findBySubdivision", query = "SELECT f FROM FuelRegister f WHERE f.subdivision = :subdivision"),
    @NamedQuery(name = "FuelRegister.findByCreationTime", query = "SELECT f FROM FuelRegister f WHERE f.creationTime = :creationTime")})
public class FuelRegister implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuelRegisterPK fuelRegisterPK;
    @Column(name = "statusCode")
    private Integer statusCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "fuelLevel")
    private Double fuelLevel;
    @Column(name = "isIncrease")
    private Short isIncrease;
    @Column(name = "fuelTotal")
    private Double fuelTotal;
    @Column(name = "odometerKM")
    private Double odometerKM;
    @Size(max = 32)
    @Column(name = "subdivision")
    private String subdivision;
    @Column(name = "creationTime")
    private Integer creationTime;

    public FuelRegister() {
    }

    public FuelRegister(FuelRegisterPK fuelRegisterPK) {
        this.fuelRegisterPK = fuelRegisterPK;
    }

    public FuelRegister(String accountID, String deviceID, int timestamp) {
        this.fuelRegisterPK = new FuelRegisterPK(accountID, deviceID, timestamp);
    }

    public FuelRegisterPK getFuelRegisterPK() {
        return fuelRegisterPK;
    }

    public void setFuelRegisterPK(FuelRegisterPK fuelRegisterPK) {
        this.fuelRegisterPK = fuelRegisterPK;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
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

    public Double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Short getIsIncrease() {
        return isIncrease;
    }

    public void setIsIncrease(Short isIncrease) {
        this.isIncrease = isIncrease;
    }

    public Double getFuelTotal() {
        return fuelTotal;
    }

    public void setFuelTotal(Double fuelTotal) {
        this.fuelTotal = fuelTotal;
    }

    public Double getOdometerKM() {
        return odometerKM;
    }

    public void setOdometerKM(Double odometerKM) {
        this.odometerKM = odometerKM;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
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
        hash += (fuelRegisterPK != null ? fuelRegisterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuelRegister)) {
            return false;
        }
        FuelRegister other = (FuelRegister) object;
        if ((this.fuelRegisterPK == null && other.fuelRegisterPK != null) || (this.fuelRegisterPK != null && !this.fuelRegisterPK.equals(other.fuelRegisterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.FuelRegister[ fuelRegisterPK=" + fuelRegisterPK + " ]";
    }

}
