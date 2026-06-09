public class Constructor{

    int price;
    String title;

    Constructor() {
        System.out.println("Default Constructor");
    }

    Constructor(int price, String title){
        this.price = price;
        this.title = title;
    }

    void display(){
        System.out.print(title + " " + ":" + " " + price);
    }
    
    public static void main(String[] a){
        Constructor t = new Constructor();
        t.display();
        Constructor c = new Constructor(1500,"Abdul Kalam");
        c.display();
    }
}