import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(3);
		v.add(10);
		v.add(6);
		VectorHelper.tri(v);
		for(int i=0;i<v.size();i++) {
			System.out.println(v.elementAt(i));
		}
	}

}