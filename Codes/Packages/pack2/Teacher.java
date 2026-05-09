package pack2;

public class Teacher{
    String name;

    public Teacher(String name){
        this.name = name;
    }

    public void teach(){
        System.out.println(name + " is Teaching...");
    }
}