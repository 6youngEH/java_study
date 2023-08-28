package chap07;

public class WhentoUse {
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드가 필요한 이유

        //2의 2승을 구하기

        System.out.println(getPower(2,2));//2 * 2 = 4

        //3의 3승 구하기


        System.out.println(getPower(3,3));//3 * 3 * 3 = 27
        //4의 2승 구하기
        //이렇게 코드를 짜도 되지만
        //메소드를 사용하면 위에 2승 3승 구하는 코드처럼 간결하게 구할수있음
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);//4 * 4 = 16
    }
}
