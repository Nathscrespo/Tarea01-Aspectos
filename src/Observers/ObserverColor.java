package Observers;
import java.awt.Color;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.awt.Color;



public aspect ObserverColor {  
	
//		pointcut colorChange(): execution(void javafx.scene.Parent.setStyle(String));

//	    after() returning (String color): colorChange() {
//	        System.out.println("Nuevo color: " + color);
//	    }
	 
	    @Pointcut("execution(void Ventanas.Principal.getContentPane().setBackground(java.awt.Color)) && args(color)")
	    public void colorChange(Color color) {}

	    @AfterReturning (pointcut = "colorChange(color)", returning = "color")
	    public void afterColorChange(JoinPoint joinPoint, Color color) {
	        System.out.println("Nuevo color de fondo: " + color.toString());
	    
}



