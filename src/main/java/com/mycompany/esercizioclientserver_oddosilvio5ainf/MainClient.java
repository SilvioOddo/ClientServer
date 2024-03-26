/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercizioclientserver_oddosilvio5ainf;
import java.io.*;
import java.net.*;

/**
 *
 * @author SO
 */
public class MainClient {

    public static void main(String[] args) {
        Client c = new Client("silvio","viola");
        c.connetti("127.0.0.1",2000);
        c.chiudi();
    }
}
