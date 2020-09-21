public class MultiThreadingTest01 {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();

        while(true){
            System.out.println("陈垃建");
        }
    }
}

class ThreadOne extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("狗东西陈帅");
        }
    }
}


class  ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println("笨比陈帅");
    }
}