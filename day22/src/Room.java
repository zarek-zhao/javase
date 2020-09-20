import java.util.Objects;

public class Room {
    //房间编号
    private int no;
    //房间类型
    private String type;
    //房间是否入住
    private boolean status;


    public Room(){

    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "no=" + no +
                ", type='" + type + '\'' +
                ", status=" + (status == true ? "未入住" : "已入住") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no &&
                status == room.status &&
                Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if(status == this.status)return;
        this.status = status;
//        System.out.println("我被修改了");
    }
}
