/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import cliente.Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alexcoelho
 */
public class Implementacao extends UnicastRemoteObject implements Interface {

    private static final long serialVersionUID = 1L;

    protected Implementacao() throws RemoteException {
        super();
    }

    @Override
    public String hello(String name) throws RemoteException {
        return "Ola, " + name;
    }

}
