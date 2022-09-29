import java.lang.reflect.Type;

public class shuzu {
    public static void main(String[] args) {
        //声明 数组类型  变量名【=初始化列表】
        //数组类型就是数组存储数据的类型
        //int acores[];
        //int[] cnames;//推荐大家使用整数类型的数组，数组名叫cnames
        //静态初始化
        //int[] scores={2,4,6,5,3,1};//声明了一个刘伟长度的数组分别用列表的数据进行初始化
        //动态初始化
        //int[] scores = new  int[6];//6代表数组的长度 int基本类型
        //Integer[] scores = new Integer[6];//比较合理的表示
        //int len =3;
        //String[] names= new String[len];
        //scores[1]=88;
        //System.out.println(scores[0]);
        //System.out.println(scores[1]);
        //System.out.println(scores[6]);
        //System.out.println(scores[-1]);   -1  6  都是越界了

        //System.out.println(names[1]);

        //Integer[] luckNums= new Integer[];
        //luckNums[0] =33;//此时发生了自动包装   33这个int自动转为Integer
        //System.out.println(luckNums[0].floatValue());
        Object[] types =new  Object[5];
        types[0]=12;
        types[1]=3.12;
        types[2]="hi";
        types[3]=false;


    }
}

//3.1 数组未明显初始化的部分会默认使用初始化
//3.2 数组定义是长度可以使用变量
//3.3数组访问是超过定义时的范围则抛出异常
//3.4 数组时引用对象之一，数组存储的数据
//3.5 如果想要数组保存不同类型的数据【不建议】 数组烈性选择需要存放类型的繁华类型【共同祖宗】在Java世界中object是所有类的祖宗

