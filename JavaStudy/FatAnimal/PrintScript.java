package JavaStudy;

public class PrintScript {
	public String start = "동물 친구 살찌우기 게임\n\n\n게임규칙\n 1. 동물 친구를 10kg을 찌우면  성공~!\n 2. 밥을 3번 먹으면 꼭 취미활동을 1번 해야해~!\n 3. 안 그럼 화낸당!!\n\n\n 함께할 동물 친구를 골라볼래? (한 마리만 가능)\n\n\n";
		
	
	
	public String hello(String name) {
		return String.format("안녕? 난 %s이야! 만나서 반가워 ! 나에게 무엇을 해줄거야?\n 1. 밥\n 2. 잠\n 3.똥\n 4.취미활동",name);
	}
}