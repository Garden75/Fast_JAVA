package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�h�� �������� ���ų� ����Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
		
	}

}
