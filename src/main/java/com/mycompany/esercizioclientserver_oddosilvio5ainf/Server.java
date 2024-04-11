/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizioclientserver_oddosilvio5ainf;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SO
 */
public class Server {
    int nPorta;
    ServerSocket serverSocket;
    Socket socket;
    public Server(int nPorta){
        this.nPorta = nPorta;
    }
    
    public Socket attendi(){
        socket = null;
        
        try {
            serverSocket = new ServerSocket(nPorta);
            System.out.println("Fase 1: Il server è in ascolto!");
            socket = serverSocket.accept();
            System.out.println("Fase 2: Il client ha fatto richiesta e la connessione è avvenuta!");
        } catch (BindException ex){
            System.err.println("Porta già in uso!");
        } catch (IOException ex) {
            System.err.println("Errore nella fase di ascolto del server!");
        }
        return socket;
    }
    
    public void scrivi(){}
    
    public void leggi(){}
    
    public void chiudi(){
        try {
            socket.close();
            System.out.println("Chiusura connessione con il client avvenuta");
        } catch (IOException ex) {
            System.err.println("Errore nella chiuisura della connessione con il client");
        }
    }
    
    public void termina(){
        try {
            serverSocket.close();
            System.out.println("L'applicazione è stata chiusa correttamente!");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
