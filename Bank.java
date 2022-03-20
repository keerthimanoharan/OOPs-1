package org.college;

public class Bank extends SBI implements PNB,CIBIL{

	public void cibilScore() {
	System.out.println("cibil score is 950");
	}
public void creditScore() {
System.out.println("credit score is 850");
	}
public void minimumBalance() {
		System.out.println("minimum balance is 6000");
		}
@Override
	public void bankBalance() {
		System.out.println("the bank balance is 100000");
		}
@Override
	public void maximumLoanAmount() {
	System.out.println("maximum loan amount is 500000");
		}
public static void main(String[] args) {
	Bank det=new Bank();
	det.bankBalance();
	det.cibilScore();
	det.creditScore();
	det.maximumLoanAmount();
	det.minimumBalance();
	det.ITLoan();
}}
