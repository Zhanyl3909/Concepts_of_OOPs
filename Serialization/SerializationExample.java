import java.io.*;

// A Serializable class
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Creating an object of the Serializable class
        Person person = new Person("John Doe", 25);

        // Serialization: Saving the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Serialization completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: Reading the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization completed.");
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
