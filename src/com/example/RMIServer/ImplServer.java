package com.example.RMIServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Creating Remote interface for our application
interface Hello extends Remote {
    void printMsg() throws RemoteException;
}
public class ImplServer implements Hello {

    // Implementing the interface method
    public void printMsg() {
        System.out.println("This is an example RMI program");
    }
}
