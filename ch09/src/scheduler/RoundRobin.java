package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
		
	}

}
