
package zadatak2;

import java.util.Scanner;


public class JelenaJankovic {
    private String s1;
    private String s2;

    public JelenaJankovic(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }
    
    public void ispis(){
        
      Scanner in = new Scanner (System.in);
		
               
                System.out.println("Unesi prvi string: ");
		s1 = in.nextLine();
                
                System.out.println("Unesi drugi string: ");
		s2 = in.nextLine();
		
		if (s1.equals(s2)) {
                    System.out.println("Stringovi su isti");
                } else {
                    System.out.println("Stringovi su razliciti");
                }
        
       
    }
           
}
