package chap1_2;

public class varScope {
    public static void main(String[] args) {
        //java는 변수가 선언된 블록({})에서 태어나고 블록이 끝나는 지점에서 소멸한다.
        int x1 = 10;
        if (true) {
            int x2 = 20;  //블록안의 x2는 블록밖에서 유효하지 않음
        }

        System.out.println("x1 = " + x1);
        //System.out.println("x2 = " + x2);

        for (int i = 0; i < 3; i++) {
            
        }
        //.out.println("i = " + i);
    }
}
