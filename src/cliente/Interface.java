/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alexcoelho
 */
public interface Interface extends Remote {

    public float soma(float n1, float n2) throws RemoteException;
    
    public float subtracao(float n1, float n2) throws RemoteException;
    
    public float divisao(float n1, float n2) throws RemoteException;
    
    public float multiplicacao(float n1, float n2) throws RemoteException;
}
