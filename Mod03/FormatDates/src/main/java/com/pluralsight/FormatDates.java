package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.ZonedDateTime;




public class FormatDates {

    public static void main(String[] args) {

   //09/05/2021
        //2021-09-05
        //September 5, 2021
        //Sunday, Sep 5, 2021 10:02 - display in GMT

        LocalDateTime nowTime = LocalDateTime.now();
        String userInput;

        DateTimeFormatter formatterOne = DateTimeFormatter.ofPattern("09/05/2021");
        System.out.println("Format 1 : " + nowTime.format(formatterOne));

        DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("2021-09-05");
        System.out.println("Format 2 :" + nowTime.format(formatterTwo));

        userInput = "Sept 5,2021";
        DateTimeFormatter formatterThree = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate date = LocalDate.of(2021,9,5);
        String formattedDate = date.format(formatterThree);
        System.out.println("Format 3: " + formattedDate);

        ZonedDateTime gmtTime = nowTime.atZone(ZoneId.of("GMT"));
        DateTimeFormatter formatterFour = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        LocalDateTime gmtDate = LocalDateTime.of(2021,9,5,10,2);
        System.out.println("Format 4: "+ gmtDate);




    }


}
