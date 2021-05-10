package JavaStudy;
import java.util.Scanner;
					  //상속
	public class Bear extends GameObject {
		private Scanner scanner;
		public Bear(int x, int y, int distance) { //생성자
			super(x, y, distance); // 매개변수 없을 때 super생략가능
			scanner = new Scanner(System.in);
		}
		
		@Override
		public void move() {
			System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
			char c;				   // 0: 인덱스 위치
			c = scanner.next().charAt(0); // String class의 메소드 (index에 있는 것을 문자로 반환하라), 띄어쓰기 전까지 문자 다 받음
			switch(c) {
				case 'a' : // left
					x--; // 맵 밖으로 나간 경우
					if(x < 0) x = 0;
					break;
				case 'd' : // right
					x++; 
					if(x >= Game.MAX_X) x = Game.MAX_X - 1;
					break;
				case 'w' : // up
					if(y < 0) y = 0;
					break;
				case 's' : // down
					y++; 
					if(y >= Game.MAX_Y) y = Game.MAX_Y - 1;
					break;
			}		
		}
		
		@Override
		public char getShape() { // Bear의 모양 리턴
			return 'B';
		}
	}

