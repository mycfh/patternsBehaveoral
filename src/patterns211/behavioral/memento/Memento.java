package patterns211.behavioral.memento;

class Memento {
    int num;
    Memento(int c) {
       num = c;
    }
    int getNum() {
       return num;
    }
}
