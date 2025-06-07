package com.kapil.archtests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

@AnalyzeClasses(packages = "com.kapil")
public class UtilsArchTest {
    @ArchTest
    ArchRule archRuleStaticMethodsInUtilClasses = methods().that().
            areDeclaredInClassesThat().resideInAPackage("..utils..").
            should().beStatic();

}
