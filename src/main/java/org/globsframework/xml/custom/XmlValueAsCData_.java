package org.globsframework.xml.custom;

import org.globsframework.core.metamodel.GlobType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.FIELD})

public @interface XmlValueAsCData_ {
    GlobType TYPE = XmlValueAsCData.TYPE;
}
