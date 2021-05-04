package JavaStudy;
 

public abstract class GameObject { // 추상 클래스 -- bear랑 fish가 상속받을 것임
	protected int distance; // 한 번 이동 거리
	protected int x, y; // 현재 위치(화면 맵 상의 위치)
	
	public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정
		this.x = startX; this.y = startY; // game은 이것을 상속x
		this.distance = distance;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했으면 true 리턴 -- 다향성의 일종
		if(this.x == p.getX() && this.y == p.getY()) //bear와 fish위치가 같으면 먹히는..
			return true;
		else 
			return false;
	}
	
	//bear와 fish가 이동방식이 다르기 때문에 추상화
	protected abstract void move(); // 이동한 후의 새로운 위치로 x, y 변경 / 상속받은 애한테 가서 구현부 작성 (fish,bear)
	protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}