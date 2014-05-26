/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hasz.bean.dw;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "DimCidade")
public class DimCidade implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDCidade;
    
    @Column(length = 30)
    private String Municipio;
    
    @Column(length = 2)
    private String UF;
    
    @OneToMany(mappedBy = "cidade",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> fatosReserva = new HashSet<FatosReserva>();
    
    @OneToMany(mappedBy = "cidade",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> hotel = new HashSet<FatosReserva>();

    /**
     * @return the IDCidade
     */
    public int getIDCidade() {
        return IDCidade;
    }

    /**
     * @param IDCidade the IDCidade to set
     */
    public void setIDCidade(int IDCidade) {
        this.IDCidade = IDCidade;
    }

    /**
     * @return the Municipio
     */
    public String getMunicipio() {
        return Municipio;
    }

    /**
     * @param Municipio the Municipio to set
     */
    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the fatosReserva
     */
    public Set<FatosReserva> getFatosReserva() {
        return fatosReserva;
    }

    /**
     * @param fatosReserva the fatosReserva to set
     */
    public void setFatosReserva(Set<FatosReserva> fatosReserva) {
        this.fatosReserva = fatosReserva;
    }
}
