/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercizioclientserver_oddosilvio5ainf;

/**
 *
 * @author SO
 */
public class MainServer {

    public static void main(String[] args) {
        Server mioServer = new Server(2024); //la nPorta può essere un qualsiasi numero
        mioServer.attendi();
        
    }
}
