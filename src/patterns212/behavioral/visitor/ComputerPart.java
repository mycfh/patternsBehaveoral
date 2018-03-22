package patterns212.behavioral.visitor;
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}