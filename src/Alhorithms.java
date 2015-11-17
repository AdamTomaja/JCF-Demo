import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Adam Tomaja
 */
public class Alhorithms {

	private static final List<String> items = Arrays.asList("Car", "Mobile Phone", "Notebook", "House", "Book", "Mouse",
			"Keyboard", "Book", "Notebook", "Notebook");
	
	private static final List<Integer> numbers = Arrays.asList(23, 54, 12, 23, 6, 12 , 0 , 123, -212, 400, 100, 2000, 32);
	
	public static void main(String[] args) {
		title("Sorting and shuffling:");
			show("All items", items);
			
			Collections.sort(items);
			show("Sorted   ", items);
			
			Collections.shuffle(items);
			show("Shuffled", items);
			
			Collections.shuffle(items);
			show("Shuffled", items);
		newline();
		
		title("Frequency:");
			showFrequency(items, "Notebook");
			showFrequency(items, "Book");
		newline();

		title("Extreme Values:");
			show("All numbers", numbers);
			show("MAX", Collections.max(numbers));
			show("MAX", Collections.min(numbers));
		newline();
		
		title("Routine data manipulation:");
			Collections.reverse(numbers);
			show("Reversed", numbers);	
		
			Collections.swap(numbers, 0, 1);
			show("Swapped 0 and 1 indexes", numbers);
		
			Collections.fill(numbers, 256);
			show("Filled with 256 value", numbers);
		newline();
	}
	
	private static void title(String title) {
		System.out.println(String.format("======= %s =======", title));
	}

	private static void newline() {
		System.out.println();
	}

	private static void showFrequency(Collection<String> collection, Object object) {
		System.out.println(String.format("Frequency of: %s = %d", object, Collections.frequency(collection, object)));
	}

	private static void show(String title, Object object) {
		System.out.println(String.format("%s:\t %s", title, object));
	}
}
