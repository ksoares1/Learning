package com.keilah;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import static com.keilah.Foo.*; // this will import every static content into Foo
import org.junit.Test;

/**
 * @author ks
 *
 */
public class MockitoHelloWorldExample {
	@Test
	public void fooGreets() {
	
	Foo foo = mock(Foo.class);
		when(foo.greet()).thenReturn(HELLO_WORLD);
		System.out.println("Foo greets: " + foo.greet());
		// this static method belong to another dependency hamcrest 
		// maven is smart enough to figure out this, added this automatically 
		// because maven is cool 
		assertEquals(foo.greet(), HELLO_WORLD );  
	}
}
