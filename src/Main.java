public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день!");
        int ticketPrice = 1000;
        int bonusMile = 20;
        int bonusMiles = ticketPrice / bonusMile;
        System.out.println("Количество начисленных миль за купленный билет " + bonusMiles + ".");
    }
}