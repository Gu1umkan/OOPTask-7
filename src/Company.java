import java.time.LocalDate;
import java.util.Arrays;

public class Company {
  String companyName;
  String country;
  LocalDate yearFoundation;
  String founder;
  Group[] groups;


  public  Company(String companyName,String country,LocalDate yearFoundation,String founder,Group[] groups){
    this.companyName= companyName;
    this.country = country;
    this.yearFoundation = yearFoundation;
    this.founder = founder;
    this.groups = groups;
  }
 public  void getInfo(){
   System.out.println(STR."""
           Company name: \{companyName}
           Country: \{country}
           Year of faundation: \{yearFoundation}
           Founder : \{founder}

           """);
   for (Group group:groups) {
     System.out.println(group.getInfo());
   }
 }
}
