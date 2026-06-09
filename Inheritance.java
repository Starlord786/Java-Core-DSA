public class Inheritance{
    String name = "shaban";
    int age = 20;

    void display(){
        System.out.println(name + " " + age);
    }
}

class Students extends Inheritance{
    int rollno = 64;


    public static void main(String[] args){
        Students s = new Students();

        System.out.println(s.rollno);

        s.display();
    }
}