public class Test {
    public static void main(String[] args) {
        Musician musician = new Musician();

        Instrument erhu = new Erhu();
        Instrument piano = new Piano();
        Instrument violin = new Violin();

        musician.play(erhu);
        musician.play(piano);
        musician.play(violin);
    }
}
