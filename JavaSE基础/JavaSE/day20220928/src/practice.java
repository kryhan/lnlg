public class practice {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
           /* for (int j =1;j<=i;j++){
                if (i*j >9){
                    System.out.println(i + "*" + j + "=" + i*j + "\t");
                }else {
                    System.out.println(i + "*" + j + "=" + i*j + "\t\t");
                }
            }
            System.out.println();
        }*/
            {
                int j = 1;
                while (true) {
                    if (j > i) {
                        break;//倒三角前提
                    }
                    if (i * j > 9) {
                        System.out.print(i + "*" + j + "=" + i * j + "\t");
                    } else {
                        System.out.print(i + "*" + j + "=" + i * j + "\t\t");
                    }
                    j=j+1;

                }
            }
            System.out.println();

        }
 //


    }
}
