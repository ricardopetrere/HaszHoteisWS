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
@Table(name = "DimHotel")
public class DimHotel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDHotel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDEmpresa",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimEmpresa empresa;
    
    @Column(length = 50)
    private String HotelNomeFilial;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCidade",insertable = true,updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimCidade cidade;
    
    private int HotelEstrelas;
    
    private int HotelQtdQuartos;
    
    @OneToMany(mappedBy = "hotel",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> fatosReserva = new HashSet<FatosReserva>();

    /**
     * @return the IDHotel
     */
    public int getIDHotel() {
        return IDHotel;
    }

    /**
     * @param IDHotel the IDHotel to set
     */
    public void setIDHotel(int IDHotel) {
        this.IDHotel = IDHotel;
    }

    /**
     * @return the empresa
     */
    public DimEmpresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(DimEmpresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the HotelNomeFilial
     */
    public String getHotelNomeFilial() {
        return HotelNomeFilial;
    }

    /**
     * @param HotelNomeFilial the HotelNomeFilial to set
     */
    public void setHotelNomeFilial(String HotelNomeFilial) {
        this.HotelNomeFilial = HotelNomeFilial;
    }

    /**
     * @return the cidade
     */
    public DimCidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(DimCidade cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the HotelEstrelas
     */
    public int getHotelEstrelas() {
        return HotelEstrelas;
    }

    /**
     * @param HotelEstrelas the HotelEstrelas to set
     */
    public void setHotelEstrelas(int HotelEstrelas) {
        this.HotelEstrelas = HotelEstrelas;
    }

    /**
     * @return the HotelQtdQuartos
     */
    public int getHotelQtdQuartos() {
        return HotelQtdQuartos;
    }

    /**
     * @param HotelQtdQuartos the HotelQtdQuartos to set
     */
    public void setHotelQtdQuartos(int HotelQtdQuartos) {
        this.HotelQtdQuartos = HotelQtdQuartos;
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
