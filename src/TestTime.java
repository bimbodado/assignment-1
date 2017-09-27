import java.io.IOException;
class TestTime{
	public static void main(String args[]){
	    byte[] buffer = new byte[1024];  //Buffer to hold byte input
		String input = "";
		int i;
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
	        double t1 = System.currentTimeMillis();
	        if (input.charAt(0)=='2'){
	        	t1=System.nanoTime();
	        	PointCP2 point;
	        	for (i=0; i<10000; i++){
	        		point=new PointCP2(i, 10000-i);
	        		point.getX();
	        		point.getY();
	        		point.getRho();
	        		point.getTheta();
	        	}
	        	System.out.println("Design 2: " + (System.nanoTime()-t1) + "ms");
	        } else if (input.charAt(0)=='3'){
	        	t1=System.currentTimeMillis();
	        	PointCP3 point;
	        	for (i=0; i<10000; i++){
	        		point=new PointCP3(i, 10000-i);
	        		point.getX();
	        		point.getY();
	        		point.getRho();
	        		point.getTheta();
	        	}
	        	System.out.println("Design 3: " + (System.currentTimeMillis()-t1) + "ms");
	        } else if (input.charAt(0)=='5'){
	        	t1=System.currentTimeMillis();
	        	PointCP5 point;
	        	for (i=0; i<5000; i++){
	        		point=new PointCP2(i, 5000-i);
	        		point.getX();
	        		point.getY();
	        		point.getRho();
	        		point.getTheta();
	        	}
	        	for (i=0; i<5000; i++){
	        		point=new PointCP3(i, 5000-i);
	        		point.getX();
	        		point.getY();
	        		point.getRho();
	        		point.getTheta();
	        	}
	        	System.out.println("Design 5: " + (System.currentTimeMillis()-t1) + "ms");
	        }
	        
		}
	}
}