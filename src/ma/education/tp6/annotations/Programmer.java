package ma.education.tp6.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.TYPE,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Programmer {
	abstract int id();

	String name();
}
