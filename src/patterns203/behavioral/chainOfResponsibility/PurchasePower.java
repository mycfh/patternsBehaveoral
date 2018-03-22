package patterns203.behavioral.chainOfResponsibility;

abstract class PurchasePower {
    protected final double base = 500;
    protected PurchasePower successor;

    public void setSuccessor(PurchasePower successor){
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}
