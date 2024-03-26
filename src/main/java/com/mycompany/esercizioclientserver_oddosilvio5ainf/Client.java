/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizioclientserver_oddosilvio5ainf;
import java.io.*;
import java.net.*;

/**
 *
 * @author SO
 */
public class Client {
    String nomeServer = "nomeServer";
    int nPorta = 2024;
    DataInputStream in;
    DataOutputStream out;
    
    protected Socket connetti () throws IOException {
        Socket socket = new Socket(nomeServer, nPorta);
        
        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());
        
        return socket;
    }

    public void scrivi() {
    }

    public void leggi() {
    }

    public void chiudi(){
    } 
}
