package chapter4;

public class Ex6 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		
		// 두 인스턴스 이름이 같다
		String p1Name = p1.getName();
		String p2Name = p2.getName();
		
		boolean nameSame = p1Name.equals(p2Name);
		
		// 두 인스턴스 전번이 같다
		String p1Tel = p1.getTel();
		String p2Tel = p2.getTel();
		
		boolean telSame = p1Tel.equals(p2Tel);
		
		// 두 인스턴스 좌석이 같다
		String p1Seat = p1.getSeat();
		String p2Seat = p2.getSeat();
		
		boolean seatSame = p1Seat.equals(p2Seat);
		
		
		// 이름 전번 주소 모두 같다면 true 아니면 false
		if(nameSame && telSame && seatSame) {
			System.out.println("p1과 p2가 같습니다");
		}else {
			System.out.println("p1과 p2가 다릅니다");
		}

	}

}
