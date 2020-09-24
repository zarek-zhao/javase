package bt;

public class Test {
    public static void main(String[] args) {
        BtSys btSys = new BtSys();
        Thread bt1 = new BtServices(btSys);
        Thread bt2 = new BtServices(btSys);

        bt1.setName("bt1");
        bt2.setName("bt2");

        bt1.start();
        bt2.start();

    }
}
