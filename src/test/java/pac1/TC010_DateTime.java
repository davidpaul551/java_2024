package pac1;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TC010_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant CurrentTime=Instant.now();
		System.out.println("CurrentTime is : "+ CurrentTime);
		
		LocalDate now = LocalDate.now();
		System.out.println("LocalDate is : "+now);
		
		System.out.println("Today : "+ now);
		System.out.println("Tomorrow : "+now.plusDays(1));
		System.out.println("Yesterday : "+now.minusDays(1));
		System.out.println("Last Month : "+now.minusMonths(1));
		System.out.println("Is Leap ?  : "+now.isLeapYear());
		
		
		ZonedDateTime CT = ZonedDateTime.now();
		System.out.println("Current Time Zone : "+ CT);
		ZonedDateTime CT_Paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Current Time Zone : "+ CT_Paris);
		System.out.println("Tomorrow in Paris : "+CT_Paris.plusDays(1));
		System.out.println("Yesterday in Paris : "+CT_Paris.minusDays(1));
		System.out.println("Last Month in Paris : "+CT_Paris.minusMonths(1));
		
		ZonedDateTime CT_California = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Time Zone : "+ CT_California);
		
		
		LocalDate Start = LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate end = LocalDate.now();
		Period period = Start.until(end);
		
		System.out.println("Years : "+ period.get(ChronoUnit.YEARS));
		System.out.println("Months : "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Days : "+ period.get(ChronoUnit.DAYS));
		System.out.println();
		

		
		
		
		
		
		
		
		
		
		
		
		
		




		
		
		
	}

}
