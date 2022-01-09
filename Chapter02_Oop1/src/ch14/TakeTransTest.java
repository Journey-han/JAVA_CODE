package ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentC = new Student("Compose", 5000);
        Student studentE = new Student("Ediya", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        studentC.takeBus(bus100);
        studentE.takeSubway(subwayGreen);

        studentC.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}
