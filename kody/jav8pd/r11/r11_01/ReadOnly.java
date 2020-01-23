package r11.r11_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
public @interface ReadOnly {

}