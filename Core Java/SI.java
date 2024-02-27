package JAVA;

class ParentClass {

    ParentClass() {
        System.out.println("Constructor of Parent");
    }

    void disp() {
        System.out.println("Parent Method");
    }
}

class SI extends ParentClass {
    SI() {
        System.out.println("Constructor of Child");
    }

    void disp() {
        System.out.println("Child Method");

        super.disp();
    }

    public static void main(String args[]) {

        SI obj = new SI();
        obj.disp();
    }
}