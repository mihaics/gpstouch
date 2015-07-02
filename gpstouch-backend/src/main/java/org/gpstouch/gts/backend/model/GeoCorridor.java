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
@Table(name = "GeoCorridor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GeoCorridor.findAll", query = "SELECT g FROM GeoCorridor g"),
    @NamedQuery(name = "GeoCorridor.findByAccountID", query = "SELECT g FROM GeoCorridor g WHERE g.geoCorridorPK.accountID = :accountID"),
    @NamedQuery(name = "GeoCorridor.findByCorridorID", query = "SELECT g FROM GeoCorridor g WHERE g.geoCorridorPK.corridorID = :corridorID"),
    @NamedQuery(name = "GeoCorridor.findByRadius", query = "SELECT g FROM GeoCorridor g WHERE g.radius = :radius"),
    @NamedQuery(name = "GeoCorridor.findByDisplayName", query = "SELECT g FROM GeoCorridor g WHERE g.displayName = :displayName"),
    @NamedQuery(name = "GeoCorridor.findByDescription", query = "SELECT g FROM GeoCorridor g WHERE g.description = :description"),
    @NamedQuery(name = "GeoCorridor.findByLastUpdateTime", query = "SELECT g FROM GeoCorridor g WHERE g.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "GeoCorridor.findByCreationTime", query = "SELECT g FROM GeoCorridor g WHERE g.creationTime = :creationTime")})
public class GeoCorridor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeoCorridorPK geoCorridorPK;
    @Column(name = "radius")
    private Integer radius;
    @Size(max = 40)
    @Column(name = "displayName")
    private String displayName;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public GeoCorridor() {
    }

    public GeoCorridor(GeoCorridorPK geoCorridorPK) {
        this.geoCorridorPK = geoCorridorPK;
    }

    public GeoCorridor(String accountID, String corridorID) {
        this.geoCorridorPK = new GeoCorridorPK(accountID, corridorID);
    }

    public GeoCorridorPK getGeoCorridorPK() {
        return geoCorridorPK;
    }

    public void setGeoCorridorPK(GeoCorridorPK geoCorridorPK) {
        this.geoCorridorPK = geoCorridorPK;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
        hash += (geoCorridorPK != null ? geoCorridorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoCorridor)) {
            return false;
        }
        GeoCorridor other = (GeoCorridor) object;
        if ((this.geoCorridorPK == null && other.geoCorridorPK != null) || (this.geoCorridorPK != null && !this.geoCorridorPK.equals(other.geoCorridorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.GeoCorridor[ geoCorridorPK=" + geoCorridorPK + " ]";
    }

}
