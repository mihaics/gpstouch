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
@Table(name = "kbclienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kbclienti.findAll", query = "SELECT k FROM Kbclienti k"),
    @NamedQuery(name = "Kbclienti.findById", query = "SELECT k FROM Kbclienti k WHERE k.id = :id"),
    @NamedQuery(name = "Kbclienti.findByNrclient", query = "SELECT k FROM Kbclienti k WHERE k.nrclient = :nrclient"),
    @NamedQuery(name = "Kbclienti.findByIngts", query = "SELECT k FROM Kbclienti k WHERE k.ingts = :ingts"),
    @NamedQuery(name = "Kbclienti.findByToemails", query = "SELECT k FROM Kbclienti k WHERE k.toemails = :toemails"),
    @NamedQuery(name = "Kbclienti.findByEmail", query = "SELECT k FROM Kbclienti k WHERE k.email = :email")})
public class Kbclienti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "nrclient")
    private String nrclient;
    @Column(name = "ingts")
    private Short ingts;
    @Size(max = 1024)
    @Column(name = "toemails")
    private String toemails;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 128)
    @Column(name = "email")
    private String email;

    public Kbclienti() {
    }

    public Kbclienti(Integer id) {
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

    public Short getIngts() {
        return ingts;
    }

    public void setIngts(Short ingts) {
        this.ingts = ingts;
    }

    public String getToemails() {
        return toemails;
    }

    public void setToemails(String toemails) {
        this.toemails = toemails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Kbclienti)) {
            return false;
        }
        Kbclienti other = (Kbclienti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Kbclienti[ id=" + id + " ]";
    }

}
