
import java.util.*;
class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Shrilanka","Columbo");
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("Afghanistan", "Kabul");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the country name: ");
        String country = input.next();

        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        }
        else{
            System.out.println("Sorry, We don't know the capital.");
        }
    }
}
