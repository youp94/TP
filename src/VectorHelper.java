import java.util.Vector;

public class VectorHelper {
	
	public static void tri(Vector<Integer> v) {
		int longueur = v.size();
		int tampon = 0;
		boolean permut;
		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (v.elementAt(i) > v.elementAt(i+1)) {
					tampon = v.elementAt(i);
					v.setElementAt(v.elementAt(i+1), i);
					v.setElementAt(tampon, i+1);
					permut = true;
				}
			}
		} while (permut);
	}
	
	public static Vector<Integer> somme(Vector<Integer> v, Vector<Integer> v2)throws SizeException{
		Vector<Integer> res = null;
		if(v.size()!=v2.size()) {
			throw new SizeException("Taille des vecteurs differentes");
		}else {
			res = new Vector<>(v.size());
			for(int i=0;i<v.size();i++) {
				res.add(v.elementAt(i)+v2.elementAt(i));
			}
		}
		return res;
	}
}
