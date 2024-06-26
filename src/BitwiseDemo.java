public class BitwiseDemo {
    public static void main(String [] arg){
        int x = 58; //111010
        int y = 13; //1101
        System.out.println("x & y:" +(x & y)); //return 8 = 1000
        System.out.println("x | y:" +(x | y)); //63 = 111111
        System.out.println("x ^ y:" +(x ^ y)); //55 = 11011
        System.out.println("~x :" +(~x)); //-59
        System.out.println("x << y:" +(x << y));
        System.out.println("x >> y:" +(x >> y));

    }
}
