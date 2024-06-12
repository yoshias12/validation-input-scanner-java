import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Helper helper = new Helper();
    public void menu(){
//        String name = helper.inputString("Masukkan nama anda : ");
//        System.out.println("Nama : " + name);

        Integer umur = helper.inputInt("Masukkan umur anda");
        System.out.println("Umur : " + umur);
    }

}
