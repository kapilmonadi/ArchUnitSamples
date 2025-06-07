package com.kapil.archtests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.kapil")
public class NamingConventionArchTest {

    @ArchTest
    ArchRule archRuleNamingConvention = classes().that().
            resideInAPackage("..constants..").should().
            haveSimpleNameEndingWith("Constants");
}
