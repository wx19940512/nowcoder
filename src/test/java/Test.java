/**
 * @author weixin
 * @create 2022 -02 -25 -11:37
 **/
public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        String s = "1 + 2i";
        String[] s1 = s.split("\\+|i");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);

        }
    }
}
