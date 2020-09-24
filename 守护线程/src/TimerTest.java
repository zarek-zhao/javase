import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception {
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true)  //以守护线程的方式

        //指定定时任务
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //匿名内部类方式
        Date firstTime = simpleDateFormat.parse("2020-03-14 09:30:00");
        timer.schedule(new TimerTask(){
            @Override
            public void run() {

            }
        },firstTime,1000 * 10);
    }
}

//编写一个定时人物类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        //编写你需要执行的任务就行了
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = simpleDateFormat.format(new Date());
        System.out.println(strTime + ":成功完成了一次数据备份");
    }
}