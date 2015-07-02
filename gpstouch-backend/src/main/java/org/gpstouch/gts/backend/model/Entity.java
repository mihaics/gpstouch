/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@javax.persistence.Entity
@Table(name = "Entity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entity.findAll", query = "SELECT e FROM Entity e"),
    @NamedQuery(name = "Entity.findByAccountID", query = "SELECT e FROM Entity e WHERE e.entityPK.accountID = :accountID"),
    @NamedQuery(name = "Entity.findByEntityID", query = "SELECT e FROM Entity e WHERE e.entityPK.entityID = :entityID"),
    @NamedQuery(name = "Entity.findByEntityType", query = "SELECT e FROM Entity e WHERE e.entityPK.entityType = :entityType"),
    @NamedQuery(name = "Entity.findByTimestamp", query = "SELECT e FROM Entity e WHERE e.timestamp = :timestamp"),
    @NamedQuery(name = "Entity.findByStatusCode", query = "SELECT e FROM Entity e WHERE e.statusCode = :statusCode"),
    @NamedQuery(name = "Entity.findByIsAttached", query = "SELECT e FROM Entity e WHERE e.isAttached = :isAttached"),
    @NamedQuery(name = "Entity.findByDeviceID", query = "SELECT e FROM Entity e WHERE e.deviceID = :deviceID"),
    @NamedQuery(name = "Entity.findByDeviceOdomKM", query = "SELECT e FROM Entity e WHERE e.deviceOdomKM = :deviceOdomKM"),
    @NamedQuery(name = "Entity.findByLatitude", query = "SELECT e FROM Entity e WHERE e.latitude = :latitude"),
    @NamedQuery(name = "Entity.findByLongitude", query = "SELECT e FROM Entity e WHERE e.longitude = :longitude"),
    @NamedQuery(name = "Entity.findByAltitude", query = "SELECT e FROM Entity e WHERE e.altitude = :altitude"),
    @NamedQuery(name = "Entity.findByAddress", query = "SELECT e FROM Entity e WHERE e.address = :address"),
    @NamedQuery(name = "Entity.findByOdometerKM", query = "SELECT e FROM Entity e WHERE e.odometerKM = :odometerKM"),
    @NamedQuery(name = "Entity.findByDescription", query = "SELECT e FROM Entity e WHERE e.description = :description"),
    @NamedQuery(name = "Entity.findByLastUpdateTime", query = "SELECT e FROM Entity e WHERE e.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "Entity.findByCreationTime", query = "SELECT e FROM Entity e WHERE e.creationTime = :creationTime")})
public class Entity implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntityPK entityPK;
    @Column(name = "timestamp")
    private Integer timestamp;
    @Column(name = "statusCode")
    private Integer statusCode;
    @Column(name = "isAttached")
    private Short isAttached;
    @Size(max = 32)
    @Column(name = "deviceID")
    private String deviceID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "deviceOdomKM")
    private Double deviceOdomKM;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "altitude")
    private Double altitude;
    @Size(max = 90)
    @Column(name = "address")
    private String address;
    @Column(name = "odometerKM")
    private Double odometerKM;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public Entity() {
    }

    public Entity(EntityPK entityPK) {
        this.entityPK = entityPK;
    }

    public Entity(String accountID, String entityID, int entityType) {
        this.entityPK = new EntityPK(accountID, entityID, entityType);
    }

    public EntityPK getEntityPK() {
        return entityPK;
    }

    public void setEntityPK(EntityPK entityPK) {
        this.entityPK = entityPK;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Short getIsAttached() {
        return isAttached;
    }

    public void setIsAttached(Short isAttached) {
        this.isAttached = isAttached;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public Double getDeviceOdomKM() {
        return deviceOdomKM;
    }

    public void setDeviceOdomKM(Double deviceOdomKM) {
        this.deviceOdomKM = deviceOdomKM;
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

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getOdometerKM() {
        return odometerKM;
    }

    public void setOdometerKM(Double odometerKM) {
        this.odometerKM = odometerKM;
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
        hash += (entityPK != null ? entityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity)) {
            return false;
        }
        Entity other = (Entity) object;
        if ((this.entityPK == null && other.entityPK != null) || (this.entityPK != null && !this.entityPK.equals(other.entityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Entity[ entityPK=" + entityPK + " ]";
    }

}
