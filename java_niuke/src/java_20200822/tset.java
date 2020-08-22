package java_20200822;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName tset
 * @Description
 * @Author by小房
 * @Date 2020/8/22 19:29
 */



    class A{
        public String show(D obj) {
            return ("1");
        }
        public String show(A obj) {
            return ("2");
        }
    }
    class B extends A{
        public String show(B obj) {
            return ("3");
        }
        public String show(A obj) {
            return ("4");
        }
    }
    class C extends B {}
    class D extends B {}

    public class tset {
        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new B();
            B b = new B();
            C c = new C();
            D d = new D();
            System.out.println(a1.show(b) + "," + a2.show(c) + "," + b.show(d));
        }

}

