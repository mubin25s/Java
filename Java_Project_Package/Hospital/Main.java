package Hospital;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Smith", "Cardiology");
        Patient patient = new Patient("John Doe", 45);

        System.out.println(doc.getDetails());
        System.out.println("Treating patient: " + patient.getName());
    }
}
