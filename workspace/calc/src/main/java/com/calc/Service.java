package com.calc;

/**
 * 
 * The Service class for calculator operation
 * 
 * @author Андрей
 *
 */

public class Service {
	
	/**
	 * The variable stores the state of a number
	 */
	private StateEnum state;
	
	/**
	 * The variable stores information about the operation
	 */
	private Operation op;
	
	/**
	 * The variable stores the first or last entered number
	 */
	
	private Double a;
	/**
	 * The variable stores the result
	 */
	private String result;
    
	/**
	 * The main constructor Service
	 */
    public Service() {
        
        op = Operation.RESULT;
        state = StateEnum.RESULT;
        result = "Pleas, click the button";
    }

    /**
     * The method for storing the next input number
     * 
     * @return The second operand
     */
    public Double getNext() {
        return Double.valueOf(result);
    }
    
    /**
     * Method for storing and transmitting the state of an operation
     * 
     * @param op
     * 
     * @return The second operand or result
     */
    public void operation(Operation op) {
        if (a == null) {
            a = Double.valueOf(result);
            this.op = op;
            state = StateEnum.RESULT;
        } else {
            this.op = op;
            result(getNext());
        }
    }
    
    /**
     * This is the method of division
     */
    public void divide() {
        operation(Operation.DIVEDE);
    }
    
    /**
     * This is the method of multiply
     */
    public void multiply() {
        operation(Operation.MULTIPLY);
    }
    
    /**
     * This is the method of subtraction
     */
    public void minus() {
        operation(Operation.MINUS);
    }
    
    /**
     * This is the method of addition 
     */
    public void plus() {
        operation(Operation.PLUS);
    }  
   
    /**
     * This is the method of result
     */
    public void result(Double b) {
        switch (op) {
        
        	case DIVEDE: {
        		result = ((Double) (a / b)).toString();
        		a = null;
        		op = Operation.RESULT;
        		state = StateEnum.RESULT;
        		break;
        	} 
        	case MULTIPLY: {
        		result = ((Double) (a * b)).toString();
        		a = null;
        		op = Operation.RESULT;
        		state = StateEnum.RESULT;
        		break;
        	}
            case MINUS: {
                result = ((Double) (a - b)).toString();
                a = null;
                op = Operation.RESULT;
                state = StateEnum.RESULT;
                break;
            }    
            case PLUS: {
                result = ((Double) (a + b)).toString();
                a = null;
                op = Operation.RESULT;
                state = StateEnum.RESULT;
                break;
            }
            default: {
                break;
            }
        }
        
    }
    public String getResult(){
        return result;
    }

    private final void number(int i) {
        if (state == StateEnum.RESULT) {
            result = String.valueOf(i);
            state = StateEnum.ALTER;
        } else if (result.equals("0")) {
            result = String.valueOf(i);
        } else {
            result = result + i;
        }
    }

    public void one() {
        number(1);
    }

    public void two() {
        number(2);
    }

    public void three() {
        number(3);
    }

    public void four() {
        number(4);
    }

    public void five() {
        number(5);
    }

    public void six() {
        number(6);
    }

    public void seven() {
        number(7);
    }

    public void eight() {
        number(8);
    }

    public void nine() {
        number(9);
    }

    public void zero() {
        number(0);
    }
    
    public void cancel() {
        result = "0";
        state = StateEnum.RESULT;
    }

    public void point() {
        if (state == StateEnum.RESULT) {
            result = String.valueOf("0.");
            state = StateEnum.ALTER;
        } else if (result.equals("0")) {
            result = String.valueOf("0.");
        } else {
            result = result + ".";
        }
    }
    
    public void sqrt() {
        result = Double.valueOf(Math.sqrt(Double.valueOf(result))).toString();
        state = StateEnum.RESULT;
    }
    
    public void cube() {
    	result = Double.valueOf(Math.pow(Double.valueOf(result), 3.0)).toString();
        state = StateEnum.RESULT;
    }
    
    public void sqr() {
    	result = Double.valueOf(Math.pow(Double.valueOf(result), 2.0)).toString();
        state = StateEnum.RESULT;
    }

   
	


}
