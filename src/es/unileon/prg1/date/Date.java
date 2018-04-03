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
		return this.getMonthName(this.getMonth());
	}
	
	public String getMonthDaySame(){
		return this.getMonthDaySame(this.getMonth());
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
	
	boolean isMonthDayOk(){
	boolean ok=false;
	switch(this.month){
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		if(this.day<=31){
		ok=true;
		}
		else		
		ok=false;	
	break;
	case 2:
		if(this.day<=28){
		ok=true;
		}
		else
		ok=false;	
	break;
	case 4://next
	case 6://next
	case 9://next
	case 11:
		if(this.day<=30){
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

	//TODO el metodo de Fechas hasta fin de mes
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

	private String getMonthDaySame(int i){
	String name=null;
	switch(i){
	case 1:
		name="El propio Enero,Marzo,Mayo,Julio,Agosto,Octubre y Diciembre";
	break;
	case 2:
		name="Febrero es el unico mes con 28 dias";
	break;
	case 3:
		name="Enero,el propio Marzo,Mayo,Julio,Agosto,Octubre y Diciembre";
	break;
	case 4:
		name="El propio Abril,Junio,Septiembre y Noviembre";
	break;
	case 5:
		name="Enero, Marzo,el propio Mayo,Julio,Agosto,Octubre y Diciembre";
	break;
	case 6:
		name="Abril,el propio Junio,Septiembre y Noviembre";
	break;
	case 7:
		name="Enero,Marzo,Mayo,el propio Julio,Agosto,Octubre y Diciembre";
	break;
	case 8:
		name="Enero,Marzo,Mayo,Julio,Agosto,el propio Octubre y Diciembre";
	break;
	case 9:
		name="Abril,Junio,el propio Septiembre y Noviembre";
	break;
	case 10:
		name="Enero,Marzo,Mayo,Julio,Agosto,el propio Octubre y Diciembre";
	break;
	case 11:
		name="Abril,Junio,Septiembre y el propio Noviembre";
	break;
	case 12:
		name="Enero,Marzo,Mayo,Julio,Agosto,Octubre y el propio Diciembre";
	break;
	}
	return name;
	}

	public String DaysLeftEndYear(){
	int counter=0;
	Date CountDays= new Date(this.day,this,month,this.year);
	for (int i=1;i<=this.month;i++){
		if(i==this.month){
			for (int j=1;j<=this.day;j++){
			counter=counter+1;
			}
		}
		else{
			for (int j=1;CountDays.isDayMonthOk(i)==true;j++){
			CountDays.day=j+1;
			counter=counter+1;
			}
			CountDays.day=this.day;
		}
	}
	return counter;
	}
}
