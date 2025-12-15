package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

    public static void main(String[] args) {
        // Auto-generated method stub
        try {
            LocateRegistry.createRegistry(1099);
            BanqueServiceImpl objDistant = new BanqueServiceImpl();
            System.out.println(objDistant.toString());
            Naming.rebind("rmi://localhost:1099/BK", objDistant);
        } catch (Exception e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}
