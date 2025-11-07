package Pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

		System.out.println(map.get(3));

		map.remove(3);

		System.out.println(map.get(3));
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.containsKey(2));
		System.out.println(map.keySet());
		System.out.println(map.values());
		Set<Integer> s = map.keySet();

		for (int x : s) {
			System.out.print(x);
		}

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

		s.forEach(x -> {
			System.out.print(x);
		});

		for (HashMap.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}