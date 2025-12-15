package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImpl extends UnicastRemoteObject implements EBanqueRemote {

    private static final long serialVersionUID = 1L; // added to remove warning

    protected BanqueServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double montant) throws RemoteException {
        return montant * 3;
    }

    @Override
    public Date GetServeurDate() throws RemoteException {
        return new Date();
    }
}
