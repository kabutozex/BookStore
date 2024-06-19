package com.bookstore.validator;

import jakarta.validation. Constraint;
import jakarta.validation. Payload;
import java. lang.annotation .*;
import static java. lang.annotation.ElementType .*;
import static java. lang.annotation. RetentionPolicy. RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUserIdValidator.class)
public @interface ValidUserId {
    String message() default "Hehe đăng nhập không hợp lệ";
    Class <? extends Payload>[] payload() default {};
    Class <? >[] groups() default {};

}