//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // sattheites werte der Tiere
        int satietyCow = 80;
        int satietySheep = 80;
        int satietyChicken = 80;

        
        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                satietyChicken = feed(satietyChicken);
                satietyCow = feed(satietyCow);
                satietySheep = feed(satietySheep);
            }

            if (satietyChicken <= 20 || satietyCow <= 20 || satietySheep <= 20) {
                satietyChicken = feed(satietyChicken);
                satietyCow = feed(satietyCow);
                satietySheep = feed(satietySheep);
                System.out.println("Chicken Hunger: " + satietyChicken + " Cow Hunger: " + satietyCow +  " Sheep Hunger: " + satietySheep);

            } else {
                satietyChicken = getHungrier(satietyChicken);
                satietyCow = getHungrier(satietyCow);
                satietySheep = getHungrier(satietySheep);
                System.out.println("Chicken Hunger: " + satietyChicken + " Cow Hunger: " + satietyCow +  " Sheep Hunger: " + satietySheep);
            }

        }

    }


    // Methode zum reduzieren des Sattheitwertes
    public static int getHungrier(int satiety) {
        return Math.max(0, satiety - 20);
    }

    // Methode zum erhöhen des Sattheitwertes
    public static int feed(int satiety) {
        return Math.min(100, satiety + 30);
    }
}