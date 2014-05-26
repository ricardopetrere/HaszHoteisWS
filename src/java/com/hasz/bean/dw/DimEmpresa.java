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
@Table(name = "DimEmpresa")
public class DimEmpresa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDEmpresa;
    
    @Column(length = 50)
    private String EmpresaNome;
    
    @OneToMany(mappedBy = "empresa",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> fatosReserva = new HashSet<FatosReserva>();
    
    @OneToMany(mappedBy = "empresa",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<DimHotel> hotel = new HashSet<DimHotel>();

    /**
     * @return the IDEmpresa
     */
    public int getIDEmpresa() {
        return IDEmpresa;
    }

    /**
     * @param IDEmpresa the IDEmpresa to set
     */
    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }

    /**
     * @return the EmpresaNome
     */
    public String getEmpresaNome() {
        return EmpresaNome;
    }

    /**
     * @param EmpresaNome the EmpresaNome to set
     */
    public void setEmpresaNome(String EmpresaNome) {
        this.EmpresaNome = EmpresaNome;
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

    /**
     * @return the hotel
     */
    public Set<DimHotel> getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(Set<DimHotel> hotel) {
        this.hotel = hotel;
    }
}
