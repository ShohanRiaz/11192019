package newAbstraction;

public interface Car extends Dmv, Tlc{//an interface can extend more than one interface class
	public abstract void start();// curly brace absent means that method is declared, in an interface, method can NOT be implemented
	public void stop();// by default, methods in interface are Abstract so need to write 'abstract'
	}


