package ch15;

public class TakeTaxiTest {
    public static void main(String[] args) {
        Edward edward = new Edward("Edward", 20000);
        Taxi taxi = new Taxi("잘 나간다 운수");

        edward.takeTaxi(taxi);

        edward.showInfo();
        taxi.showTaxiInfo();
    }
}
