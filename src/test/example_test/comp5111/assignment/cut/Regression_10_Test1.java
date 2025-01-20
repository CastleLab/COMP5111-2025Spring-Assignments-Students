package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_10_Test1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test501");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("LOCALHOST", "10-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test502");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("52-03-31", "1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test503");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("52-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52-03-31" + "'", str1, "52-03-31");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test504");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100 s", "-1 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test505");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test506");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test507");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("52-03-31", "1-03-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test508");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        java.lang.String str12 = textUtils0.abbreviate("-1 s", "55 m", (int) '4', 1520);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "32 s", false, 0, (java.lang.CharSequence) "12 h", (int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 s" + "'", str12, "-1 s");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test509");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("12 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test510");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("97 s", "", "1-10-0", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test511");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0", "1 s", "55 m");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test512");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 10, (int) (short) 1, 2, 1520);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test513");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0-12-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0-12-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test514");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-1566141971), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1566141971-12-31" + "'", str2, "-1566141971-12-31");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test515");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "1-10-01", true, 10, (java.lang.CharSequence) "100-01-01", (int) (byte) 10, (int) (byte) 0);
        boolean boolean28 = textUtils0.regionMatch((java.lang.CharSequence) "1-03-31", true, 3, (java.lang.CharSequence) "97 s", 52515, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test516");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1566141971-12-31", "1-03-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test517");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test518");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("11th", "", "10th");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test519");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1520);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test520");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("97 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97 s" + "'", str1, "97 s");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test521");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0", "11th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test522");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 1520);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25 m" + "'", str1, "25 m");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test523");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("55 m");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test524");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-10-0", "25 m");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test525");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("25 m", "0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test526");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-181834510) + "'", int1 == (-181834510));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test527");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(1, 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test528");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test529");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1566141971), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1566141971-01-01" + "'", str2, "-1566141971-01-01");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test530");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test531");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("-1566141971-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test532");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test533");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0 ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 " + "'", str2, "0 ");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test534");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, (int) (byte) 100, 3329, 44796);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test535");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1-12-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1445896099 + "'", int1 == 1445896099);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test536");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test537");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35 s", (int) '#', '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test538");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("52 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 s" + "'", str1, "52 s");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test539");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) '4', (-181834510));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test540");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("52-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test541");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("97 s", "35-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test542");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("LOCALHOST", 3, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test543");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) '#', (int) (byte) 100, (-695457261), 11, (-1), 2, 8);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test544");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(35, (-1566141971));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test545");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test546");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52 s", (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test547");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test548");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        java.lang.String str19 = textUtils0.abbreviate("0", "0 ", (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test549");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test550");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "LOCALHOST");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test551");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("52-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test552");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("25 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test553");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invaliddom)", 32, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test554");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1566141971-01-01", "-1566141971-12-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test555");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "0", "LOCALHOST", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test556");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("11th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test557");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test558");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("35-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-421541747) + "'", int1 == (-421541747));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test559");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10 s");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test560");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(3329, (int) '4', (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test561");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test562");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "0-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test563");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test564");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("-1566141971-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test565");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("(invalidDOM)", 0, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test566");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("97 s", "12 h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test567");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-10-0", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test568");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(16, (-1566141971), 3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test569");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-10-01" + "'", str2, "0-10-01");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test570");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0 ", "1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test571");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test572");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '#', 1445896099);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test573");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("0-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test574");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("52 s", "(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test575");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "-1566141971-12-31", "LOCALHOST", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test576");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-10-0", "1 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test577");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('a', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test578");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (short) 0, 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test579");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("0-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0-12-31" + "'", str1, "0-12-31");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test580");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("LOCALHOST");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'LOCALHOST' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test581");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("55 m", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55 m" + "'", str2, "55 m");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test582");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("11th");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test583");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((-421541747), 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-421541747-06-30" + "'", str2, "-421541747-06-30");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test584");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("11th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11th" + "'", str1, "11th");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test585");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-421541747-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test586");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("", "10 s", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test587");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("(invaliddom)", "1-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test588");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("12 h");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '12 h' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test589");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("-1566141971-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test590");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test591");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray6);
        byte[] byteArray8 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray6);
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
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test592");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("11th", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11th" + "'", str2, "11th");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test593");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("12 h", "97 s", "35 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test594");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("10th", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test595");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35 s", "52 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test596");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-1-01-01", "LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test597");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test598");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("LOCALHOST", "52-03-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test599");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(35, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35-03-31" + "'", str2, "35-03-31");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test600");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test601");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test602");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("97 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97 s" + "'", str1, "97 s");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test603");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("(invaliddom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test604");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-01-01", "35-10-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test605");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("35-03-31", "52-03-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test606");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test607");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("", "100-01-01", "35-10-01", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test608");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("-62085571250000 s", "0-10-01", "11-03-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test609");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("100-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100-01-01" + "'", str1, "100-01-01");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test610");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("1-12-31", "11-03-31", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test611");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-62085571250000 s", "1 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test612");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10-12-31", "1-03-31", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test613");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-695457261), 1520, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test614");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(44796, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44796-07-01" + "'", str2, "44796-07-01");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test615");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-62085571250000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test616");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("25 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test617");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test618");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("44796-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test619");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("100 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test620");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("52-03-31", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-03-31" + "'", str2, "52-03-31");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test621");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "11th", true, 1520, (java.lang.CharSequence) "1-12-31", (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test622");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("10th", "-1-01-01", (int) (byte) 0, 2);
        java.lang.String str29 = textUtils0.abbreviate("25 m", "11-03-31", 16, (int) (short) 10);
        java.lang.String str34 = textUtils0.abbreviate("", "100-01-01", 48609, (int) '4');
        java.lang.String str39 = textUtils0.abbreviate("", "52-03-31", (int) (short) -1, 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test623");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("35 s");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50686 + "'", int1 == 50686);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test624");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0-12-31", "10 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test625");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("52-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test626");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("12 h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 h" + "'", str1, "12 h");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test627");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("10th", "-1-01-01", (int) (byte) 0, 2);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "0-10-01", true, 1, (java.lang.CharSequence) "-62085571250000 s", (-695457261), 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test628");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0 ", "1-03-31", "35-10-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test629");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test630");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("44796-07-01", "1-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test631");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-03-31", "10-12-31");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test632");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "25 m", false, (int) (short) 10, (java.lang.CharSequence) "11th", 4, (int) (short) 100);
        java.lang.String str26 = textUtils0.abbreviate("52 s", "1-03-31", (-421541747), 8);
        java.lang.Class<?> wildcardClass27 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test633");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("12 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test634");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "10-12-31", "11-03-31", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test635");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("12 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test636");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
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
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test637");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("25 m", "32 s", "(invaliddom)", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test638");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("12 h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test639");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("25 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test640");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(3329, 52515);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test641");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("55 m", "0 ", "35-03-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test642");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "35 s", "1st", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test643");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 s" + "'", str1, "3 s");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test644");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(1520, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test645");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("35-03-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '35-03-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test646");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("35-03-31", "35-03-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test647");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1st", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test648");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "44796-07-01", false, 2, (java.lang.CharSequence) "(invalidDOM)", (int) ' ', (int) ' ');
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "3 s", true, 0, (java.lang.CharSequence) "12 h", 1520, 16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test649");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (byte) -1, 1, 35, (-1566141971), (-1), 8, 11);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test650");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("11th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test651");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("55 m", "10-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test652");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("10th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test653");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", (-1), '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test654");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("55 m");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test655");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("25 m", "1st", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test656");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 1445894174, 44796, (int) (byte) 1, (int) (short) -1, (int) (byte) 100, 0, 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-15407203101600000L) + "'", long8 == (-15407203101600000L));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test657");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test658");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test659");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12(' ', ' ');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test660");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("100 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test661");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("25 m", "3 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test662");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("52 s", 11, ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test663");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1634 + "'", int1 == 1634);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test664");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("35-10-01", "1-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test665");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("55 m", "10th", "55 m");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test666");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("97 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '97 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test667");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-01-01" + "'", str2, "-1-01-01");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test668");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "25 m", false, (int) (short) 10, (java.lang.CharSequence) "11th", 4, (int) (short) 100);
        java.lang.String str26 = textUtils0.abbreviate("52 s", "1-03-31", (-421541747), 8);
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "1-10-01", false, (-695457261), (java.lang.CharSequence) "44796-07-01", (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test669");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 0);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 " + "'", str9, "0 ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test670");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (byte) 0, 4, (int) (byte) 10, (-181834510));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test671");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("10th", "52-03-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test672");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("52 s", "-1 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test673");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1-03-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test674");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("LOCALHOST");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1900804353 + "'", int1 == 1900804353);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test675");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("1-03-31", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-03-31" + "'", str2, "1-03-31");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test676");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-1-01-01", "1st", "1st");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test677");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 0, (int) (byte) 10, (int) (byte) -1, 0, 1520, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62143627199000L) + "'", long8 == (-62143627199000L));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test678");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test679");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "32 s", false, (-181834510), (java.lang.CharSequence) "44796-07-01", (-421541747), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test680");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test681");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int7 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 100);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 1634);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 " + "'", str5, "0 ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test682");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-1 s", (-1566141971));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 s" + "'", str2, "-1 s");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test683");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("100-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test684");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("-1 s", "LOCALHOST", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test685");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(8, 1445896099, 4, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test686");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test687");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-421541747-06-30");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-421541747-06-30" + "'", str1, "-421541747-06-30");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test688");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("3 s", "0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test689");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test690");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("35-10-01", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test691");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-03-31" + "'", str2, "0-03-31");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test692");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-12-31", "-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test693");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test694");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1634);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test695");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-1566141971));
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) ' ');
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 0);
        java.lang.String str11 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int13 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 " + "'", str11, "0 ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test696");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("0-12-31", "-62085571250000 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test697");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("10-12-31", "0 s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test698");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("3 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test699");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("", 1634, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1634 + "'", int3 == 1634);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test700");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-1566141971));
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 11);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 10);
        int int12 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-181834510));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test701");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 32);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test702");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((-62169986903000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-62169986903000 s" + "'", str1, "-62169986903000 s");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test703");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 50686);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 h" + "'", str1, "14 h");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test704");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test705");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("0", "LOCALHOST", "32 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test706");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-421541747-06-30", "1-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test707");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("-421541747-06-30", "10-12-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test708");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-1566141971));
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 11);
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 10);
        int int12 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 16);
        int int14 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test709");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 1445894174, 16, (-1), 4, (int) '#', 1, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test710");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test711");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("10th");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test712");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("35-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35-10-01" + "'", str1, "35-10-01");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test713");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int11 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 1634);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 " + "'", str8, "0 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 " + "'", str9, "0 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test714");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (short) 1, 4, (int) (byte) 0, 52515, (-1), (-421541747), 52515);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62360395007000L) + "'", long8 == (-62360395007000L));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test715");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("0-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test716");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("10-12-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1955274357 + "'", int1 == 1955274357);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test717");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("0-10-01", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test718");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 0);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int11 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 " + "'", str9, "0 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test719");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test720");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-62169986903000 s", 1634, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1634 + "'", int3 == 1634);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test721");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("0 s", "1st", (int) (byte) 100, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("11-03-31", "10 s", (int) (byte) 1, (int) (byte) 100);
        boolean boolean36 = textUtils0.regionMatch((java.lang.CharSequence) "0 s", false, (int) (byte) 10, (java.lang.CharSequence) "0-10-01", (int) (byte) 100, 52515);
        boolean boolean43 = textUtils0.regionMatch((java.lang.CharSequence) "0-10-01", false, 1, (java.lang.CharSequence) "11-03-31", (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0 s" + "'", str24, "0 s");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "11-03-31" + "'", str29, "11-03-31");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test722");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("LOCALHOST", "LOCALHOST", "(invalidDOM)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test723");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("1-12-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-12-31" + "'", str1, "1-12-31");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test724");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("(invalidDOM)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test725");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("-421541747-06-30", "-1566141971-01-01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test726");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("52 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test727");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test728");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("LOCALHOST", "1-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test729");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "-1-01-01", "1st");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test730");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(1955274357, (int) '4', 0, 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test731");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("0 s", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 s" + "'", str2, "0 s");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test732");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(1955274357, 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test733");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("0-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test734");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test735");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (int) (byte) 10, 48609, 0, (int) (short) -1, 50686, 16, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test736");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd((int) (byte) -1, 3329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test737");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("55 m", "-1-01-01", 11, (int) (byte) -1);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "97 s", true, 32, (java.lang.CharSequence) "100-01-01", 3329, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test738");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 s" + "'", str1, "100 s");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test739");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.hourplus12('4', 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test740");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("3 s", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test741");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("35-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test742");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("(invalidDOM)", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test743");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-03-31" + "'", str1, "1-03-31");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test744");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "-62085571250000 s", false, (-1566141971), (java.lang.CharSequence) "32 s", (int) (short) 10, 8);
        java.lang.Class<?> wildcardClass22 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test745");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0-12-31", "(invaliddom)", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test746");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("97 s", "11th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test747");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("11th", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test748");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 11, (int) '#', 0, 1634, 48609, 10, 1955274357);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test749");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("-421541747-06-30");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-421541747-06-30" + "'", str1, "-421541747-06-30");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test750");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("0-10-01", (-181834510), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -181834510");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test751");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-1566141971-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test752");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("-1566141971-01-01", (int) (short) 1, '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test753");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("-62085571250000 s", "-1566141971-01-01", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test754");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("11-03-31", "35-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test755");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(1900804353, 1634, (int) (short) 1, 52515);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test756");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-10-0", "(invalidDOM)", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test757");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("1-10-01", "12 h", "25 m");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test758");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-62085571250000 s", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test759");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 100, 1634, 8, 10, (int) (byte) 1, (-1), 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-54695915941000L) + "'", long8 == (-54695915941000L));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test760");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "", "1 s", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test761");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test762");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("55 m", "-1-01-01", 11, (int) (byte) -1);
        java.lang.String str29 = textUtils0.abbreviate("32 s", "(invaliddom)", (int) (byte) 100, (-1));
        java.lang.String str34 = textUtils0.abbreviate("0 ", "-1 s", 1445894174, 1634);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0 " + "'", str34, "0 ");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test763");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(1445896099);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test764");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 0, (int) (byte) 0, (-421541747), 35, (int) (byte) -1, (-695457261), 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test765");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("11th", "0-10-01", "11th");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test766");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-03-31", "1-10-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test767");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.domStr(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4th" + "'", str1, "4th");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test768");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((-181834510), 1520, 50686, 50686);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test769");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) 100, 0, 1955274357, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test770");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) '4');
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        int int12 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 32);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test771");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNumber("-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test772");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranet("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test773");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-532896165) + "'", int1 == (-532896165));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test774");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test775");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-532896165), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-532896165-01-01" + "'", str2, "-532896165-01-01");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test776");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-10-01" + "'", str1, "1-10-01");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test777");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("0", "LOCALHOST", "1-12-31", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test778");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("-421541747-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test779");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((-532896165), 1445896099);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test780");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("1 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 s" + "'", str1, "1 s");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test781");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-1 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test782");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("35-10-01", "", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test783");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test784");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "10 s", "1-10-01", false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test785");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("14 h");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '14 h' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test786");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("10th", "-1-01-01", (int) (byte) 0, 2);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (int) (byte) 10, (java.lang.CharSequence) "0-10-01", (int) (byte) -1, 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test787");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, (-421541747), 1955274357, (-421541747), (int) (byte) 0, (int) (byte) 10, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test788");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "25 m", false, (int) (short) 10, (java.lang.CharSequence) "11th", 4, (int) (short) 100);
        java.lang.String str26 = textUtils0.abbreviate("52-03-31", "", 32, 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52-" + "'", str26, "52-");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test789");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int((int) (short) -1, (int) (short) -1, (int) (short) -1, 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test790");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("", "10th", "-1-01-01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test791");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("55 m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55 m" + "'", str1, "55 m");
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test792");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("(invalidDOM)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalidDOM)" + "'", str1, "(invalidDOM)");
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test793");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("14 h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48733 + "'", int1 == 48733);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test794");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, 1445896099);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test795");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-421541747-06-30");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test796");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("44796-07-01", "35-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test797");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("55 m", "52-");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test798");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("4th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1728 + "'", int1 == 1728);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test799");
        java.lang.String[] strArray2 = new java.lang.String[] { "55 m", "-1-01-01" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) 1);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test800");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("52-", "-1566141971-01-01", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test801");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100-01-01", "32 s");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test802");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("1-03-31", "1-10-0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test803");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35-10-01", (int) '4', '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test804");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 1634);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "27 m" + "'", str1, "27 m");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test805");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("(invalidDOM)", "1-10-01", "0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test806");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("-1-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test807");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-01-01" + "'", str2, "52-01-01");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test808");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 4, 44796, 1634, (int) (byte) 0, (int) (byte) 1, 16, 35);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 56466288076000L + "'", long8 == 56466288076000L);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test809");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(100, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-06-30" + "'", str2, "100-06-30");
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test810");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "-62085571250000 s", false, (-1566141971), (java.lang.CharSequence) "32 s", (int) (short) 10, 8);
        java.lang.String str26 = textUtils0.abbreviate("1st", "14 h", 1520, 1);
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "52-01-01", true, 50686, (java.lang.CharSequence) "(invalidDOM)", 50686, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test811");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) (byte) 10, 35, 3, 3, 50686, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61758691940000L) + "'", long8 == (-61758691940000L));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test812");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(8, (int) (byte) 1, (int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test813");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test814");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("52-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test815");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("11th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test816");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("0 s", "1st", (int) (byte) 100, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("11-03-31", "10 s", (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass30 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0 s" + "'", str24, "0 s");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "11-03-31" + "'", str29, "11-03-31");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test817");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1566141971-12-31", "11th");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test818");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("1-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test819");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 44796, 11, 1445896099, 32, 1955274357, 0, 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test820");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("35-10-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test821");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("(invaliddom)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '(invaliddom)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test822");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("10-12-31", "0-10-01", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test823");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeUtils.secToString((long) 48733);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 h" + "'", str1, "14 h");
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test824");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("52-01-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test825");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(16, 1955274357, 1445894174, 52515);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test826");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("11-03-31", "-1566141971-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test827");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("", "35 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test828");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("52-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52-01-01" + "'", str1, "52-01-01");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test829");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isSubnet("1-10-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test830");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("14 h");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test831");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "52-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test832");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        boolean boolean26 = textUtils0.regionMatch((java.lang.CharSequence) "44796-07-01", false, 2, (java.lang.CharSequence) "(invalidDOM)", (int) ' ', (int) ' ');
        boolean boolean33 = textUtils0.regionMatch((java.lang.CharSequence) "-1-01-01", true, (-1566141971), (java.lang.CharSequence) "1-10-0", (int) (short) 100, 1445896099);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test833");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("0", "35 s");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test834");
        boolean boolean4 = comp5111.assignment.cut.Subject.WebUtils.isPrivatev4nonet_int(0, 100, 2, 44796);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test835");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("0-10-01", "10-12-31", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test836");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1-10-01", "-1566141971-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test837");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (-1566141971), (-1), (int) (byte) 0, (-532896165), 48609, (int) (short) 100, 16);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-68399557539248000L) + "'", long8 == (-68399557539248000L));
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test838");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("1st", "35 s", "52-", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test839");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        java.lang.String str5 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str6 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 1);
        java.lang.String str9 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int11 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 " + "'", str5, "0 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 " + "'", str6, "0 ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 " + "'", str9, "0 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test840");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("100-01-01", "100-06-30");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test841");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "32 s", true, 1955274357, (java.lang.CharSequence) "(invaliddom)", 8, 52515);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test842");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason((int) (byte) 1, 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-10-01" + "'", str2, "1-10-01");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test843");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("44796-07-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 875287811 + "'", int1 == 875287811);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test844");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test845");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("hi!", "25 m", "1-03-31", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test846");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test847");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPublicv4("10 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test848");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.strLeftTrim("14 h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 h" + "'", str1, "14 h");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test849");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("52-01-01", "11-03-31", "0-03-31");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test850");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("10th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test851");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "0-10-01", "100-06-30");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test852");
        java.lang.String str4 = comp5111.assignment.cut.Subject.TextUtils.subString("35 s", "1st", "-532896165-01-01", true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test853");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-1566141971));
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) ' ');
        int int10 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 0);
        java.lang.String str11 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int13 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, 35);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 " + "'", str11, "0 ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test854");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("35-03-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test855");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(0, 50686);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test856");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(35, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test857");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isIntranetv4("LOCALHOST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test858");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("1-10-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-10-01" + "'", str1, "1-10-01");
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test859");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("10th");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test860");
        boolean boolean2 = comp5111.assignment.cut.Subject.TextUtils.equalsIgnoreCaseHash("0-10-01", "0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test861");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 52, 11, 4, 1900804353, (int) '4', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test862");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 32, 32, (int) (short) 100, 1445894174, (-532896165), (-421541747), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-63678878527000L) + "'", long8 == (-63678878527000L));
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test863");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 0, 16, 1445894174, 11, (int) ' ', 1900804353, (-181834510));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test864");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("11-03-31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '11-03-31' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test865");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("10-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test866");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("1-10-0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test867");
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
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test868");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray3);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray6);
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
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test869");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, (int) (short) 100, (java.lang.CharSequence) "-62085571250000 s", 10, (int) (short) 0);
        boolean boolean21 = textUtils0.regionMatch((java.lang.CharSequence) "35 s", true, 32, (java.lang.CharSequence) "11th", 1728, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test870");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("-1566141971-01-01", "(invalidDOM)");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test871");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 100);
        java.lang.String str7 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        int int9 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) '4');
        java.lang.String str10 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        java.lang.String str11 = comp5111.assignment.cut.Subject.TextUtils.longestCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 " + "'", str7, "0 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 " + "'", str10, "0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 " + "'", str11, "0 ");
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test872");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("44796-07-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test873");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isPort("11th");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test874");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        java.lang.String str12 = textUtils0.abbreviate("-1 s", "55 m", (int) '4', 1520);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, 4, (java.lang.CharSequence) "97 s", 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 s" + "'", str12, "-1 s");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test875");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("0-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test876");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("97 s", "", true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test877");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("32 s");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '32 s' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test878");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("25 m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25 m" + "'", str1, "25 m");
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test879");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("52-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52-" + "'", str1, "52-");
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test880");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, 100, (java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 100);
        java.lang.String str12 = textUtils0.abbreviate("-1 s", "55 m", (int) '4', 1520);
        java.lang.String str17 = textUtils0.abbreviate("(invaliddom)", "1-03-31", 52, (int) (short) 0);
        java.lang.String str22 = textUtils0.abbreviate("-1566141971-01-01", "25 m", 1445894174, 1520);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 s" + "'", str12, "-1 s");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1566141971-01-01" + "'", str22, "-1566141971-01-01");
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test881");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("-532896165-01-01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-532896165-01-01" + "'", str1, "-532896165-01-01");
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test882");
        java.lang.String[] strArray2 = new java.lang.String[] { "0 s", "0 s" };
        int int4 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (byte) -1);
        int int6 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (-1566141971));
        int int8 = comp5111.assignment.cut.Subject.WebUtils.localHostInList(strArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test883");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(10, (-421541747));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test884");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("0-03-31", (-1566141971));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-03-31" + "'", str2, "0-03-31");
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test885");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("35-10-01", 8, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test886");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(false, 3329, (-532896165), 0, 0, 48733, (-421541747), 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test887");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isv4("-62169986903000 s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test888");
        char[] charArray2 = comp5111.assignment.cut.Subject.DateTimeUtils.splitMillis("1-03-31", "-1-01-01");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test889");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("-532896165-01-01", 1634);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-532896165-01-01" + "'", str2, "-532896165-01-01");
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test890");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeasonEnd(48609, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "48609-03-31" + "'", str2, "48609-03-31");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test891");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 566100416 + "'", int1 == 566100416);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test892");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = comp5111.assignment.cut.Subject.DateTimeUtils.parseDate("0-10-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0-10-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test893");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "-1566141971-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test894");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray3 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray4 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray2);
        byte[] byteArray5 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray4);
        byte[] byteArray6 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray7 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray5);
        byte[] byteArray8 = comp5111.assignment.cut.Subject.WebUtils.removeWhitespace(byteArray7);
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
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test895");
        int int1 = comp5111.assignment.cut.Subject.TextUtils.lowerHashCode("55 m");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52608 + "'", int1 == 52608);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test896");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("32 s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 s" + "'", str1, "32 s");
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test897");
        java.lang.String str2 = comp5111.assignment.cut.Subject.WebUtils.getString("100-06-30", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-06-30" + "'", str2, "100-06-30");
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test898");
        boolean boolean4 = comp5111.assignment.cut.Subject.TextUtils.regexMatch("48609-03-31", "14 h", false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test899");
        java.lang.String str2 = comp5111.assignment.cut.Subject.TextUtils.subString("1 s", "-1566141971-12-31");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test900");
        long long1 = comp5111.assignment.cut.Subject.WebUtils.ipToLong("100-01-01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test901");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeUtils.thisSeason(1955274357, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1955274357-01-01" + "'", str2, "1955274357-01-01");
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test902");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("1-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-03-31" + "'", str1, "1-03-31");
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test903");
        boolean boolean1 = comp5111.assignment.cut.Subject.TextUtils.isNotEmpty((java.lang.CharSequence) "52-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test904");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, 32, 0, (int) (short) 100, (-1566141971), 1445896099, 1445894174, 1634);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-57670136158000L) + "'", long8 == (-57670136158000L));
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test905");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        java.lang.String str12 = textUtils0.abbreviate("", "-1-01-01", 3329, (int) (byte) 0);
        boolean boolean19 = textUtils0.regionMatch((java.lang.CharSequence) "1-12-31", false, 1, (java.lang.CharSequence) "0 s", (int) (byte) 0, (int) (short) 10);
        java.lang.String str24 = textUtils0.abbreviate("0 s", "1st", (int) (byte) 100, (int) (byte) 10);
        java.lang.String str29 = textUtils0.abbreviate("1-03-31", "1-03-31", (int) (byte) 100, 100);
        java.lang.String str34 = textUtils0.abbreviate("", "10 s", (int) '#', 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0 s" + "'", str24, "0 s");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1-03-31" + "'", str29, "1-03-31");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test906");
        java.lang.String str3 = comp5111.assignment.cut.Subject.TextUtils.subString("100 s", "-62085571250000 s", "32 s");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test907");
        boolean boolean1 = comp5111.assignment.cut.Subject.WebUtils.isImgFileName("10-12-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test908");
        long long8 = comp5111.assignment.cut.Subject.DateTimeUtils.getMillis(true, (int) 'a', 32, 1445894174, 52, 1445896099, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 124867086821619000L + "'", long8 == 124867086821619000L);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test909");
        int int3 = comp5111.assignment.cut.Subject.TextUtils.indexOf_re("11th", 566100416, '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 566100416 + "'", int3 == 566100416);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test910");
        java.lang.String str1 = comp5111.assignment.cut.Subject.TextUtils.removeNameQuotes("27 m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "27 m" + "'", str1, "27 m");
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test911");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "-1 s", 0, (int) (short) 10);
        java.lang.String str19 = textUtils0.abbreviate("0", "0 ", (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = textUtils0.abbreviate("10 s", "52 s", (int) (short) 0, 3329);
        boolean boolean31 = textUtils0.regionMatch((java.lang.CharSequence) "1st", false, (int) (short) 0, (java.lang.CharSequence) "0 ", (-695457261), (int) '4');
        java.lang.String str36 = textUtils0.abbreviate("1-12-31", "10-12-31", (-695457261), (int) (short) 0);
        boolean boolean43 = textUtils0.regionMatch((java.lang.CharSequence) "48609-03-31", false, (int) '4', (java.lang.CharSequence) "1955274357-01-01", (int) (byte) 100, 48733);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10 s" + "'", str24, "10 s");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test912");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("25 m", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test913");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("-1566141971-12-31", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test914");
        comp5111.assignment.cut.Subject.TextUtils textUtils0 = new comp5111.assignment.cut.Subject.TextUtils();
        boolean boolean7 = textUtils0.regionMatch((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "-1 s", (int) (byte) 0, (int) (short) 100);
        boolean boolean14 = textUtils0.regionMatch((java.lang.CharSequence) "(invaliddom)", true, (-1566141971), (java.lang.CharSequence) "0-10-01", (-532896165), (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = textUtils0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test915");
        java.lang.String str1 = comp5111.assignment.cut.Subject.WebUtils.clearDomainPort("11-03-31");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11-03-31" + "'", str1, "11-03-31");
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test916");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("35 s", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test917");
        boolean boolean2 = comp5111.assignment.cut.Subject.WebUtils.isDomainPrivate("1-10-01", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

