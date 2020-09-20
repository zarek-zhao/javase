public class Last {
    public static void main(String[] args) {
        Husband husband = new Husband("001","孙悟空","1998-4-8",null);
        Wife wife = new Wife("002","紫霞仙子","1998-10-5",null);

        husband.setWife(wife);
        wife.setHusband(husband);

        System.out.println(husband.getName() + "丈夫的妻子是" + husband.getWife().getName());
    }
}

class Husband{
    private String idCard;
    private String name;
    private String birthday;
    private Wife wife;

    public Husband(){
        System.out.println("打印出p");
    }

    public String getName() {
        return name;
    }

    public void p(){

    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Husband(String idCard, String name, String birthday, Wife wife){
        this.idCard = idCard;
        this.name = name;
        this.birthday = birthday;
        this.wife = wife;
    }
}

class Wife{
    private String idCard;
    private String name;
    private String birthday;
    private Husband husband;

    public Wife(){

    }

    public String getName() {
        return name;
    }

    public void setHusband(Husband husband){
        this.husband = husband;
    }

    public Wife(String idCard,String name,String birthday,Husband husband){
        this.idCard = idCard;
        this.name = name;
        this.birthday = birthday;
        this.husband = husband;
    }

}
