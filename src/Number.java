import java.util.Scanner;

public class Number implements InputTerminal, OutputTerminal{
    private float numb;


    @Override
    public float input() {
        Scanner scanner = new Scanner(System.in);
        boolean isFloat = false;
        while (!isFloat) {
            try {
                this.numb = Float.parseFloat(scanner.nextLine());
                isFloat = true;
            }
            catch (Exception e) {
                this.output("Вы ввели не число");
            }
        }
        scanner.close();
        return this.numb;
    }

    @Override
    public void output(String s) {
        System.out.println(s);
    }

    public float getNumb() {
        return this.numb;
    }
}
