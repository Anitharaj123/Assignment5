package org.sysem;
//Single inheritance

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("The Desktop size is: 1920×1080");
	}

	public static void main(String[] args) {
		Desktop size=new Desktop();
		size.computermodel();
		size.desktopSize();
		
		
		
		
	}

}