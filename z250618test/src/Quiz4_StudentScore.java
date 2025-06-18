public class Quiz4_StudentScore {
    // public 어디서든 접근 가능
    // class: 클래스를 정의할 때 사용하는 키워드.
    // 즉, 이 줄은 “이름이 Quiz4_StudentScore인 클래스를 정의
    public static void main(String[] args) {
        int[][] scores = {
                // int[][] scores: 2차원 배열 선언, 각 학생의 과목별 점수를 저장할 배열
                // 행(row)은 학생 (총 5명)
                // 열(column)은 과목 (국어, 영어, 수학)
                { 80, 60, 70 },
                { 90, 95, 80 },
                { 75, 80, 100 },
                { 80, 70, 95 },
                { 100, 65, 80 }
        };

        System.out.println("학생번호   국어   영어   수학    총점    평균");
        System.out.println("=============================================");

        for (int i = 0; i < scores.length; i++) { // 바깥 반복문 각 학생 반복
            // nt i = 0: 학생 인덱스 시작 (0번부터)
            // i < scores.length: 학생 수만큼 반복 (5명이므로 0~4)
            // i++: i를 1씩 증가
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                // 변수 j를 0부터 시작해서,
                // j가 i번째 학생 점수 배열 길이(3)보다 작을 동안 반복,
                // 반복할 때마다 j를 1씩 증가시키며,
                // i번째 학생의 각 과목 점수에 순서대로 접근하라는 뜻
                total += scores[i][j];
            }
            double avg = total / 3.0;

            System.out.printf("%d번 학생:   %3d   %3d   %3d   %4d   %5.1f\n",
                    // %d 정수를 출력할 때 쓰는 서식 지정자
                    // 예를 들어 %d는 숫자 5를 출력하면 그냥 5라고 보여줌
                    // %3d 정수를 출력하는데, 출력 공간을 최소 3칸 확보해서 오른쪽 정렬

                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    total,
                    avg);
        }
    }
}
