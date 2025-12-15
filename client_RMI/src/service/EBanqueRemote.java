package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface EBanqueRemote extends Remote {

    public double conversion(double montant) throws RemoteException;

    public Date GetServeurDate() throws RemoteException;
}
