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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "categorie", catalog = "tp_jee", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c")
    , @NamedQuery(name = "Categorie.findByCodeCat", query = "SELECT c FROM Categorie c WHERE c.codeCat = :codeCat")
    , @NamedQuery(name = "Categorie.findByLibCat", query = "SELECT c FROM Categorie c WHERE c.libCat = :libCat")})
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codeCat", nullable = false)
    private Integer codeCat;
    @Basic(optional = false)
    @Column(name = "libCat", nullable = false, length = 225)
    private String libCat;

    public Categorie() {
    }

    public Categorie(Integer codeCat) {
        this.codeCat = codeCat;
    }

    public Categorie(Integer codeCat, String libCat) {
        this.codeCat = codeCat;
        this.libCat = libCat;
    }

    public Integer getCodeCat() {
        return codeCat;
    }

    public void setCodeCat(Integer codeCat) {
        this.codeCat = codeCat;
    }

    public String getLibCat() {
        return libCat;
    }

    public void setLibCat(String libCat) {
        this.libCat = libCat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCat != null ? codeCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.codeCat == null && other.codeCat != null) || (this.codeCat != null && !this.codeCat.equals(other.codeCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bd.Categorie[ codeCat=" + codeCat + " ]";
    }
    
}
