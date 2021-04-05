package chapter4;

public class Passenger {
	private String name;
	private String tel;
	private String seat;
	
	public Passenger(String name, String tel, String seat) {
	this.name = name;
	this.tel = tel;
	this.seat = seat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� = "+name+", ����ó="+tel+", �¼� = "+seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	@Override
	public int hashCode() {
		// String Ŭ������ �����Ǿ��ִ� HashCode�� ���������� Ȱ���ϸ�
		// ���� �����ϰ� �츮���� �ʿ��� �ؽ� �Լ��� ���� �� �ִ�.
		
		// String Ŭ������ hashCode �޼���
		// ���ڿ��� �ؽ�ȭ ��
		int hashCode = name.hashCode() + tel.hashCode() + seat.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Passenger) {
			// �Ű������� ���޹��� ��ü�� Passenger Ŭ���� Ÿ������ ��ȯ�� �� �ִٸ�
			Passenger target = (Passenger) obj;
			
			return this.hashCode() == obj.hashCode();
		}else {
			// �Ű������� ���޹��� ��ü�� Passenger Ŭ���� Ÿ������ ��ȯ�� �� ���ٸ� 
			//false
			return false;
		}
		
	}
	
	
	
	
}
