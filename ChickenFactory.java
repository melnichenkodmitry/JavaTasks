/*
Куриная фабрика
*/

public class ChickenFactory {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            }
            if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            }
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            }
            return hen;
        }
    }
}
