public class Tripleta <I,P,S> {
    private final I i;
    private final P p;
    private final S s;

    public Tripleta(I valor1, P valor2, S valor3) {
        i = valor1;
        p = valor2;
        s = valor3;
    }

    public String toString(){
        return String.format(i + " - " + p + " - " + s);
    }

    
    
}
