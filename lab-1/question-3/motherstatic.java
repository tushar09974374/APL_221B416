class Mother {
    static void show() {
        System.out.println("Static Show of Mother");
    }
}

class Child extends Mother {
    void show() {
        System.out.println("Show of Child");
    }
}

class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
    }
}
