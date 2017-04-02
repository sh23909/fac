import javax.swing.JOptionPane;
public class fac{
	public static void main(String [] args){
		int countLowest=0;
		int value=1;
		int hc=Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
		do{
			if(countLowest==0)
				value=value*(countLowest+1);
						else
						value=value*countLowest;
						countLowest++;
		}
		while(countLowest<=hc);
		System.out.println("Factorial of "+(countLowest-1)+" is " + value);
	}
}

