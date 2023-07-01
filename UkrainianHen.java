public class UkrainianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 20;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " ћо€ страна - " + Country.UKRAINE + ". я несу " + getCountOfEggsPerMonth() + " €иц в мес€ц.";
        }

}
