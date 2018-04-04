package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		
		this.year = year;
		this.month = month;
		this.day = day;
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
		return this.getMonthName(this.month);
	}
	
	public boolean isMonthDayOk(){
		return this.isMonthDayOk(this.getMonth());
	}
	
	private String getMonthName(int i){
	String name=null;
	switch(i){
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
	
	private int getMonthLastDay(){
	int lastDay=1;
	switch(this.month){
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		lastDay=31;		
	break;
	case 2:
		lastDay=28;	
	break;
	case 4://next
	case 6://next
	case 9://next
	case 11:
		lastDay=30;	
	break;
	}
	return lastDay;
	}

	private boolean isMonthDayOk(int i){
	boolean ok=false;
	switch(i){
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		if(this.day>=0 &&  this.day<=31){
		ok=true;
		}
		else		
		ok=false;	
	break;
	case 2:
		if(this.day>=0 && this.day<=28){
		ok=true;
		}
		else
		ok=false;	
	break;
	case 4://next
	case 6://next
	case 9://next
	case 11:
		if(this.day>=0 && this.day<=30){
		ok=true;
		}
		else
		ok=false;	
	break;
	}
	return ok;
	}
	public String monthsLeft(){
	StringBuffer monthsLeft=new StringBuffer();
	for(int i = this.month+1; i<=12;i++){
		monthsLeft.append(this.getMonthName(i)+",");
	}
	return monthsLeft.toString();
	}

	
	public String DatesLeftMonth(){
	StringBuffer DatesLeft=new StringBuffer();
	for(int i=this.day;i<=31;i++){
	Date left;	
	left = new Date(i,this.month,this.year);
		if(left.isMonthDayOk()==true){
		DatesLeft.append(left+"\n");
		}
	}
	return DatesLeft.toString();
	}

	public String sameMonthsWithSameDays(){
	StringBuffer sameMonthsWithSameDays= new StringBuffer();
		for(int i=1;i<=12;i++){
		Date sameDay= new Date(this.day,i,this.year);
			if(this.getMonthLastDay()==sameDay.getMonthLastDay()){
			sameMonthsWithSameDays.append(this.getMonthName(i)+", ");
			}
		}
	return sameMonthsWithSameDays.toString();
	}
	
	public int DaysStartYear(){
	int counter=0;
	Date countDays= new Date(this.day,this.month,this.year);
		for (int i=1;i<=this.month;i++){
			if(i==this.month){
				for (int j=1;j<=this.day;j++){
				counter=counter+1;
				}
			}
			else{
				for (int j=1;countDays.isMonthDayOk(i)==true;j++){
				countDays.day=j+1;
				counter=counter+1;
				}
			countDays.day=this.day;
			}
	
		}
	return counter;
	}	
}
