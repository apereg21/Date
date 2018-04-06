package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today,tomorrow;
		today = new Date(1, 7, 2018);
		tomorrow = new Date(11, 11, 2018);

		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow)+"\n");
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow)+"\n");
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow)+"\n");
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow)+"\n");

		System.out.println("El mes es: "+tomorrow.getMonthName()+"\n");
		System.out.println("¿El dia "+tomorrow.getDay()+" del mes "+tomorrow.getMonth()+" es correcto? "+tomorrow.isMonthDayOk()+"\n");
		System.out.println("¿El dia "+today.getDay()+" del mes "+today.getMonth()+" es correcto? "+today.isMonthDayOk()+"\n");
		System.out.println("La estacion del mes "+tomorrow.getMonthName()+" es: "+tomorrow.getMonthSeason()+"\n");
		
		System.out.println("Quedan "+today.monthsLeft()+"\n");
		System.out.println("Quedan "+tomorrow.monthsLeft()+"\n");
		System.out.println("La fecha de hoy es: "+today.toString()+"\n");
		System.out.println("La fecha de maniana es: "+tomorrow.toString()+"\n");
		
		System.out.println("La fecha de hoy es: "+today.toString()+"\n");
		System.out.println("La fecha de maniana es: "+tomorrow.toString()+"\n");
		System.out.println("Las fechas antes de fin de mes, siendo este "+today.getMonthName()+" : "+today.datesLeftMonth()+"\n");
		System.out.println("Las fechas antes de fin de mes, siendo este "+tomorrow.getMonthName()+" : "+tomorrow.datesLeftMonth()+"\n");

		System.out.println("El mes o los meses con el mismo numero de dias es/son "+today.sameMonthsWithSameDays()+"\n");
		System.out.println("El mes o los meses con el mismo numero de dias es/son "+tomorrow.sameMonthsWithSameDays()+"\n");
		System.out.println("Los dias que han pasado desde el inicio del año hasta "+today.toString()+" : "+today.daysStartYear()+"\n");
		System.out.println("Los dias que han pasado desde el inicio del año hasta "+tomorrow.toString()+" : "+tomorrow.daysStartYear()+"\n");
		System.out.println("Se necesitaron "+today.randomDate()+" intentos para adivinar la fecha "+today.toString());
		System.out.println("Se necesitaron "+tomorrow.randomDate()+" intentos para adivinar la fecha "+tomorrow.toString());
		System.out.println("La fecha "+today.toString()+" fue un "+today.dayOfTheWeek());
		System.out.println("La fecha "+tomorrow.toString()+" fue un "+tomorrow.dayOfTheWeek());
	}

}
