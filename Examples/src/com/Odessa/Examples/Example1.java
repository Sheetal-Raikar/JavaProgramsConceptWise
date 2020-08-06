package com.Odessa.Examples;

public class Example1 {

	public static void main(String[] args) {
App app = new App(123,1000);

System.out.println(app.getAmount());
app.setAmount(1000);
System.out.println(app.getAmount());
	}

}

class App
{
	private int PIN=123;
	private int amount=500;

	 App(int PIN,int amount)
	{
		this.PIN=PIN;
		this.amount=amount;
	}
//	public int getPIN() {
//		return PIN;
//	}
//	public void setPIN(int pIN) {
//		PIN = pIN;
//	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount =this.amount+ amount;
	}
	
	
}
