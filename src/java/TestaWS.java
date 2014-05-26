
import org.hibernate.Session;
import org.hibernate.Transaction;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestaWS {
    public static void main(String[] args){
        System.out.println("Início da conexão e manipulação...");
        Session sessao = HibernateUtilWS.getSession();
        Transaction transaction = sessao.beginTransaction();
        
        
        transaction.commit();
        sessao.close();
        System.out.println("Término da conexão e manipulação...");
    }
}
