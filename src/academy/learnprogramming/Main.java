package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hostelite hostelite=new Hostelite(12,'F',"Stephen","Curry","Vishalakshi",51);
        System.out.println("StudentID = "+hostelite.getStudentId());
        System.out.println("StudentName = "+hostelite.getStudentName());
        System.out.println("studentType = "+hostelite.getStudentType());
        System.out.println("student HostelName = "+hostelite.getHostelName());
        System.out.println("student HostelRoomNumber = " +hostelite.getRoomNumber());

    }
}
