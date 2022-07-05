//Required Packages
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

//Helper Class for Motorboat Class
class motorBoatSchedule {

  private int day; //day of the week
  private List<Integer> booked = new ArrayList<Integer>(); //list of timeslots booked
  private List<String> time = new ArrayList<String>(); //list of timeslots

  motorBoatSchedule(int d, List<Integer> b, List<String> t) { //constructor
    day = d;
    booked = b;
    time = t;
  }

  public void setDay(int d) { //setter for day
    day = d;
  }

  public void setBooked(List<Integer> b) { //setter for booked
    booked = b;
  }

  public void setTime(List<String> t) { //setter for time
    time = t;
  }

  public int getDay() { //getter for day
    return day;
  }

  public List<Integer> getBooked() { //getter for booked
    return booked;
  }

  public List<String> getTime() { //getter for time
    return time;
  }
}

//Motorboat Class
class Motorboat {

  private String name; //name of motorboat
  private List<motorBoatSchedule> schedule = new ArrayList<motorBoatSchedule>(); //list of motorboat schedules

  Motorboat() { //constructor
    name = "";
    schedule = null;
  }

  Motorboat(String n, List<motorBoatSchedule> s) { //constructor
    name = n;
    schedule = s;
  }

  public void setName(String n) { //setter for name
    name = n; //set name to n
  }

  public void setSchedule(List<motorBoatSchedule> s) { //setter for schedule
    schedule = s; //set schedule to s
  }

  public String getName() { //getter for name
    return name; //returns name of motorboat
  }

  public List<motorBoatSchedule> getSchedule() { //getter for schedule
    return schedule; //returns schedule of motorboat
  }
}

//Lesson Class
class Lesson {

  private int day; //day of the week
  private List<Boolean> booked = new ArrayList<Boolean>(); //list of timeslots booked
  private List<String> time = new ArrayList<String>(); //list of timeslots

  Lesson() { //constructor
    day = 0;
    time = null;
    booked = null;
  }

  Lesson(int d, List<String> t, List<Boolean> b) { //constructor
    day = d;
    time = t;
    booked = b;
  }

  public void setBooked(List<Boolean> b) { //setter for booked
    booked = b; //set booked to b
  }

  public void setDay(int d) { //setter for day
    day = d; //set day to d
  }

  public void setTime(List<String> time) { //setter for time
    this.time = time; //set time to time
  }

  public int getDay() { //getter for day
    return day; //returns day of the week
  }

  public List<String> getTime() { //getter for time
    return time; //returns time of the lesson
  }

  public List<Boolean> getBooked() { //getter for booked
    return booked; //returns booked of the lesson
  }
}

//Instructor Class
class Instructor {

  private String name; //name of instructor
  private Boolean provides; //whether instructor provides lessons
  private String membName; //name of member
  private List<Lesson> lessons = new ArrayList<Lesson>(); //list of lessons

  Instructor() {
    name = "";
    provides = false;
    membName = "";
    lessons = null;
  }

  Instructor(
    String name,
    String membName,
    List<Lesson> list,
    Boolean provides
  ) { //constructor
    this.name = name;
    this.membName = membName;
    this.lessons = list;
    this.provides = provides;
  }

  public void setName(String n) { //setter for name
    name = n; //set name to n
  }

  public void setProvides(Boolean provides) { //setter for provides
    this.provides = provides; //set provides to provides
  }

  public void setMemberName(String n) { //setter for member name
    membName = n; //set member name to n
  }

  public void setLesson(List<Lesson> lessons) { //setter for lessons
    this.lessons = lessons; //set lessons to lessons
  }

  public String getName() { //getter for name
    return name; //returns name of instructor
  }

  public String getMemberName() { //getter for member name
    return membName; //returns name of member
  }

  public List<Lesson> getLesson() { //getter for lessons
    return lessons; //returns lessons of instructor
  }

  public Boolean getProvides() { //getter for provides
    return provides; //returns whether instructor provides lessons
  }
}

//Abstract Class Member
abstract class Member {

  private String name; //name of member

  public void setName(String n) { //setter for name
    name = n; //set name to n
  }

  public String getName() { //getter for name
    return name; //returns name of member
  }
}

//MBLH Class a child of Member class
class MBLH extends Member {

  private Boolean hasHired; //whether member has hired instructor
  private int numOfHires; //number of times member has hired instructor
  private List<String> bookedLessons = new ArrayList<String>(); //list of lessons member has booked

  MBLH() { //constructor
    hasHired = false;
    numOfHires = 0;
    bookedLessons = null;
  }

  MBLH(Boolean hire, int n, List<String> l) { //constructor
    hasHired = hire;
    numOfHires = n;
    bookedLessons = l;
  }

  public void setHired(Boolean hire) { //setter for has hired
    hasHired = hire; //set has hired to hire
  }

  public void setNumOfHires(int n) { //setter for number of hires
    numOfHires = n; //set number of hires to n
  }

  public Boolean getHasHired() { //getter for has hired
    return hasHired; //returns whether member has hired instructor
  }

  public int getNumOfHires() { //getter for number of hires
    return numOfHires; //returns number of times member has hired instructor
  }

  public void setBookedLessons(List<String> l) { //setter for booked lessons
    bookedLessons = l; //set booked lessons to l
  }

  public List<String> getBookedLessons() { //getter for booked lessons
    return bookedLessons; //returns booked lessons of member
  }
}

//Novice Class a child of Member class
class Novice extends Member {

  private Boolean isAssigned; //whether member is assigned to instructor
  private int numOfLessons; //number of lessons member has taken
  private Instructor instructor; //instructor member is assigned to
  private List<String> bookedLessons = new ArrayList<String>(); //list of lessons member has booked

  Novice() { //constructor
    isAssigned = false;
    instructor = null;
    numOfLessons = 0;
    bookedLessons = null;
  }

  Novice(Boolean a, Instructor ins, int n, List<String> l) { //constructor
    isAssigned = a;
    instructor = ins;
    numOfLessons = n;
    bookedLessons = l;
  }

  public void setIsAssigned(Boolean a) { //setter for is assigned
    isAssigned = a; //set is assigned to a
  }

  public void setInstructor(Instructor ins) { //setter for instructor
    instructor = ins; //set instructor to ins
  }

  public void setNumOfLessons(int n) { //setter for number of lessons
    numOfLessons = n; //set number of lessons to n
  }

  public void setBookedLessons(List<String> l) { //setter for booked lessons
    bookedLessons = l; //set booked lessons to l
  }

  public Boolean getIsAssigned() { //getter for is assigned
    return isAssigned; //returns whether member is assigned to instructor
  }

  public Instructor getInstructor() { //getter for instructor
    return instructor; //returns instructor member is assigned to
  }

  public int getNumOfLessons() { //getter for number of lessons
    return numOfLessons; //returns number of lessons member has taken
  }

  public List<String> getBookedLessons() { //getter for booked lessons
    return bookedLessons; //returns booked lessons of member
  }
}

//Driver Code
public class MotorBoatManagementSystem {

  public static void main(String[] args) { //main method
    //Time Array
    String[] times = {
      "9:00",
      "10:00",
      "11:00",
      "12:00",
      "13:00",
      "14:00",
      "15:00",
      "16:00",
      "17:00",
      "18:00",
    }; //array of times

    //Declaring Variables
    List<Motorboat> motorboatList = new ArrayList<Motorboat>(); //list of motorboats
    List<MBLH> MBHLList = new ArrayList<MBLH>(); //list of MBLH members
    List<Novice> noviceList = new ArrayList<Novice>(); //list of novice members
    List<Instructor> instructorList = new ArrayList<Instructor>(); //list of instructors
    //Names for Members and Assets
    String noviceName = "Person"; //name of novice member
    String mblhName = "Person"; //name of MBLH member
    String instructorName = "Instructor"; //name of instructor
    String motorboatName = "Motorboat"; //name of motorboat

    //Filling Dummy Data
    for (int i = 1; i <= 10; i++) { //for loop to fill dummy data
      List<String> bookedLessons1 = new ArrayList<String>(); //list of lessons for MBLH member
      MBLH mblh = new MBLH(false, 0, bookedLessons1); //MBLH member with no data
      mblh.setName(mblhName + "" + String.valueOf(i)); //set name of MBLH member
      List<String> bookedLessons = new ArrayList<String>(); //list of lessons for novice member

      List<Lesson> lessonsList = new ArrayList<Lesson>(); //list of lessons for instructor
      for (int j = 0; j < 7; j++) { //for loop to fill lessons for instructor
        List<Boolean> booked = new ArrayList<Boolean>(); //list of whether instructor has booked lesson

        List<String> time = new ArrayList<String>(); //list of times for lesson
        for (int k = 0; k < times.length; k++) { //for loop to fill times for lesson
          booked.add(false); //adds false to booked list
          time.add(times[k]); //adds time to time list
        }
        Lesson obj = new Lesson(j, time, booked); //lesson with no data
        lessonsList.add(obj); //adds lesson to list of lessons
      }

      Instructor instructor = new Instructor(
        instructorName + "" + String.valueOf(i),
        noviceName + "" + String.valueOf(i + 10),
        lessonsList,
        false
      ); //instructor with no data
      Novice novice = new Novice(true, instructor, 0, bookedLessons); //novice member with no data

      novice.setName(noviceName + "" + String.valueOf(i + 10)); //set name of novice member
      noviceList.add(novice); //adds novice member to list of novice members
      MBHLList.add(mblh); //adds MBLH member to list of MBLH members
      instructorList.add(instructor); //adds instructor member to list of instructors
    }
    //Filing Motorboats Dummy Data (Randomly Hiring)
    for (int i = 0; i < 10; i++) { //for loop to fill motorboat data
      List<motorBoatSchedule> schedule = new ArrayList<motorBoatSchedule>(); //list of motorboat schedule
      for (int j = 0; j < 7; j++) { //for loop to fill schedule for motorboat
        List<Integer> booked = new ArrayList<Integer>(); //list of whether motorboat has booked lesson
        List<String> time = new ArrayList<String>(); //list of times for lesson
        for (int k = 0; k < times.length; k++) { //for loop to fill times for lesson
          booked.add(-1); //adds -1 to booked list
          time.add(times[k]); //adds time to time list
        }
        motorBoatSchedule obj = new motorBoatSchedule(j, booked, time); //motorboat schedule with no data
        schedule.add(obj); //adds motorboat schedule to list of motorboat schedule
      }
      Motorboat obj = new Motorboat(
        motorboatName + "" + String.valueOf(i + 1),
        schedule
      ); //motorboat with no data
      motorboatList.add(obj); //adds motorboat to list of motorboats
    }

    //Function called Filled Dummy Data in Both Member Classes
    fillNoviceData(noviceList, instructorList, motorboatList); //fills dummy data in novice members
    fillMBLHData(MBHLList, motorboatList); //fills dummy data in MBLH members

    // Menu for User
    Scanner input = new Scanner(System.in); //scanner for user input
    int opt; //option for user
    do {
      System.out.println(
        "\n\nChoose Operation\n1 = Book Lesson for Member\n2 = List Member Lessons\n3 = List Instructor Lessons\n4 = Hire Motorboat for MBLH\n5 = Display Motorboat Bookings\n0 = Exit"
      );
      opt = input.nextInt(); //option for user
      switch (opt) { //switch case for user input
        case 0:
          {
            System.out.println("Bye!"); //if user chooses 0, program ends
            System.exit(1);
            break;
          }
        case 1:
          { //if user chooses 1, program asks for member name and lesson number
            bookLessonForMember(
              noviceList,
              MBHLList,
              motorboatList,
              instructorList
            );
            break;
          }
        case 2:
          { //if user chooses 2, program asks for member name and displays lessons
            displayMemberLessons(noviceList, MBHLList);
            break;
          }
        case 3:
          { //if user chooses 3, program asks for instructor name and displays lessons
            displayInstructorLessons(instructorList, noviceList, MBHLList);
            break;
          }
        case 4:
          { //if user chooses 4, program asks for motorboat name and hires it
            hireMotorBoatforMBLH(MBHLList, motorboatList, noviceList);
            break;
          }
        case 5:
          { //if user chooses 5, program asks for motorboat name and displays bookings
            displayMotorBoatBookings(motorboatList);
            break;
          }
        default:
          System.out.println("Incorrect Option!"); //if user chooses incorrect option, program asks again
      }
    } while (true); //loop until user chooses 0
  }

  // Use Case 1 (Book Lesson for a Member)
  public static void bookLessonForMember(
    List<Novice> noviceList,
    List<MBLH> MBHLList,
    List<Motorboat> motorboatList,
    List<Instructor> instructorList
  ) {
    int count = 1; //count for member name
    for (int i = 0; i < noviceList.size(); i++) { //for loop to display member names
      System.out.println((count) + " Name = " + noviceList.get(i).getName()); //display member name
      count++; //increment count
      System.out.println((count) + " Name = " + MBHLList.get(i).getName()); //display member name
      count++; //increment count
    }

    Scanner inp = new Scanner(System.in); //scanner for user input
    System.out.print("Enter Name of The Member = "); //ask user for member name
    String name = inp.nextLine(); //user input for member name
    int[] result = findAndGetObject(noviceList, MBHLList, name); //finds member and returns index of member
    if (result[0] == 0) { //if member is novice member
      //Novice Code
      if (noviceList.get(result[1]).getNumOfLessons() == 3) { //if member has 3 lessons
        System.out.println(
          "This Member Already Has 3 Lessons Booked for this Week"
        ); //display message
        return; //return to main menu
      } else { //if member has less than 3 lessons
        Instructor instructor = noviceList.get(result[1]).getInstructor(); //get instructor of member
        System.out.println("Instructor Name = " + instructor.getName()); //display instructor name
        System.out.println("\nNo.   Day\t    Time\t  Status\n"); //display header
        //Called Function
        printInstructorLessons(instructor); //prints lessons of instructor

        System.out.println("\nBooking Lesson for This Member\nEnter day (1-7)"); //ask user for day
        int day = inp.nextInt(); //user input for day
        day--; //decrement day
        System.out.println("\nEnter Time in This Format (HH:00)"); //ask user for time
        Scanner line = new Scanner(System.in); //scanner for user input
        String time = line.nextLine(); //user input for time
        int bookedIndex = getIndexOfBooked(time, day, instructor); //get index of booked lesson
        if (bookedIndex != -1) { //if lesson is booked
          if (
            instructor.getLesson().get(day).getBooked().get(bookedIndex) == true
          ) { //if lesson is booked
            System.out.println("Slot Already Booked!"); //display message
          } else { //if lesson is not booked
            System.out.println("Available Motorboats are"); //display message
            PrintAvailableMotorBoats(motorboatList, day, bookedIndex); //prints available motorboats

            System.out.println("Enter The Name of The Motorboat"); //ask user for motorboat name
            String bname = line.nextLine(); //user input for motorboat name
            int boatIndex = findMotorboat(bname, motorboatList); //finds motorboat and returns index of motorboat
            if (boatIndex != -1) { //if motorboat is found
              motorboatList
                .get(boatIndex)
                .getSchedule()
                .get(day)
                .getBooked()
                .set(bookedIndex, 0); //set lesson to booked
              int numOfLessons = noviceList.get(result[1]).getNumOfLessons(); //get number of lessons of member
              noviceList.get(result[1]).setNumOfLessons(++numOfLessons); //increment number of lessons of member
              instructor
                .getLesson()
                .get(day)
                .getBooked()
                .set(bookedIndex, true); //set lesson to booked
              String sc =
                "Day = " +
                String.valueOf(day + 1) +
                " Time = " +
                time +
                "\nMotorBoat = " +
                motorboatList.get(boatIndex).getName(); //get string of booked lesson
              System.out.println(
                "Lesson has been booked Successfully\nDetails:\n" + sc
              ); //display message
              noviceList.get(result[1]).getBookedLessons().add(sc); //add string to booked lessons of member
            } else {
              System.out.println("No Motorboat exist with this name"); //display message
            }
          }
        } else {
          System.out.println("Lesson not Found.! with Given Time Slots"); //display message
        }
      }
    }
    if (result[0] == 1) { //if member is MBH member
      //MBLH Code

      if (MBHLList.get(result[1]).getNumOfHires() == 2) { //if member has 2 hires
        System.out.println(
          "This Member Already Has 2 Motorboat Hires for this Week"
        ); //display message
        return;
      } else {
        printInstructors(instructorList); //prints instructors
        System.out.println("Enter Instructor Name"); //ask user for instructor name
        name = inp.nextLine(); //user input for instructor name
        int insIndex = getInstructor(instructorList, name); //get index of instructor
        if (insIndex != -1) { //if instructor is found
          printInstructorLessons(instructorList.get(insIndex)); //prints lessons of instructor
          System.out.println(
            "\nBooking Lesson for This Member\nEnter day (1-7)"
          ); //ask user for day
          int day = inp.nextInt(); //user input for day
          day--; //decrement day
          Instructor instructor = instructorList.get(insIndex); //get instructor of member
          System.out.println("\nEnter Time in This Format (HH:00)"); //ask user for time
          Scanner line = new Scanner(System.in); //scanner for user input
          String time = line.nextLine(); //user input for time
          int bookedIndex = getIndexOfBooked(time, day, instructor); //get index of booked lesson
          if (bookedIndex != -1) { //if lesson is booked
            if (
              instructor.getLesson().get(day).getBooked().get(bookedIndex) ==
              true
            ) { //if lesson is booked
              System.out.println("Slot Already Booked!"); //display message
            } else {
              System.out.println("Available Motorboats are"); //display message
              PrintAvailableMotorBoats(motorboatList, day, bookedIndex); //prints available motorboats

              System.out.println("Enter The Name of The Motorboat"); //ask user for motorboat name
              String bname = line.nextLine(); //user input for motorboat name
              int boatIndex = findMotorboat(bname, motorboatList); //finds motorboat and returns index of motorboat
              if (MBHLList.get(result[1]).getBookedLessons().size() == 3) { //if member has 3 lessons
                System.out.println(
                  "This Member Already Has 3 Lessons Booked For this week"
                ); //display message
                return;
              }
              if (boatIndex != -1) { //if motorboat is found
                motorboatList
                  .get(boatIndex)
                  .getSchedule()
                  .get(day)
                  .getBooked()
                  .set(bookedIndex, 1); //set lesson to booked
                instructorList
                  .get(insIndex)
                  .getLesson()
                  .get(day)
                  .getBooked()
                  .set(bookedIndex, true); //set lesson to booked
                instructorList.get(insIndex).setProvides(true); //set instructor to provides

                String sc =
                  "Instructor Name = " +
                  instructorList.get(insIndex).getName() +
                  "\nDay = " +
                  String.valueOf(day + 1) +
                  " Time = " +
                  time +
                  "\nMotorBoat = " +
                  motorboatList.get(boatIndex).getName(); //get string of booked lesson
                System.out.println(
                  "Lesson has been booked Successfully\nDetails:\n" + sc
                );
                MBHLList.get(result[1]).getBookedLessons().add(sc); //add string to booked lessons of member
              } else {
                System.out.println("No Motorboat exist with this name"); //display message
              }
            }
          } else { //if lesson is not booked
            System.out.println("Lesson not Found.! with Given Time Slots"); //display message
          }
        } else {
          System.out.println("NO Instructor With This Name"); //display message
          return;
        }
      }
    }
    if (result[0] == -1) { //if member is not found
      System.out.println("Not Found any Member with This Name"); //display message
      return;
    }
  }

  //Helper Function Prints Instructor Names
  public static void printInstructors(List<Instructor> instructorList) {
    System.out.println("Available Instructors Are"); //display message
    for (int k = 0; k < instructorList.size(); k++) { //for each instructor
      System.out.println(instructorList.get(k).getName()); //print name of instructor
    }
  }

  //helper Function find Instructor with Provided Name
  public static int getInstructor(
    List<Instructor> instructorList,
    String name
  ) {
    for (int i = 0; i < instructorList.size(); i++) { //for each instructor
      if (instructorList.get(i).getName().equalsIgnoreCase(name)) { //if name is found
        return i; //return index of instructor
      }
    }
    return -1; //if name is not found
  }

  //Helper Functioon that Prints available Motorboats at Given Time Slot (day and Time)
  public static void PrintAvailableMotorBoats(
    List<Motorboat> motorboatList,
    int day,
    int bookedIndex
  ) {
    Boolean flag = false; //flag to check if motorboat is available
    for (int i = 0; i < motorboatList.size(); i++) { //for each motorboat
      if (
        motorboatList.get(i).getSchedule().get(day).getDay() == day &&
        motorboatList
          .get(i)
          .getSchedule()
          .get(day)
          .getBooked()
          .get(bookedIndex) ==
        -1
      ) { //if motorboat is available
        flag = true; //set flag to true
        System.out.println(motorboatList.get(i).getName()); //print name of motorboat
      }
    }
    if (!flag) { //if no motorboat is available
      System.out.println("No Available Motorboats at this Slot"); //display message
    }
  }

  //Helper Function That Prints Individual Instructor Lessons of a week
  public static void printInstructorLessons(Instructor instructor) {
    String format = "%-" + 15 + "s"; //format string for printing
    String format2 = "%-" + 5 + "d"; //format string for printing
    int number = 1;
    for (int i = 0; i < instructor.getLesson().size(); i++) { //for each day
      int d = instructor.getLesson().get(i).getDay(); //get day of lesson
      for (int j = 0; j < instructor.getLesson().get(i).getTime().size(); j++) { //for each time slot
        if (instructor.getLesson().get(i).getBooked().get(j) == true) { //if lesson is booked
          System.out.format(format2, number++); //print number of lesson

          System.out.format(format, getWeekDay(d)); //print day of lesson
          System.out.println(
            instructor.getLesson().get(i).getTime().get(j) + "\t Booked"
          ); //print time of lesson
        } else {
          System.out.format(format2, number++); //print number of lesson
          System.out.format(format, getWeekDay(d)); //print day of lesson
          System.out.println(
            instructor.getLesson().get(i).getTime().get(j) + "\t Available"
          ); //print time of lesson
        }
      }
    }
  }

  //Helper Function that Find index of given Day and Time Slot
  public static int getIndexOfBooked(
    String Time,
    int day,
    Instructor instructor
  ) {
    for (int i = 0; i < instructor.getLesson().get(day).getTime().size(); i++) { //for each time slot
      if (
        instructor.getLesson().get(day).getTime().get(i).equalsIgnoreCase(Time) //if time is found
      ) {
        return i; //return index of time slot
      }
    }
    return -1;
  }

  //Helper Function Converts Day Numbers to Days of Week (String Type)
  public static String getWeekDay(int n) {
    switch (n) {
      case 0: //if day is 0
        return "Monday";
      case 1: //if day is 1
        return "Tuesday";
      case 2: //if day is 2
        return "Wednesday";
      case 3: //if day is 3
        return "Thursday";
      case 4: //if day is 4
        return "Friday";
      case 5: //if day is 5
        return "Saturday";
      case 6: //if day is 6
        return "Sunday";
      default: //if day is not 0,1,2,3,4,5,6
        break;
    }
    return "";
  }

  //Helper Function that find the Member from Both Members List using Name
  public static int[] findAndGetObject(
    List<Novice> noviceList,
    List<MBLH> MBHLList,
    String name
  ) { //find member and get index of member
    for (int i = 0; i < noviceList.size(); i++) { //for each member
      if (noviceList.get(i).getName().equalsIgnoreCase(name)) { //if name is found
        int[] array = { 0, i }; //create array of index of member
        return array; //return array
      }
    }
    for (int i = 0; i < MBHLList.size(); i++) { //for each member
      if (MBHLList.get(i).getName().equalsIgnoreCase(name)) { //if name is found
        int[] array = { 1, i }; //create array of index of member
        return array; //return array
      }
    }
    int[] array = { -1, 0 }; //create array of index of member
    return array; //return array
  }

  //Use Case 2   (List Member Lessons)
  public static void displayMemberLessons(
    List<Novice> noviceList,
    List<MBLH> MBHLList
  ) {
    int count = 1;
    for (int i = 0; i < noviceList.size(); i++) { //for each member
      System.out.println((count) + " Name = " + noviceList.get(i).getName()); //print name of member
      count++; //increment count
      System.out.println((count) + " Name = " + MBHLList.get(i).getName()); //print name of member
      count++; //increment count
    }

    Scanner inp = new Scanner(System.in); //create scanner
    System.out.print("Enter Name of The Member = "); //print message
    String name = inp.nextLine(); //get name of member
    int[] result = findAndGetObject(noviceList, MBHLList, name); //find member and get index of member
    if (result[0] == 0) { //if member is novice
      if (noviceList.get(result[1]).getNumOfLessons() != 0) { //if member has lessons
        System.out.println( //print message
          "This Member Has " +
          noviceList.get(result[1]).getNumOfLessons() +
          " Booked Lessons\nDetails are:\n"
        ); //print message
        List<String> temp = noviceList //create temporary list of lessons
          .get(result[1])
          .getBookedLessons()
          .stream()
          .sorted()
          .collect(Collectors.toList()); //sort lessons
        for (
          int j = 0;
          j < noviceList.get(result[1]).getBookedLessons().size();
          j++
        ) { //for each lesson
          System.out.println(temp.get(j)); //print lesson
        }
      } else { //if member has no lessons
        System.out.println("There are No Lessons Booked for this Member"); //print message
        return;
      }
    } else if (result[0] == 1) { //if member is MBH
      if (MBHLList.get(result[1]).getBookedLessons().size() == 0) { //if member has no lessons
        System.out.println("There are No Lessons Booked for this Member"); //print message
      } else { //if member has lessons
        System.out.println(
          "This Member Has " +
          MBHLList.get(result[1]).getBookedLessons().size() +
          " Booked Lessons\nDetails are:\n"
        ); //print message
        List<String> temp = MBHLList
          .get(result[1])
          .getBookedLessons()
          .stream()
          .sorted()
          .collect(Collectors.toList()); //sort lessons

        for (
          int j = 0;
          j < MBHLList.get(result[1]).getBookedLessons().size();
          j++
        ) { //for each lesson
          System.out.println(temp.get(j)); //print lesson
        }
      }
    } else { //if member is not found
      System.out.println("Person Name Not Found"); //print message
      return;
    }
  }

  //Use Case 3 (display Instructors Lessons)
  public static void displayInstructorLessons(
    List<Instructor> instructorList,
    List<Novice> noviceList,
    List<MBLH> MBHLList
  ) { //display lessons of instructors
    printInstructors(instructorList); //print instructors
    Scanner inp = new Scanner(System.in); //create scanner
    System.out.println("Enter Instructor Name"); //print message
    String name = inp.nextLine(); //get name of instructor
    int insIndex = getInstructor(instructorList, name); //get index of instructor
    if (instructorList.get(insIndex).getProvides()) { //if instructor provides lessons
      List<String> temp = new ArrayList<String>(); //create temporary list of lessons
      //for Novice
      int[] result = findAndGetObject( //find member and get index of member
        noviceList,
        MBHLList,
        instructorList.get(insIndex).getMemberName()
      ); //find member and get index of member
      if (result[0] == 0) { //if member is novice
        if (noviceList.get(result[1]).getBookedLessons().size() != 0) { //if member has lessons
          temp = noviceList.get(result[1]).getBookedLessons(); //add lessons to temporary list
        }
      } else { //if member is MBH
        System.out.println("Member Name Not Found!"); //print message
        return; //return
      }
      //for MBLH
      List<String> temp2 = new ArrayList<String>(); //create temporary list of lessons
      for (int i = 0; i < MBHLList.size(); i++) { //for each member
        if (MBHLList.get(i).getBookedLessons().size() != 0) { //if member has lessons
          for (int j = 0; j < MBHLList.get(i).getBookedLessons().size(); j++) { //for each lesson
            if (
              MBHLList
                .get(i)
                .getBookedLessons()
                .get(j)
                .contains(instructorList.get(insIndex).getName()) //if lesson is provided by instructor
            ) { //if lesson is provided by instructor
              temp2.add( //add lesson to temporary list
                "Member Name = " +
                MBHLList.get(i).getName() +
                " " +
                MBHLList.get(i).getBookedLessons().get(j) //add lesson to temporary list
              );
            }
          }
        }
      }
      if (temp.size() != 0) { //if temporary list has lessons
        System.out.println("\nLesson Booked By Novice Member\n"); //print message
        System.out.println( //print message
          "Member Name = " + instructorList.get(insIndex).getMemberName()
        );
        temp = temp.stream().sorted().collect(Collectors.toList()); //sort lessons
        for (String string : temp) {
          System.out.println(string); //print lesson
        }
      }
      if (temp2.size() != 0) {
        System.out.println("\nLesson Booked By MBLH Member\n");
        temp2 = temp2.stream().sorted().collect(Collectors.toList()); //sort lessons
        for (String string : temp2) {
          System.out.println(string); //print lesson
        }
      }
    } else { //if instructor does not provide lessons
      System.out.println("Instructor Has No Booked Lesson"); //print message
    }
  }

  //Use Case 4 (Hire Motorboat for MBLH)
  public static void hireMotorBoatforMBLH( //hire motorboat for MBLH
    List<MBLH> MBHLList,
    List<Motorboat> motorboatList,
    List<Novice> noviceList
  ) {
    System.out.println("MBLH Members are:\n"); //print message
    for (int i = 0; i < MBHLList.size(); i++) { //for each member
      System.out.println(MBHLList.get(i).getName()); //print member name
    }
    Scanner inp = new Scanner(System.in); //create scanner
    System.out.println("Enter Member Name"); //print message
    String name = inp.nextLine(); //get name of member
    int[] result = findAndGetObject(noviceList, MBHLList, name); //find member and get index of member
    if (result[0] == 1) { //if member is MBH
      if (MBHLList.get(result[1]).getNumOfHires() == 2) { //if member has 2 motorboats
        System.out.println( //print message
          "This Member Has Reached His Limit of Hiring Motorboats"
        );
        return; //return
      } else { //if member has less than 2 motorboats
        System.out.println( //print message
          "This Member Currently has Hired " +
          MBHLList.get(result[1]).getNumOfHires() +
          " MotorBoats"
        );
        System.out.println("\nBooking Lesson for This Member\nEnter day (1-7)"); //print message
        int day = inp.nextInt(); //get day
        day--; //subtract 1 from day
        System.out.println("\nEnter Time in This Format (HH:00)"); //print message
        Scanner line = new Scanner(System.in); //create scanner
        String time = line.nextLine(); //get time
        String sc = "Day = " + String.valueOf(day + 1) + " Time = " + time; //create string for lesson
        if (checkIfHaveLessonAtTime(MBHLList, result[1], sc)) { //if member has lesson at time
          System.out.println(
            "Member Has Already Booked a Lesson at this Time Slot"
          );
          return; //return
        } else {
          int bookedIndex = getIndexOfMotorBoatTime( //get index of motorboat at time
            motorboatList.get(0),
            day,
            time
          );
          if (bookedIndex != -1) { //if motorboat is booked at time
            PrintAvailableMotorBoats(motorboatList, day, bookedIndex); //print available motorboats
            System.out.println("Enter The Name of The Motorboat"); //print message
            String bname = line.nextLine(); //get name of motorboat
            int boatIndex = findMotorboat(bname, motorboatList); //find motorboat and get index of motorboat
            if (boatIndex != -1) {
              motorboatList
                .get(boatIndex)
                .getSchedule()
                .get(day)
                .getBooked()
                .set(bookedIndex, 1); //set motorboat as booked at time
              System.out.println("Motorboat Hired Successfully!\nDetails:\n"); //print message
              System.out.println(
                "Day = " +
                String.valueOf(day + 1) +
                " Time = " +
                time +
                "\nMotorBoat = " +
                bname
              ); //print message
              int numOfHired = MBHLList.get(result[1]).getNumOfHires(); //get number of hired motorboats
              numOfHired++; //increment number of hired motorboats
              MBHLList.get(result[1]).setNumOfHires(numOfHired); //set number of hired motorboats
            } else {
              System.out.println("No Motorboat Exist with This Name!"); //print message
            }
          } else { //if motorboat is not booked at time
            System.out.println("No MotorBoat Found at Given Slot"); //print message
          }
        }
      }
    } else { //if member is not MBH
      System.out.println("Member with this Name not Found!"); //print message
    }
  }

  //This Function Checks if Member Has Already Booked a Lesson at Given Time Slots (Helper Function for Use case 4)
  public static Boolean checkIfHaveLessonAtTime(
    List<MBLH> MBHLList,
    int index,
    String slot
  ) {
    for (int i = 0; i < MBHLList.get(index).getBookedLessons().size(); i++) { //for each lesson
      if (MBHLList.get(index).getBookedLessons().get(i).contains(slot)) { //if lesson is at time slot
        return true;
      }
    }
    return false;
  }

  //This Function find Index of the Time Slot on Given Day (Helper Function for Use case 4)
  public static int getIndexOfMotorBoatTime(
    Motorboat motorboat,
    int day,
    String time
  ) {
    for (
      int i = 0;
      i < motorboat.getSchedule().get(day).getBooked().size();
      i++
    ) { //for each time slot
      if (
        motorboat.getSchedule().get(day).getTime().get(i).equalsIgnoreCase(time) //if time slot is at time
      ) {
        return i; //return index of time slot
      }
    }
    return -1; //return -1 if time slot is not found
  }

  //Use Case 5 (Display Motorboat Bookings)
  public static void displayMotorBoatBookings(List<Motorboat> motorboatList) {
    System.out.println("Motorboats owned by the Club are:"); //print message
    for (int i = 0; i < motorboatList.size(); i++) { //for each motorboat
      System.out.println(motorboatList.get(i).getName()); //print motorboat name
    }
    Scanner inp = new Scanner(System.in); //create scanner
    System.out.println("Enter The Name of The Motorboat"); //print message
    String name = inp.nextLine(); //get name of motorboat
    int boatIndex = findMotorboat(name, motorboatList); //find motorboat and get index of motorboat
    if (boatIndex != -1) { //if motorboat is found
      printMotorBoatBookings(motorboatList.get(boatIndex)); //print motorboat bookings
    } else {
      System.out.println("No Motorboat exist with this name"); //print message
    }
  }

  //Helper Function That prints MotorBoat Bookings of an Individual Motorboat of a week
  public static void printMotorBoatBookings(Motorboat motorboat) {
    String format = "%-" + 15 + "s"; //create string for formatting
    String format2 = "%-" + 5 + "d"; //create string for formatting
    int number = 1;
    System.out.println("\nNo.   Day\t    Time\t  Status\n"); //print message
    for (int i = 0; i < motorboat.getSchedule().size(); i++) { //for each day
      int d = motorboat.getSchedule().get(i).getDay(); //get day
      for (
        int j = 0;
        j < motorboat.getSchedule().get(i).getBooked().size();
        j++
      ) { //for each time slot
        if (motorboat.getSchedule().get(i).getBooked().get(j) == -1) { //if time slot is not booked
          System.out.format(format2, number++); //print number of time slot

          System.out.format(format, getWeekDay(d)); //print day of week
          System.out.println(
            motorboat.getSchedule().get(i).getTime().get(j) + "\t Available"
          ); //print time slot and status
        } else if (motorboat.getSchedule().get(i).getBooked().get(j) == 0) { //if time slot is booked
          System.out.format(format2, number++); //print number of time slot

          System.out.format(format, getWeekDay(d)); //print day of week
          System.out.println(
            motorboat.getSchedule().get(i).getTime().get(j) +
            "\t Booked For Lesson"
          ); //print time slot and status
        } else {
          System.out.format(format2, number++); //print number of time slot

          System.out.format(format, getWeekDay(d)); //print day of week
          System.out.println(
            motorboat.getSchedule().get(i).getTime().get(j) +
            "\t Booked For Hire"
          ); //print time slot and status
        }
      }
    }
  }

  //Helper Function the Find the Motorboat with Given Name
  public static int findMotorboat(String name, List<Motorboat> motorboatList) {
    for (int i = 0; i < motorboatList.size(); i++) { //for each motorboat
      if (motorboatList.get(i).getName().equalsIgnoreCase(name)) { //if motorboat name is same as given name
        return i;
      }
    }
    return -1;
  }

  //Randomly Fill Novice Data
  public static void fillNoviceData(
    List<Novice> noviceList,
    List<Instructor> instructorList,
    List<Motorboat> motorboatList
  ) {
    //Randomly Filling the Data for Novice Members
    for (int i = 0; i < 10; i++) { //for each novice member
      Random rand = new Random(); //create random object
      int numOfLessons = rand.nextInt(4); //get random number of lessons
      if (numOfLessons != 0) { //if number of lessons is not 0
        instructorList.get(i).setProvides(true); //set instructor to provide lessons
        for (int j = 0; j < numOfLessons; j++) { //for each lesson
          int day = rand.nextInt(7); //get random day
          int time = rand.nextInt(10); //get random time
          Lesson obj = instructorList.get(i).getLesson().get(day); //get lesson object
          if (obj.getBooked().get(time) == true && obj.getDay() == day) { //if time slot is already booked
            j--; //decrease j by 1
            continue; //continue to next iteration
          } else { //if time slot is not booked
            obj.getBooked().set(time, true); //set time slot to booked
            String motorBoatName = ""; //create string for motorboat name
            int mName = rand.nextInt(10); //get random number of motorboat name
            while (true) { //while true
              Motorboat motorboat = motorboatList.get(mName); //get motorboat object
              if (
                motorboat.getSchedule().get(day).getDay() == day && //if day is same as day of lesson
                motorboat.getSchedule().get(day).getBooked().get(time) != -1
              ) { //if time slot is not available
                mName = rand.nextInt(10); //get random number of motorboat name
              } else { //if time slot is available
                motorBoatName = motorboat.getName(); //get motorboat name
                motorboat.getSchedule().get(day).getBooked().set(time, 0); //set time slot to booked
                break; //break while loop
              }
            }
            // System.out.println(motorBoatName);
            String sc =
              "Day = " +
              String.valueOf(day) +
              " Time = " +
              obj.getTime().get(time) +
              "\nMotorBoat = " +
              motorBoatName; //create string for schedule
            noviceList.get(i).setNumOfLessons(numOfLessons); //set number of lessons
            noviceList.get(i).getBookedLessons().add(sc); //add schedule to booked lessons
          }
        }
      }
    }
  }

  //Randomly Fill MBLH Data
  public static void fillMBLHData(
    List<MBLH> MBHLList,
    List<Motorboat> motorboatList
  ) {
    //Randomly Filling Data for MBLH Members
    for (int i = 0; i < 10; i++) { //for each MBLH member
      Random rand = new Random(); //create random object
      int numOfHired = rand.nextInt(3); //get random number of hired boats
      if (numOfHired != 0) { //if number of hired boats is not 0
        MBHLList.get(i).setNumOfHires(numOfHired); //set number of hired boats
        MBHLList.get(i).setHired(true); //set MBLH to be hired
        for (int j = 0; j < numOfHired; j++) { //for each hired boat
          int mName = rand.nextInt(10); //get random number of motorboat name
          int day = rand.nextInt(7); //get random day
          int time = rand.nextInt(10); //get random time

          while (true) { //while true
            Motorboat motorboat = motorboatList.get(mName); //get motorboat object
            if (
              motorboat.getSchedule().get(day).getDay() == day &&
              motorboat.getSchedule().get(day).getBooked().get(time) != -1
            ) { //if day is same as day of lesson
              mName = rand.nextInt(10); //get random number of motorboat name
            } else { //if day is different from day of lesson
              motorboat.getSchedule().get(day).getBooked().set(time, 1); //set time slot to booked
              break; //break while loop
            }
          }
        }
      }
    }
  }
}