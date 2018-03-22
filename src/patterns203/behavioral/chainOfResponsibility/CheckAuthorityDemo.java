package patterns203.behavioral.chainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CheckAuthorityDemo {
    public static void main(String[] args) throws Exception{
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vp = new VicePresident();
        President president = new President();
        
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);
        
        //enter ctrl+c to kill.
        while (true) {
            System.out.println("Enter the amount to check who should approve your expenditure.");
            System.out.print(">");
            double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            manager.processRequest(new PurchaseRequest(d, "General"));
        }

  }
}
