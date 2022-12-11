package rulesadstract;
abstract class person{
	abstract void walk();
}

class soluction extends person{
	@Override
	void walk(){
		System.out.println("person is walking");
}
public static void main(String[] args) {
	soluction s=new soluction();
	s.walk();
}
}
