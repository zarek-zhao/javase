public class ThisTest01 {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu chinaCooker = new AmericanCooker();

        //创建顾客对象
        Customer customer = new Customer(chinaCooker);

        //顾客点菜
        customer.dianCan();
    }
}



