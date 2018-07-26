package chap05;

/**
 * 비트 연산
 * - NOT(반대값으로 변환), OR(1이 하나라도 있으면 1로 변환), XOR(값이 0이나 1로 같으면 0, 다르면 1로 변환), AND(모두에 1이 있을 떄만 1로 변환, 나머지 경우에는 0으로 변환)
 * - 2의 보수 표현 : NOT으로 숫자를 뒤집고, 1을 더함
 * - 산술 우측 shift(>>)  : 최상위 비트에 1을 반복적으로 넣고 오른쪽으로 shift - 결국엔 1이 됨
 * - 논리 우측 shift(>>>) : 2로 나눈 결과와 같음, 논리우측shift : 한 자리씩 오른쪽으로 옮긴 다음에 최상위 비트에 0을 넣음 - 결국엔 0이 됨
 *
 * //todo Main 메소드 제거하고 test case 작성
 *
 * Created by sungyeon on 2018. 7. 26..
 */
public class BitExample {
    public static void main(String[] args) {
        BitExample bit = new BitExample();
        int arithmeticShift = bit.repeatedArithmeticShift(-93242, 40);
        int logicalShift = bit.repeatedLogicalShift(-93242, 40);

        System.out.println("#산술 시프트 결과 : " + arithmeticShift);
        System.out.println("#논리 시프트 결과 : " + logicalShift);
    }

    /* 산술 시프트 : 모든 값이 1으로 채워지기 때문에 결국에는 -1 */
    int repeatedArithmeticShift(int x, int count) {
        // shift 연산
        for (int i = 0; i < count; i++) {
            x >>= 1; // 1만큼 산술 시프트
        }
        return x;
    }

    /* 논리 시프트 : 모든 값이 0으로 채워지기 때문에 결국에는 0  */
    int repeatedLogicalShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>>= 1;   //1만큼 논리 시프트
        }
        return x;
    }

}
