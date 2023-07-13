package P2;

class TestMachine {
    Machine m;

    public TestMachine(Machine m) {
        this.m = m;
    }

    public void moveMachine() {
        switch (this.m) {
            case car:
                System.out.println("roll");
                break;

            case plane:
                System.out.println("fly");
                break;

            case ship:
                System.out.println("float");
                break;
        }
    }
}

// Hint: use polymorphism
