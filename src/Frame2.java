import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame2 {

	public static void main(String[] args) {
		//프레임은 시작하는 툴이고, 프레임안에 패널을 여러가지를 넣을 수 있게 해줌. 		
		//프레임은 생성  
		JFrame frame = new JFrame();
		//패널은 숨기고, 보이고, 켜고끄고를 할 수 있다. 프레임과 비슷 하지만 프레임 안에서 여러개 만들어내는 프레임과 같다
		//패널을 생성했다고 자동으로 frame안에 들어가는 것이 아니다.
		JPanel panel = new JPanel();
		//글자를 표시하는 역할
		JLabel label = new JLabel("Some Text");
		//버튼 그리고 버튼안의 문구를 넣어준다.
		JButton btn1 = new JButton("Click me!!");
		//많은 글을 쓸 수 있음.(패널창에 직접글을 쓸 수 있게 해줌)
		//스크롤바를 지원하지 않는다 JScrollPane 객체를 삽입하여 스크롤바 지원
		JTextArea txtArea = new JTextArea();
		//한줄의 문자열을 입력받는 창 숫자는 열의 크기를 나타남
		JTextField txtField = new JTextField(50);
		//한줄의 문자열을 입력받는 창 숫자는 열의 크기를 나타남 abc는 기본적으로 나타나는 문자(placeholder)
		JTextField txtField2 = new JTextField("abc",50);
		
		
		
		
		
		//자기가 원하는 방식대로 버튼같은 것을 위치할 수 있게한다. new BorderLayout() -->패널이나 프레임을 내가 원하는 곳에 둘 수 있다.
		panel.setLayout(new BorderLayout());
		
		
		//패널안에 버튼을 서쪽에 위치시킨다.
		panel.add(btn1,BorderLayout.WEST);		
		//패널안에 레이블을 위치시켜본다 북쪽에 위치시킴
		panel.add(label, BorderLayout.NORTH);
		//패널안에 텍스트에리어를 가운데 위치시켜본다.
		panel.add(txtArea, BorderLayout.CENTER);
		
		panel.add(txtField, BorderLayout.EAST);
		
		//frame 안에 패널을 넣어준다.
		frame.add(panel);
		
		
		//패널이 들어있는지 확인하기위한 예제이다 아래의 문구를 패널에 넣어보았다.
		//panel.add(new JLabel("Welcome this project"));
		
		//프레임사이즈를 true로 하면 사용자가 늘릴수 있자만 false는 고정이다.
		//(마우스포인트가 사이즈 늘리는 표식이 활성화가 되고 안된다.)
		frame.setResizable(false);
		//화면에 창을 보여주게해줌 기본은  false임
		frame.setVisible(true);  
		//화면 사이즈 정해 주는데 new Dimension을 사용해야함 (두개의 값을 입력하는데 외쪽은 가로, 오른쪽은 세로)
		//개인적으로 선호하는 사이즈를 정해주는 것이고 화면이 작아도 최대한 비슷하게 나옴
		frame.setPreferredSize(new Dimension(840,840/12*9));
		//사이즈에 맞게 프레임이 보여짐
		frame.setSize(840, 840/12*9);
		//실행했을시 창이 왼쪽상단에서 출력되는 것을 null값을 입력하면 가운데에서 시작하게해줌
		frame.setLocationRelativeTo(null);
		//창을 껐음에도 계속 실행되고 있는데 창을 끄면 실행되는게 꺼지게끔 프레임설정해줌
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//기본프레임 생성 끝
		
		
	}
}
