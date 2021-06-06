public class Practice_1129 {
    public static void main1(String[] args) {

    }
}

class Container {
    int w;
    int d;

    int wBox;
    int dBox;


}


class RightTriangle {
    float base;
    float height;

    RightTriangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    float getArea() {
        Circle b1 = new Circle(0);
        float a = b1.mul(base, height);
        float b = b1.div(a, 2);
        return b;
    }
}


class Circle {

    float r;
    float pi = 3.14f;

    Circle(float r) {
        this.r = r;
    }

    float add(float a, float b) {
        return a + b;
    }

    float mul(float a, float b) {
        return a * b;
    }

    float div(float a, float b) {
        return a / b;
    }

    float getArea() {
        float d = mul(r, r);
        float x = mul(pi, d);
        return x;
    }

    float getCircum() {
        float a = mul(2, pi);
        float b = mul(a, r);
        return b;
    }
}

class Calculator1 {

    //     O
    //    OO
    //   OOO

    float r;

    Calculator1(float r) {
        this.r = r;
    }

    float getTotalArea() {
        Circle a1 = new Circle(r);
        float y = a1.mul(a1.getArea(), 6);
        return y;
    }

}



