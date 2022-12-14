public class HashMapDemo
{
 
    public static void main(String[] args)
    {
        // Create an empty hash map
        HashMap<Integer, String> map = new HashMap<>();
 
        // Adding elements to the map
        map.put(10, "Geeks");
        map.put(20, "Ram");
        map.put(30, "Shyam");
 
        // Printing size of the map
        System.out.println("Size of map is: " + map.size());
 
        // Iterating the map
        for (Map.Entry m : map.entrySet()) 
     {
            System.out.println(m.getKey() + " "    + m.getValue());
        }
    }
}