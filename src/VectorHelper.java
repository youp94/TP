import java.util.Vector;


public class VectorHelper {
	/**
	 * 
	 * @param v le vecteur en entr�e
	 * La m�thode genere un vecteur tri� � partir de v 
	 */
	
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
	/**
	 * 
	 * @param v le premier vecteur � sommer 
	 * @param v2 le second vecteur � sommer 
	 * @return le resultat de la somme de v+v2
	 * @throws SizeException une excepiton en cas de difference
	 *  de taille des 2 vecteurs v et v2
	 */

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

	/**
	 * 
	 * @param v est le vecteur � inversser 
	 * le methode effectue une inverssin du vecteur v 
	 */
	public static void invese(Vector<Integer> v) {
		int len = v.size();
		int tmp;
	    for(int i=0 ; i < len/2 ; i++) {
	        tmp = v.elementAt(i);
	        v.setElementAt(v.elementAt(len-i-1), i);
	        v.setElementAt(tmp, len-i-1);
	    }
	}
	/**
	 * 
	 * @param v le vecteur dont on veut trouver son minimum et maximum
	 * @return on retourne  un tableau de 2 cases contenant le min et le max de v
	 */
	public static Integer[] MinMax(Vector<Integer> v)
	{
		Integer Tab[]=new Integer[2];
		Integer min=v.elementAt(0),max=v.elementAt(0);
		
		for(int i=0;i<v.size();i++)
		{
			if(v.elementAt(i)>max)
			{
				max=v.elementAt(i);
			}
			if(v.elementAt(i)<min)
			{
				min=v.elementAt(i);
			}
			
			
		}
			Tab[0]=min;
			Tab[1]=max;
		
		return Tab;
		
		
		
	}
	

	/**
	 * 
	 * @param v est le vecteur dont on veut lui appliquer une formule 
	 * precedement d�finie 
	 */
	public static void AppliquerFormule(Vector<Integer> v)
	{
		//Formule est une classe qui contienne un ensemble d'operations 
		//qu'on peut les appliquer sur un element d'un vecteur 
		Formules F= new Formules();
		
		for(int i=0;i<v.size();i++)
		{
		  v.setElementAt(F.Doubler(v.elementAt(i)), i);
		}
		
		
	}
	
	
	
	
} 
