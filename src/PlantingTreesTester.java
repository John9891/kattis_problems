
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class PlantingTreesTester {
	
	ArrayList <Integer> lista1;
	ArrayList <Integer> lista2;
	ArrayList <Integer> listaCorta;
	ArrayList <Integer> listaSing;
	ArrayList <Integer> listaLarge;
	
	@Before
	public void setUp() throws Exception{
		
		lista1: new ArrayList<Integer>();
	lista1.addAll(Arrays.asList(2,3,4,3));
	}
	
	@Test
	public void testInsertionSort(){
		
		try {			
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
	}

	
	
	

}
