// *******************************************************

// Static array = has a fixed capacity
// Dynamic array : has his own static array with fixed size
// 

// Advantages :
// 1. Random access of elements O(1)
// 2. Good locality of references and data cache utilization
// 3. Easy to insert / delete at the end

// Disadvantages :
// 1. Wastes more memory then LinkedList
// 2. Shifting / Shrinking the array is time consuming O(n)
// 

// *******************************************************

public class Main {

	public static void main(String[] args) {

		DynamicArray dynamicArray = new DynamicArray(5);

		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");

		// System.out.println(dynamicArray.get(0));
		// dynamicArray.insert(0, "X");
		// dynamicArray.delete("A");
		// System.out.println(dynamicArray.search("C"));

		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	}
	
}

