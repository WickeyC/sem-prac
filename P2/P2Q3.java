package P2;

interface Machine {
    String move();
}

class Car implements Machine {
    @Override
    public String move() {
        return "roll";
    }
}

class Plane implements Machine {
    @Override
    public String move() {
        return "fly";
    }
}

class Ship implements Machine {
    @Override
    public String move() {
        return "float";
    }
}

class TestMachine {
    Machine m;

    public TestMachine(Machine m) {
        this.m = m;
    }

    public void moveMachine() {
        System.out.println(this.m.move());
    }
}

public class P2Q3 {
    public static void main(String[] args) {
        TestMachine tm = new TestMachine(new Car());
        tm.moveMachine();
        tm = new TestMachine(new Plane());
        tm.moveMachine();
        tm = new TestMachine(new Ship());
        tm.moveMachine();
    }
}
