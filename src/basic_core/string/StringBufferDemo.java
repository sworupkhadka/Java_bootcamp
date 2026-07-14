package basic_core.string;

public class StringBufferDemo {
    public static void main ( String [] args){
        StringBuffer SB= new StringBuffer("hello");

        SB.append("World");                          //adds World after Hello "concatenates"
        System.out.println(SB.hashCode());
        System.out.println(SB);


    }
}


//StringBuffer is Synchronized( one at a time), slow and thread safe
//StringBuilder is Non-synchronized (more than one at a time), fast, not thread safe

/*
Synchronous   (StrungBuffer)                                            Asynchronous (StringBuilder)
Executes one task at a time.                                	Can execute multiple tasks concurrently.
Caller waits for the task to finish.                        	Caller continues without waiting.
when data consistency required                                  when speed required
Blocking.	                                                    Non-blocking
Easier to understand.                                          	More efficient for long-running tasks like network calls.
 */