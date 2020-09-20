public class PrivateFuction {

    public static void main(String[] args){
        PrivateFuction p = new T();
        p.todo();
    }

    private void todo(){
        System.out.println("父类的方法");
    }
}

class T extends PrivateFuction{
    private void todo(){
        System.out.println("子类的方法");
    }
}


