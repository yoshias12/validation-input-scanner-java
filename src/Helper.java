import java.util.Scanner;

public class Helper {
    private Scanner scanner = new Scanner(System.in);

    public String print() {
        String input = scanner.nextLine();
        if (input.isEmpty() || input.isBlank()) {
//            System.out.println("Input tidak boleh kosong...");
            System.out.printf("%s : ", input);
            return print();
        } else {
            return input;
        }
    }

    public Integer inputInt(String string) {
        try {
            System.out.printf("%s : ", string);
            Integer number = Integer.parseInt(scanner.nextLine());
            if (number < 0){
                System.out.println("Input tidak boleh kosong dan tidak boleh kurang dari 0...");
                return inputInt(string);
            }
                return number;
        } catch (NumberFormatException e) {
            System.out.println("Input harus angka....");
            return inputInt(string);
        }
    }

    public String inputString(String inputan) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%s ", inputan);
            String input = scanner.nextLine();

            if (input.isBlank() || input.isEmpty()) {
                System.out.println("Input tidak boleh kosong...");
                continue;
            } else if(input.matches("-?\\d+") || input.matches("-{2,}\\d+")){
                System.out.println("Input tidak boleh berupa angka...");
                continue;
            } else if (input.length() < 3 || input.length() > 5) {
                System.out.println("Input min 3 dan maks 5...");
                continue;
            }
            return input;
        }
    }


}
