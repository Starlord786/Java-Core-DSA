public class Encapsulation {
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
    }

    public String getName(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public static void main(String[] a){
        Encapsulation sc = new Encapsulation();

        sc.setId(5);
        sc.setname("Shaban");

        System.out.print(sc.getId() + " " + ":" + " " + sc.getName());
    }
}
