package Chapter10_Polymorphism.Exercise7_8;

public class Wind extends Instrument {

    void play(Note n) { System.out.println("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}
