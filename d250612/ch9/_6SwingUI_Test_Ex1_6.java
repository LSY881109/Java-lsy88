package d250612.ch9;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _6SwingUI_Test_Ex1_6 {
    public static void main(String[] args) {
        // 이름 입력이라는 라벨, 텍스트 필트(JTextField)
        JFrame frame = new JFrame("이름 입력 필드 예시");
        // 패널 추가
        JPanel jPanel = new JPanel();
        // 라벨 추가
        JLabel jLabel = new JLabel("이름 입력");
        // 텍스트 필드
        JTextField jTextField = new JTextField(10);
        // 패널에 라벨, 텍스트 필드 추가
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        // 패널 - 프레임 붙이기
        frame.add(jPanel);
        // 창 크기, 창 닫기시 종료, 창 보이기 , 1세트
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
