package ch18;

public class Company {

    // 싱글톤 패턴. 인스턴스가 단 한개만 생성. 유일한 인스턴스
    private static Company instance = new Company();

    private Company() {}

    public static Company getInstance() {

        if( instance == null) {
            instance = new Company();
        }
        return instance;

    }
}
