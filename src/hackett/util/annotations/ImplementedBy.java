package hackett.util.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(Implementations.class)
public @interface ImplementedBy {
    Class<?> value();
}

