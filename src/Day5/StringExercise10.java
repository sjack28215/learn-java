package Day5;

public class StringExercise10 {
    String str = new String("jack");
    final char[] ch = {'j','a','v','a'};
    public  void change(String str,char ch[]){
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringExercise10 ex = new StringExercise10();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);
    }

}
