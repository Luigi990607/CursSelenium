package curs17;

import org.testng.annotations.*;
public class TestPriority {
    @Test
	public void one() {
		System.out.println("First");
	}
    @Test
	public void two() {
		System.out.println("Second");
    }
    @Test
	public void three() {
		System.out.println("Third");
	}
    @Test
    public void four() {
    	System.out.println("Fourth");
    }
    @Test
    public void five() {
    	System.out.println("Fifth");
    }
}
