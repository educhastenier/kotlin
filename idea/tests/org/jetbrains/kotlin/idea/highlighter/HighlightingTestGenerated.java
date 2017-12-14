/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.highlighter;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/highlighter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class HighlightingTestGenerated extends AbstractHighlightingTest {
    public void testAllFilesPresentInHighlighter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/highlighter"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("Annotations.kt")
    public void testAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Annotations.kt");
        doTest(fileName);
    }

    @TestMetadata("Dynamic.kt")
    public void testDynamic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Dynamic.kt");
        doTest(fileName);
    }

    @TestMetadata("Enums.kt")
    public void testEnums() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Enums.kt");
        doTest(fileName);
    }

    @TestMetadata("Field.kt")
    public void testField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Field.kt");
        doTest(fileName);
    }

    @TestMetadata("Functions.kt")
    public void testFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Functions.kt");
        doTest(fileName);
    }

    @TestMetadata("InvokeCall.kt")
    public void testInvokeCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/InvokeCall.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaTypes.kt")
    public void testJavaTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/JavaTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("KDoc.kt")
    public void testKDoc() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/KDoc.kt");
        doTest(fileName);
    }

    @TestMetadata("KotlinInjection.kt")
    public void testKotlinInjection() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/KotlinInjection.kt");
        doTest(fileName);
    }

    @TestMetadata("Labels.kt")
    public void testLabels() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Labels.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedArguments.kt")
    public void testNamedArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/NamedArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("NonNullAssertion.kt")
    public void testNonNullAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/NonNullAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("Object.kt")
    public void testObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Object.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCast.kt")
    public void testSmartCast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/SmartCast.kt");
        doTest(fileName);
    }

    @TestMetadata("Todo.kt")
    public void testTodo() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Todo.kt");
        doTest(fileName);
    }

    @TestMetadata("TypesAndAnnotations.kt")
    public void testTypesAndAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/TypesAndAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("Variables.kt")
    public void testVariables() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/Variables.kt");
        doTest(fileName);
    }

    @TestMetadata("VariablesAsFunctions.kt")
    public void testVariablesAsFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/VariablesAsFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/testData/highlighter/deprecated")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Deprecated extends AbstractHighlightingTest {
        public void testAllFilesPresentInDeprecated() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/highlighter/deprecated"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Class.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/ClassObject.kt");
            doTest(fileName);
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Constructor.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtensionFunction.kt")
        public void testExtensionFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/ExtensionFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Function.kt");
            doTest(fileName);
        }

        @TestMetadata("Get.kt")
        public void testGet() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Get.kt");
            doTest(fileName);
        }

        @TestMetadata("Getter.kt")
        public void testGetter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Getter.kt");
            doTest(fileName);
        }

        @TestMetadata("Inc.kt")
        public void testInc() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Inc.kt");
            doTest(fileName);
        }

        @TestMetadata("Invalid.kt")
        public void testInvalid() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Invalid.kt");
            doTest(fileName);
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Invoke.kt");
            doTest(fileName);
        }

        @TestMetadata("Operation.kt")
        public void testOperation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Operation.kt");
            doTest(fileName);
        }

        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Property.kt");
            doTest(fileName);
        }

        @TestMetadata("RangeTo.kt")
        public void testRangeTo() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/RangeTo.kt");
            doTest(fileName);
        }

        @TestMetadata("Setter.kt")
        public void testSetter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Setter.kt");
            doTest(fileName);
        }

        @TestMetadata("SuperCall.kt")
        public void testSuperCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/SuperCall.kt");
            doTest(fileName);
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/highlighter/deprecated/Trait.kt");
            doTest(fileName);
        }
    }
}
