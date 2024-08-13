import java.util.Scanner; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualApp{
public static void main(String[] args){
 
Scanner scanner = new Scanner(System.in);
DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

String userInformation = """
			Welcome to Semicolon menstrual app.
			Kindly follow the information below to get your mestrual date and info.
			""";
System.out.println(userInformation);   

System.out.println("Enter the last day you have your period: ");
String lastDateOfFlow = scanner.next();

System.out.print("How many days did you always see your flow: ");
int flowDate = scanner.nextInt();

System.out.print("How many days is your cycle: ");
int cycleDays = scanner.nextInt();

LocalDate lastFlow = LocalDate.parse(lastDateOfFlow, newFormat);

LocalDate nextFlowDate = lastFlow.plusDays(cycleDays);

LocalDate nextFlowDateEnds = nextFlowDate.plusDays(flowDate - 1);

LocalDate firstSafePeriod = nextFlowDateEnds.plusDays(1);

LocalDate firstSafePeriodEnds = firstSafePeriod.plusDays(flowDate - 1);

LocalDate ovalutionStartDate = firstSafePeriodEnds.plusDays(1);

LocalDate ovalutionHitDay = ovalutionStartDate.plusDays(flowDate-2);

LocalDate ovalutionEndDate = ovalutionHitDay.plusDays(flowDate-1);

LocalDate secondSafePeriodStarts = ovalutionEndDate.plusDays(1);

LocalDate secondSafePeriodEnds = nextFlowDate.plusDays(cycleDays);


System.out.println("Your next period Date is on "+nextFlowDate);
System.out.println("Your next period End day is : "+nextFlowDateEnds);
System.out.println("Your next first Safe period is "+firstSafePeriod+" and it ends on "+firstSafePeriodEnds);
System.out.println("Your next ovaluation period start on  "+ovalutionStartDate);
System.out.println("Your Hit ovalution day is on "+ovalutionHitDay);
System.out.println("Your ovaulation period ends on "+ovalutionEndDate);
System.out.println("Your next second safe period is starting on "+secondSafePeriodStarts+" and ends on "+secondSafePeriodEnds);









		}

	}
