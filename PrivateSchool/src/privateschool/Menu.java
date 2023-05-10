package privateschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {

    public static void printMenu() {

        System.out.println("Select one of the following options: ");
        System.out.println("Press 1 to create a student");
        System.out.println("Press 2 to create a course");
        System.out.println("Press 3 to create a trainer");
        System.out.println("Press 4 to create an assignment");

        System.out.println("Press 5 to print a student list");
        System.out.println("Press 6 to print a course list");
        System.out.println("Press 7 to print a trainer list");
        System.out.println("Press 8 to print an assigment list");

        System.out.println("Press 9 to print all the students per course");
        System.out.println("Press 10 to print all the trainers per course");
        System.out.println("Press 11 to print all the assignments per course");
        System.out.println("Press 12 to print all the assignments per student");
        System.out.println("Press 13 to print a list of students that belong to more than one courses");
        System.out.println("Press 14 to print a list of students that need to submit one or more assignments on the same week");
        System.out.println("Press 15 to exit");

    }

    public static void menuOption() {
        Student student1 = new Student("Maria", "Iakovidou", "07-09-94", 2250);
        Student student2 = new Student("Ioannis", "Ioannidis", "03-10-88", 2100);
        Student student3 = new Student("Ioanna", "Ioannou", "04-05-90", 2000);
        Student student4 = new Student("Georgia", "Georgiadou", "04-11-90", 2500);
        Student student5 = new Student("Thodoris", "Theodorou", "06-01-90", 2000);
        Course c1 = new Course("Coding Bootcamp", "C", "part-time", "02-15-21", "09-15-21");
        Course python1 = new Course("Coding Bootcamp", "Python", "part-time", "02-15-21", "09-15-21");
        Course java1 = new Course("Coding Bootcamp", "Java", "part-time", "02-15-21", "09-15-21");
        Course c2 = new Course("Coding Bootcamp", "C", "full-time", "02-15-21", "05-15-21");
        Course python2 = new Course("Coding Bootcamp", "Python", "full-time", "02-15-21", "05-15-21");
        Course java2 = new Course("Coding Bootcamp", "Java", "full-time", "02-15-21", "05-15-21");
        Trainer trainer1 = new Trainer("Giorgos", "Papadopoulos", "Java");
        Trainer trainer2 = new Trainer("Georgia", "Papadopoulou", "C");
        Trainer trainer3 = new Trainer("Giorgos", "Georgiou", "Python");
        Assignment javaAssignment1 = new Assignment("Java PrivateSchool", "first_project", "03-31-21", 85.00, 90.00);
        Assignment javaAssignment2 = new Assignment("Java PublicSchool", "first_project", "03-31-21", 85.00, 90.00);
        Assignment cAssignment1 = new Assignment("C PrivateSchool", "first_project", "04-07-21", 85.00, 90.00);
        Assignment cAssignment2 = new Assignment("C PublicSchool", "first_project", "04-07-21", 85.00, 90.00);
        Assignment pythonAssignment1 = new Assignment("Python PrivateSchool", "first_project", "04-14-21", 85.00, 90.00);
        Assignment pythonAssignment2 = new Assignment("Python PublicSchool", "first_project", "04-14-21", 85.00, 90.00);

        Scanner scanner = new Scanner(System.in);

        List<Student> myStudents = new ArrayList<>();
        List<Course> myCourses = new ArrayList<>();
        List<Trainer> myTrainers = new ArrayList<>();
        List<Assignment> myAssignments = new ArrayList<>();
        List<Student> myJavaStudentsFull = new ArrayList<>();
        List<Student> myCStudentsFull = new ArrayList<>();
        List<Student> myPythonStudentsFull = new ArrayList<>();
        List<Student> myJavaStudentsPart = new ArrayList<>();
        List<Student> myCStudentsPart = new ArrayList<>();
        List<Student> myPythonStudentsPart = new ArrayList<>();
        List<Trainer> myJavaTrainers = new ArrayList<>();
        List<Trainer> myCTrainers = new ArrayList<>();
        List<Trainer> myPythonTrainers = new ArrayList<>();
        List<Assignment> myJavaAssignments = new ArrayList<>();
        List<Assignment> myCAssignments = new ArrayList<>();
        List<Assignment> myPythonAssignments = new ArrayList<>();
        List<Student> myJavaStudentsAssignments = new ArrayList<>();
        List<Student> myCStudentsAssignments = new ArrayList<>();
        List<Student> myPythonStudentsAssignments = new ArrayList<>();
        List<Student> bothCoursesStudents = new ArrayList<>();

        myStudents.add(student1);
        myStudents.add(student2);
        myStudents.add(student3);
        myStudents.add(student4);
        myStudents.add(student5);
        myCourses.add(c1);
        myCourses.add(c2);
        myCourses.add(python1);
        myCourses.add(python2);
        myCourses.add(java1);
        myCourses.add(java2);
        myTrainers.add(trainer1);
        myTrainers.add(trainer2);
        myTrainers.add(trainer3);
        myAssignments.add(javaAssignment1);
        myAssignments.add(javaAssignment2);
        myAssignments.add(cAssignment1);
        myAssignments.add(cAssignment2);
        myAssignments.add(pythonAssignment1);
        myAssignments.add(pythonAssignment2);
        myJavaAssignments.add(javaAssignment1);
        myJavaAssignments.add(javaAssignment2);
        myCAssignments.add(cAssignment1);
        myCAssignments.add(cAssignment2);
        myPythonAssignments.add(pythonAssignment1);
        myPythonAssignments.add(pythonAssignment2);
        myJavaStudentsAssignments.add(student1);
        myCStudentsAssignments.add(student2);
        myPythonStudentsAssignments.add(student3);
        myJavaStudentsFull.add(student1);
        myJavaStudentsPart.add(student2);
        myCStudentsFull.add(student3);
        myCStudentsPart.add(student2);
        myPythonStudentsFull.add(student4);
        myPythonStudentsPart.add(student5);
        myPythonStudentsPart.add(student2);
        bothCoursesStudents.add(student2);
        myJavaTrainers.add(trainer1);
        myCTrainers.add(trainer2);
        myPythonTrainers.add(trainer3);

        int optionNumber;
        do {
            optionNumber = scanner.nextInt();

            switch (optionNumber) {
                case 1:
                    System.out.println("Please, insert the First Name of the Student.");
                    String firstName = scanner.next();
                    System.out.println("Please, insert the Last Name of the Student.");
                    String lastName = scanner.next();
                    System.out.println("Please, insert the Date Of Birth of the Student. (Example: 03-31-2003)");
                    String dateOfBirth = scanner.next();
                    System.out.println("Please, insert the Tuition Fees of the Student.");
                    int tuitionFees = scanner.nextInt();

                    Student st = new Student(firstName, lastName, dateOfBirth, tuitionFees);
                    myStudents.add(st);

                    System.out.println("Please, choose the course of the Student. The available courses are Java, C and Python.");
                    String courseChoice = scanner.next();
                    if (courseChoice.equalsIgnoreCase("java")) {
                        System.out.println("The available assignments for Java course are: ");
                        for (Assignment myTempJavaAssignments : myJavaAssignments) {
                            System.out.println(myTempJavaAssignments.getTitle());
                        }
                        myJavaStudentsAssignments.add(st);

                        System.out.println("Choose F for the full time program or P for the part time program");
                        String streamChoice = scanner.next();
                        if (streamChoice.equalsIgnoreCase("f")) {
                            myJavaStudentsFull.add(st);
                        } else if (streamChoice.equalsIgnoreCase("p")) {
                            myJavaStudentsPart.add(st);

                            System.out.println("You have been successfully registered to a part time course. Do you want to register to another one?");
                            System.out.println("Yes or No");
                            String answer = scanner.next();
                            if (answer.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st);
                            }

                        }

                    } else if (courseChoice.equalsIgnoreCase("c")) {
                        System.out.println("The available assignments for C course are: ");
                        for (Assignment myTempCAssignments : myCAssignments) {
                            System.out.println(myTempCAssignments.getTitle());
                        }
                        myCStudentsAssignments.add(st);

                        System.out.println("Choose F for the full time program or P for the part time program");
                        String streamChoice = scanner.next();
                        if (streamChoice.equalsIgnoreCase("f")) {
                            myCStudentsFull.add(st);
                        } else if (streamChoice.equalsIgnoreCase("p")) {
                            myCStudentsPart.add(st);

                            System.out.println("You have been successfully registered to a part time course. Do you want to register to another one?");
                            System.out.println("Yes or No");
                            String answer = scanner.next();
                            if (answer.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st);
                            }
                        }

                    } else if (courseChoice.equalsIgnoreCase("python")) {
                        System.out.println("The available assignments for Python course are: ");
                        for (Assignment myTempPythonAssignments : myPythonAssignments) {
                            System.out.println(myTempPythonAssignments.getTitle());
                        }
                        myPythonStudentsAssignments.add(st);
                        System.out.println("Choose F for the full time program or P for the part time program");
                        String streamChoice = scanner.next();
                        if (streamChoice.equalsIgnoreCase("f")) {
                            myPythonStudentsFull.add(st);
                        } else if (streamChoice.equalsIgnoreCase("p")) {
                            myPythonStudentsPart.add(st);

                            System.out.println("You have been successfully registered to a part time course. Do you want to register to another one?");
                            System.out.println("Yes or No");
                            String answer = scanner.next();
                            if (answer.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st);
                            }
                        }

                    }

                    break;
                case 2:
                    System.out.println("Please, insert the title of the Course.");
                    String title = scanner.next();
                    System.out.println("Please, insert the stream of the Course.");
                    String stream = scanner.next();
                    System.out.println("Please, insert the type of the Course.");
                    String type = scanner.next();
                    System.out.println("Please, insert the start date of the Course.");
                    System.out.println("Example: 03-31-2021");
                    SimpleDateFormat dateC = new SimpleDateFormat("MM-dd-yyyy");
                    String startDate = scanner.next();
                    try {
                        Date date = dateC.parse(startDate);
                        dateC = new SimpleDateFormat("EEE, d MMM yyyy");
                        System.out.println("Date: " + dateC.format(date));
                    } catch (ParseException e) {
                        System.out.println("Parse Exception");
                    }

                    System.out.println("Please, insert the end date of the Course.");
                    System.out.println("Example: 03-31-2021");
                    SimpleDateFormat dateB = new SimpleDateFormat("MM-dd-yyyy");
                    String endDate = scanner.next();

                    try {
                        Date date = dateB.parse(endDate);
                        dateB = new SimpleDateFormat("EEE, d MMM yyyy");
                        System.out.println("Date: " + dateB.format(date));
                    } catch (ParseException e) {
                        System.out.println("Parse Exception");
                    }

                    Course co = new Course(title, stream, type, startDate, endDate);
                    myCourses.add(co);

                    break;
                case 3:
                    System.out.println("Please, insert the First Name of the Trainer.");
                    String firstNameTrainer = scanner.next();
                    System.out.println("Please, insert the Last Name of the Trainer.");
                    String lastNameTrainer = scanner.next();
                    System.out.println("Please, insert the Subject of the Trainer.");
                    String subject = scanner.next();

                    Trainer tr = new Trainer(firstNameTrainer, lastNameTrainer, subject);
                    myTrainers.add(tr);

                    System.out.println("In which course do you want to assign the trainer? The available courses are Java, C and Python.");
                    String trainerChoice = scanner.next();

                    if (trainerChoice.equalsIgnoreCase("Java")) {
                        myJavaTrainers.add(tr);
                    } else if (trainerChoice.equalsIgnoreCase("C")) {
                        myCTrainers.add(tr);
                    } else if (trainerChoice.equalsIgnoreCase("Python")) {
                        myPythonTrainers.add(tr);
                    }

                    break;
                case 4:
                    System.out.println("Please, insert the title of the Assignment");
                    String titleAssignment = scanner.next();
                    System.out.println("Please, insert the description of the Assignment.");
                    String description = scanner.next();
                    System.out.println("Please, insert the submission date time of the Assignment.");
                    System.out.println("Example: 03-31-2021");
                    SimpleDateFormat dateA = new SimpleDateFormat("MM-dd-yyyy");
                    String subDateTime = scanner.next();

                    try {
                        Date date = dateA.parse(subDateTime);
                        dateA = new SimpleDateFormat("EEE, d MMM yyyy");
                        System.out.println("Date: " + dateA.format(date));
                    } catch (ParseException e) {
                        System.out.println("Parse Exception");
                    }

                    System.out.println("Please, insert the oral mark of the Assignment.");
                    double oralMark = scanner.nextDouble();
                    System.out.println("Please, insert the total mark of the Assignment.");
                    double totalMark = scanner.nextDouble();

                    Assignment assign = new Assignment(titleAssignment, description, subDateTime, oralMark, totalMark);
                    myAssignments.add(assign);

                    System.out.println("In which course do you want to add your assignment? The available courses are Java, C and Python.");
                    String assignmentChoice = scanner.next();

                    if (assignmentChoice.equalsIgnoreCase("Java")) {
                        myJavaAssignments.add(assign);
                    } else if (assignmentChoice.equalsIgnoreCase("C")) {
                        myCAssignments.add(assign);
                    } else if (assignmentChoice.equalsIgnoreCase("Python")) {
                        myPythonAssignments.add(assign);
                    }

                    break;
                case 5:
                    System.out.println("All the students are:");
                    for (Student myTempStudents : myStudents) {
                        System.out.println(myTempStudents.getFirstName() + " " + myTempStudents.getLastName() + " " + myTempStudents.getDateOfBirth() + " " + myTempStudents.getTuitionFees());
                    }
                    break;
                case 6:
                    System.out.println("All the courses are: ");
                    for (Course myTempCourses : myCourses) {
                        System.out.println(myTempCourses.getTitle() + " " + myTempCourses.getStream() + " " + myTempCourses.getType() + " " + myTempCourses.getStart_date() + " " + myTempCourses.getEnd_date());
                    }
                    break;
                case 7:
                    System.out.println("All the trainers are: ");
                    for (Trainer myTempTrainers : myTrainers) {
                        System.out.println(myTempTrainers.getFirstName() + " " + myTempTrainers.getLastName() + " " + myTempTrainers.getSubject());
                    }
                    break;
                case 8:
                    System.out.println("All the assignments are: ");
                    for (Assignment myTempAssignments : myAssignments) {
                        System.out.println(myTempAssignments.getTitle() + " " + myTempAssignments.getDescription() + " " + myTempAssignments.getSubDateTime() + " " + myTempAssignments.getOralMark() + " " + myTempAssignments.getTotalMark());
                    }
                    break;
                case 9:
                    System.out.println("Java Full Time students are: ");
                    for (Student myTempJavaStudents : myJavaStudentsFull) {
                        System.out.println(myTempJavaStudents.getFirstName() + " " + myTempJavaStudents.getLastName());
                    }
                    System.out.println("Java Part Time students are: ");
                    for (Student myTempJavaStudents : myJavaStudentsPart) {
                        System.out.println(myTempJavaStudents.getFirstName() + " " + myTempJavaStudents.getLastName());
                    }
                    System.out.println("=======================================");

                    System.out.println("C Full Time students are: ");
                    for (Student myTempCStudents : myCStudentsFull) {
                        System.out.println(myTempCStudents.getFirstName() + " " + myTempCStudents.getLastName());
                    }

                    System.out.println("C Part Time students are: ");
                    for (Student myTempCStudents : myCStudentsPart) {
                        System.out.println(myTempCStudents.getFirstName() + " " + myTempCStudents.getLastName());
                    }
                    System.out.println("=======================================");

                    System.out.println("Python Full Time students are: ");
                    for (Student myTempPythonStudents : myPythonStudentsFull) {
                        System.out.println(myTempPythonStudents.getFirstName() + " " + myTempPythonStudents.getLastName());
                    }

                    System.out.println("Python Part Time students are: ");
                    for (Student myTempPythonStudents : myPythonStudentsPart) {
                        System.out.println(myTempPythonStudents.getFirstName() + " " + myTempPythonStudents.getLastName());
                    }

                    break;
                case 10:
                    System.out.println("Java trainers are: ");
                    for (Trainer myTempJavaTrainers : myJavaTrainers) {
                        System.out.println(myTempJavaTrainers.getFirstName() + " " + myTempJavaTrainers.getLastName());
                    }

                    System.out.println("============================");
                    System.out.println("C trainers are: ");
                    for (Trainer myTempCTrainers : myCTrainers) {
                        System.out.println(myTempCTrainers.getFirstName() + " " + myTempCTrainers.getLastName());
                    }

                    System.out.println("============================");
                    System.out.println("Python trainers are: ");
                    for (Trainer myTempPythonTrainers : myPythonTrainers) {
                        System.out.println(myTempPythonTrainers.getFirstName() + " " + myTempPythonTrainers.getLastName());
                    }
                    break;
                case 11:
                    System.out.println("Java Assignments are: ");
                    for (Assignment myTempJavaAssignments : myJavaAssignments) {
                        System.out.println(myTempJavaAssignments.getTitle());
                    }
                    System.out.println("===============================");
                    System.out.println("C Assignments are: ");
                    for (Assignment myTempCAssignments : myCAssignments) {
                        System.out.println(myTempCAssignments.getTitle());
                    }
                    System.out.println("===============================");
                    System.out.println("Python Assignments are: ");
                    for (Assignment myTempPythonAssignments : myPythonAssignments) {
                        System.out.println(myTempPythonAssignments.getTitle());
                    }
                    break;
                case 12:
                    System.out.println("Students for Java assignments are: ");
                    for (Student myTempJavaStudentsAssignments : myJavaStudentsAssignments) {
                        System.out.println(myTempJavaStudentsAssignments.getFirstName() + " " + myTempJavaStudentsAssignments.getLastName());
                    }
                    System.out.println("===============================");

                    System.out.println("Students for C assignments are: ");
                    for (Student myTempCStudentsAssignments : myCStudentsAssignments) {
                        System.out.println(myTempCStudentsAssignments.getFirstName() + " " + myTempCStudentsAssignments.getLastName());
                    }
                    System.out.println("===============================");

                    System.out.println("Students for Python assignments are: ");
                    for (Student myTempPythonStudentsAssignments : myPythonStudentsAssignments) {
                        System.out.println(myTempPythonStudentsAssignments.getFirstName() + " " + myTempPythonStudentsAssignments.getLastName());
                    }
                    break;
                case 13:
                    System.out.println("Students who belong to more than one courses: ");
                    for (Student myTempBothCoursesStudents : bothCoursesStudents) {
                        System.out.println(myTempBothCoursesStudents.getFirstName() + " " + myTempBothCoursesStudents.getLastName());
                    }
                    break;
                case 14:

                    System.out.println("Please, insert the submission date of the Assignment.");
                    System.out.println("Example: 03-31-2021");
                    SimpleDateFormat dateD = new SimpleDateFormat("MM-dd-yyyy");
                    String subDateTime2 = scanner.next();

                    try {
                        Date date1 = dateD.parse(subDateTime2);
                        dateD = new SimpleDateFormat("EEE, d MMM yyyy");
                        System.out.println("Date: " + dateD.format(date1));
                    } catch (ParseException e) {
                        System.out.println("Parse Exception");
                    }

                    break;
                case 15:
                    System.out.println("Exit menu");
                    return;
                default:
                    System.out.println("Invalid number option");

            }
            System.out.println("Please, select your next action");

        } while (optionNumber >= 1 && optionNumber < 15);
    }
}
