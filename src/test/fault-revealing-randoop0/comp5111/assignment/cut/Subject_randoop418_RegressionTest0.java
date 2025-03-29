package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop418_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test001");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test002");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test003");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test004");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "hi!", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test005");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test006");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test007");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test008");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test009");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test010");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test011");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) (short) 10, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test012");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test013");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test014");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) (byte) 10, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test015");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test016");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test017");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test018");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) (short) 100, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test019");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test021");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test022");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test023");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test024");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test025");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test026");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test027");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test028");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test029");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test030");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test031");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test032");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 100, (-1), (-1), (int) 'a', (int) (short) 1, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59016466708000L) + "'", long8 == (-59016466708000L));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test033");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test034");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test035");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test036");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test037");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test038");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test039");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test040");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test042");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test043");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test044");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) 'a', 1, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test045");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-10-01" + "'", str2, "35-10-01");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test046");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "hi!", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test047");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103232 + "'", int1 == 103232);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test048");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "35-10-01", "hi!", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test049");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test050");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test051");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test052");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test053");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test054");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test055");
        java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test056");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test057");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.Class<?> wildcardClass1 = textUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test058");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test059");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test060");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test061");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test062");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test063");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test064");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test065");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-12-31" + "'", str2, "-1-12-31");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test066");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test067");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test068");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("35-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35-10-01" + "'", str1, "35-10-01");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test069");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test070");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test071");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test072");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("(invalidDOM)", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test073");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("-1-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1-12-31" + "'", str1, "-1-12-31");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test074");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test075");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 100, (int) (byte) 10, (int) 'a', 10, 100, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-58979535548000L) + "'", long8 == (-58979535548000L));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test076");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test077");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test078");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test079");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test080");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "-1-12-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test081");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, 103232, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test082");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test083");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test084");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35-10-01", (int) (short) 10, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test085");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "", "(invalidDOM)", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test086");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "(invalidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test087");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "hi!", (int) ' ', 10);
        java.lang.Class<?> wildcardClass6 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test088");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(103232);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test089");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test090");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "0 s", "LOCALHOST", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test091");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 1, (int) (short) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test092");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "-1-12-31", "0 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test094");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test095");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-1-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1-12-31" + "'", str1, "-1-12-31");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test096");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", 103232, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103232 + "'", int3 == 103232);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test097");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test098");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test099");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84338570) + "'", int1 == (-84338570));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test100");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("35-10-01", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-10-01" + "'", str2, "35-10-01");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test101");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test102");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0 s", (int) (byte) 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test103");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 1, (int) '#', 103232, (-1), (-84338570), (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-53892105604000L) + "'", long8 == (-53892105604000L));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test104");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 100, (int) (byte) -1, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test105");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test106");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test107");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test108");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test109");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-12-31", "", "-1-12-31", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test110");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("35-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-182892220) + "'", int1 == (-182892220));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test111");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', (int) (byte) -1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test112");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-182892220));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-182892220 s" + "'", str1, "-182892220 s");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test113");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-182892220 s", 103232, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103232 + "'", int3 == 103232);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test114");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test115");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35-10-01", (int) (byte) 100, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test116");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-84338570), (int) (byte) -1, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test117");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) ' ', '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test118");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("0 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1-12-31", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-12-31" + "'", str2, "-1-12-31");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test120");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("10 s", (int) (short) 0, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test121");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "-182892220 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test122");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "10 s", "35 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test123");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test124");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test125");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (byte) -1, 100, (int) (byte) -1, 0, 0, 100, 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test126");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("LOCALHOST");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35-10-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35-10-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test128");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("LOCALHOST", "", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test129");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test130");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test131");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test132");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test133");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-182892220 s", "-1-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test134");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test135");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test136");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test137");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test138");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test139");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "", "-1-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test140");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test141");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test142");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(100, 3, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test143");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "35-10-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test145");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "10 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test146");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "(invalidDOM)", "35-10-01" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test147");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test148");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test149");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test150");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35-10-01", "-1-12-31", 3, 100);
        java.lang.String str10 = textUtils0.abbreviate("(invalidDOM)", "35-10-01", (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-10-01" + "'", str5, "35-10-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(invalidDOM)" + "'", str10, "(invalidDOM)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test151");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) (short) 10, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test152");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('#', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test153");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(2, (int) '4', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test154");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test155");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(1, 100, 3, (-182892220));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test156");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test157");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "", "35 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test158");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("LOCALHOST");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'LOCALHOST' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test160");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "(invalidDOM)", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test161");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (short) -1, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test162");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "(invalidDOM)", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test163");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test164");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-03-31" + "'", str2, "10-03-31");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test165");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0 s", "hi!", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test167");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("-1-12-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test168");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test169");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2nd" + "'", str1, "2nd");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test170");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test171");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test173");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test174");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(3, (int) (byte) 10, (int) (byte) -1, 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test175");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35 s", 32, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test176");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-182892220 s", "0 s", "10 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test177");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test178");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-12-31", "-1-12-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test179");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) -1, (int) (short) 100, (-84338570), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test180");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test181");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test182");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10 s", "-1-12-31", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test183");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-1-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test184");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-03-31" + "'", str2, "-1-03-31");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test185");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test186");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test187");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invaliddom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invaliddom)" + "'", str1, "(invaliddom)");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test188");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("2nd", "2nd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test189");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test190");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("10-03-31", "", "0 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test191");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("LOCALHOST", "hi!", (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass6 = textUtils0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test192");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("LOCALHOST", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LOCALHOST" + "'", str2, "LOCALHOST");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test193");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("2nd", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test194");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test195");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10-03-31", "10 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test196");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-12-31", "10-03-31", "2nd", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test197");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("2nd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2nd" + "'", str1, "2nd");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test198");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((-182892220));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test199");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-12-31" + "'", str2, "10-12-31");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test200");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("LOCALHOST", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test201");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("2nd", "hi!");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test202");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test203");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1-12-31", "-182892220 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test204");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("10-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10-03-31" + "'", str1, "10-03-31");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test205");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test206");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-10-01" + "'", str2, "100-10-01");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test207");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10 s", "(invalidDOM)", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test208");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test209");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "10-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test210");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "-1-03-31", "LOCALHOST", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test211");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test212");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "hi!", "10-03-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test213");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test214");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test215");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "0 s", "2nd");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test216");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("hi!", "10-03-31", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test217");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("2nd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51560 + "'", int1 == 51560);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test218");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test219");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test220");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-10-01", "", "100-10-01", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test221");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35 s", "-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test222");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("hi!", "-182892220 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test223");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test224");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test225");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-182892220 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 404623664 + "'", int1 == 404623664);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test226");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test227");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(51560);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test228");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test229");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "2nd", "100 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test230");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(3, (int) (byte) 1, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test231");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test232");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test233");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test234");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("10 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test235");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "localhost" + "'", str1, "localhost");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test236");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "LOCALHOST", 103232, (-84338570));
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "10-03-31", false, (int) (short) 100, (java.lang.CharSequence) "100-10-01", 100, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test237");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("100-10-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test238");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("10-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10-12-31" + "'", str1, "10-12-31");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test239");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test240");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("localhost", "10-03-31", "-182892220 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test241");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test242");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "-1-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test243");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test244");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("", "100-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test245");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (byte) -1, (int) (short) -1, (int) (short) 1, 2, 404623664, (-84338570), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("10-03-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '10-03-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test247");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 2, (java.lang.CharSequence) "10-12-31", 1, (-182892220));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test248");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test249");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("10-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10-03-31" + "'", str1, "10-03-31");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test250");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test251");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35-10-01", "-1-12-31", 3, 100);
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "LOCALHOST", true, (int) (short) 0, (java.lang.CharSequence) "-1-03-31", (int) (short) 100, 404623664);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-10-01" + "'", str5, "35-10-01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test252");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test253");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 1, (int) (short) 1, 404623664, 2, (int) (short) -1, 0, (-182892220));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34897348893539818L + "'", long8 == 34897348893539818L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test254");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("35 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test255");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test256");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1), 103232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test257");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-182892220), (int) (short) -1, 10, 1, (int) (byte) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 165779610771695000L + "'", long8 == 165779610771695000L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test259");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test260");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("2nd", "-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test261");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("10-03-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 483069242 + "'", int1 == 483069242);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test262");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("(invaliddom)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test263");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1-12-31", "2nd");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test264");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("35-10-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test265");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-01-01" + "'", str2, "0-01-01");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test266");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("-182892220 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-182892220 s' could not be parsed, unparsed text found at index 10");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test268");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test269");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test270");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "LOCALHOST", 103232, (-84338570));
        java.lang.String str17 = textUtils0.abbreviate("(invalidDOM)", "100 s", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test271");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("localhost", "hi!", "", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test272");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 10, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-03-31" + "'", str2, "10-03-31");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test273");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test274");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test275");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test276");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test277");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "LOCALHOST", 103232, (-84338570));
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "35-10-01", false, 404623664, (java.lang.CharSequence) "35 s", 32, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test278");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("(invaliddom)", "35-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test279");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "(invalidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test280");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("-182892220 s", "0 s", (int) 'a', 3);
        java.lang.Class<?> wildcardClass11 = textUtils0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test281");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("2nd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test282");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test283");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35-10-01", "-1-12-31", 3, 100);
        java.lang.String str10 = textUtils0.abbreviate("10-12-31", "2nd", 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-10-01" + "'", str5, "35-10-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-12-31" + "'", str10, "10-12-31");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("100-10-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '100-10-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test285");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invaliddom)", "-1-03-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test286");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10-12-31", "", "35 s", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test287");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test288");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test289");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test290");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test291");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0-01-01", "hi!", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test292");
        comp5111.assignment.cut.Subject.DateTimeUtils dateTimeUtils0 = new comp5111.assignment.cut.Subject.DateTimeUtils();
        java.lang.Class<?> wildcardClass1 = dateTimeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test293");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("10-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test294");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invalidDOM)", "10-03-31", true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test295");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-182892220 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-182892220 s" + "'", str1, "-182892220 s");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test296");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test297");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("35 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1571381 + "'", int1 == 1571381);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test298");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("2nd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test299");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test300");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test301");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 s" + "'", str1, "0 s");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test302");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "35 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test303");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(2, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test304");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (short) 1);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test305");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("35 s", "100-10-01", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test306");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("35 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invalidDOM)", (-84338570), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -84338570");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test308");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("LOCALHOST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALHOST" + "'", str1, "LOCALHOST");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test309");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("localhost", "2nd");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test311");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test312");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 0, 1, (int) 'a', (int) '4', 51560, (-1), (-84338570));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test313");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "-1-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test314");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-84338570), (-182892220), (-182892220), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test315");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test316");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (int) '#', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test317");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "(invalidDOM)", "35-10-01" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test318");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "LOCALHOST", 103232, (-84338570));
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "35 s", false, (int) (short) 100, (java.lang.CharSequence) "-1-12-31", 100, (int) (short) -1);
        java.lang.String str24 = textUtils0.abbreviate("10 s", "100-10-01", 483069242, 1);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "35 s", false, 10, (java.lang.CharSequence) "10 s", (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test319");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100-10-01", "-1-03-31", "10-03-31", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test320");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test321");
        java.lang.String[] strArray1 = new java.lang.String[] { "(invaliddom)" };
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invaliddom)" + "'", str3, "(invaliddom)");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "0 s", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test323");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test324");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10-03-31", "100-10-01", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test325");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-182892220 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test326");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-12-31", "", "2nd");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test327");
        comp5111.assignment.cut.Subject.WebUtils webUtils0 = new comp5111.assignment.cut.Subject.WebUtils();
        java.lang.Class<?> wildcardClass1 = webUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test328");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test329");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("10-03-31", "35-10-01", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test330");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test331");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test332");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("0-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test333");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("2nd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2nd" + "'", str1, "2nd");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test334");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("100 s", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100 s" + "'", str2, "100 s");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test335");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-12-31" + "'", str2, "35-12-31");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test336");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("35-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test337");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("2nd", 103232, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103232 + "'", int3 == 103232);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test338");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("2nd", "10-12-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test339");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString(34897348893539818L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1106587674 y" + "'", str1, "1106587674 y");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test340");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test341");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(3, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3-01-01" + "'", str2, "3-01-01");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test342");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35-10-01", "-1-12-31", 3, 100);
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "10-12-31", false, (int) ' ', (java.lang.CharSequence) "0 s", (-1), (int) (short) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "-182892220 s", true, (int) '#', (java.lang.CharSequence) "0 s", (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-10-01" + "'", str5, "35-10-01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test343");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("(invaliddom)", "10-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test344");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 483069242, 35, 0, (int) ' ', (int) (short) 10, 35, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 29638655683835000L + "'", long8 == 29638655683835000L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test345");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) -1, (int) '4', (int) (short) 1, 483069242);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test346");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test347");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test348");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("hi!", (int) ' ', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test349");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "10-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test350");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test351");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("2nd", "-1-12-31", "35-12-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test352");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) '4', 2, 35, 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test353");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("3-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test354");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test355");
        java.lang.String[] strArray3 = new java.lang.String[] { "35 s", "10-12-31", "(invalidDOM)" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test356");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100-10-01", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test357");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-182892220), 103232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test358");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(404623664, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test359");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1106587674 y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test360");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1106587674 y", "-1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test361");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test362");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray3, 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test363");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test364");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35-10-01", 2, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test365");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("LOCALHOST", "0-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test366");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 1, 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-03-31" + "'", str2, "1-03-31");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test367");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 s" + "'", str1, "10 s");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test368");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("3-01-01", "", "35-12-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test369");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test370");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("10-03-31", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-03-31" + "'", str2, "10-03-31");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test371");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("10 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test372");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) 1, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-01-01" + "'", str2, "1-01-01");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test373");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("3-01-01", "", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test374");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 1, 8, (-84338570), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test375");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-1 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 s" + "'", str1, "-1 s");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test376");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("2nd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test377");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 10, 51560, 0, (-84338570));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test378");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-03-31", "0 s", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test379");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("3-01-01", "1-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test380");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(35, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test381");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(483069242, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test382");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1106587674 y", "10-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test383");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("-182892220 s", "0 s", (int) 'a', 3);
        java.lang.String str15 = textUtils0.abbreviate("hi!", "-1 s", (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test384");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(10, 483069242, 35, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test385");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-182892220 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-182892220 s" + "'", str1, "-182892220 s");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test386");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test387");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1-03-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test388");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "(invalidDOM)", "35-10-01", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test389");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1 s", "(invalidDOM)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test390");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-03-31" + "'", str1, "1-03-31");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test391");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test392");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (short) 1);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, 51560);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test393");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("2nd", "35-10-01", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test394");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test395");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "10-12-31", false, 100, (java.lang.CharSequence) "-1-12-31", 100, 51560);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "10-12-31", true, 51560, (java.lang.CharSequence) "LOCALHOST", (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test396");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("10-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test397");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test398");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-03-31", "100 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test399");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) '4', 32, 100, (int) (byte) 1, 3, (-182892220), (int) ' ');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test400");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("100-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test401");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("3-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test402");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (short) 1, (int) ' ', 51560);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test403");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("LOCALHOST", "hi!", (int) (short) 10, 0);
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "10-12-31", true, (int) (short) -1, (java.lang.CharSequence) "-1-12-31", (int) (short) -1, 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test404");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("35 s", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35 s" + "'", str2, "35 s");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test405");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test406");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 35, (int) (short) -1, (int) '#', (-182892220), 8, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62346923132000L) + "'", long8 == (-62346923132000L));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test407");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test408");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test409");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test410");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("3-01-01", "0 s", "(invaliddom)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test411");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("10-12-31", (int) (byte) 0, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test412");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test413");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-182892220 s", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-182892220 s" + "'", str2, "-182892220 s");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test415");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("(invaliddom)", "localhost", "10th", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test416");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("1 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test417");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 1, 0, (int) (byte) 0, (int) (short) -1, (-1), (int) '#', 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62138278825000L) + "'", long8 == (-62138278825000L));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test418");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "35-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test419");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test420");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test421");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "hi!", "10-12-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test422");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", 51560);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test423");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("", "100 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test424");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1st", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test425");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("35-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test426");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-12-31", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-12-31" + "'", str2, "-1-12-31");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test427");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("100-10-01", 2, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test428");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test429");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test430");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("localhost");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "localhost" + "'", str1, "localhost");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test431");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("10-12-31", "localhost");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test432");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test433");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(32, 32, (-182892220), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test434");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test435");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("3-01-01", "100-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test436");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test437");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test438");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "35-12-31", false, (-84338570), (java.lang.CharSequence) "0-01-01", (int) '#', 1571381);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test439");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100-10-01", "1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test440");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test441");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0 s", "1st");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test442");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test443");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("35-12-31", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test444");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("10-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '10-12-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test445");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10 s", "hi!", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test446");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test447");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) 0, (-182892220));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test448");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("(invaliddom)", "10-03-31", 103232, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(invaliddom)" + "'", str10, "(invaliddom)");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test449");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("LOCALHOST", (int) (byte) 1, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test450");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("3-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3-01-01" + "'", str1, "3-01-01");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test451");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(103232, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test452");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) '#');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 51560);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test453");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test454");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(8, (int) (short) 10, 3, 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test455");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("-182892220 s", "0 s", (int) 'a', 3);
        java.lang.String str15 = textUtils0.abbreviate("0 s", "(invalidDOM)", (int) (byte) 0, (int) (short) -1);
        java.lang.String str20 = textUtils0.abbreviate("10-03-31", "", 9, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test456");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "1106587674 y", (int) (byte) 0, (int) (short) 100);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "3-01-01", true, 404623664, (java.lang.CharSequence) "1 s", 100, 8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test457");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("(invaliddom)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84338570) + "'", int1 == (-84338570));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test458");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-01-01", "-1-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test459");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray4, (int) (byte) 0);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test460");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("100-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test461");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test462");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-1-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1-03-31" + "'", str1, "-1-03-31");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test463");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test464");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray3, 0);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test465");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test466");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) '#');
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 51560);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 100);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test467");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test468");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 1);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test469");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("3-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test470");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("(invaliddom)", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test471");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test472");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (short) 0, (int) '4', (-182892220));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test473");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("100-10-01", "1106587674 y");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test474");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("2nd", "1-03-31", "0-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test475");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1872152753 + "'", int1 == 1872152753);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test476");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test477");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("35 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test478");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test479");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-1-12-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1304807391) + "'", int1 == (-1304807391));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test480");
        java.lang.String[] strArray1 = new java.lang.String[] { "(invaliddom)" };
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray1, (-1));
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invaliddom)" + "'", str2, "(invaliddom)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(invaliddom)" + "'", str5, "(invaliddom)");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test481");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test482");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "1 s", false, (int) (byte) 10, (java.lang.CharSequence) "1-03-31", (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test483");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 100, 8, (int) (short) 1, (int) (byte) 1, 8, (int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-58993138310000L) + "'", long8 == (-58993138310000L));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test484");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("3-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3-01-01" + "'", str1, "3-01-01");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test485");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, (int) '#');
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test486");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10-12-31");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test487");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("3-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test488");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-03-31" + "'", str1, "1-03-31");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test489");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("1106587674 y", "hi!", (int) (short) -1, 3);
        java.lang.String str15 = textUtils0.abbreviate("1106587674 y", "-1-12-31", (int) (short) -1, (-182892220));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test490");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1]");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test491");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test492");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("", "0 s", 3, 0);
        java.lang.String str10 = textUtils0.abbreviate("100 s", "-1-03-31", 51560, (int) (short) 10);
        java.lang.String str15 = textUtils0.abbreviate("100-10-01", "100-10-01", (int) (short) 1, (int) (short) 0);
        java.lang.String str20 = textUtils0.abbreviate("0 s", "35 s", (int) (short) 10, 2);
        boolean boolean27 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", false, 51560, (java.lang.CharSequence) "10-03-31", 2, (int) (byte) 100);
        java.lang.String str32 = textUtils0.abbreviate("35-12-31", "-1 s", 483069242, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test493");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("10 s", "1-01-01", "", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test494");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (-84338570));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-84338570 s" + "'", str1, "-84338570 s");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test495");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35-12-31", "10th", "10-12-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test496");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-84338570 s", "", "100 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test497");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("35 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 s" + "'", str1, "35 s");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test498");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("10-12-31", 404623664, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 404623664 + "'", int3 == 404623664);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test499");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        java.lang.String str5 = textUtils0.abbreviate("35 s", "(invalidDOM)", 3, (int) ' ');
        boolean boolean12 = textUtils0.regionMatch((java.lang.CharSequence) "(invalidDOM)", true, (-84338570), (java.lang.CharSequence) "LOCALHOST", 103232, (-84338570));
        java.lang.String str17 = textUtils0.abbreviate("-1-03-31", "35 s", 483069242, (int) (byte) 100);
        java.lang.String str22 = textUtils0.abbreviate("10-12-31", "hi!", 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35 s" + "'", str5, "35 s");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-03-31" + "'", str17, "-1-03-31");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-12-31" + "'", str22, "10-12-31");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop418_RegressionTest0.test500");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1872152753);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }
}

