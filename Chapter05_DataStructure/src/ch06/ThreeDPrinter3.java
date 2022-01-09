package ch06;

public class ThreeDPrinter3 {
    // 제네릭을 사용하지 않을 때, material을 모두 수용할 수 있는 형태 Object으로 선언
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }
}
