
public aspect ObserverColor {
	    pointcut colorChange(): execution(void javafx.scene.Parent.setStyle(String));

	    after(): colorChange() {
	        String color = thisJoinPoint.getArgs()[0].toString();
	        System.out.println("Nuevo color: " + color);
	    }
	}



