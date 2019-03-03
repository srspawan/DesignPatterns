package com.hs.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	// private static volatile Singleton instance=null; // for double checking
	private static volatile Singleton instance = null;

	/*
	 * private Singleton(){
	 * 
	 * }
	 */

	// its good for single threaded enviornament not for multithreaded
	// enviornament
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// for double check
	public static Singleton getInstanceByDoubleCheck() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	// when we do reflection then it calls internally default constructor.
	// but above we have already declared default constructor for making
	// singleton for above two types.
	// and we cant put same signature for more than one method so we need to
	// comment first constructor here
	// to restrict the reflection we need modify constructor like this
	/*
	 * private Singleton(){ if(instance !=null){ throw new
	 * RuntimeException("you cant create the object of this "+instance); } }
	 */

	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	static class Holder {
		static final Singleton instance7 = new Singleton();
	}

	public static Singleton getInstanceByInnerClass() {
		return Holder.instance7;
	}

	// whenever deserialization happens it calls this method and it returns the
	// same object
	// so we can get the overriding this method and return the same object.
	// if we dont override this method then at the time of deserialization jvm
	// will call default readResolve() method and
	// it will create a new instance every time
	public Object readResolve() {
		return instance;
	}

	/*
	 * protected Object clone() throws CloneNotSupportedException{ //throw new
	 * CloneNotSupportedException(); return instance; }
	 */

	/*
	
	
	
	*/
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		// through double checking
		Singleton instance3 = Singleton.getInstanceByDoubleCheck();

		// through reflection
		// here it creates the different object
		Singleton instance4 = null;
		try {
			Class clazz = Class.forName("com.cisco.designpattern.singleton.Singleton");
			Constructor<Singleton> constructor = clazz.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			instance4 = constructor.newInstance(); // we cant do as
													// clazz.newInstace();///it
													// gives erorr we cant
													// access private member
		} catch (Exception e) {
			e.printStackTrace();
		}

		// through cloning
		Singleton instance5 = null;
		try {
			instance5 = (Singleton) instance1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// through serialization
		Singleton instance6 = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("test.ser");
			ObjectOutputStream oop = new ObjectOutputStream(fileOutputStream);
			oop.writeObject(instance1);

			ObjectInputStream oip = new ObjectInputStream(new FileInputStream("test.ser"));
			// here it creates the new object every time.
			instance6 = (Singleton) oip.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// through static inner class
		Singleton instance7 = Singleton.getInstanceByInnerClass();

		SingletonTest test = new SingletonTest();
		test.print("instance1 by simple null check ", instance1);
		test.print("instance2 by simple null check ", instance2);
		test.print("instance3 by double checking ", instance3);
		test.print("instance4 by reflection ", instance4);
		test.print("instance5 by clone ", instance5);
		test.print("instance6 by deserialization ", instance6);
		test.print("instance7 by inner class ", instance7);

	}

	public void print(String name, Object instance) {
		System.out.println(name + ", and its hashcode is " + System.identityHashCode(instance));
	}

}
