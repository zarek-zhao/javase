import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房.[3]表示退房.[0]表示退出系统");
        Scanner sc = new Scanner(System.in);




        boolean flag = true;
        while (flag){
            System.out.println("请输入功能编号:");
            int i = sc.nextInt();
            if(i == 1){
                hotel.print();
            }else if(i == 2){
                System.out.println("请输入订房编号：");
                int roomNo = sc.nextInt();
                hotel.order(roomNo);
                System.out.println("订房成功！！！");
            }else if(i == 3){
                System.out.println("请输入退房房编号：");
                int roomNo = sc.nextInt();
                hotel.exit(roomNo);
                System.out.println("退房成功！！！");
            }else if(i == 0){
                System.out.println("再见，欢迎下次再来");
                flag = false;
            }else{
                System.out.println("系统出错，请稍后");
            }

        }
    }



}
