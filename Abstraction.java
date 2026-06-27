abstract class Abstraction {
    abstract int getInterest();
}

class Kotak extends Abstraction {
    int getInterest() {
        return 7;
    }
}

class Federal extends Abstraction {
    int getInterest() {
        return 8;
    }

    public static void main(String[] args) {
        Abstraction b = new Federal();
        System.out.println(b.getInterest());
    }
}