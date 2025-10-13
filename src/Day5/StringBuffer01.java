package Day5;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        StringBuffer的父类是 AbstractBufferBuilder
        StringBuffer的对象可以串行化
        StringBuffer是一个fianl类 不能被继承
        StringBuffer字符内容是存在charvalue中 所以在变化
        不用每次都更换地址 效率高于String

         */
        StringBuffer strb = new StringBuffer("heelo");
    }
}
