package com.calc;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class Calc extends WebPage {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2794663681039012076L;

	private Label label;
    
    private Form<Object> form;
    
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bCancel;
    private Button bPoint;
    private Button bDivide;
    private Button bMultiply;
    private Button bMinus;
    private Button bPlus;
    private Button bSqr;
    private Button bSqrt;
    private Button bCube;
    private Button bResult;  

    private Service service = new Service();

    @SuppressWarnings("serial")
	public Calc() {
    	
        label = new Label("return", new PropertyModel<>(service, "result"));
        
        b1 = new Button("1") {
			@Override
            public void onSubmit() {
                super.onSubmit();
                service.one();
            }
        };
        
        b2 = new Button("2") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.two();
            }
        };
        
        b3 = new Button("3") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.three();
            }
        };
        
        b4 = new Button("4") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.four();
            }
        };
        
        b5 = new Button("5") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.five();
            }
        };
        
        b6 = new Button("6") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.six();
            }
        };
        
        b7 = new Button("7") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.seven();
            }
        };
        
        b8 = new Button("8") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.eight();
            }
        };
        
        b9 = new Button("9") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.nine();
            }
        };
        
        b0 = new Button("0") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.zero();
            }
        };

        bSqr = new Button("buttonSqr") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.sqr();
            }
        };
        
        bSqrt = new Button("buttonSqrt", Model.of("√")) {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.sqrt();
            }
        };

        bCancel = new Button("buttonCancel", Model.of("C")) {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.cancel();
            }
        };
        
        bPoint = new Button("buttonPoint", Model.of(".")) {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.point();
            }
        };
        
        bResult = new Button("buttonResult") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.result(service.getNext());
            }
        };
        
        bPlus = new Button("buttonPlus") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.plus();
            }
        };
        
        bMinus = new Button("buttonMinus") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.minus();
            }
        };
        
        bCube = new Button("buttonCube") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.cube();
            }
        };
        
        bMultiply = new Button("buttonMultiply") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.multiply();
            }
        };
        
        bDivide = new Button("buttonDivide") {
            @Override
            public void onSubmit() {
                super.onSubmit();
                service.divide();
            }
        };
        
        form = new Form<Object>("form");
        
        form.add(b1);
        form.add(b2);
        form.add(b3);
        form.add(b4);
        form.add(b5);
        form.add(b6);
        form.add(b7);
        form.add(b8);
        form.add(b9);
        form.add(b0);
        form.add(bSqr);
        form.add(bSqrt);
        form.add(bCancel);
        form.add(bPoint);
        form.add(bResult);
        form.add(bPlus);
        form.add(bMinus);
        form.add(bCube);
        form.add(bMultiply);
        form.add(bDivide);
        add(label);
        add(form);
    }
}
