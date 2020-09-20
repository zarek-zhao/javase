public class Instrument {
    public void makeSound(){

    }
}


class Erhu extends  Instrument{
    public void makeSound(){
        System.out.println("演奏二胡");
    }
}

class Piano extends  Instrument{
    public void makeSound(){
        System.out.println("演奏钢琴");
    }
}

class Violin extends  Instrument{
    public void makeSound(){
        System.out.println("演奏小提琴");
    }
}