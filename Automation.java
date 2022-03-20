package org.department;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public void Selenium() {
		System.out.println("Automation in Selenium");
		}
public void JAVA() {
	System.out.println("JAVA is a programming language");	
		}
@Override
	public void ruby() {
		System.out.println("ruby is also a programming language");
		}
public static void main(String[] args) {
	Automation read=new Automation();
	read.JAVA();
	read.python();
	read.ruby();
	read.Selenium();
	}}
