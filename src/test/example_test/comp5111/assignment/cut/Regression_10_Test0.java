package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_10_Test0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test001");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test002");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', (int) '4', 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test003");
        comp5111.assignment.cut.Subject.DateTimeUtils dateTimeUtils0 = new comp5111.assignment.cut.Subject.DateTimeUtils();
        java.lang.Class<?> wildcardClass1 = dateTimeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 0, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test005");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test006");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test007");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3329 + "'", int1 == 3329);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test008");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test010");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test011");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test012");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 0, (int) ' ', (int) (byte) -1, 0, (int) (short) -1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62085571250000L) + "'", long8 == (-62085571250000L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test013");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test014");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, 0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test015");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "hi!", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test016");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test017");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test018");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test019");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test020");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test021");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test022");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-1 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test023");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test024");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test025");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test026");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test027");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test028");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0 s", "(invalidDOM)", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test029");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-62085571250000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-62085571250000 s" + "'", str1, "-62085571250000 s");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test030");
        java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test031");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test032");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test033");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-62085571250000 s", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-62085571250000 s" + "'", str2, "-62085571250000 s");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test034");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test035");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test036");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test037");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (short) 100, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test038");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test039");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test040");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-695457261) + "'", int1 == (-695457261));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test041");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-12-31" + "'", str2, "1-12-31");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-62085571250000 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-62085571250000 s' could not be parsed, unparsed text found at index 15");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test043");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-1 s", "(invalidDOM)", "-1 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test044");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test045");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 10, 3329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test046");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 " + "'", str1, "0 ");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test047");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 0, (int) (short) 0, (-1), (-1), (int) (byte) 10, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62169986903000L) + "'", long8 == (-62169986903000L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test048");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test049");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("1-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-12-31" + "'", str1, "1-12-31");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test050");
        comp5111.assignment.cut.Subject.WebUtils webUtils0 = new comp5111.assignment.cut.Subject.WebUtils();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test051");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1 s", "", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test052");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-12-31", "0 s", "-1 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test053");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test054");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test055");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (short) -1, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test056");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test057");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test058");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test059");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test060");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("-62085571250000 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-62085571250000 s" + "'", str1, "-62085571250000 s");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test061");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1-12-31", "-1 s", "-62085571250000 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test062");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "0 s", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test063");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-1 s", "(invalidDOM)", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test064");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 10, (int) (short) -1, (int) '#', (-1), 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test065");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1-12-31", "1st", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test066");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invaliddom)", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test067");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "1st", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test068");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test069");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-62085571250000 s", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-62085571250000 s" + "'", str2, "-62085571250000 s");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test070");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-01-01" + "'", str2, "-1-01-01");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test071");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test072");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", 100, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test073");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) -1, (int) (byte) 1, (int) (byte) 0, 3329);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test074");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test075");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) 'a', (-695457261));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test076");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test077");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test078");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 " + "'", str5, "0 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 " + "'", str6, "0 ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test079");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "0 ", "", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test080");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1st", "(invaliddom)", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test081");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test082");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test083");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (byte) 10, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test084");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("1st");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1st' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test086");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0 ", "0 ");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test087");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        java.lang.CharSequence charSequence13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = textUtils0.regionMatch(charSequence13, true, (int) '#', (java.lang.CharSequence) "0 s", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test088");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) -1, (int) (short) 100, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test089");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test090");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test091");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test092");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(3329, (int) (byte) 1, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test093");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-1 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44796 + "'", int1 == 44796);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test094");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test095");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invaliddom)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test096");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "-1-01-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test097");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test098");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-1 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test099");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, 0, (java.lang.CharSequence) "0 s", (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test100");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1st", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test101");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-1 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-1 s' could not be parsed at index 1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test103");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 0, (int) (byte) 10, 1, 44796, (int) (byte) 100, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61982273965000L) + "'", long8 == (-61982273965000L));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test104");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test105");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test106");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("35 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test107");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0 ", "-1-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test108");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test109");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test110");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "1-12-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test111");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test112");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-62085571250000 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-62085571250000 s" + "'", str1, "-62085571250000 s");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("1-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1-12-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test114");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0 s", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 s" + "'", str2, "0 s");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test115");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "-1-01-01", "0 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test116");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test117");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test118");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1), (-695457261));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test119");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test120");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 " + "'", str2, "0 ");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test121");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test122");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test123");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1-12-31", (int) ' ', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test124");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test125");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "-62085571250000 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test126");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invalidDOM)", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalidDOM)" + "'", str2, "(invalidDOM)");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test127");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("-1 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test128");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-12-31", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test129");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, (int) (short) 100, (java.lang.CharSequence) "-62085571250000 s", 10, (int) (short) 0);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "-1 s", true, (-695457261), (java.lang.CharSequence) "0 s", (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test130");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test131");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "0 s", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test132");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "35 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test133");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "-1 s", "35 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test134");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "35 s", "-1 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test135");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test136");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test137");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test138");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test139");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "35 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test140");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test141");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test142");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1st", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test143");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1 s", "1-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test144");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35 s", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test145");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test146");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1-01-01", "(invaliddom)", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test147");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test148");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test149");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test150");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test151");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-10-01" + "'", str2, "1-10-01");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test152");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test153");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("1st", 10, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test154");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test155");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test156");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test157");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test158");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-1-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1-01-01" + "'", str1, "-1-01-01");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test159");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35 s", 0, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test160");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test161");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test162");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-695457261), 0, (int) (short) 1, 0, (int) (short) 100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-52548285075590000L) + "'", long8 == (-52548285075590000L));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test163");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test164");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test165");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "-62085571250000 s", "0 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-01-01" + "'", str2, "100-01-01");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test167");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(44796);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test168");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invaliddom)", "");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test169");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test170");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test171");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test172");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(44796, (int) (short) -1, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test173");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-10-01", "1-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test174");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-10-01", "35 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test175");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test176");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 s" + "'", str1, "52 s");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test177");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test178");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test179");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test180");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test181");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test182");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("52 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 s" + "'", str1, "52 s");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test183");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "1-12-31", "(invaliddom)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test184");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-62085571250000 s", "1st");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test185");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test186");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 10, (int) '#', (int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test187");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "1st", "10 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test188");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "", "0 ", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test189");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test190");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1-01-01", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-01-01" + "'", str2, "-1-01-01");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test191");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "-62085571250000 s", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test192");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", false, 3329, (java.lang.CharSequence) "0 s", (-695457261), 44796);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, (int) 'a', (java.lang.CharSequence) "35 s", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test193");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "-1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test194");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test195");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test196");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 3329);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55 m" + "'", str1, "55 m");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test197");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0", "0 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test198");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "(invaliddom)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test199");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97 s" + "'", str1, "97 s");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test200");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test201");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test202");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test203");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "", false, 100, (java.lang.CharSequence) "1st", (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test204");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-1-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1566141971) + "'", int1 == (-1566141971));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test205");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "10 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test206");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test207");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test208");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test209");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("55 m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55 m" + "'", str1, "55 m");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test210");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test211");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("1-10-0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test212");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (short) -1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test213");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1566141971), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test214");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("0 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1520 + "'", int1 == 1520);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test215");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-1566141971), 0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test216");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test217");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("52 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test218");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test219");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) 'a', 3329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test220");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("100-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '100-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test221");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "(invalidDOM)", "10 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test222");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (short) 0, 10, (int) '#', 10, 10, 32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test223");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invaliddom)", 1, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test224");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test225");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalidDOM)" + "'", str2, "(invalidDOM)");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test226");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test227");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invalidDOM)", "1-10-01", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test228");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("35 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test229");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test230");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("35 s", "");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("(invalidDOM)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '(invalidDOM)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test232");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("55 m");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '55 m' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test233");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test234");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("35 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test235");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test236");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test237");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-1 s", "(invaliddom)", "-1 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test238");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test239");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1-12-31", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-12-31" + "'", str2, "1-12-31");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test240");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test241");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52 s", (int) (short) 0, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test242");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test243");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 ", "-1-01-01", "97 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test244");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test245");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test246");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-10-0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test247");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0", "1-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test248");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("10 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48609 + "'", int1 == 48609);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test249");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "1st");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test250");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test251");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("55 m", "52 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test252");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0 ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test253");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test254");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("10 s", 44796, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44796 + "'", int3 == 44796);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test255");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("55 m", "0 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test256");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test257");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-1), (int) ' ', 1520, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test258");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test259");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test260");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 10);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-695457261));
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test261");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test262");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 100, 44796, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 59354642410000L + "'", long8 == 59354642410000L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test263");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test264");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test265");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("32 s", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32 s" + "'", str2, "32 s");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test266");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1-10-0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test267");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test268");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 0, (-695457261), (int) (short) -1, 0, 0, 1520, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-13236329057680000L) + "'", long8 == (-13236329057680000L));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test269");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("97 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test270");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        java.lang.String str12 = textUtils0.abbreviate("10 s", "(invaliddom)", 3329, 2);
        java.lang.String str17 = textUtils0.abbreviate("1-12-31", "1-10-01", 2, 48609);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1-12-31" + "'", str17, "1-12-31");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test271");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test272");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("32 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test273");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test274");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("55 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test275");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test276");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "55 m", "1-10-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test277");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) '4', 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-03-31" + "'", str2, "52-03-31");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test278");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, 0, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test279");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("55 m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55 m" + "'", str1, "55 m");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test280");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test281");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("52 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test282");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test283");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "1-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test284");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test285");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1st", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1st" + "'", str2, "1st");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test286");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test287");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "97 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test288");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100-01-01", "32 s", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test289");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test290");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test291");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-10-01", "52-03-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test292");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-01-01", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test293");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test294");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52 s", 100, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test295");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "32 s", "-1 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test296");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(10, (int) (byte) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test297");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(48609, (int) '4', 11, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test298");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1-10-0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test299");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-1 s", (int) (byte) 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test300");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-12-31" + "'", str2, "0-12-31");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test301");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test302");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "1-10-01", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test303");
        java.lang.String[] strArray1 = new java.lang.String[] { "1-10-01" };
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-10-0" + "'", str2, "1-10-0");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test304");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test305");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-12-31", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test306");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(100, (int) '4', (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test307");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "55 m");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test308");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0-12-31" + "'", str1, "0-12-31");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test309");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("32 s", "0-12-31", "55 m", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test310");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test311");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test312");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1-10-0", "1st", "1st", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test313");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1-12-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test314");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "97 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test315");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("100-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-01-01" + "'", str1, "100-01-01");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test316");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (-1), (int) (short) -1, 1520, 2, 0, 1520, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test317");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0 s", "1-10-0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test318");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("10 s", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 s" + "'", str2, "10 s");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test319");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test320");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "52-03-31", "-62085571250000 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test321");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("52-03-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '52-03-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test322");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(2, (int) (short) -1, 2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test323");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test324");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test325");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52 s", (int) (short) 100, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test326");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1445894174 + "'", int1 == 1445894174);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test327");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 100, (int) '4', (int) (short) 100, 0, 100, 44796, 1520);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-58868243604000L) + "'", long8 == (-58868243604000L));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test328");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("52 s", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test329");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "32 s", "0-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test330");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "hi!", "52-03-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test331");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1-10-01", "10 s", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test332");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(3, (-695457261));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test333");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("0 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test334");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test335");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, (int) (short) 100, (java.lang.CharSequence) "-62085571250000 s", 10, (int) (short) 0);
        java.lang.String str19 = textUtils0.abbreviate("1-10-0", "97 s", 100, 3);
        java.lang.Class<?> wildcardClass20 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test336");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test337");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invalidDOM)", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalidDOM)" + "'", str2, "(invalidDOM)");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test338");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, 1520);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test339");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "-62085571250000 s", "32 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test340");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 ", "52-03-31", "0 ", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test341");
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test342");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test343");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(11, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11-03-31" + "'", str2, "11-03-31");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test344");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test345");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", false, 3329, (java.lang.CharSequence) "0 s", (-695457261), 44796);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "52 s", false, (int) '4', (java.lang.CharSequence) "55 m", (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test346");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("11-03-31", "");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test347");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "1st", "0 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test348");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "-1 s", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test349");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1st", 48609);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1st" + "'", str2, "1st");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test350");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1-10-0", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-10-0" + "'", str2, "1-10-0");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test351");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("11-03-31", "10 s", "(invaliddom)", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test352");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1-01-01", "52 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test353");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "97 s", "52-03-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test354");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test355");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test356");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test357");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "0-12-31", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test358");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(1445894174, 3329, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test359");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test360");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test361");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test362");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1-10-01", "55 m", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test363");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11th" + "'", str1, "11th");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test364");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100-01-01", "97 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test365");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test366");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "100 s", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test367");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test368");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test369");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) '4');
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test370");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test371");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test372");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0 ", "", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test373");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test374");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("32 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test375");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-01-01", "0 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test376");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(44796, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test377");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 0);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 " + "'", str9, "0 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 " + "'", str10, "0 ");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test378");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test379");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("52-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test380");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test381");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test382");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test383");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test384");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("52-03-31", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test385");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test386");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-12-31" + "'", str1, "1-12-31");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test387");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("35 s", "1-10-01", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test388");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-62085571250000 s", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test389");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test390");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 0, 1, 11, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test391");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-10-01" + "'", str1, "1-10-01");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test392");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test393");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0-12-31", (int) '#', ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test394");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "1-10-01", true, 10, (java.lang.CharSequence) "100-01-01", (int) (byte) 10, (int) (byte) 0);
        java.lang.String str26 = textUtils0.abbreviate("1-10-0", "0 ", 3, 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1-10-0" + "'", str26, "1-10-0");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test395");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("hi!", "0 ");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test396");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test397");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 44796);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 h" + "'", str1, "12 h");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test398");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("11th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test399");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0-12-31", 32, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test400");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("55 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test401");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test402");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", 10, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test403");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-10-01", "LOCALHOST", "-1 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test404");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-62085571250000 s", "hi!", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test405");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test406");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test407");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("12 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test408");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(35, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test409");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) -1, 3329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test410");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invalidDOM)", "-62085571250000 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test411");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-62085571250000 s", "-1-01-01", "1-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test412");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 35, 3, (int) 'a', 2, (-695457261), (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test413");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1445894174);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test415");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("LOCALHOST", "1-10-0");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test416");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test417");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("11-03-31", "(invaliddom)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test418");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("52-03-31", "11th");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test419");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("97 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test420");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-12-31" + "'", str2, "10-12-31");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test421");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("52-03-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test422");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test423");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-12-31", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test424");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test425");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "1-10-0", "(invalidDOM)", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test426");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "10-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test427");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("52-03-31", "1-10-0");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test428");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (short) 10, 35, 11, 2, 100, 1, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test429");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("11th", "1-12-31", "-1-01-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test430");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test431");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) '4', (int) 'a', 35, (int) (byte) -1, 3329, 0, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test432");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(48609, 1445894174);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test433");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("12 h", "(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test434");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test435");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test436");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("11th", "(invalidDOM)", "10 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test437");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test438");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test439");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "52-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test440");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("32 s", 1445894174, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1445894174 + "'", int3 == 1445894174);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test441");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10-12-31", "97 s", "1-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test442");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test443");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test444");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test445");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("100-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-01-01" + "'", str1, "100-01-01");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test446");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("10 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '10 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test447");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test448");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray8 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, -1]");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test449");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("0-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test450");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0 s", 1520);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 s" + "'", str2, "0 s");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test451");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test452");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test453");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test454");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "10-12-31", "97 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test455");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0", "0-12-31", "1-10-0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test456");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1566141971), (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test457");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("10-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10-12-31" + "'", str1, "10-12-31");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test458");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("97 s", (int) (short) 1, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test459");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 1, 44796);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test460");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-03-31" + "'", str2, "1-03-31");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test461");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test462");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-62085571250000 s", (int) (short) 1, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test463");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1-03-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test464");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test465");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("32 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test466");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("12 h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 h" + "'", str1, "12 h");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test467");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1566141971), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test468");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-10-01" + "'", str2, "35-10-01");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test469");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 0, (int) (byte) -1, (-1), 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test470");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test471");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test472");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10-12-31", "35-10-01", "55 m", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test473");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-10-0", "100 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test474");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test475");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-62085571250000 s", 1520, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1520 + "'", int3 == 1520);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test476");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test477");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test478");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("100 s", "hi!", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test479");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("(invaliddom)", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test480");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test481");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "12 h", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test482");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10-12-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test483");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "0-12-31", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test484");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("11-03-31", "1-10-0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test485");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 0]");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test486");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 0);
        int int11 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 1);
        java.lang.String str12 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 " + "'", str12, "0 ");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test487");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-10-0", "1st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test488");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test489");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test490");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test491");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test492");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test493");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(1520, 1520, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test494");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35-10-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35-10-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test495");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test496");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("10 s", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 s" + "'", str2, "10 s");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test497");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("55 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test498");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("11-03-31", "0 ", "11-03-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test499");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) -1);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test500");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("52 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52515 + "'", int1 == 52515);
    }
}

