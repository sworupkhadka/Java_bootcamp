public class DataType {
    public static void main(String[] args) {
        //data type
        // non-decimal numbers
        byte age;                                    // byte stores -128 to 127
        age=127;
        System.out.println(age);

        short zipCode;                              // short stores -32768 to 32767
        zipCode=31780;
        System.out.println(zipCode);

        int landLine;
        landLine=737639;
        System.out.println(landLine);

        long phoneNumber;
        phoneNumber=986720107;
        System.out.println(phoneNumber);

        //Decimal numbers
        float price;
        // float is used to store decimal numbers with single precision (less accurate)
        // it uses 32 bits of memory and must end with 'f' or 'F'
        price = 1200.332f;
        System.out.println(price);

        double salary;
        // double is used to store decimal numbers with double precision (more accurate)
        // it uses 64 bits of memory and is the default data type for decimal values
        salary=240000.890324454353453454353454355435;
        System.out.println(salary);

        //character
        char gender='M';                           //single word,number.
        char choice='y';
        System.out.println(gender);
        System.out.println(choice);

        //boolean
        boolean value=true;
        boolean value2=false;
        System.out.println(value);
        System.out.println(value2);

        /*
          default value of non-decimal = 0
          default value of decimal = 0.0
          default value of char = NULL
          default value of boolean = false
         */

    }
}
