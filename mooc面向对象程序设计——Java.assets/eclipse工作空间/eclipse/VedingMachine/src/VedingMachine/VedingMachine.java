package VedingMachine;

public class VedingMachine {
	//VedingMachine的三个属性/变量
	int price = 80;
	int balance;
	int total;
	//VedingMachine的四个动作
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
		VedingMachine vm = new VedingMachine();//用之前学的怎么制造变量的方式去制造了我们自己写的VedingMachine的对象
		//接下来我们可以做一些动作：
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
