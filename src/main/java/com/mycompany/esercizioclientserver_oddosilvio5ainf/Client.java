/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.esercizioclientserver_oddosilvio5ainf;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SO
 */
public class Client {
    String nomeDefault;
    String coloreDefault;
    Socket s;
    
    public Client(String nomeDefault,  String coloreDefault){
        this.nomeDefault=nomeDefault;
        this.coloreDefault=coloreDefault;
    }
    
    public void connetti(String nomeServer, int nPorta){
        try{
            s = new Socket(nomeServer,nPorta);
            System.out.println("il client ha richiesto una connessione");
        }catch(UnknownHostException ue){
            System.err.println("errore DNS");
        }catch (IOException ex) {
            System.err.println("errore nella comunicazione");
        }
    }        
    public void scrivi(){
    
    }
    
    public void leggi(){
        
    }
    
    public void chiudi(){
        try {
            s.close();
            System.out.println("il client ha chiuso la comunicazione con il server");
        } catch (IOException ex) {
            System.err.println("errore nella fase di chiusra delal connessione");
        }
    }   
}
