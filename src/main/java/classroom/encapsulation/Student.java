package classroom.encapsulation;

import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
public class Student extends Person {

    private final String MAIL_DOMAIN = "@lu.lv";
    public int graduationYear;

   @Getter
   private String email;
    // email = account.name + MAIL_DOMAIN (nikita.milka@lu.lv)


    public Student(String accountName) {
        this.email = accountName + MAIL_DOMAIN;
        // "" = nikita.milka@lu.lv
    }



    public void setEmail(String email) {
        if(this.email.equals(MAIL_DOMAIN)) {
            this.email = email;
        } else {
            System.out.printf("Your e-mail is: %s which is correct one, and it will be not changed\n", this.email);
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        if(graduationYear > 2022) {
            System.out.println("value cannot be set! Current year is 2022");
        } else {
            this.graduationYear = graduationYear;
        }
    }



}

