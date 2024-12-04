import java.util.ArrayList;
import java.util.*;



    class Student{
        int RollNumber;
        String Name;
        int Marks;
        public  Student(int RollNumber, String Name, int  Marks){
            this.RollNumber=RollNumber;
            this.Name=Name;
            this.Marks= Marks;
        }
        public String toString(){
            return " RollNumber "+ RollNumber + " Name " + Name + " Marks " + Marks;
        }
    }
    
    public class StudentManagementProject{
        private static List<Student> students= new ArrayList<>();
        
            public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            while (true) {
            System.out.println("==================================");
            System.out.println( "  Student Management System  ");
            System.out.println("==================================");
            System.out.println("1. Add a Student");
            System.out.println("2. View all Student");
            System.out.println("3. View Student by their roll Number");
            System.out.println("4. Update Student data by their roll Number");
            System.out.println("5. Delete a Student Data by their roll Number ");
            System.out.println("6. Exit");
            System.out.println("Enter your choice (1/2/3/4/5/6) : ");
            int choice =scanner.nextInt();
            scanner.nextLine();
           
                
            
            switch(choice){
                case 1 : addStudent(scanner);
                break;
                case 2 : viewStudent();
                break;
                case 3 : SearchStudentbyrollNumber(scanner);
                break;
                case 4 : UpdateStudent(scanner);
                break;
                case 5 : DeleteStudent(scanner);
                break;
                case 6 : System.out.println(" Exiting.... Thank You ! ");
                System.exit(0);
                break;
                default : System.out.println(" Invalid choice ! Choose a valid choice ");
                break;

            }
        }
        }
        public static void addStudent(Scanner scanner){
            System.out.println("Enter Student RollNumber : ");
            int RollNumber=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the Student Name : ");
            String Name = scanner.nextLine();
            System.out.println("Enter Student Marks : ");
            int Marks= scanner.nextInt();
            students.add(new Student(RollNumber, Name, Marks));
            System.out.println(" Student "+ Name + " Added Successfully ");
            return;
        }
        public static void viewStudent(){
            if(students.isEmpty()){
                System.out.println(" No Students found yet ");
                return;
            }
            else{
                System.out.println(" Students List : ");
                for(Student student: students){
                    System.out.println(student);
                }
            }
            return;

        }


        public static void SearchStudentbyrollNumber(Scanner scanner){
            System.out.println(" Enter Student Roll Number ");
            int RollNumber= scanner.nextInt();
            for(Student student : students){
                if(student.RollNumber== RollNumber){
                    System.out.println(" Student Found :  " +student);
                    return;
                }
            }
            System.out.println( " Student Not Found ");

        }

        public static void UpdateStudent(Scanner scanner){
            System.out.println(" Enter Student RollNumber ");
            int rollnumber=scanner.nextInt();
            scanner.nextLine();
            for(Student student: students){
                if(student.RollNumber==rollnumber){
                    System.out.println(" ENter New Name of the Student ");
                    String name= scanner.nextLine();
                    System.out.println(" Enter new Marks ");
                    int marks= scanner.nextInt();

                    student.Name=name;
                    student.Marks=marks;

                    System.out.println(" Student Updated Successfully ");
                    return;

                }
                System.out.println(" Student Not Found ");
            }

        }

        public static void DeleteStudent(Scanner scanner){
            System.out.println(" Enter the Student RollNumber ");
            int rollnumber=scanner.nextInt();
            Iterator<Student> iterator=students.iterator();

            while(iterator.hasNext()){
                Student student=iterator.next();
                if(student.RollNumber==rollnumber){
                    iterator.remove();
                    System.out.println(" Student deleted successfully ");
                    return;
                }
                
            }
            System.out.println(" Student Not Found ");
            
        }

    }
