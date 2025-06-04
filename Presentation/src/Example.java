class Example {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    void show(double d) {
        System.out.println("Double: " + d);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show(10);
        obj.show("Hello");
        obj.show(3.14);
    }
}
