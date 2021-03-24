 public class HireDate {
        String month;
        String day;
        String year;


        public HireDate(String month, String date, String year) {
                this.month = month;
                this.day = date;
                this.year = year;
        }

        public String getMonth(){
                return month;
        }
        public void setMonth(String month){
                this.month = month;
        }
        public String getDay(){
                return day;
        }
        public void setDay(String date){
                this.day = date;
        }
        public String getYear(){
                return year;
        }
        public void setYear(String year){
                this.year = year;
        }

        @Override
        public String toString() {
                return month + "/" + day + "/" + year;
        }
}
