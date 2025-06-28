package java0201;
//实现泛型接口
public class Generic010302 implements Generic010301<String> {
    @Override
    public void process(String item) {
        System.out.println("字符串: " + item);
    }
}