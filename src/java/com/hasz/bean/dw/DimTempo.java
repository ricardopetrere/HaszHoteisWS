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
@Table(name = "DimTempo")
public class DimTempo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDTempo;
    
    private int Ano;
    
    private int Mes;
    
    @OneToMany(mappedBy = "tempo", fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> fatosReserva = new HashSet<FatosReserva>();

    /**
     * @return the idTempo
     */
    public int getIDTempo() {
        return IDTempo;
    }

    /**
     * @param IDTempo the idTempo to set
     */
    public void setIDTempo(int IDTempo) {
        this.IDTempo = IDTempo;
    }

    /**
     * @return the Ano
     */
    public int getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    /**
     * @return the Mes
     */
    public int getMes() {
        return Mes;
    }

    /**
     * @param Mes the Mes to set
     */
    public void setMes(int Mes) {
        this.Mes = Mes;
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
