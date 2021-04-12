import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    private static List<StructureMongo> entries = new ArrayList<StructureMongo>();

    public static void main(String[] args) {
        String sourceFilePath= "C://Users//haffa//IdeaProjects//CSV//SensorCount.csv";
        String destinationFilePath= "C://Users//haffa//IdeaProjects//CSV//SensorCountApacheMain2.csv";

        System.out.println("starting read user.csv file");
        readCsv(sourceFilePath);

        System.out.println("starting write user.csv file: " + destinationFilePath);
        writeCsv(destinationFilePath);
    }
    public static void writeCsv(String filePath) {

        List <String> checkDuplicate = new ArrayList<>();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);


            fileWriter.append("Id, Hourly_Count, Sensor_Info.SensorID, Date_Time_Embed.Date_Time, Date_Time_Embed.Year, Date_Time_Embed.Month, Date_Time_Embed.Mdate, Date_Time_Embed.Day, Date_Time_Embed.Time, \n");



            for(StructureMongo u: entries) {


                {
                    fileWriter.append(String.valueOf(u.getID()));
                    fileWriter.append(",");
                    fileWriter.append(String.valueOf(u.getHourlyCount()));
                    fileWriter.append(",");
                    fileWriter.append(u.getSensorID());
                    fileWriter.append(",");
                    fileWriter.append(u.getDatetime());
                    fileWriter.append(",");
                    fileWriter.append(String.valueOf(u.getYear()));
                    fileWriter.append(",");
                    fileWriter.append(u.getMonth());
                    fileWriter.append(",");
                    fileWriter.append(String.valueOf(u.getmDate()));
                    fileWriter.append(",");
                    fileWriter.append(u.getDay());
                    fileWriter.append(",");
                    fileWriter.append(String.valueOf(u.getTime()));
                    fileWriter.append("\n");
                    checkDuplicate.add(u.getDatetime());
                }
//
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void readCsv(String filePath) {
        BufferedReader reader = null;

        try {

            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                if (fields.length > 0) {
                    StructureMongo user = new StructureMongo();
                    user.setID(Integer.parseInt(fields[0]));
                    user.setDatetime(fields[1]);
                    user.setYear(Integer.parseInt(fields[2]));
                    user.setMonth(fields[3]);
                    user.setmDate(Integer.parseInt(fields[4]));
                    user.setDay(fields[5]);
                    user.setTime(Integer.parseInt(fields[6]));
                    user.setSensorID(fields[7]);
                    user.setSensorNAme(fields[8]);
                    user.setHourlyCount(Integer.parseInt(fields[9]));

                    entries.add(user);
                }
            }

//            for (JavaForCSVManipulation.StructureMongo u : entries) {
//                System.out.printf("[Id=%d, DateTime=%s, Year=%d, Month=%s, Mdate=%d, Day=%s, Time=%d, Sensor_ID=%s, Sensor_Name=%s, Hourly_Count=%d]\n", u.getID(), u.getDatetime(), u.getYear(), u.getMonth(), u.getmDate(), u.getDay(), u.getTime(), u.getSensorID(), u.getSensorNAme(), u.getHourlyCount());
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
