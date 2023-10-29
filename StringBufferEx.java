package test;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, ");

        // Append text to the buffer
        sb.append("World!");
        System.out.println("Append: " + sb);

        // Insert text at a specific position
        sb.insert(7, "Java ");
        System.out.println("Insert: " + sb);

        // Delete characters from the buffer
        sb.delete(6, 10);
        System.out.println("Delete: " + sb);

        // Reverse the contents of the buffer
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // Get the length of the buffer
        int length = sb.length();
        System.out.println("Length: " + length);

        // Get the capacity of the buffer
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // Set the length of the buffer
        sb.setLength(5);
        System.out.println("Set Length: " + sb);

        // Replace a substring
        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        // Get the character at a specific position
        char charAt = sb.charAt(1);
        System.out.println("Character at index 2: " + charAt);

        // Get the index of a substring
        int indexOf = sb.indexOf("World");
        System.out.println("Index of 'World': " + indexOf);
    }
}