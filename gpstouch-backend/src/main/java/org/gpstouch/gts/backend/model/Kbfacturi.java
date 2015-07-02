/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "kbfacturi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kbfacturi.findAll", query = "SELECT k FROM Kbfacturi k"),
    @NamedQuery(name = "Kbfacturi.findById", query = "SELECT k FROM Kbfacturi k WHERE k.id = :id"),
    @NamedQuery(name = "Kbfacturi.findByNrclient", query = "SELECT k FROM Kbfacturi k WHERE k.nrclient = :nrclient"),
    @NamedQuery(name = "Kbfacturi.findByNumeclient", query = "SELECT k FROM Kbfacturi k WHERE k.numeclient = :numeclient"),
    @NamedQuery(name = "Kbfacturi.findByNrinv", query = "SELECT k FROM Kbfacturi k WHERE k.nrinv = :nrinv"),
    @NamedQuery(name = "Kbfacturi.findByDataemis", query = "SELECT k FROM Kbfacturi k WHERE k.dataemis = :dataemis"),
    @NamedQuery(name = "Kbfacturi.findByDatascadent", query = "SELECT k FROM Kbfacturi k WHERE k.datascadent = :datascadent"),
    @NamedQuery(name = "Kbfacturi.findByTotal", query = "SELECT k FROM Kbfacturi k WHERE k.total = :total"),
    @NamedQuery(name = "Kbfacturi.findByToemails", query = "SELECT k FROM Kbfacturi k WHERE k.toemails = :toemails")})
public class Kbfacturi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "nrclient")
    private String nrclient;
    @Size(max = 64)
    @Column(name = "numeclient")
    private String numeclient;
    @Size(max = 20)
    @Column(name = "nrinv")
    private String nrinv;
    @Column(name = "dataemis")
    @Temporal(TemporalType.DATE)
    private Date dataemis;
    @Column(name = "datascadent")
    @Temporal(TemporalType.DATE)
    private Date datascadent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Size(max = 1024)
    @Column(name = "toemails")
    private String toemails;

    public Kbfacturi() {
    }

    public Kbfacturi(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNrclient() {
        return nrclient;
    }

    public void setNrclient(String nrclient) {
        this.nrclient = nrclient;
    }

    public String getNumeclient() {
        return numeclient;
    }

    public void setNumeclient(String numeclient) {
        this.numeclient = numeclient;
    }

    public String getNrinv() {
        return nrinv;
    }

    public void setNrinv(String nrinv) {
        this.nrinv = nrinv;
    }

    public Date getDataemis() {
        return dataemis;
    }

    public void setDataemis(Date dataemis) {
        this.dataemis = dataemis;
    }

    public Date getDatascadent() {
        return datascadent;
    }

    public void setDatascadent(Date datascadent) {
        this.datascadent = datascadent;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getToemails() {
        return toemails;
    }

    public void setToemails(String toemails) {
        this.toemails = toemails;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kbfacturi)) {
            return false;
        }
        Kbfacturi other = (Kbfacturi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Kbfacturi[ id=" + id + " ]";
    }

}
