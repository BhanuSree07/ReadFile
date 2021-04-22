package FileHandling;
import java.io.File; // Import the File class

public class FileInformation {
public static void main(String[] args) {
// Creating an object of a file
File myObj = new File("Student.xls");
if (myObj.exists()) {
// Returning the file name
System.out.println("File name: " + myObj.getName());

// Returning the path of the file
System.out.println("Absolute path: " + myObj.getAbsolutePath());

// Displaying whether the file is writable
System.out.println("Writeable: " + myObj.canWrite());

// Displaying whether the file is readable or not
System.out.println("Readable " + myObj.canRead());

// Returning the length of the file in bytes
System.out.println("File size in bytes " + myObj.length());
} else {
System.out.println("The file does not exist.");
}
}
}
