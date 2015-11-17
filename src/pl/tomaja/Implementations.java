package pl.tomaja;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Adam Tomaja
 */
public class Implementations {

	private static final String INTERFACE_SIGN = "-> ";
	private static final String LINE = "==============================";
	private static final String TAB = "| * ";

	public static void main(String[] args) {
		Map<Class<?>, Set<Class<?>>> demo = new HashMap<Class<?>, Set<Class<?>>>();
		initDemo(demo);
		displayDemo(demo);
	}

	private static void initDemo(Map<Class<?>, Set<Class<?>>> collections) {
		collections.put(Set.class, new HashSet<Class<?>>(Arrays.asList(HashSet.class, LinkedHashSet.class,
				TreeSet.class, EnumSet.class, CopyOnWriteArraySet.class)));

		collections.put(List.class,
				new HashSet<Class<?>>(Arrays.asList(ArrayList.class, LinkedList.class, CopyOnWriteArrayList.class)));

		collections.put(Map.class,
				new HashSet<Class<?>>(Arrays.asList(HashMap.class, TreeMap.class, LinkedHashMap.class)));

		collections.put(Queue.class,
				new HashSet<Class<?>>(Arrays.asList(LinkedList.class, PriorityQueue.class, LinkedBlockingQueue.class,
						ArrayBlockingQueue.class, PriorityBlockingQueue.class, DelayQueue.class, SynchronousQueue.class,
						LinkedTransferQueue.class)));
		
		collections.put(Deque.class, new HashSet<Class<?>>(Arrays.asList(LinkedList.class, ArrayDeque.class, LinkedBlockingQueue.class)));
	}

	private static void displayDemo(Map<Class<?>, Set<Class<?>>> collections) {
		for (Class<?> collection : collections.keySet()) {
			System.out.print(INTERFACE_SIGN);
			System.out.println(collection.getSimpleName());
			for (Class<?> impl : collections.get(collection)) {
				System.out.print(TAB);
				System.out.println(impl.getSimpleName());
			}
			System.out.println(LINE);
		}
	}

}
