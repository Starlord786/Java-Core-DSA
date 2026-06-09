public class Bank {
    void getInterest(){
        System.out.println("Interest By Overall Banks");
    }
}

class SBI extends Bank{
    void getInterest(){
        System.out.println("Interest By SBI");
    }
}

class HDFC extends SBI{
    void getInterest(){
        System.out.println("Interest By HDFC");
    }
    public static void main(String[] a){
        Bank b = new SBI();
        b.getInterest();
    }
}
