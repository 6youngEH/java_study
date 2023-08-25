package chap07;

public class parameter {
    public static void power(int number){ // parameter ,매개변수
        //전달값이 있는 메소드
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;

        }
        System.out.println(number + "의"+exponent+ "승은"+result );
    }
    public static void main(String[] args) {
        //전달값.parameter
        //2 -> 2 * 2 = 4
        //3 -> 3 * 3 = 9

        //Argument ,인수
        power(2); //2 * 2 = 4
        power(3); //3 * 3 = 9

        powerByExp(2,3);//2*2*2=8
        powerByExp(3,3);//3*3*3=27
        powerByExp(10,0);
    }
}
