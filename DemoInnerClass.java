package thirdday;

class  ChangePassword{
static String password="pass@123";
static class EncryptPassword{
	int passwordLevel=5;
	public void doEncrypt() {
		System.out.println("The password is:"+password);
		
	}
}
}
public class DemoInnerClass{
	public static void main(String[] args) {
		ChangePassword pa=new ChangePassword();
		ChangePassword.EncryptPassword e=new ChangePassword.EncryptPassword();
		e.doEncrypt();
		
	}
}
