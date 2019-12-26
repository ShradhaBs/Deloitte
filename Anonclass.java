package thirdday;
interface ChangePasswords{
	void doChange();
	
}
public class Anonclass {
public static void main(String[] args) {
	ChangePasswords c=new ChangePasswords() {
		public void doChange() {
			System.out.println("Password changed succesfully");
		}
	};
	c.doChange();
}
}
