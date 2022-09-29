public class 运算符 {
    public static void main(String[] args){

        //算术运算符
        int age = 18+1 ;
        //赋值运算符的优先级一般较低
        //自增自减 等同于 age++ 等同于 age=age+1 或者 age+=1；
        //前置自增自减，先运算自增自减然后再运行其他表达式
        //后置自增自减，先运算其他表达式，再自增自减
        System.out.println(age); //19
        age ++;  //19   其他表达式  ，age返回了19  age++执行自增操作就是20了；
        System.out.println(age);    //20
        System.out.println(age++);  //20   先打印20    然后再+1=21
        System.out.println(++age);  //22    先自增21+1=22 打印22

        //逻辑是什么？
        //+运算符 是一种从左到右的结合顺序
        //当我们使用+ 与任何字符串相加  结果就是字符串
        // 1+2--->3    3+hi -->3hi 变为字符串了  3hi+3+4-->3hi34  字符串相加
        //运算符在不同环境【上下文】形成重载【不同的操作】
        //+如果操作两个数，此时+就是算数加
        //如果错做两个个数是字符串 +就是连接字符串
        System.out.println(1+2+"hi"+3+4); //3hi34

        //关系运算符
        //1 关系运算符总为布尔值
        //2 JavaScript不同，java中没有===
        //运算符Java中地址



        //逻辑运算符
        //1 &&与 ||或  ！取反
        //2 短路运算符  将最容易判定的条件放在关系表达式最前面太

        boolean gender = false;
        //true && false ==> false
        //false && {{true} ==>false  {}中的表达式无需运算，这就是短路
        //flase || true ==》true
        //true ||{false】 ==》true  {}中表达式无需运算，这就是短路
        if (age >= 22 &&  gender == true){   // true
            System.out.println("条件为真");
        }

        //三目运算符；
        //只有一个操作数的运算符，叫做一元运算符；  -num
        //有两个操作数，二元运算符    num1+num2
        //有三个操作数，三元运算符    flag= num1 》 num2 ？ num3”是“：”否
        //取代简单的if elsee
        System.out.println(3/2);

        int sum =123;
        System.out.println();

        //选择
        //单分支
        boolean legStatue = true;
        System.out.println("去食堂吃饭");
        if (legStatue == false){
            System.out.println("绕过石头");
        }
        System.out.println("吃到美食");

        //双分支
        String hobby ="甜";
        if (hobby !="甜"){
            System.out.println("喝白开水");
        }else{
            System.out.println("喝可乐");
        }


        //多分枝
        float score =55.5F;//考试分数
        if (score <0 || score>100){
            System.out.println("成绩输入错误");
        }else{
            if (score >=85){
                System.out.println("优秀");
            }else if(score>=75) {
                System.out.println("良好");
            }else if(score>=60) {
                System.out.println("及格");
            }else {
                System.out.println("不及格");
            }



        }
    }
}
