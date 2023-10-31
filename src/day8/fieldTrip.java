package day8;

public class fieldTrip {
    public static void main(String[] args) {

/*
 2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown

 */

        int grade = 6;
        String gra = "for any other gradeNumber:";
        String loc ="\tlocation - Unknown";
        String num = "\tnumber of groups - 0";
        String teac = "\tteacher in charge - Unknown";

        if (grade>=1 && grade<=6) {
            gra = "grade " + grade;
            loc = "\tlocation - ";
            num = "\tnumber of groups - ";
            teac = "\tteacher in charge - ";

            if (grade == 1) {
                loc += "Apple orchard";
                num += "3";
                teac += "Ms. Smith";

            } else if (grade == 2) {
                loc += "Zoo";
                num += "7";
                teac += "Mr. Lee";
            } else if (grade == 3) {
                loc += "Aquarium";
                num += "5";
                teac += "Ms. Wilson";

            } else if (grade == 4) {
                loc += "Movie theater";
                num += "2";
                teac += "Ms. Reyes";

            } else if (grade == 5) {
                loc += "Museum";
                num += "5";
                teac += "Ms. Lela";

            } else if (grade == 6) {
                loc += "Six Flags";
                num += "8";
                teac += "Mr. Watt";

            }
        }
        System.out.println(gra);
        System.out.println(loc);
        System.out.println(num);
        System.out.println(teac);

    }
}