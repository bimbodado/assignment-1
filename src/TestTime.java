import java.io.IOException;
import java.util.Arrays;
class TestTime{
	public static void main(String args[]){
		
		double current;
		double[] array= new double[21];
		double greatest=0;
		double least=999999999;
		clearArray(array);
		test2();
		for (int i=0; i<array.length; i++){
			current = test2();
			least = Math.min(least, current);
			greatest = Math.max(greatest, current);
			array[i]=current;
		}
		Arrays.sort(array);
		System.out.println("Design 2: min= " + least + " ms " +
				"max= " + greatest +" ms " +
				"median= " + array[10]);
		
		greatest=0;
		least=999999999;
		clearArray(array);
		test3();
		for (int i=0; i<array.length; i++){
			current = test3();
			least = Math.min(least, current);
			greatest = Math.max(greatest, current);
			array[i]=current;
		}
		Arrays.sort(array);
		System.out.println("Design 3: min= " + least + " ms " +
				"max= " + greatest +" ms " +
				"median= " + array[10]);
		
		greatest=0;
		least=999999999;
		clearArray(array);
		test5();
		for (int i=0; i<array.length; i++){
			current = test5();
			least = Math.min(least, current);
			greatest = Math.max(greatest, current);
			array[i]=current;
		}
		Arrays.sort(array);
		System.out.println("Design 5: min= " + least + " ms " +
				"max= " + greatest +" ms " +
				"median= " + array[10]);
		
	    byte[] buffer = new byte[1024];  //Buffer to hold byte input
		String input = "";
		while (input!="4"){
			System.out.println("\nEnter design 2,3, or 5, or 4 to quit");
	        for(int k=0; k<1024; k++)
	        	buffer[k] = '\u0020'; //initialize buffer
	        try {
	        	System.in.read(buffer);
	        } catch (IOException e){
	        	System.out.println("\nIOException.");
	        	System.exit(0);
	        }
	        input = new String(buffer).trim(); //gather input
	        if (input.charAt(0)=='2'){
	        	System.out.println(test2()+"ms");
	        } else if (input.charAt(0)=='3'){
	        	System.out.println(test3()+"ms");
	        } else if (input.charAt(0)=='5'){
	        	System.out.println(test5()+"ms");
	        }
	        
		}
	}
	private static double test2(){

    	double t1=System.nanoTime()/1000000.0;
    	PointCP2 point;
    	for (int i=0; i<10000000; i++){
    		point=new PointCP2(i, 10000000-i);
    		point.getX();
    		point.getY();
    		point.getRho();
    		point.getTheta();
    		point=null;
    	}
    	return System.nanoTime()/1000000.0-t1;
	}
	
	private static double test3(){
		double t1=System.nanoTime()/1000000.0;
    	PointCP3 point;
    	for (int i=0; i<10000000; i++){
    		point=new PointCP3(i, 10000000-i);
    		point.getX();
    		point.getY();
    		point.getRho();
    		point.getTheta();
    		point=null;
    	}
    	return System.nanoTime()/1000000.0-t1;
	}
	
	private static double test5(){
		double t1=System.nanoTime()/1000000.0;
    	PointCP5 point;
    	for (int i=0; i<5000000; i++){
    		point=new PointCP2(i, 5000000-i);
    		point.getX();
    		point.getY();
    		point.getRho();
    		point.getTheta();
    		point=null;
    	}
    	for (int i=0; i<5000000; i++){
    		point=new PointCP3(i, 5000000-i);
    		point.getX();
    		point.getY();
    		point.getRho();
    		point.getTheta();
    		point=null;
    	}
    	return System.nanoTime()/1000000.0-t1;
	}
	
	private static void clearArray(double[] array){
		for (int i=0; i<array.length; i++)
			array[i]=0;
	}
}