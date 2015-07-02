/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "kbacc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kbacc.findAll", query = "SELECT k FROM Kbacc k"),
    @NamedQuery(name = "Kbacc.findById", query = "SELECT k FROM Kbacc k WHERE k.id = :id"),
    @NamedQuery(name = "Kbacc.findByAccID", query = "SELECT k FROM Kbacc k WHERE k.accID = :accID"),
    @NamedQuery(name = "Kbacc.findByNrclient", query = "SELECT k FROM Kbacc k WHERE k.nrclient = :nrclient")})
public class Kbacc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 32)
    @Column(name = "accID")
    private String accID;
    @Size(max = 20)
    @Column(name = "nrclient")
    private String nrclient;

    public Kbacc() {
    }

    public Kbacc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getNrclient() {
        return nrclient;
    }

    public void setNrclient(String nrclient) {
        this.nrclient = nrclient;
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
        if (!(object instanceof Kbacc)) {
            return false;
        }
        Kbacc other = (Kbacc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Kbacc[ id=" + id + " ]";
    }

}
