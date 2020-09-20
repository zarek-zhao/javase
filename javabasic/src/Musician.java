public class Musician {

    Instrument i = new Instrument();

    public Musician(){

    }

    public Musician(Instrument i){
        this.i = i;
    }

    public void play(Instrument i){
        i.makeSound();
    }
}
