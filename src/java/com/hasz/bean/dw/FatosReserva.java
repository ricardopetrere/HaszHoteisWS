/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hasz.bean.dw;
import java.io.Serializable;
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
@Table(name = "FatosReserva")
public class FatosReserva implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDFatosReserva;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDHotel",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimHotel hotel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDEmpresa",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimEmpresa empresa;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDQuartoTipo",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimQuartoTipo quartoTipo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCidade",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimCidade cidade;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDTempo",insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private DimTempo tempo;
    
    private char ClienteFaixaEtaria;
    
    private char ClienteTipo;
    
    private float ReservaValorTotal;
    
    private float ReservaValorMax;
    
    private float ReservaValorMin;
    
    private int ReservaQtdCanceladas;
    
    private int ReservaQtdDias;
    
    private int ReservaQtd;

    /**
     * @return the idFatosReserva
     */
    public int getIdFatosReserva() {
        return IDFatosReserva;
    }

    /**
     * @param IDFatosReserva the idFatosReserva to set
     */
    public void setIdFatosReserva(int IDFatosReserva) {
        this.IDFatosReserva = IDFatosReserva;
    }

    /**
     * @return the hotel
     */
    public DimHotel getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(DimHotel hotel) {
        this.hotel = hotel;
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
     * @return the quartoTipo
     */
    public DimQuartoTipo getQuartoTipo() {
        return quartoTipo;
    }

    /**
     * @param quartoTipo the quartoTipo to set
     */
    public void setQuartoTipo(DimQuartoTipo quartoTipo) {
        this.quartoTipo = quartoTipo;
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
     * @return the tempo
     */
    public DimTempo getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(DimTempo tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the clienteFaixaEtaria
     */
    public char getClienteFaixaEtaria() {
        return ClienteFaixaEtaria;
    }

    /**
     * @param ClienteFaixaEtaria the clienteFaixaEtaria to set
     */
    public void setClienteFaixaEtaria(char ClienteFaixaEtaria) {
        this.ClienteFaixaEtaria = ClienteFaixaEtaria;
    }

    /**
     * @return the clienteTipo
     */
    public char getClienteTipo() {
        return ClienteTipo;
    }

    /**
     * @param ClienteTipo the clienteTipo to set
     */
    public void setClienteTipo(char ClienteTipo) {
        this.ClienteTipo = ClienteTipo;
    }

    /**
     * @return the reservaValorTotal
     */
    public float getReservaValorTotal() {
        return ReservaValorTotal;
    }

    /**
     * @param ReservaValorTotal the reservaValorTotal to set
     */
    public void setReservaValorTotal(float ReservaValorTotal) {
        this.ReservaValorTotal = ReservaValorTotal;
    }

    /**
     * @return the reservaValorMax
     */
    public float getReservaValorMax() {
        return ReservaValorMax;
    }

    /**
     * @param ReservaValorMax the reservaValorMax to set
     */
    public void setReservaValorMax(float ReservaValorMax) {
        this.ReservaValorMax = ReservaValorMax;
    }

    /**
     * @return the reservaValorMin
     */
    public float getReservaValorMin() {
        return ReservaValorMin;
    }

    /**
     * @param ReservaValorMin the reservaValorMin to set
     */
    public void setReservaValorMin(float ReservaValorMin) {
        this.ReservaValorMin = ReservaValorMin;
    }

    /**
     * @return the reservaQtdCanceladas
     */
    public int getReservaQtdCanceladas() {
        return ReservaQtdCanceladas;
    }

    /**
     * @param ReservaQtdCanceladas the reservaQtdCanceladas to set
     */
    public void setReservaQtdCanceladas(int ReservaQtdCanceladas) {
        this.ReservaQtdCanceladas = ReservaQtdCanceladas;
    }

    /**
     * @return the reservaQtdDias
     */
    public int getReservaQtdDias() {
        return ReservaQtdDias;
    }

    /**
     * @param ReservaQtdDias the reservaQtdDias to set
     */
    public void setReservaQtdDias(int ReservaQtdDias) {
        this.ReservaQtdDias = ReservaQtdDias;
    }

    /**
     * @return the reservaQtd
     */
    public int getReservaQtd() {
        return ReservaQtd;
    }

    /**
     * @param ReservaQtd the reservaQtd to set
     */
    public void setReservaQtd(int ReservaQtd) {
        this.ReservaQtd = ReservaQtd;
    }
}