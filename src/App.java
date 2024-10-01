public class App {
    public static void main(String[] args) throws Exception {
        Tripleta <Integer, String, String> tripleta1 = new Tripleta<Integer,String,String>(1, "Cálculo", "Cómputo, cuenta o investigación que se hace de algo por medio de operaciones matemáticas.");
        System.out.println(tripleta1);

        Tripleta <String, String, String> tripleta2 = new Tripleta<String, String, String> ("Real Madrid", "Barcelona", "3-3");
        System.out.println(tripleta2);

        Tripleta<String, String, Integer> tripleta3 = new Tripleta<String, String, Integer> ("Temperatura", "Grados centígrados",18);
        System.out.println(tripleta3);
    }
}
