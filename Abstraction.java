abstract class Abstraction {
    abstract int getInterest();
}

class SBI extends Abstraction {
    int getInterest() {
        return 7;
    }
}

class HDFC extends Abstraction {
    int getInterest() {
        return 8;
    }

    public static void main(String[] args) {
        Abstraction b = new HDFC();
        System.out.println(b.getInterest());
    }
}