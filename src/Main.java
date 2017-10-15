import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		//v.add(5);
		v.add(4);
		v.add(3);
		v.add(10);
		v.add(6);
		Vector<Integer> v2 = new Vector<>();
		v2.add(5);
		v2.add(4);
		v2.add(3);
		v2.add(10);
		v2.add(6);
		
		//VectorHelper.tri(v);
		Vector<Integer> res = null;
		try {
			res = VectorHelper.somme(v, v2);
		} catch (SizeException e) {
			e.printStackTrace();
		}
		
		VectorHelper.invese(res);
		
		for(int i=0;i<res.size();i++) {
			System.out.println(res.elementAt(i));
		}
		System.out.println();
		
		Integer[] tab = VectorHelper.MinMax(res);
		System.out.println("min="+tab[0]+" max="+tab[1]);
	}

}