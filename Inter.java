interface Test {
    void button();
}

class click implements Test{
    public void button(){
        System.out.println("Button is Clicked!");
    }
}

public class Inter{
    public static void main(String[] a){
        Test bt = new click();
        bt.button();
    }
}