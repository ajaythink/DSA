class ClassAndObject {// inside the public class main method.
    public static void main(String... are) {
        Pen pen1 = new Pen();
        pen1.setColor("Yellow");
        System.out.println(pen1.color);
        pen1.setTip(5);
        System.out.println(pen1.tip);

    }
}

class Pen {// Class is group of entities, Class is blue print of object;
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int math, int english, int science) {
        percentage = (math + english + science) / 3;
    }
}
