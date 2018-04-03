package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today,tomorrow;
		today = new Date(20, 2, 2018);
		tomorrow = new Date(21, 3, 2018);
		
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));

		System.out.println("El mes es: "+tomorrow.getMonthName());
		System.out.println("¿El dia "+tomorrow.getDay()+" del mes "+tomorrow.getMonth()+" es correcto? "+tomorrow.isMonthDayOk());
		System.out.println("¿El dia "+today.getDay()+" del mes "+today.getMonth()+" es correcto? "+today.isMonthDayOk());
		System.out.println("La estacion del mes "+tomorrow.getMonthName()+" es: "+tomorrow.getMonthSeason());
		
		System.out.println("Quedan "+today.monthsLeft());
		System.out.println("Quedan "+tomorrow.monthsLeft());
		System.out.println("La fecha de hoy es: "+today.toString());
		System.out.println("La fecha de maniana es: "+tomorrow.toString());
		
		System.out.println("La fecha de hoy es: "+today.toString());
		System.out.println("La fecha de maniana es: "+tomorrow.toString());
		
		System.out.println("Las fechas antes de fin de mes, sinedo este "+today.getMonthName()+" : "+today.DatesLeftMonth());
		System.out.println(today.getMonthDaySame());
		System.out.println("Quedan "+today.DaysLeftEndYear()+" dias");
		
	}

}
