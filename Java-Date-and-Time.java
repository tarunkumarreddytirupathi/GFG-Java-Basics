/* 




copy the below code and execute in GFG




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;
import java.time.DayOfWeek;

class Result {

   

     public static String findDay(int month, int day, int year) {
        // Create a LocalDate instance
                LocalDate date = LocalDate.of(year, month, day);
        
              // Get the day of the week
                DayOfWeek dayOfWeek = date.getDayOfWeek();
        
               int number=dayOfWeek.getValue();
               
               if(number==1){
                   return "MONDAY";
               }
               else if(number==2){
                   return "TUESDAY";
               }
               else if(number==3){
                   return "WEDNESDAY";
               }
               else if(number==4){
                   return "THURSDAY";
               }
               else if(number==5){
                   return "FRIDAY";
               }
               else if(number==6){
                   return "SATURDAY";
               }else{
                   return "SUNDAY";
               }
        
        }
        }
        
        public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        
                int month = Integer.parseInt(firstMultipleInput[0]);
        
                int day = Integer.parseInt(firstMultipleInput[1]);
        
                int year = Integer.parseInt(firstMultipleInput[2]);
        
                String res = Result.findDay(month, day, year);
        
                bufferedWriter.write(res);
                bufferedWriter.newLine();
        
                bufferedReader.close();
                bufferedWriter.close();
            }
        }
   
     
        
*/