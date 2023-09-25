class AccessClassDot {
    public static void main(String... aregs) {
        Student stu = new Student();
        stu.setName("Ajay");// with function call value inserting
        System.out.println(stu.name);
        stu.name = "Dimpal";// without function calling value inseting;
        System.out.println(stu.name);
    }
}

class Student {
    String name;

    void setName(String Name) {
        name = Name;
    }
}