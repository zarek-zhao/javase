public class Father {
    public Father(){
        System.out.println("父类无参构造");
    }

    public Father(int i){
        System.out.println("父类的有参构造");
    }

}

class Son extends Father{

    String name;

    public Son(){
        System.out.println("子类的无参构造");
    }

    public Son(String name,int i){
        super(i);
        System.out.println("子类的有参构造");
        this.name = name;
    }
}
