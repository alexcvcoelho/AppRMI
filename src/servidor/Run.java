/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author alexcoelho
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Implementacao impl = new Implementacao();
        Naming.rebind("//localhost/rmi", impl);
        System.out.println("Server running...");
    }
    
}
