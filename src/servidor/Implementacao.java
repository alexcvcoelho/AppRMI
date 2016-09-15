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
    public float soma(float n1, float n2) throws RemoteException {
        return n1 + n2;
    }

    @Override
    public float subtracao(float n1, float n2) throws RemoteException {
        return n1 - n2;
    }

    @Override
    public float divisao(float n1, float n2) throws RemoteException {
        return n1 / n2;
    }

    @Override
    public float multiplicacao(float n1, float n2) throws RemoteException {
        return n1 * n2;
    }
}
