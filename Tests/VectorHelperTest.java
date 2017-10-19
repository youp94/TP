import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VectorHelperTest {

	Vector<Integer> v = new Vector<>();
	Vector<Integer> v2 = new Vector<>();
	Vector<Integer> v3 = new Vector<>();
	Vector<Integer> v4 = new Vector<>();
	Vector<Integer> res = new Vector<>();
	Integer[] tab = {3,10};
	
	@Before
	public void setUp() throws Exception {
		v.add(5);
		v.add(4);
		v.add(3);
		v.add(10);
		v.add(6);
		
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		v2.add(10);
		
		v3.add(6);
		v3.add(10);
		v3.add(3);
		v3.add(4);
		v3.add(5);
		
		v4.add(10);
		v4.add(8);
		v4.add(6);
		v4.add(20);
		v4.add(12);
		
		res.add(10);
		res.add(8);
		res.add(6);
		res.add(20);
		res.add(12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTri() {
		VectorHelper.tri(v);
		 assertEquals(v2,v);
	}
	
	@Test
	public void testSomme() throws SizeException {
		 assertEquals(res,VectorHelper.somme(v, v));
	}
	
	@Test
	public void testInvese() {
		VectorHelper.invese(v);
		 assertEquals(v3,v);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMinMax() {
		 assertEquals(tab,VectorHelper.MinMax(v));
	}
	
	@Test
	public void testAppliquerFormule() {
		VectorHelper.AppliquerFormule(v);
		 assertEquals(v4,v);
	}

}
