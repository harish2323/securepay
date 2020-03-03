package Utilities;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class RandomData {



    static Faker faker = new Faker(new Locale("en-AU"));

    public static String get_contact_reason() {
        String[] contact_reasons = {"Support", "Accounts"};
        Random rand = new Random();
        return  contact_reasons[rand.nextInt(contact_reasons.length)] ;
    }

    public static String get_first_name() {
      return faker.name().firstName();
    }

    public static String get_last_name(){
       return faker.name().lastName();
    }

    public static String get_email_address(){
        return faker.internet().emailAddress();
    }

    public static String get_phone_number() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String get_Website_url() {
        return faker.internet().url();
    }

    public static String get_company_name() {
       return faker.company().name();
    }

    public static String get_paragraph_message(){
        return faker.lorem().paragraph();
    }

}
