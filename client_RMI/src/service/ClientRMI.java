package service;

import java.rmi.Naming;

public class ClientRMI {

    public static void main(String[] args) {
        try {
            // Lookup the remote object from the RMI registry
            EBanqueRemote stub = (EBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
            
            // Call remote methods
            System.out.println(stub.conversion(1000));
            System.out.println(stub.GetServeurDate());
            
        } catch (Exception e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}
