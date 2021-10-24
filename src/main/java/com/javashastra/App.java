package com.javashastra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws ParseException, JsonProcessingException {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formater.parse("01-01-2020");
        Channel ch = new Channel("", null, 10000,date);
        ObjectMapper mapper = new ObjectMapper();
       // mapper.setDateFormat(formater);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        //mapper.setTimeZone(TimeZone.getDefault());


        //Converting java objects into json files

       /* mapper.writeValue(new File("C:\\JavaShastra\\javaShastra.json"), ch);
        String data = mapper.writeValueAsString(ch);
        System.out.println(data);*/


        //Converting  java objects from json file

        /*Channel ch1= mapper.readValue(new File("C:\\JavaShastra\\javaShastra.json"),Channel.class);
        System.out.println(ch1.getName());*/


        //Writing java objects into json String

        // String data = mapper.writeValueAsString(ch);


        //Converting java objects from json String

        /* String data = "{\"name\":\"Java Shastra\",\"category\":\"Educational\",\"subscribers\":10000}";
           Channel ch1 = mapper.readValue(data, Channel.class);
           System.out.println(ch1.getSubscribers());
         */


        //String data = mapper.writeValueAsString(ch);

        //@ignoreProperties example
        /*String data="{\n" +
                "  \"channel-name\" : \"Java Shastra\",\n" +
                "  \"channel-category\" : \"Educational\",\n" +
                "  \"subscribers\" : 10000,\n" +
                "  \"description\" : \"Educational videos will upload\"\n" +
                "}";

        Channel ch1=mapper.readValue(data,Channel.class);
        System.out.println(ch1.getName());*/

        String data = mapper.writeValueAsString(ch);
        System.out.println(data);
        //Channel ch1=mapper.readValue(data,Channel.class);
        //System.out.println(ch1.getName());

    }
}


