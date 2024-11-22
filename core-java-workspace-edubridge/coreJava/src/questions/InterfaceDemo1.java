package questions;
interface Playable{
	void play();
}
class Guitar implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Guitar");
		
	}
	
}
class Piano implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Piano");
		
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable guitar1=new Guitar();
		Playable piano1=new Piano();
		guitar1.play();
		piano1.play();

	}

}
