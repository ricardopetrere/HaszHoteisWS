
import beans.DimCidade;
import beans.DimEmpresa;
import beans.DimHotel;
import beans.DimQuartoTipo;
import beans.DimTempo;
import beans.FatosReserva;
import principal.WSDatawarehouse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Client {
    public static void main(String[] args){
        WSDatawarehouse dw = new WSDatawarehouse("jdbc:sqlserver://192.168.150.4:1433;DatabaseName=HaszDW2");
        
        int IDEmpresa=0
                ,IDCidade=0
                ,IDQuartoTipo=0
                ,IDHotel=0
                ,quartoVagas=0
                ,ano=0
                ,mes=0
                ,hotelEstrelas=0
                ,hotelQtdQuartos=0
                ,reservaQtdCanceladas=0
                ,reservaQtdDias=0
                ,reservaQtd=0;
        double reservaValorTotal=0
                ,reservaValorMax=0
                ,reservaValorMin=0;
        
        DimEmpresa e = new DimEmpresa(IDEmpresa, "Hoteis Hasz", null, null);
        DimCidade c = new DimCidade(IDCidade, null, null, null, null, null);
        DimQuartoTipo qt = new DimQuartoTipo(IDQuartoTipo, null, quartoVagas, null);
        DimTempo t = new DimTempo(ano, mes, null);
        DimHotel h = new DimHotel(IDHotel, "Hasz Alpha", hotelEstrelas, hotelQtdQuartos, e, c, null);
        FatosReserva f = new FatosReserva(h, e, t, "Adulto", "Fisico", c, qt, reservaValorTotal, reservaValorMax, reservaValorMin, reservaQtdCanceladas, reservaQtdDias, reservaQtd);
        if(dw.enviarFato(f)==1){
            //sucesso
        }
        else
        {
            //falha
        }
    }
}
