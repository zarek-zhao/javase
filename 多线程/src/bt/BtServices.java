package bt;

public class BtServices extends Thread {

    private BtSys btSys = new BtSys();

    public BtServices(BtSys btSys) {
        this.btSys = btSys;
    }

    public BtSys getBtSys() {
        return btSys;
    }

    public void setBtSys(BtSys btSys) {
        this.btSys = btSys;
    }

    @Override
    public void run () {
        synchronized (btSys){
            for (int i = 0; i < 10; i++) {
                btSys.Buyticket();
                System.out.println(Thread.currentThread().getName() + "购票成功，还剩余" + btSys.getTickets() + "张票");
            }
        }
    }
}
