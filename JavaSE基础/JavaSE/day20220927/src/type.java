public class type {
    public static  void main(String[] args){
        //byte为例：1个字节，-128到127
        char sex = 'F';
        //char类型表示一个字符，character，占两个字符
        // 字符类型使用单引号
        boolean gender = false;
        //布尔型  True或False 占1字节
        byte b1 =(byte) 128;
        //byte占一个字节，1111111（-128）~01111111（127）
        //默认int  强转byte
        System.out.println(b1);
        short s1 = (short)32768;
        //short 占2哥字节    32768报错  直接强转
        System.out.println(s1);
        int i1 = 2 >> 31;
        System.out.println(i1);
        //int占4个字符，
        long l1 =(1<<83);
        System.out.println(l1);
        //long占8个字符，如果数值字面量
        float f1=3.14F;
        System.out.println(f1);
        //float占4个字符
        double d1=3.14;
        System.out.println(d1);
        //double 占8个字符


        byte a;
        int b;

        int i = (int)2.8;
        float f = (float)5.2;
    }
}
