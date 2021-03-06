import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prime2 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();

		// Iterator<Integer> it = l1.iterator();

		long c = System.currentTimeMillis();

		for (int i = 2; i < 700000; i++)
			l1.add(i);
		
		
	//	 System.out.println(l1.get(0));
		int count = 1;
		int n = 2;
		long sum = 2;

		while (l1.size() > 1) {

			for (Iterator<Integer> it = l1.iterator(); it.hasNext();) {
				Integer value = it.next();
				if (value % n == 0) {
					it.remove();
				}
			}

			System.out.println(l1.get(0));
			sum += l1.get(0);
			count++;
			n = l1.get(0);
		}

		System.out.println("Total prime numbers: " + count);
		System.out.println("Sum of primes: " + sum);
		long d = System.currentTimeMillis();
		System.out.println("Total time taken: " + (d - c)+" ms");

	}

}
