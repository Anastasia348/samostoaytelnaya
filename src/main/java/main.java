import java.io.File;

public class main {
    public static void main(String[] args) {
        File fl = new File("/Users/Student.POLCOL/Desktop/Это.txt");
            if (fl.exists()){
                double baites = fl.length();
                double kilobaites = (baites/ 1024);
                double megbaites = (kilobaites/1024);
                System.out.println("Байт: "+baites);
                System.out.println("Килобайт: "+ kilobaites);
                System.out.println("Мегабайт: "+ megbaites);

            }
            else {
                System.out.println("Ошибка");
            }
    }
}
