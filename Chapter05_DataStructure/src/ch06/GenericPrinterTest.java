package ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Plastic plastic = new Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);

        // Object로 재료를 가져올때는 형 변환이 필요했는데, 여기선 필요 없다.
        // 이유: GenericPrinter<Powder>로 선언했기 때문에 GenericPrinter의 T들이 전부 Powder로 바뀐다. 형변환 필요없이 사용 가능.
        // T의 자료형이 Powder라고 컴파일러가 자동으로 replace해주기 때문.
        Powder pd = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

        Plastic pc = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter.toString());

        // <자료형>을 안쓰고 이렇게도 사용가능. 사용할 때는 Object로 형 변환해서 사용해야한다.
        // GenericPrinter powderPrinter = new GenericPrinter<>();
        // Powder p = (Object)powderPrinter.getMaterial();
    }
}
