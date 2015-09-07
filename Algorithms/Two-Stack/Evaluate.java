import java.util.*;

public class Evaluate{


	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
	    Stack<Double> vals = new Stack<Double>();

	    while(!StdIn.isEmpty()){

	    	String s = StdIn.readString();

	    	if(s.equals("(")){
	    		;
	    	}else if(s.equals("+")){
	    		ops.push(s);
	    	}else if(s.equals("-")){
	    		ops.push(s);
	    	}else if(s.equals("*")){
	    		ops.push(s);
	    	}else if(s.equals("/")){
	    		ops.push(s);
	    	}else if(s.equals("sqrt")){
	    		ops.push(s);
	    	}else if(s.equals(")")){
	    		double val = vals.pop();
	    		String op = ops.pop();

	    		if(op.equals("+")){
	    			val = vals.pop()+val;
	    		}else if(op.equals("-")){
	    			val = vals.pop()-val;
	    		}else if(op.equals("*")){
	    			val = vals.pop()*val;
	    		}else if(op.equals("/")){
	    			val = vals.pop()/val;
	    		}else if(op.equals("sqrt")){
	    			val = Math.sqrt(val);
	    		}

	    		vals.push(val);
	    	}else {
	    		vals.push(Double.parseDouble(s));
	    	}
	    }

	    StdOut.println(vals.pop());

	}
} 