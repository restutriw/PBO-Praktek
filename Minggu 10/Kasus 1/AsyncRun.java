package minggu.pkg10.kasus.pkg1;

public class AsyncRun implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
            System.out.println("AsyncRun.run on thread " +
            Thread.currentThread().getId());
            throw new ArithmeticException();
        }catch(Exception ex){
            System.out.println(ex.getClass().getName()+" handled");
        }
    }
        
    public static void main( String[] args ) {
        try {
        Thread t = new Thread(new AsyncRun());
        t.start();
        System.out.println( "main on thread " + Thread.currentThread().getId());
        throw new NullPointerException();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getClass().getName() + " handled");
        }
    }
}
