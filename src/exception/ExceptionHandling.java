package exception;

public class ExceptionHandling {
    static void main(String[] args) {
        int nums[] = {2, 3};
        System.out.println("program started");

        try {
            System.out.println("result is: "+ 5/0);
            System.out.println(nums[5]);                                           //error prone code
            //  } catch (Exception e) {                                            //using generic exception for now
        } catch (ArrayIndexOutOfBoundsException  e){                               //can use Arithmetic exception here like  } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("inside catch block");
        //    e.printStackTrace();                                                 //to print details of exception
            System.out.println("Message is:" +e.getMessage());
            System.out.println("Exception is:"+ e.getClass().getName());
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured");
        } catch (Exception e) {
            System.out.println("rest of exceptions");                               //if you dont know what exception may occur but not good practice
        }
        finally {
            System.out.println("Finally block executed");                          //finally runs regardless weather there is exception or not
        }
            System.out.println("program ended");
    }
}
