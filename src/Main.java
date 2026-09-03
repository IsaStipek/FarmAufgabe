//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int satietyCow = 80;
        int satietySheep = 80;
        int satietyChicken = 80;


    }

    public static int getHungrier(int satiety) {
        return Math.max(0, satiety - 20);
    }

    public static int feed(int satiety) {
        return Math.min(100, satiety + 30);
    }
}