/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SAMSUNG
 */
@Entity
@Table(name = "produit", catalog = "tp_jee", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
    , @NamedQuery(name = "Produit.findByRefprod", query = "SELECT p FROM Produit p WHERE p.refprod = :refprod")
    , @NamedQuery(name = "Produit.findByDesignation", query = "SELECT p FROM Produit p WHERE p.designation = :designation")
    , @NamedQuery(name = "Produit.findByQteStock", query = "SELECT p FROM Produit p WHERE p.qteStock = :qteStock")
    , @NamedQuery(name = "Produit.findByPrixUnit", query = "SELECT p FROM Produit p WHERE p.prixUnit = :prixUnit")
    , @NamedQuery(name = "Produit.findByCodeCat", query = "SELECT p FROM Produit p WHERE p.codeCat = :codeCat")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "refprod", nullable = false, length = 225)
    private String refprod;
    @Basic(optional = false)
    @Column(name = "designation", nullable = false, length = 225)
    private String designation;
    @Basic(optional = false)
    @Column(name = "QteStock", nullable = false)
    private int qteStock;
    @Basic(optional = false)
    @Column(name = "prixUnit", nullable = false)
    private long prixUnit;
    @Basic(optional = false)
    @Column(name = "codeCat", nullable = false)
    private int codeCat;

    public Produit() {
    }

    public Produit(String refprod) {
        this.refprod = refprod;
    }

    public Produit(String refprod, String designation, int qteStock, long prixUnit, int codeCat) {
        this.refprod = refprod;
        this.designation = designation;
        this.qteStock = qteStock;
        this.prixUnit = prixUnit;
        this.codeCat = codeCat;
    }

    public String getRefprod() {
        return refprod;
    }

    public void setRefprod(String refprod) {
        this.refprod = refprod;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public long getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(long prixUnit) {
        this.prixUnit = prixUnit;
    }

    public int getCodeCat() {
        return codeCat;
    }

    public void setCodeCat(int codeCat) {
        this.codeCat = codeCat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refprod != null ? refprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.refprod == null && other.refprod != null) || (this.refprod != null && !this.refprod.equals(other.refprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bd.Produit[ refprod=" + refprod + " ]";
    }
    
}
