public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	
	public static void main(String args[]) {

        int pickedYear = Integer.parseInt(args[0]);
	    advance(pickedYear);

	 }
	
	 private static void advance(int s) {

		while(year <= s){

			for (int month = 1; month <= 12; month++) {
		
				for (int dayOfMonth = 1; dayOfMonth <= nDaysInMonth(month, year); dayOfMonth++){

						String date = (dayOfMonth + "/" + month + "/" + year);

                        if (dayOfWeek == 8){

                            dayOfWeek = 1;
                        }

						if (year == s && dayOfWeek == 1){

							System.out.println(date + " Sunday");

						} else if (year == s){

							System.out.println(date);

						}

						dayOfWeek++;

					}
				}
	
				year++;

			}
		} 

	private static boolean isLeapYear(int year) {

	    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

			return true;
		}

		return false;
	}

	private static int nDaysInMonth(int month, int year) {
		
		if ((isLeapYear(year)) && (month == 2)){

			return 29;
			
		}

		else if (month == 2){
			
			return 28;

		}

		else if((((double) month % 2 == 0) && (month <= 6)) || ((double) month % 2 != 0 && month > 7)) {

			return 30;

		}

		else {

			return 31;

		}
	}
}
