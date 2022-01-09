package ch06;

public class GenericPrinter<T> {

    private T material;     // T 자료형으로 선언한 변수

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {       // T 자료형을 반환하는 제네릭 메서드
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
