package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop437_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test001");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test002");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "hi!", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test003");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test004");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test006");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (byte) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test007");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test008");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test009");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test010");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) 'a', (int) (short) 1, 100, 10, (int) (byte) 10, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59097476965000L) + "'", long8 == (-59097476965000L));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test011");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test012");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test013");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test014");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test015");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test016");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) ' ', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test017");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test018");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "-1 s", "10 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test019");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("-1 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test020");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "10 s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test021");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test022");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test023");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test024");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test025");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test026");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test027");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test028");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1 s", "hi!", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test029");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "hi!", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test030");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10 s", "", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test031");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test032");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test033");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1 s", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test034");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test035");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 10, (int) '4', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test036");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test037");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test038");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test039");
        comp5111.assignment.cut.Subject.WebUtils webUtils0 = new comp5111.assignment.cut.Subject.WebUtils();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test040");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "10 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test041");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test042");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test043");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test044");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-1 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test045");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("10 s", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-1 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-1 s' could not be parsed at index 1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test047");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (short) 100, (int) '4', 100, 100, 100, 100, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test048");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test049");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test050");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-01-01" + "'", str2, "100-01-01");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test051");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass22 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test052");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test053");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test054");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "100-01-01", "", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test055");
        comp5111.assignment.cut.Subject.DateTimeUtils dateTimeUtils0 = new comp5111.assignment.cut.Subject.DateTimeUtils();
        java.lang.Class<?> wildcardClass1 = dateTimeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test056");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("-1 s", "hi!", (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 s" + "'", str12, "-1 s");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test057");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "0 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test058");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test059");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test060");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test061");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("10 s", "0 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test062");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test063");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test064");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "100-01-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test065");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test066");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test067");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "-1 s", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test068");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test069");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test070");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "100-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("100-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '100-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test072");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test073");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100-01-01", "10 s", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test074");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 0, (int) (byte) 10, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test075");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test076");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test077");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test078");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test079");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test080");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test081");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test082");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("100-01-01", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test083");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test084");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test085");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test086");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-03-31" + "'", str2, "100-03-31");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test087");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-1 s", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test088");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.CharSequence charSequence13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = textUtils0.regionMatch(charSequence13, false, (int) (short) -1, (java.lang.CharSequence) "-1 s", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test089");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) '#', (int) (short) 0, (int) '#', (int) (short) 100, (int) (short) 0, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test090");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("100 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test091");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test092");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test093");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 100, 0, (int) (short) 10, 0, (int) (short) -1, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59013273563000L) + "'", long8 == (-59013273563000L));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test094");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invalidDOM)", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalidDOM)" + "'", str2, "(invalidDOM)");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test095");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("100-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test096");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test097");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100-03-31", "100-03-31", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test098");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invalidDOM)", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test099");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test100");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 0, (int) ' ', (int) (short) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test101");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-1 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test102");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100-03-31", "100-03-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test103");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "(invalidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test104");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("100 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test105");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test106");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84338570) + "'", int1 == (-84338570));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test107");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test108");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test109");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) ' ', (int) (byte) 0, (-1), (int) ' ', (int) '#', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61160023400000L) + "'", long8 == (-61160023400000L));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test110");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("10 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test111");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "-1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test112");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test113");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invaliddom)", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test114");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 0, (int) 'a', 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test115");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test116");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invalidDOM)", "100-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test117");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test118");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "100-03-31", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-01-01" + "'", str2, "52-01-01");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test120");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (short) 10, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test121");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100-01-01", "100-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test122");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test123");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test124");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test125");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("100 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46729732 + "'", int1 == 46729732);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test126");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1 s", "hi!", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test127");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test128");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100-03-31", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test129");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test130");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("10 s", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test131");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test132");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test133");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test134");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97 s" + "'", str1, "97 s");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test135");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test136");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("", "-1 s", (int) 'a', 46729732);
        java.lang.Class<?> wildcardClass30 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test137");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test138");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test140");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-1 s", "", "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test141");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invalidDOM)", "-1 s", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test142");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        java.lang.CharSequence charSequence21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 1, charSequence21, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test143");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("10 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1506994 + "'", int1 == 1506994);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test144");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(10, (int) '4', (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test145");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test146");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("52-01-01", "100-01-01", "10 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test147");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test148");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97 s", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test149");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "(invalidDOM)", "100-01-01", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test150");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("97 s", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test151");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100-01-01", (int) (short) 100, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test152");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("(invalidDOM)", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test153");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52-01-01", (-84338570), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -84338570");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test155");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test156");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test157");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100 s", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test158");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test159");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "(invaliddom)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test160");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0 s", "10 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test161");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invaliddom)", 1506994, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1506994 + "'", int3 == 1506994);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test162");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1st", "100-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test163");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test164");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("100-01-01", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-01-01" + "'", str2, "100-01-01");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test165");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) -1, (-84338570));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test166");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1st", "0 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test167");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test168");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test169");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test170");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("52-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52-01-01" + "'", str1, "52-01-01");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test171");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test172");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-84338570), (int) (byte) 0, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test173");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("100-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-03-31" + "'", str1, "100-03-31");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test174");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test175");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 1506994, (int) (byte) 100, (int) (short) 0, (int) 'a', 1506994, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test176");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!lidDOM)", "0 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test177");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test178");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1st", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1st" + "'", str2, "1st");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test179");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "10 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test180");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1st", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test181");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test182");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 1, 100, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test183");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("97 s", "10 s", 4, (int) '4');
        java.lang.Class<?> wildcardClass25 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 s" + "'", str24, "97 s");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "0 s", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test185");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test186");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "100-03-31", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test187");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test188");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test189");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test190");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("52-01-01", "(invalidDOM)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test191");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invalidDOM)", "97 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test192");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!lidDOM)", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test193");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test194");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) -1, (int) '4', 10, 46729732);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test195");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invaliddom)", 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test196");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100-01-01", "LOCALHOST");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test197");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("52-01-01", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test198");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test199");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-59097476965000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-59097476965000 s" + "'", str1, "-59097476965000 s");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test200");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test201");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "", "10 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test202");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass15 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test203");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("100 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '100 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test205");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("97 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test206");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test207");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100 s", "-59097476965000 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("52-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '52-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test209");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("10 s", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 s" + "'", str2, "10 s");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test210");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("52-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52-01-01" + "'", str1, "52-01-01");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test211");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("97 s", "10 s", 4, (int) '4');
        java.lang.String str29 = textUtils0.abbreviate("-59097476965000 s", "hi!", (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 s" + "'", str24, "97 s");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-59097476965000 s" + "'", str29, "-59097476965000 s");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test212");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 100, 10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test213");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("-1 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test214");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("(invaliddom)", "-1 s", (-84338570), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(invaliddom)" + "'", str24, "(invaliddom)");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test215");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test216");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test217");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("97 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1752049 + "'", int1 == 1752049);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test218");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0 s", (int) (short) 0, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test219");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) -1, 46729732, (int) (byte) -1, 1752049);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test220");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test221");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test222");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "hi!lidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test223");
        java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test224");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100 s", "10 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test225");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "-1 s", true, 1506994, (java.lang.CharSequence) "", (int) (short) 10, 0);
        java.lang.String str31 = textUtils0.abbreviate("-59097476965000 s", "52-01-01", (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test226");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test227");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 100, (int) (short) 10, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62134890600000L) + "'", long8 == (-62134890600000L));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test228");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test229");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("97 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-1 s", (int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test231");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100 s", (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test233");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test234");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("(invalidDOM)", "0 s", (-84338570), 1);
        java.lang.String str34 = textUtils0.abbreviate("1st", "LOCALHOST", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test235");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1 s", "hi!lidDOM)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test236");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "100-03-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test237");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test238");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', 100, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test239");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97 s", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test240");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97 s", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test241");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100-01-01", "97 s", "100 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test242");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0 s", "(invalidDOM)", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test243");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) '4', (int) (short) 0, 1752049, (int) '#', (int) (byte) 10, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test244");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test245");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("hi!lidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!lidDOM)" + "'", str1, "hi!lidDOM)");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test246");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test247");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) 'a', (int) (byte) 100, 1752049, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test248");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("-59097476965000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test249");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103232 + "'", int1 == 103232);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test250");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test251");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-59097476965000 s", "100-03-31", "100-01-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test252");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test253");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test254");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("97 s", "-1 s", "-59097476965000 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test255");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test256");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test257");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1752049, 1752049);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test258");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "hi!lidDOM)", false, 0, (java.lang.CharSequence) "LOCALHOST", (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test259");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-01-01" + "'", str2, "0-01-01");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test260");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-59097476965000 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1503611487) + "'", int1 == (-1503611487));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test261");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100-03-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test262");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test263");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50770 + "'", int1 == 50770);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test264");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test265");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test266");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test267");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("(invalidDOM)", "0 s", (-84338570), 1);
        java.lang.String str34 = textUtils0.abbreviate("10 s", "hi!", 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10 s" + "'", str34, "10 s");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test268");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test269");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test270");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "-1 s", "97 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test271");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("LOCALHOST", "10 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test272");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (-1503611487), (int) (short) 100, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test273");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test274");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test275");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "100-03-31", true, (int) '#', (java.lang.CharSequence) "", (-84338570), 0);
        java.lang.String str38 = textUtils0.abbreviate("0-01-01", "-59097476965000 s", (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test276");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test277");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test278");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("100-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-03-31" + "'", str1, "100-03-31");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("10 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '10 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test280");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("hi!lidDOM)", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test281");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("100-01-01", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test282");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test283");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.String str31 = textUtils0.abbreviate("100-01-01", "1st", 100, 0);
        java.lang.String str36 = textUtils0.abbreviate("100-03-31", "(invaliddom)", (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "100-03-31" + "'", str36, "100-03-31");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test284");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-59097476965000 s", (int) (short) 100, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test285");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test286");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test287");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("100 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test288");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test289");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test290");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "-59097476965000 s", true, (int) (byte) 10, (java.lang.CharSequence) "10 s", 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test291");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invaliddom)", "100-03-31", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test292");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 369243761 + "'", int1 == 369243761);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("LOCALHOST");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'LOCALHOST' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test294");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1st", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test295");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100-03-31", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test296");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test297");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-59097476965000 s", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-59097476965000 s" + "'", str2, "-59097476965000 s");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test298");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test299");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("97 s", 103232, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103232 + "'", int3 == 103232);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test300");
        java.lang.String[] strArray4 = new java.lang.String[] { "(invaliddom)", "(invaliddom)", "100-01-01", "0 s" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test301");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 10, 369243761);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test302");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test303");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test304");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0 s", "-1 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test305");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100-01-01", "100 s", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test306");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "", false, (int) '4', (java.lang.CharSequence) "0 s", (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass8 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test307");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test308");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "(invaliddom)" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test309");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test310");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test311");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test312");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "100 s", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test313");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test314");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!lidDOM)", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!lidDOM)" + "'", str2, "hi!lidDOM)");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test315");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("97 s", "LOCALHOST", "0 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test317");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test318");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test319");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test320");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1st", (int) 'a', ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test321");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "52-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test322");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test323");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((-1503611487));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test324");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test325");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 50770);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 h" + "'", str1, "14 h");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test326");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-59097476965000 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test327");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 103232);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test328");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "100-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test329");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-59097476965000 s", "-59097476965000 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test330");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-59097476965000 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test331");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test332");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97 s", "14 h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test333");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test334");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("97 s", "-59097476965000 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test335");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test336");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test337");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("14 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test338");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-12-31" + "'", str2, "10-12-31");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test339");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test340");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "97 s", "100-01-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test341");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "1 s", "hi!lidDOM)", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test342");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test343");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(4, (int) (byte) 0, 46729732, 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test344");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100-01-01", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test345");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test346");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0-01-01", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-01-01" + "'", str2, "0-01-01");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test347");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test348");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 4, 369243761, (int) (byte) -1, (int) (byte) 0, (-1503611487), (int) (short) -1, 46729732);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test349");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("100-01-01", "1st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test350");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, (int) (short) 1);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test351");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-59097476965000 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-59097476965000 s" + "'", str1, "-59097476965000 s");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test352");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("52-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test353");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.String str31 = textUtils0.abbreviate("(invalidDOM)", "hi!", (int) '4', (int) (byte) 10);
        java.lang.String str36 = textUtils0.abbreviate("(invaliddom)", "1 s", (-1), 46729732);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!lidDOM)" + "'", str31, "hi!lidDOM)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(invaliddom)" + "'", str36, "(invaliddom)");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test354");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1 s", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test355");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(10, (-84338570), 103232, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test356");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("52-01-01", 1752049);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-01-01" + "'", str2, "52-01-01");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test357");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("14 h", "(invalidDOM)", "35 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test358");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("100 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test359");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test360");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test361");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test362");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 0, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-04-01" + "'", str2, "0-04-01");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test363");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("10 s", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 s" + "'", str2, "10 s");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test364");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("", "-1 s", (int) 'a', 46729732);
        boolean boolean36 = textUtils0.regionMatch((java.lang.CharSequence) "-1 s", false, (int) (short) 1, (java.lang.CharSequence) "LOCALHOST", 97, 0);
        java.lang.String str41 = textUtils0.abbreviate("100-01-01", "0-04-01", 50770, 1506994);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "100-01-01" + "'", str41, "100-01-01");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test365");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 10, (int) ' ', 0, (int) (short) 100, (int) (byte) 1, (int) '#', 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61769591905000L) + "'", long8 == (-61769591905000L));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test366");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-01-01", "LOCALHOST", "-59097476965000 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test367");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-59097476965000 s", (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test368");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("100-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-03-31" + "'", str1, "100-03-31");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test369");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) -1, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-06-30" + "'", str2, "-1-06-30");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test370");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("hi!lidDOM)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test371");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "100-01-01", true, (int) (byte) 0, (java.lang.CharSequence) "10 s", 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test372");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("100-01-01", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test373");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-1-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test374");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, (int) (short) 1);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test375");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("97 s", "10 s", 4, (int) '4');
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "97 s", false, 46729732, (java.lang.CharSequence) "-59097476965000 s", (-84338570), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 s" + "'", str24, "97 s");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test376");
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test377");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test378");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test379");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "-59097476965000 s", false, (int) (byte) 0, (java.lang.CharSequence) "", 1506994, 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test380");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("10-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '10-12-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test382");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test383");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("LOCALHOST", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test384");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test385");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test386");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("-1 s", "", (int) (byte) 100, (int) 'a');
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = textUtils0.regionMatch(charSequence6, false, 4, (java.lang.CharSequence) "97 s", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 s" + "'", str5, "-1 s");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test387");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("52-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test388");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("52-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test389");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-10-01" + "'", str2, "10-10-01");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test390");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test391");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-62134890600000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-62134890600000 s" + "'", str1, "-62134890600000 s");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test392");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) 'a', 4, 50770, 46729732);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test393");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-59097476965000 s", "1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test394");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        java.lang.String str22 = textUtils0.abbreviate("-59097476965000 s", "100 s", 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-59097476965000 s" + "'", str22, "-59097476965000 s");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test395");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("14 h", "-59097476965000 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test396");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10-10-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test397");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("100-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test398");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test399");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test400");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 103232);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test401");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invaliddom)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test402");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("32 s", "35 s", "10 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test403");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test404");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test405");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("10-10-01", "LOCALHOST", "0 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test406");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(50770);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test407");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-03-31" + "'", str2, "-1-03-31");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test408");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "-59097476965000 s", true, (int) (byte) 10, (java.lang.CharSequence) "10 s", 1, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("52-01-01", "100-03-31", (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test409");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-59097476965000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test410");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test411");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(369243761);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test412");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) -1, 0, (int) (short) 100, 97, (int) (short) 0, 50770, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62192393630000L) + "'", long8 == (-62192393630000L));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test413");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-1), 97, 46729732, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test414");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("10-12-31", "-62134890600000 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test415");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(4, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test416");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("32 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test417");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1 s", "100-01-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test418");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test419");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-62134890600000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test420");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4th" + "'", str1, "4th");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test421");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "10-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test422");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("10-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10-10-01" + "'", str1, "10-10-01");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test423");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("10 s", "0-04-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test424");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test425");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("hi!lidDOM)", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test426");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, (int) (short) 1);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray6, (int) (short) 100);
        java.lang.String str12 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test427");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test428");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "-59097476965000 s", true, (int) (byte) 10, (java.lang.CharSequence) "10 s", 1, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("52-01-01", "100-03-31", (int) (short) 10, (int) (byte) 1);
        java.lang.String str34 = textUtils0.abbreviate("97 s", "hi!lidDOM)", 1506994, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test429");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test430");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        java.lang.String str17 = textUtils0.abbreviate("0 s", "1st", (int) '4', (int) (short) -1);
        boolean boolean24 = textUtils0.regionMatch((java.lang.CharSequence) "-59097476965000 s", true, (int) (byte) 10, (java.lang.CharSequence) "10 s", 1, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("14 h", "97 s", 0, 46729732);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14 h" + "'", str29, "14 h");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test431");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test432");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "-62134890600000 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test433");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("10-12-31", "10-10-01", "10-10-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test434");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test435");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test436");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1st" + "'", str2, "1st");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test437");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-01-01", "100-03-31", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test438");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("", "-1 s", (int) 'a', 46729732);
        java.lang.String str34 = textUtils0.abbreviate("(invaliddom)", "(invaliddom)", (-84338570), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(invaliddom)" + "'", str34, "(invaliddom)");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test439");
        java.lang.String[] strArray2 = new java.lang.String[] { "4th", "-1-03-31" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test440");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-62134890600000 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-62134890600000 s' could not be parsed, unparsed text found at index 15");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test441");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35 s", "35 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test442");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 100);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test443");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test444");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("14 h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 h" + "'", str1, "14 h");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test445");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-59097476965000 s", "14 h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test446");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test447");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 369243761);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 y" + "'", str1, "12 y");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test448");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!lidDOM)", "-62134890600000 s", "1st");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test449");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("10-12-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 483962972 + "'", int1 == 483962972);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test450");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1506994, (-84338570));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test451");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test452");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("14 h");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test453");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("4th", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test454");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 s" + "'", str1, "4 s");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test455");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("12 y", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test456");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test457");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-59097476965000 s", "12 y");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test458");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 0, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test459");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test460");
        java.lang.String[] strArray4 = new java.lang.String[] { "(invaliddom)", "(invaliddom)", "100-01-01", "0 s" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (short) 100);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test461");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test462");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "4th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test463");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test464");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 100);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 369243761);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 1506994);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test465");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-1), (int) (short) 1, (-1503611487), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test466");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-62134890600000 s", "10-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test467");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test468");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "hi!lidDOM)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test469");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "LOCALHOST", "LOCALHOST", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test470");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.String str31 = textUtils0.abbreviate("100-01-01", "1st", 100, 0);
        java.lang.Class<?> wildcardClass32 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test471");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("(invaliddom)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '(invaliddom)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test472");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test473");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "100-01-01", "0-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test474");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 100, (-1), (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test475");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test476");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-1-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test477");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("32 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test478");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.String str31 = textUtils0.abbreviate("0 s", "-62134890600000 s", (int) (short) 10, (int) (short) 0);
        boolean boolean38 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, (int) 'a', (java.lang.CharSequence) "0-04-01", (int) '#', 97);
        boolean boolean45 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, (int) 'a', (java.lang.CharSequence) "10-12-31", (int) (short) 1, 103232);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test479");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(103232, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "103232-12-31" + "'", str2, "103232-12-31");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test480");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (int) (byte) 1);
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, 369243761);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test481");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "hi!", (int) (short) 0, (int) '#');
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) ' ', (java.lang.CharSequence) "10 s", (int) (short) -1, (int) ' ');
        java.lang.String str26 = textUtils0.abbreviate("0 s", "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.String str31 = textUtils0.abbreviate("0 s", "-62134890600000 s", (int) (short) 10, (int) (short) 0);
        boolean boolean38 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, (int) 'a', (java.lang.CharSequence) "0-04-01", (int) '#', 97);
        boolean boolean45 = textUtils0.regionMatch((java.lang.CharSequence) "35 s", false, (int) (byte) 10, (java.lang.CharSequence) "12 y", 1752049, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test482");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test483");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("103232-12-31", "35 s", "97 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test484");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test485");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "100 s", "14 h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test486");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test487");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, 100, 50770, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test488");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10-10-01", "10th");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test489");
        java.lang.String[] strArray4 = new java.lang.String[] { "(invaliddom)", "(invaliddom)", "100-01-01", "0 s" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (short) 100);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test490");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) 'a', (int) (short) 0, 1752049, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test491");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-59097476965000 s", "100-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test492");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35 s", (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test493");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-84338570));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-84338570 s" + "'", str1, "-84338570 s");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test494");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, (int) (short) 10, (java.lang.CharSequence) "", (int) '#', (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "", (int) (byte) 0, (int) '4');
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) ' ');
        java.lang.String str24 = textUtils0.abbreviate("0 s", "", 1, (int) (byte) -1);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "12 y", true, (int) (byte) 0, (java.lang.CharSequence) "0-01-01", (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test495");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-59097476965000 s", "32 s", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test496");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test497");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test498");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0-04-01", "0-01-01", "10-10-01", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test499");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1 s", (int) '4', '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop437_RegressionTest0.test500");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

