
public class MyClass {
	MyClass(){
		
	}
	
	void method1() {
		Remocon rc = new Television();
		rc.setVolume(3);
	}
	void method2(Remocon rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
