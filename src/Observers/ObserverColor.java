package Observers;


public aspect ObserverColor {
	    pointcut colorChange(): execution(void javafx.scene.Parent.setStyle(String));

	    after() returning (String color): colorChange() {
	        System.out.println("Nuevo color: " + color);
	    }
	}



