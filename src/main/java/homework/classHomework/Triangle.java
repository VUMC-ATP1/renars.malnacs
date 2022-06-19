package homework.classHomework;

public class Triangle {

    int sideA;
    int sideB;
    int sideC;
    double triangleArea;


    public boolean checkAllSides() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean checkTwoSides() {
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }

    public Triangle() {
        System.out.println("Creating new triangle!");
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        /*
         * Izmantoju internetā atrodamo Hērona formulas aprēķina paraugu:
         * Area of any triangle = sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree))
         * Where s = (sideOne + sideTwo + sideThree)/2
         *
         * Uzdevumā bija teikts, ka malām jābūt veseliem skaitļiem (Int), taču, izmantojot veselus skaitļus, trijstūra laukuma aprēķins sanāk nepareizs. Tāpēc formulā veselos skaitļus pārkonvertēju uz double.
         * Aprēķina rezultātu validēju, izmantojot šo online kalkulatoru - https://www.inchcalculator.com/herons-formula-calculator/
         *
         */
        double s = ((double) sideA + (double) sideB + (double) sideC)/2;
        this.triangleArea = Math.sqrt(s * (s - (double) sideA) * (s - (double) sideB) * (s - (double) sideC));
    }

}
