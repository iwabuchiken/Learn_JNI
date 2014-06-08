package jni.main;

public class HelloJNI {

	static {
      System.loadLibrary("hello"); // Load native library at runtime
                                   // hello.dll (Windows) or libhello.so (Unixes)
   }
	
	private native void sayHello();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new HelloJNI().sayHello();  // invoke the native method
		
		String message = "done";
		message(message,
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		
		
	}

	public static void message(String message, int line) {
		
		String label = "["
				+ Thread.currentThread().getStackTrace()[1].getFileName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ " : "
				+ line
				+ "]";
		System.out.println(label + " " + message);
	}

}
