public class UkrainianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 20;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " ��� ������ - " + Country.UKRAINE + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
        }

}
