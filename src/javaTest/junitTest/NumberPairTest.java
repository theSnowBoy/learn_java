package javaTest.junitTest;

import org.junit.Before;
import org.junit.Test;

import javaTest.stringTest.NumberPair;

public class NumberPairTest {
	NumberPair pair;
	
	@Test
	public void init(){
		pair = new NumberPair();
		pair.setFirst(1);
		pair.setSecond(2);
	}
}
