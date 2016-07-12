
package threads;

/**
 *
 * @author Azael Fann Heian
 */


public class TercerThread {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
            public void run(){
            
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
           public void run(){
               
           } 
        });
        t1.start();
        t2.start();
                
        }
        
    }

