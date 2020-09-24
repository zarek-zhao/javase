package threadsafe;
/*
银行账户

    不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题。
 */

public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public Account() {
    }

    //取款的方法
    public void withdraw(double money){
        //取款之前的余额
        double before = this.getBalance();
        //取款之后的余额
        double after = before - money;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额
        //思考：t1执行到这里了，但还没有来得及执行这代码，t2线程进来withdraw方法了。此时一定出问题。
        this.setBalance(after);
    }

}
