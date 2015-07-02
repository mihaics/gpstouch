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
@Table(name = "GeoCorridorList")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GeoCorridorList.findAll", query = "SELECT g FROM GeoCorridorList g"),
    @NamedQuery(name = "GeoCorridorList.findByAccountID", query = "SELECT g FROM GeoCorridorList g WHERE g.geoCorridorListPK.accountID = :accountID"),
    @NamedQuery(name = "GeoCorridorList.findByCorridorID", query = "SELECT g FROM GeoCorridorList g WHERE g.geoCorridorListPK.corridorID = :corridorID"),
    @NamedQuery(name = "GeoCorridorList.findBySortID", query = "SELECT g FROM GeoCorridorList g WHERE g.geoCorridorListPK.sortID = :sortID"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude1", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude1 = :latitude1"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude1", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude1 = :longitude1"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude2", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude2 = :latitude2"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude2", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude2 = :longitude2"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude3", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude3 = :latitude3"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude3", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude3 = :longitude3"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude4", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude4 = :latitude4"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude4", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude4 = :longitude4"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude5", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude5 = :latitude5"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude5", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude5 = :longitude5"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude6", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude6 = :latitude6"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude6", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude6 = :longitude6"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude7", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude7 = :latitude7"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude7", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude7 = :longitude7"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude8", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude8 = :latitude8"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude8", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude8 = :longitude8"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude9", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude9 = :latitude9"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude9", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude9 = :longitude9"),
    @NamedQuery(name = "GeoCorridorList.findByLatitude10", query = "SELECT g FROM GeoCorridorList g WHERE g.latitude10 = :latitude10"),
    @NamedQuery(name = "GeoCorridorList.findByLongitude10", query = "SELECT g FROM GeoCorridorList g WHERE g.longitude10 = :longitude10"),
    @NamedQuery(name = "GeoCorridorList.findByLastUpdateTime", query = "SELECT g FROM GeoCorridorList g WHERE g.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "GeoCorridorList.findByCreationTime", query = "SELECT g FROM GeoCorridorList g WHERE g.creationTime = :creationTime")})
public class GeoCorridorList implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeoCorridorListPK geoCorridorListPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude1")
    private Double latitude1;
    @Column(name = "longitude1")
    private Double longitude1;
    @Column(name = "latitude2")
    private Double latitude2;
    @Column(name = "longitude2")
    private Double longitude2;
    @Column(name = "latitude3")
    private Double latitude3;
    @Column(name = "longitude3")
    private Double longitude3;
    @Column(name = "latitude4")
    private Double latitude4;
    @Column(name = "longitude4")
    private Double longitude4;
    @Column(name = "latitude5")
    private Double latitude5;
    @Column(name = "longitude5")
    private Double longitude5;
    @Column(name = "latitude6")
    private Double latitude6;
    @Column(name = "longitude6")
    private Double longitude6;
    @Column(name = "latitude7")
    private Double latitude7;
    @Column(name = "longitude7")
    private Double longitude7;
    @Column(name = "latitude8")
    private Double latitude8;
    @Column(name = "longitude8")
    private Double longitude8;
    @Column(name = "latitude9")
    private Double latitude9;
    @Column(name = "longitude9")
    private Double longitude9;
    @Column(name = "latitude10")
    private Double latitude10;
    @Column(name = "longitude10")
    private Double longitude10;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;

    public GeoCorridorList() {
    }

    public GeoCorridorList(GeoCorridorListPK geoCorridorListPK) {
        this.geoCorridorListPK = geoCorridorListPK;
    }

    public GeoCorridorList(String accountID, String corridorID, int sortID) {
        this.geoCorridorListPK = new GeoCorridorListPK(accountID, corridorID, sortID);
    }

    public GeoCorridorListPK getGeoCorridorListPK() {
        return geoCorridorListPK;
    }

    public void setGeoCorridorListPK(GeoCorridorListPK geoCorridorListPK) {
        this.geoCorridorListPK = geoCorridorListPK;
    }

    public Double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(Double latitude1) {
        this.latitude1 = latitude1;
    }

    public Double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(Double longitude1) {
        this.longitude1 = longitude1;
    }

    public Double getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(Double latitude2) {
        this.latitude2 = latitude2;
    }

    public Double getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(Double longitude2) {
        this.longitude2 = longitude2;
    }

    public Double getLatitude3() {
        return latitude3;
    }

    public void setLatitude3(Double latitude3) {
        this.latitude3 = latitude3;
    }

    public Double getLongitude3() {
        return longitude3;
    }

    public void setLongitude3(Double longitude3) {
        this.longitude3 = longitude3;
    }

    public Double getLatitude4() {
        return latitude4;
    }

    public void setLatitude4(Double latitude4) {
        this.latitude4 = latitude4;
    }

    public Double getLongitude4() {
        return longitude4;
    }

    public void setLongitude4(Double longitude4) {
        this.longitude4 = longitude4;
    }

    public Double getLatitude5() {
        return latitude5;
    }

    public void setLatitude5(Double latitude5) {
        this.latitude5 = latitude5;
    }

    public Double getLongitude5() {
        return longitude5;
    }

    public void setLongitude5(Double longitude5) {
        this.longitude5 = longitude5;
    }

    public Double getLatitude6() {
        return latitude6;
    }

    public void setLatitude6(Double latitude6) {
        this.latitude6 = latitude6;
    }

    public Double getLongitude6() {
        return longitude6;
    }

    public void setLongitude6(Double longitude6) {
        this.longitude6 = longitude6;
    }

    public Double getLatitude7() {
        return latitude7;
    }

    public void setLatitude7(Double latitude7) {
        this.latitude7 = latitude7;
    }

    public Double getLongitude7() {
        return longitude7;
    }

    public void setLongitude7(Double longitude7) {
        this.longitude7 = longitude7;
    }

    public Double getLatitude8() {
        return latitude8;
    }

    public void setLatitude8(Double latitude8) {
        this.latitude8 = latitude8;
    }

    public Double getLongitude8() {
        return longitude8;
    }

    public void setLongitude8(Double longitude8) {
        this.longitude8 = longitude8;
    }

    public Double getLatitude9() {
        return latitude9;
    }

    public void setLatitude9(Double latitude9) {
        this.latitude9 = latitude9;
    }

    public Double getLongitude9() {
        return longitude9;
    }

    public void setLongitude9(Double longitude9) {
        this.longitude9 = longitude9;
    }

    public Double getLatitude10() {
        return latitude10;
    }

    public void setLatitude10(Double latitude10) {
        this.latitude10 = latitude10;
    }

    public Double getLongitude10() {
        return longitude10;
    }

    public void setLongitude10(Double longitude10) {
        this.longitude10 = longitude10;
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
        hash += (geoCorridorListPK != null ? geoCorridorListPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoCorridorList)) {
            return false;
        }
        GeoCorridorList other = (GeoCorridorList) object;
        if ((this.geoCorridorListPK == null && other.geoCorridorListPK != null) || (this.geoCorridorListPK != null && !this.geoCorridorListPK.equals(other.geoCorridorListPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.GeoCorridorList[ geoCorridorListPK=" + geoCorridorListPK + " ]";
    }

}
