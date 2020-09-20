import java.util.Arrays;

public class Hotel {
    /**
     * 二维数组，模拟大厦的所有的房间
     */
    private Room[][] rooms;

    public Hotel(){
        rooms = new Room[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j < 10;j++){
                if(i == 0){
                    rooms[i][j] = new Room(100+j,"普通套房",true);
                }else if(i == 1){
                    rooms[i][j] = new Room(200+j,"豪华套房",true);
                }else{
                    rooms[i][j] = new Room(300+j,"总统套房",true);
                }

            }
        }
    }

    /**
     * 打印所有房间的状态
     */
    public void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j < 10;j++){
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }

    public void order(int roomNo){
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0;j < 10;j++){
//                if(rooms[i][j].getNo() == roomNo){
//                    rooms[i][j].setStatus(false);
//                }
//            }
//        }
        rooms[(roomNo / 100) - 1][roomNo % 100].setStatus(false);

    }

    public void exit(int roomNo){
        rooms[(roomNo / 100) - 1][roomNo % 100].setStatus(true);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append("第"+(i+1)+"层");
            for (int j = 0;j < 10;j++){
                sb.append(rooms[i][j]);
            }
            sb.append("\n");

        }

        return sb.toString();
    }
}
