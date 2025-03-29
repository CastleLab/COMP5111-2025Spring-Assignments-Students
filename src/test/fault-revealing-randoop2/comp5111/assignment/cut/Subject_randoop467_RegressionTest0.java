package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop467_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test001");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test003");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test004");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test005");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test006");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test007");
        comp5111.assignment.cut.Subject.DateTimeUtils dateTimeUtils0 = new comp5111.assignment.cut.Subject.DateTimeUtils();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test008");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test009");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("(invalidDOM)", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test010");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test011");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "(invalidDOM)", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test012");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "hi!", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test013");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(10, (int) '4', (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test014");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (short) 0, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test015");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test016");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test018");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test019");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (byte) 0, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test020");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test021");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) 'a', (int) '4', 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 0, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test023");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test024");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test025");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test026");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test027");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test028");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test029");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test030");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 0, (int) (byte) 0, (int) ' ', (int) (byte) 0, 10, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62167132190000L) + "'", long8 == (-62167132190000L));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("(invalidDOM)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '(invalidDOM)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test032");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test033");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test034");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test035");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "LOCALHOST", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test036");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test037");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97-01-01" + "'", str2, "97-01-01");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test038");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test039");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test040");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test041");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invalidDOM)", (int) (byte) 1, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test042");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("97-01-01", "(invalidDOM)", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test043");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test044");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invalidDOM)", 0, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test045");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test046");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test047");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test048");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) -1, 12, 100, (int) '4', 12, 1, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62161156079000L) + "'", long8 == (-62161156079000L));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test049");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "", "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test050");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test051");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test052");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("97-01-01", "LOCALHOST", "LOCALHOST");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test053");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("97-01-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test054");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test055");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test056");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 10, (int) 'a', (int) (short) -1, (int) (short) 0, (int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61598275141000L) + "'", long8 == (-61598275141000L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test057");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test058");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("97-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test059");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test060");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test061");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test062");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84338570) + "'", int1 == (-84338570));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test063");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("97-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test064");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "(invaliddom)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test065");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 100, 0, (int) (byte) 1, 1, (int) (short) 10, 12, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test066");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "97-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test067");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("LOCALHOST");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'LOCALHOST' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test069");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test070");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("LOCALHOST");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1204607085) + "'", int1 == (-1204607085));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test071");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invaliddom)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84338570) + "'", int1 == (-84338570));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test072");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test073");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test074");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test075");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test076");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("1st");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test077");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test078");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test079");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test080");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50770 + "'", int1 == 50770);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test081");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test082");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("97-01-01", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (-1204607085), ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1204607085");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test084");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "97-01-01", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test085");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1), (-84338570));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test086");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("97-01-01", "97-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test087");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test088");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test089");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "LOCALHOST", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test090");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 1, (int) ' ', (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test091");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 s" + "'", str1, "52 s");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test092");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("52 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1628080 + "'", int1 == 1628080);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test093");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("LOCALHOST", 10, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test094");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test095");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test096");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test097");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("LOCALHOST", (int) (short) 1, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test098");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("52 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test099");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test100");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test101");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invaliddom)", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test102");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("52 s", "", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test103");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test104");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test105");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invalidDOM)", "1st", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test106");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("97-01-01", "1st", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test107");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test108");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test109");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 100, 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-07-01" + "'", str2, "100-07-01");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test110");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(50770, (-84338570), 50770, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test111");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test112");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test113");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test114");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invalidDOM)", "100-07-01", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test115");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("52 s", "52 s", (int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 s" + "'", str5, "52 s");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test116");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test117");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test118");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test119");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test120");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test121");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test122");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test123");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97-01-01", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100-07-01", (int) (byte) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test125");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("100-07-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-07-01" + "'", str1, "100-07-01");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test126");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test127");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test128");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("100-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test129");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 1, 0, 100, (-84338570));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test130");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("35 s", (-84338570));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35 s" + "'", str2, "35 s");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test131");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("100-07-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-07-01" + "'", str1, "100-07-01");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test132");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("97-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97-01-01" + "'", str1, "97-01-01");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test133");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "97-01-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test134");
        comp5111.assignment.cut.Subject.WebUtils webUtils0 = new comp5111.assignment.cut.Subject.WebUtils();
        java.lang.Class<?> wildcardClass1 = webUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1st", (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test136");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test137");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35 s", (int) (short) 0, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test138");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test139");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test140");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invaliddom)", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test141");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) ' ', 4, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test142");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "97-01-01", "(invaliddom)", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test143");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test144");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test145");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-09-30" + "'", str2, "1-09-30");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test146");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("100-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test147");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-1204607085), (int) (short) 0, 4, (int) ' ', (int) (short) 0, (int) '4', 12);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-163102343356748000L) + "'", long8 == (-163102343356748000L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test148");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "(invaliddom)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test149");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test150");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 s" + "'", str3, "35 s");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test151");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1st", "1st");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("52 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '52 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test153");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test154");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-07-01", "0 s", "LOCALHOST", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test155");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("hi!", "(invaliddom)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test156");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1204607085), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test157");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test158");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("97-01-01", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97-01-01" + "'", str2, "97-01-01");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test159");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-09-30", "", "LOCALHOST");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test160");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "100-07-01", "1-09-30", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test161");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(100, (int) (byte) 10, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test162");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test163");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test164");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("35 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1571381 + "'", int1 == 1571381);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test165");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test166");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1st", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test167");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test168");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test169");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invaliddom)", (-1204607085), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1204607085");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test171");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-01-01" + "'", str2, "0-01-01");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test173");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (byte) 0, 100, 1628080, (int) (short) 1, (int) (byte) 0, 9, 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test174");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test175");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test176");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test177");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1-09-30");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-09-30" + "'", str1, "1-09-30");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test178");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(9, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9-12-31" + "'", str2, "9-12-31");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test179");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 1);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("100-07-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '100-07-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test181");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-06-30" + "'", str2, "0-06-30");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test182");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1-09-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1872391173 + "'", int1 == 1872391173);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test183");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test184");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("0-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test185");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1-09-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test186");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0-01-01", "(invalidDOM)", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test187");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-1204607085), 1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test189");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invaliddom)", (-84338570));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test190");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test191");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test192");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "35 s", true, (int) (byte) -1, (java.lang.CharSequence) "0-01-01", (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test193");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1", (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 s" + "'", str17, "0 s");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test194");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0-06-30");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("9-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '9-12-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test196");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("97-01-01", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97-01-01" + "'", str2, "97-01-01");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test197");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("9-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test198");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("0 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47235 + "'", int1 == 47235);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test199");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 1, (int) '#', 1872391173, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test200");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("9-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test201");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1st");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test202");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-10-01" + "'", str2, "35-10-01");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test203");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0-01-01", "1", "LOCALHOST", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test204");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 12, 100, (-84338570), 1, (int) (byte) 10, 1571381, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-7348377954019000L) + "'", long8 == (-7348377954019000L));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test205");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1-09-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test206");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 1872391173, (int) 'a', (int) 'a', (int) '#', 1571381, 100, 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test207");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35-10-01", "97-01-01", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test208");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test209");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("52 s", "(invalidDOM)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test210");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test211");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 9, (int) 'a', 0, (int) (short) 1, (int) (byte) 10, 10, 50770);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test212");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "10 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test213");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) ' ', (java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        java.lang.String str12 = textUtils0.abbreviate("(invalidDOM)", "(invalidDOM)", 0, (-1));
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "52 s", false, (int) (short) -1, (java.lang.CharSequence) "10 s", (int) (byte) 1, 1571381);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test214");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 0, 1628080, (int) (byte) -1, (int) ' ', 47235, 0, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4239871442100000L + "'", long8 == 4239871442100000L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test215");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test216");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 0, (int) (byte) -1, 0, 0, 100, 12, 1872391173);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62172483586128L) + "'", long8 == (-62172483586128L));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test217");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test218");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("9-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test219");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "hi!", "35 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test220");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("35-10-01", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-10-01" + "'", str2, "35-10-01");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test221");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test222");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test223");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0-06-30");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0-06-30" + "'", str1, "0-06-30");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test224");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100 s", (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test226");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1571381, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1571381-12-31" + "'", str2, "1571381-12-31");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test227");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "0-06-30", "97-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test228");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 1872391173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test229");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("9-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9-12-31" + "'", str1, "9-12-31");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test230");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("9-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test231");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int12 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test232");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1571381-12-31", "100 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test233");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("32 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test234");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35-10-01", "1st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test235");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test236");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test237");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("35-10-01", "hi!", "0 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test238");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test239");
        java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("1571381-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1571381-12-31' could not be parsed at index 6");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test241");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test242");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invaliddom)", "(invaliddom)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test243");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray6);
        byte[] byteArray8 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray7);
        byte[] byteArray9 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -1, -1, 0]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test244");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.Class<?> wildcardClass1 = textUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test245");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-84338570), (int) (short) 10, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test246");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test247");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 1, (int) (byte) -1, (int) 'a', 1628080);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(47235, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "47235-12-31" + "'", str2, "47235-12-31");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test249");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test250");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "0 s", "0-06-30", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test251");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test252");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "32 s", "35-10-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test253");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test254");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0-01-01" + "'", str1, "0-01-01");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test255");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "10th", "0-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35-10-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35-10-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test257");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100 s", 1571381, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1571381 + "'", int3 == 1571381);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "47235-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test259");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test260");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(50770);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test261");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test262");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-84338570), 4, (int) (byte) 10, 10, (int) (byte) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-63934143135599000L) + "'", long8 == (-63934143135599000L));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test263");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1-09-30");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-09-30" + "'", str1, "1-09-30");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test264");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test265");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("1-09-30");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1-09-30' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test266");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("32 s", "0-01-01", (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test267");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test268");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("47235-12-31", "47235-12-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test269");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103232 + "'", int1 == 103232);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test270");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(4239871442100000L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "134445441 y" + "'", str1, "134445441 y");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test271");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test272");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 100, 47235, 4, 1872391173, 1628080, 12, 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test273");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 4, (int) (short) 10, (int) (short) 1, 10, (int) (short) 1, 12, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62017306530000L) + "'", long8 == (-62017306530000L));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test274");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1-09-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test275");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("97-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test276");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("LOCALHOST", "35-10-01", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test277");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test278");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test279");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test280");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test281");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1571381-12-31", "32 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test282");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 100);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (short) 100);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test283");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test284");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test285");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test286");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (-84338570), (java.lang.CharSequence) "1st", 50770, (-84338570));
        java.lang.String str24 = textUtils0.abbreviate("1-09-30", "", (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test287");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0-01-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test288");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("0 s", "9-12-31", (int) 'a', (int) (byte) 10);
        java.lang.String str27 = textUtils0.abbreviate("35-10-01", "(invalidDOM)", (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "35-10-01" + "'", str27, "35-10-01");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test289");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test290");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-09-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test291");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1 s", (int) (short) 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test292");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 1872391173, 1, 3, 103232, 1872391173, 0, (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 84354525011884000L + "'", long8 == 84354525011884000L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test293");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test294");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("LOCALHOST");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test295");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-07-01", "1 s", "100 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test296");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "1-09-30", true, (int) (short) -1, (java.lang.CharSequence) "52 s", (int) (short) 100, (int) (byte) -1);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "100 s", false, 10, (java.lang.CharSequence) "52 s", 10, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test297");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test298");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test299");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("35-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35-10-01" + "'", str1, "35-10-01");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test300");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test301");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test302");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("134445441 y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test303");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("47235-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test304");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "0-06-30", "10 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test305");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9th" + "'", str1, "9th");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test306");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1 s", "", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test307");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test308");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test309");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100 s", "9-12-31", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test310");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 0, 9, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test311");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-09-30", "10 s", "97-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test312");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 103232, (int) (short) 100, (int) (short) 100, (-1204607085), (int) 'a', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3197121625579000L + "'", long8 == 3197121625579000L);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test313");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test314");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test315");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 47235, (int) 'a', (int) '4', 12, (int) (byte) 0, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1428683400010000L + "'", long8 == 1428683400010000L);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test316");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("10th", "52 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test317");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100 s", "52 s", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test318");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("134445441 y");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "134445441 y" + "'", str1, "134445441 y");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test319");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 12, (-1), 50770, (int) 'a', (int) 'a', (int) (byte) -1, 12);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-57406915381000L) + "'", long8 == (-57406915381000L));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test320");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray0);
        byte[] byteArray2 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray1);
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test321");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 4, (-1204607085), (int) 'a', 0, 0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2031949929610000L + "'", long8 == 2031949929610000L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test322");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test323");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        java.lang.Class<?> wildcardClass9 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test324");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("9-12-31", (int) (short) 1, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test325");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1", "52 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test326");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (short) 1, 1, (-1204607085), 47235, (int) 'a', 4, (int) '#');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test327");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("100-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test328");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0-01-01", (-1204607085), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1204607085");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test329");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test330");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test331");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("9-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test332");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("1st", "100-07-01", (-84338570), (int) (byte) 1);
        boolean boolean29 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (-1204607085), (java.lang.CharSequence) "1-09-30", (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass30 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test333");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) ' ', (int) (short) -1, 4, 7, (int) (short) 0, 9, 1571381);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test334");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0 s", "134445441 y");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test335");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test336");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 1, (java.lang.CharSequence) "(invaliddom)", (int) (byte) 10, 4);
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, (int) (byte) 1, (java.lang.CharSequence) "35-10-01", (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test337");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("9th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9th" + "'", str1, "9th");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test338");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-61598275141000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-61598275141000 s" + "'", str1, "-61598275141000 s");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test339");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0-01-01" + "'", str1, "0-01-01");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test340");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("52 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test341");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("134445441 y");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2117431687 + "'", int1 == 2117431687);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test342");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "52 s", "0 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test343");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("32 s", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32 s" + "'", str2, "32 s");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test344");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray0);
        byte[] byteArray2 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray1);
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test345");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("LOCALHOST", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LOCALHOST" + "'", str2, "LOCALHOST");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test346");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("1-09-30", "", (int) (short) -1, (-84338570));
        boolean boolean29 = textUtils0.regionMatch((java.lang.CharSequence) "1", false, (int) (short) -1, (java.lang.CharSequence) "134445441 y", (-84338570), (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test347");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1 s", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 s" + "'", str2, "1 s");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test348");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-1204607085));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1204607085 s" + "'", str1, "-1204607085 s");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test349");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) ' ', (java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) '#', (java.lang.CharSequence) "35 s", (int) 'a', (int) (byte) -1);
        java.lang.String str19 = textUtils0.abbreviate("hi!", "10th", (int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test350");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass11 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test351");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test352");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1-09-30", 2117431687, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2117431687 + "'", int3 == 2117431687);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test353");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("134445441 y", "(invaliddom)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test354");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("97-01-01", "1571381-12-31", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test355");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("134445441 y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test356");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35 s", "52 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test357");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("134445441 y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test358");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test359");
        java.lang.String[] strArray6 = new java.lang.String[] { "97-01-01", "LOCALHOST", "LOCALHOST", "hi!", "(invalidDOM)", "(invalidDOM)" };
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test360");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test361");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("134445441 y", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "134445441 y" + "'", str2, "134445441 y");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test362");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-01-01" + "'", str2, "1-01-01");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test363");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("32 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1568498 + "'", int1 == 1568498);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test364");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) ' ', (java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 1, (java.lang.CharSequence) "97-01-01", (int) (byte) 100, 0);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, (int) (byte) 0, (java.lang.CharSequence) "", (-1204607085), (-1204607085));
        boolean boolean28 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) -1, (java.lang.CharSequence) "(invaliddom)", 0, (-1204607085));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test365");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", false, (int) (byte) 100, (java.lang.CharSequence) "", 100, (-1204607085));
        java.lang.String str17 = textUtils0.abbreviate("97-01-01", "35-10-01", 9, (int) '4');
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "-1204607085 s", true, 10, (java.lang.CharSequence) "(invaliddom)", (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97-01-01" + "'", str17, "97-01-01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test366");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test367");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(12, (-1204607085));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test368");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(103232, (int) (byte) -1, 1628080, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test369");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test370");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) (byte) 1, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test371");
        java.lang.String[] strArray6 = new java.lang.String[] { "97-01-01", "LOCALHOST", "LOCALHOST", "hi!", "(invalidDOM)", "(invalidDOM)" };
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test372");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test373");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 1571381, 1628080, (int) '4', (-1204607085), (int) (byte) 0, (int) '#', 103232);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test374");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1-09-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test375");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-1204607085 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1204607085 s" + "'", str1, "-1204607085 s");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test376");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1571381-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test377");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("9-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9-12-31" + "'", str1, "9-12-31");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test378");
        java.lang.String[] strArray5 = new java.lang.String[] { "1571381-12-31", "9-12-31", "LOCALHOST", "(invaliddom)", "1" };
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test379");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 100, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-04-01" + "'", str2, "100-04-01");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test380");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "35-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test381");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", false, (int) (byte) 100, (java.lang.CharSequence) "", 100, (-1204607085));
        java.lang.String str17 = textUtils0.abbreviate("97-01-01", "35-10-01", 9, (int) '4');
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "10 s", false, (int) ' ', (java.lang.CharSequence) "0-06-30", (int) (byte) 10, 2117431687);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97-01-01" + "'", str17, "97-01-01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test382");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("97-01-01", "10 s", "100-07-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test383");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1-09-30");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test384");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-10-01" + "'", str2, "1-10-01");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test385");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test386");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("47235-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test387");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1571381-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1571381-12-31" + "'", str1, "1571381-12-31");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test388");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 0, 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-10-01" + "'", str2, "0-10-01");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test389");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test390");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test391");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test392");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1571381-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test393");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(3, (int) (byte) 100, (-84338570), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test394");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(2117431687, 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2117431687-12-31" + "'", str2, "2117431687-12-31");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test395");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 0, 7, (int) ' ', 3, (int) (short) 10, 12, 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test396");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "1 s", true, (int) ' ', (java.lang.CharSequence) "9-12-31", (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test398");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1204607085 s", "100-04-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test399");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(47235, 1, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test400");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("9th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test401");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test402");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "10 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test403");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) 'a', 103232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test404");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test405");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test406");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("9-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test407");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 1628080, 103232, (-84338570), 1568498, (int) 'a', 103232, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test408");
        java.lang.String[] strArray6 = new java.lang.String[] { "97-01-01", "LOCALHOST", "LOCALHOST", "hi!", "(invalidDOM)", "(invalidDOM)" };
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test409");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test410");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100-04-01", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test411");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0 s", 47235);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 s" + "'", str2, "0 s");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test412");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test413");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test415");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("134445441 y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test416");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "1-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test417");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("97-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test418");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("10th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test419");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test420");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test421");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("32 s", "-1204607085 s", "32 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test422");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test423");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "(invalidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test424");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test425");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("100-04-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test426");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test427");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "100 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test428");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10th");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test429");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1204607085 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test430");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test431");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(9, (int) 'a', (int) (short) -1, 2117431687);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test432");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("32 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test433");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("1st", "100-07-01", (-84338570), (int) (byte) 1);
        java.lang.String str27 = textUtils0.abbreviate("1st", "1-09-30", 50770, (int) (byte) 100);
        boolean boolean34 = textUtils0.regionMatch((java.lang.CharSequence) "100 s", true, (int) (short) 1, (java.lang.CharSequence) "0 s", (-1204607085), 1571381);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1st" + "'", str27, "1st");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test434");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1571381-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test435");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test436");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "LOCALHOST", "10 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test437");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("47235-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test438");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100-07-01", "", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test439");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test440");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(12, 7, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test441");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test442");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (-84338570), (java.lang.CharSequence) "1st", 50770, (-84338570));
        java.lang.String str24 = textUtils0.abbreviate("1st", "LOCALHOST", (int) '#', 47235);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1st" + "'", str24, "1st");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test443");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(1568498, 103232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test444");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray0);
        byte[] byteArray2 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray1);
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test445");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) ' ');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test446");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("35-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35-10-01" + "'", str1, "35-10-01");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test447");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test448");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test449");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10 s", "100 s", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test450");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("1st", "97-01-01", (-1), (int) (short) 10);
        java.lang.String str15 = textUtils0.abbreviate("32 s", "LOCALHOST", (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 s" + "'", str15, "32 s");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test451");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-84338570), 1571381);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test452");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test453");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("9-12-31", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test454");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("0 s", "9-12-31", (int) 'a', (int) (byte) 10);
        java.lang.String str27 = textUtils0.abbreviate("1st", "97-01-01", (-84338570), 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1st" + "'", str27, "1st");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test455");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test456");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        java.lang.String str10 = textUtils0.abbreviate("hi!", "(invalidDOM)", 10, (int) (byte) -1);
        boolean boolean17 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 1628080, (java.lang.CharSequence) "35 s", (-1204607085), 4);
        java.lang.String str22 = textUtils0.abbreviate("1st", "100-07-01", (-84338570), (int) (byte) 1);
        java.lang.String str27 = textUtils0.abbreviate("1st", "1-09-30", 50770, (int) (byte) 100);
        java.lang.String str32 = textUtils0.abbreviate("", "35-10-01", 47235, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1st" + "'", str27, "1st");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-1204607085 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-1204607085 s' could not be parsed, unparsed text found at index 11");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test458");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "0-06-30", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test459");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "-1204607085 s", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test460");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 7, (int) '4', 9, 0, (int) (byte) -1, 4, 12);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test461");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-10-01", "2117431687-12-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test462");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "1 s", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test463");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1571381-12-31", "0-06-30");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test464");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 0]");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test465");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("100 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test466");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-1204607085 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1204607085 s" + "'", str1, "-1204607085 s");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test467");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test468");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 1, (java.lang.CharSequence) "(invaliddom)", (int) (byte) 10, 4);
        java.lang.Class<?> wildcardClass20 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test469");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "47235-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test470");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1204607085 s", "0 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test471");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("47235-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test472");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1", "9-12-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test473");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test474");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test475");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test476");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test477");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "-61598275141000 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test478");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test479");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("hi!", "", (int) 'a', (int) '4');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "97-01-01", true, (int) (byte) 1, (java.lang.CharSequence) "97-01-01", 12, (int) (byte) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 1, (java.lang.CharSequence) "(invaliddom)", (int) (byte) 10, 4);
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "52 s", true, 2117431687, (java.lang.CharSequence) "(invalidDOM)", 7, 0);
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "1-01-01", true, (-1204607085), (java.lang.CharSequence) "1 s", (int) (byte) 10, 50770);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test480");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("35 s", "0-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test481");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test482");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test483");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("10th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test484");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1204607085), 50770);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test485");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test486");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 100, 103232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test487");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test488");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-84338570));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-84338570 s" + "'", str1, "-84338570 s");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test489");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-61598275141000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test490");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test491");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0-06-30", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test492");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1628080);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test493");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "100-04-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test494");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test495");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1 s", "-84338570 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test496");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("100 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test497");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test498");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-1204607085), 1628080, (int) (byte) 0, (int) ' ', (int) '#', 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-158800305309800000L) + "'", long8 == (-158800305309800000L));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test499");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-61598275141000 s", "1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop467_RegressionTest0.test500");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) ' ', (java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "", true, (int) '#', (java.lang.CharSequence) "35 s", (int) 'a', (int) (byte) -1);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 3, (java.lang.CharSequence) "0-01-01", 3, 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

