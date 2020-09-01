class Demo {
	
	public static void main(String args[]) {
	
	int []abc;

	int []xyz={10,20,30,40,50};
	
	System.out.println(xyz[0]);
	System.out.println(xyz[1]);

	System.out.println("for loop");
	for(int i=2;i<xyz.length;i++) {
		System.out.println(xyz[i]);
	}
	System.out.println("for each loop");
	for(int a:xyz){
		System.out.println(a);
	}
	}
}