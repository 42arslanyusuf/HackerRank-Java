package DataStructures._008_JavaSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }

            // ------- SOLUTION -------
            // studentList.sort(new StudentComparator()); // Solution #1
            Collections.sort(studentList, // Solution #2
                    Comparator.comparingDouble(Student::getCgpa).reversed()
                            .thenComparing(Student::getFname)
                            .thenComparing(Student::getId)
            );
            // ------- SOLUTION -------

            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }

}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(Double.compare(s2.getCgpa(), s1.getCgpa()) !=0){
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }

        if(s1.getFname().compareTo(s2.getFname())!=0){
            return s1.getFname().compareTo(s2.getFname());
        }


        return Integer.compare(s1.getId(), s2.getId());
    }
}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}