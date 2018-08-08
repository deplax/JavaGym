package javastatic;

public class StaticBlock {
    static {
        System.out.println("1.static init");
    }

    {
        System.out.println("2.instance init");
    }

    StaticBlock() {
        System.out.println("3.init");
    }
}
