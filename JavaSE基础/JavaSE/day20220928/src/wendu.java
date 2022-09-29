public class wendu {
    public  static void main(String[] args){
        //华氏温度和摄氏温度互相转换，从华氏度变成摄氏度 你只要减去32，乘以5再除以9就行了，
        // 将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
        double sC =23;
        double hF =112;

        System.out.println("摄氏度："+ sC +"转化为华氏温度为：" +(sC*9/5+32) );
        System.out.println("华氏温度："+ sC +"转化为摄氏度为：" +((hF-32)*5/9) );
    }

}
