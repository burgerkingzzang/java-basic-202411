package chap1_2;

public class DataType {

    //메인 메서드 : 프로그램의 실행 기점
    public static void main(String[] args) {

        int age = 20;   //정수 type
        double pi = 3.14;   //실수 type
        char c = '가';   //문자 1글자
        String greeting = "안뇽??";   //string type
        boolean flag = true;    //논리 type

        //정수 타입 (byte: 1byte, short: 2byte, int: 3byte, long: 4byte)
        byte x1 = 127;  //byte는 1byte == 8bit(8자리 2진수 저장가능) => 01111111 byte는 2의 7제곱이므로 양수 127까지 저장가능
        short x2 = 32767;  //short는 2byte == 16bit => 0 1111111 11111111 short는 2의 15제곱이므로 양수 32767까지 저장가능
        int x3 = 2147483647;
        //10;  //리터럴 : 변수에 저장되기 전 데이터;
        //정수 리터럴의 기본타입은 int
        long x4 = 2147483648L;  //long에는 접미사 L을 붙여줘야함.

        //===== 실수 타입 =====//
        float f1 = 3.14F;    //4byte  - float표현시에는 double과의 구분을 위해 접미사 F사용
        double f2 = 3.14;   //8byte
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        //===== 논리 타입 =====//
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        boolean b4 = (10 + 3) && (9 * 1);

        //===== 문자와 문자열 타입 =====//
        char c1 = 'A';  //2byte
        char c2 = 66;   //66의 아스키코드 대문자B 출력

        //문자열은 문자 하나하나의 배열과 같음 ex) hello ['h', 'e', 'l', 'l', 'o']
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str =" + str);// hello 출력

        String str2 = "안녕하세요!";  //""는 위의 배열변환을 자동으로 해준다.
        System.out.println("str2 =" + str2);  //안녕하세요 출력

        String str3 = """
                        앞뒤로 세개씩 사용하면 백틱``처럼 
                        이런식으로 줄바꾸기가 사용가능한데
                        자바17에서부터 사용가능하므로 웬만하면 사용하지 말것
                      """;

        //동적 타이핑 - 데이터를 입력하면 타입을 추론함.
        var z = 100; //타입 추론
        var h = "dsfdf";
    }
}
