import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    /**
     * 通常可以在注解上定义属性，以下这个是MyAnnotation的name属性
     * 看着像1个方法，但实际上我们称之为属性name.
     * @return
     */
    String name();

    int age() default 25;//可以设置默认值，那么使用注解的时候就不需要向此属性赋值

    //指定一个value属性,使用注解的时候如果只有一个属性，并且属性名只有value的时候，   可以省略属性名
//    String value();
}
