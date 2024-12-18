package chap1_2;

public class Casting {
    public static void main(String[] args) {

        //타입 캐스팅
        //타입이 다르면 연산이 불가능 js와는다르게 java는 엄격하게 구분됨.

        //묵시적 형 변환 : 작은 데이터를 큰 데이터에 대입하면 자동변환
        byte a = 100;  //1byte
        int b = a;     //4byte
        System.out.println("b = " + b);  //b=10 출력

        //큰 데이터를 작은 공간에 넣을 때는 명시적으로 변환ㄴ을 해야 함.
        int c = 1000;   //4byte
        byte d = (byte)c;     //1byte
        System.out.println("d = " + d);  //d= -24출력

        //결론 : 큰 데이터를 작은공간에 대입하면 데이터 손실 가능성이 있음.

        int k = 50;     //4byte 정수
        double j = k;   //8byte 실수
        System.out.println("j = " + j); //50.0출력

        double m = 5.567;
        int n = (int)m;  //데이터 손실의 가능성 있음
        System.out.println("n = " + n); //n=5출력
        
        //묵시적 형변환 -> upcasting (promotion)
        //명시적 형변환 -> downcasting 
        
        //타입이 다른 연산의 경우 낮출땐 데이터 손실의 위험이 있어서 큰 쪽에 맞춰서 자동 캐스팅
        int v = 100;
        double z = 6.6;  //int로 낮출경우 데이터가 손실됨.
        double result = v + z;

        int result2 = 'A' + 4;  //'A'는 2byte 4는 4byte라서 A를 int로 변환
        System.out.println("result2 = " + result2);  //69출력

        int result3 = 27 / 5;
        System.out.println("result3 = " + result3);  //5출력

        //int보다 작은 데이터의 연산은 모두 강제로 int로 변환됨.
        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 + b2;

        //char + char == int
        int i = 'A' + 'B';
    }
}
