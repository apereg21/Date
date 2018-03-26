package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	boolean isSameDay(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSame(Date another){
		if ( (this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear()) ){
			return true;
		}
		return false;
	}
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

	public String getMonthName(){
	String name=null;
	switch(this.month){
	case 1:
		name="Enero";
	break;
	case 2:
		name="Febrero";
	break;
	case 3:
		name="Marzo";
	break;
	case 4:
		name="Abril";
	break;
	case 5:
		name="Mayo";
	break;
	case 6:
		name="Junio";
	break;
	case 7:
		name="Julio";
	break;
	case 8:
		name="Agosto";
	break;
	case 9:
		name="Septiembre";
	break;
	case 10:
		name="Octubre";
	break;
	case 11:
		name="Noviembre";
	break;
	case 12:
		name="Diciembre";
	break;
	}
	return name;
	}
	
	public String getMonthSeason(){
	String name=null;
	switch(this.month){
	case 1://next
	case 2://next
	case 3://next
		name="Invierno";
	break;
	case 4://next
	case 5://next
	case 6://next
		name="Primavera";
	break;
	case 7://next
	case 8://next
	case 9://next
		name="Verano";
	break;
	case 10://next
	case 11://next
	case 12://next
		name="Otonio";
	break;
	}
	return name;
	}
	
	boolean isMonthDayOk(){
	boolean ok=false;
	switch(this.month){
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12://next
		if(this.day<=31){
		ok=true;
		}		ok=false;	
	break;
	case 2://next
		if(this.day<=28){
		ok=true;
		}
		ok=false;	
	break;
	case 4://next
	case 6://next
	case 9://next
	case 11://next
		if(this.day<=30){
		ok=true;
		}
		ok=false;	
	break;
	}
	return ok;
	}

}
