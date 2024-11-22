package packA;

class Calc { // 클래스 작성
    public int calculate(int x, int y) { return x + y; }
}
//SmartPhone 클래스는 Calc를 상속받고, 
//PhoneInterface 인터페이스의 추상 메소드 모두 구현

class SmartPhone extends Calc implements PhoneInterface {
 // PhoneInterface의 추상 메소드 구현
 
 public void sendCall() { System.out.println("따르릉따르릉~~"); }

 public void receiveCall() { System.out.println("전화 왔어요."); }

 // 추가로 작성한 메소드
 public void schedule() { System.out.println("일정 관리합니다."); }
}

