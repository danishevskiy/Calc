package com.calc;

public class Service {
	
	protected StateEnum state;
	
	protected Operation op;
	
	protected Double a;
	
	protected String result;
    
    public Service() {
        
        op = Operation.RESULT;
        state = StateEnum.RESULT;
        result = "Pleas, click the button";
    }

    public Double getNext() {
        return Double.valueOf(result);
    }
    
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
    
    public void divide() {
        operation(Operation.DIVEDE);
    }
    
    public void multiply() {
        operation(Operation.MULTIPLY);
    }
    
    public void minus() {
        operation(Operation.MINUS);
    }
    
    public void plus() {
        operation(Operation.PLUS);
    }  
   
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
