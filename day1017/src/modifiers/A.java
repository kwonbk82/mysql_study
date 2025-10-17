package modifiers;

class A {
	public int pub;
	protected int pro;
	int def;
	private int pri;
	
	public void printMembers() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
}
