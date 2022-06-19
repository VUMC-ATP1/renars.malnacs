package classroom.encapsulation;

import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter @Setter
    String name = "John";
    @Getter @Setter
    String lastname = "Doe";
    private boolean hasMood;
    int age = 0;

    // Getter
    public boolean isHasMood() {
        return hasMood;
    }

    public void setHasMood(boolean hasMood) {
        this.hasMood = hasMood;
    }
}
