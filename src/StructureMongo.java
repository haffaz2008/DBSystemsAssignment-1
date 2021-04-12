public class StructureMongo {
    private int ID;
    private String datetime;
    private int year;
    private String month;
    private int mDate;
    private String day;
    private int Time;
    private String sensorID;
    private String sensorNAme;
    private int hourlyCount;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getmDate() {
        return mDate;
    }

    public void setmDate(int mDate) {
        this.mDate = mDate;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public String getSensorNAme() {
        return sensorNAme;
    }

    public void setSensorNAme(String sensorNAme) {
        this.sensorNAme = sensorNAme;
    }

    public int getHourlyCount() {
        return hourlyCount;
    }

    public void setHourlyCount(int hourlyCount) {
        this.hourlyCount = hourlyCount;
    }


}
