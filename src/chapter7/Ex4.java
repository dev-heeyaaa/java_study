package chapter7;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			//프로그램을 잠시 멈출 수 있음
			// 매개변수로 전달하는 밀리초 단위의 시간만크 ㅁ멈춤
			try {
				Thread.sleep(1000);// 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
