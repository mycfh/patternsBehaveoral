package patterns203.behavioral.chainOfResponsibility;

class VicePresident extends PurchasePower {
    private final double ALLOWABLE = 40 * base;

    public void processRequest(PurchaseRequest request) {
        if( request.getAmount() < ALLOWABLE ){
            System.out.println("Vice President will approve $" + request.getAmount());
        }else if( successor != null ){
            successor.processRequest(request);
            
        }
  }
}
