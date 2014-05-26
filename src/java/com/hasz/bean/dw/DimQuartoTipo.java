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
@Table(name = "DimQuartoTipo")
public class DimQuartoTipo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDQuartoTipo;
    
    @Column(length = 30)
    private String QuartoDescricao;
    
    @Column(length = 50)
    private String QuartoVagas;
    
    @OneToMany(mappedBy = "quartoTipo",fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<FatosReserva> fatosReserva = new HashSet<FatosReserva>();

    /**
     * @return the IDQuartoTipo
     */
    public int getIDQuartoTipo() {
        return IDQuartoTipo;
    }

    /**
     * @param IDQuartoTipo the IDQuartoTipo to set
     */
    public void setIDQuartoTipo(int IDQuartoTipo) {
        this.IDQuartoTipo = IDQuartoTipo;
    }

    /**
     * @return the QuartoDescricao
     */
    public String getQuartoDescricao() {
        return QuartoDescricao;
    }

    /**
     * @param QuartoDescricao the QuartoDescricao to set
     */
    public void setQuartoDescricao(String QuartoDescricao) {
        this.QuartoDescricao = QuartoDescricao;
    }

    /**
     * @return the QuartoVagas
     */
    public String getQuartoVagas() {
        return QuartoVagas;
    }

    /**
     * @param QuartoVagas the QuartoVagas to set
     */
    public void setQuartoVagas(String QuartoVagas) {
        this.QuartoVagas = QuartoVagas;
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
