package junitproject;

public class Calculator {
	public int add(int i, int j) {
		return i+j;
	}
	public int sub(int i, int j) {
		return i-j;
	}
	public int mul(int i, int j) {
		return i*j;
	}
	public boolean validation(String userName,String password) {
		if(userName.equals("admin") && password.equals("admin")) {
			return true;
		}
		else {
			return false;
		}
	}
}
