package org.example;


// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main {
    public static void main(String[] args) {
        // 예시 시작
        int c = 20 + Math.solution(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.solution(3);

        System.out.println("결과1 : " + 결과1);// 출력 : 결과1 : 6

        int 결과2= Math.solution(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55

    }
}

class Math {

    int solution(int num1, int num2) {
      double a = ((double)num1/(double)num2)*1000;



        return (int)a;
    }
    }





