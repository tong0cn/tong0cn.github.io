package VedingMachine;

public class VedingMachine {
	//VedingMachine����������/����
	int price = 80;
	int balance;
	int total;
	//VedingMachine���ĸ�����
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		balance = balance + amount;
	}
	
	void showBalance()
	{
		System.out.println(this.balance);
	}
	
	void getFood()
	{
		if ( balance >= price) {
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price;
		}
	}
	public static void main(String[] args) {
		VedingMachine vm = new VedingMachine();//��֮ǰѧ����ô��������ķ�ʽȥ�����������Լ�д��VedingMachine�Ķ���
		//���������ǿ�����һЩ������
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VedingMachine vm1 = new VedingMachine();
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
	}

}
