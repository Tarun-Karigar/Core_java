class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Example1 extends Parent {
    void display() {
        System.out.println("Display from Example (Child)");
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
    }
}
