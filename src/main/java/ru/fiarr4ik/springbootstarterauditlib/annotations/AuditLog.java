package ru.fiarr4ik.springbootstarterauditlib.annotations;

import ru.fiarr4ik.springbootstarterauditlib.enums.LogLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    /**
     * Аннотация для логгирования методов
     * Автор - Денис Дементьев
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AuditLog {
        LogLevel logLevel() default LogLevel.INFO;
    }
