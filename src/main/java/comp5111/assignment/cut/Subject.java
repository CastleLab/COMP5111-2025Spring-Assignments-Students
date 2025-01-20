package comp5111.assignment.cut;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subject {

	public static class WebUtils {
		/**
		 * Checks if the given file name corresponds to an image file based on its
		 * extension.
		 *
		 * @param name the file name to check
		 * @return true if the file name ends with a valid image extension (".png",
		 *         ".jpg", ".jpeg", ".gif", ".webp");
		 *         false if the file name does not match any of the supported image
		 *         extensions or is null
		 */
		public static boolean isImgFileName(String name) {
			if (name.endsWith(".png"))
				return true;
			else if (name.endsWith(".jpg"))
				return true;
			else if (name.endsWith(".jpeg"))
				return true;
			else if (name.endsWith(".gif"))
				return true;
			else if (name.endsWith(".webp"))
				return true;
			return false;
		}

		/**
		 * Extracts and returns a sorted list of getter methods (starting with "get" or
		 * "is")
		 * from the objects in the provided list.
		 *
		 * @param list the list of objects to extract getter methods from
		 * @param <T>  the type of objects in the list
		 * @return a sorted list of getter methods, or an empty list if no valid methods
		 *         are found
		 */
		static public <T> List<Method> getMethods(List<T> list) {
			List<Method> methods = new ArrayList<Method>();
			Object obj = list.get(0);
			for (Method method : obj.getClass().getMethods()) {
				if (method.getDeclaringClass().equals(Object.class)) {
					continue;
				}
				String methodName = method.getName();
				int methodNameLength = methodName.length();
				if (methodNameLength > "get".length() && methodName.startsWith("get")) {
					methods.add(method);
				}
				if (methodNameLength > "is".length() && methodName.startsWith("is")) {
					methods.add(method);
				}
			}

			Collections.sort(methods, new Comparator<Method>() {
				@Override
				public int compare(Method m1, Method m2) {
					return m1.getName().compareTo(m2.getName());
				}
			});

			return methods;
		}

		/**
		 * Retrieves getter methods (starting with "get" or "is") for the specified
		 * fields from the objects in the list.
		 *
		 * @param list   the list of objects to extract getter methods from
		 * @param fields the field names for which to find getter methods
		 * @param <T>    the type of objects in the list
		 * @return a list of matching getter methods, or null if any field is invalid
		 */
		static public <T> List<Method> getMethods(List<T> list, String[] fields) {
			List<Method> methods = new ArrayList<Method>(fields.length);
			Object object = list.get(0);
			for (String field : fields) {
				String upperName = field;
				char w = field.charAt(0);
				if (w >= 'a' && w <= 'z') {
					w += 'A' - 'a';
					upperName = w + field.substring(1);
				}
				Method method = null;
				try {
					method = object.getClass().getMethod("get" + upperName);
				} catch (Exception e1) {
					try {
						method = object.getClass().getMethod("is" + upperName);
					} catch (Exception e2) {
						return null;
					}
				}
				methods.add(method);
			}

			return methods;
		}

		/**
		 * Checks if the given address is a localhost address.
		 *
		 * @param addr the address to check
		 * @return true if the address is localhost, false otherwise
		 */
		private static boolean isLocalhost(String addr) {
			return addr.equals("127.0.0.1")
					|| addr.equals("0:0:0:0:0:0:0:1")
					|| addr.equals("::1")
					|| addr.equals("0000:0000:0000:0000:0000:0000:0000:0001");
		}

		/**
		 * Returns the input string if it's not null; otherwise, returns a string of the
		 * specified length filled with spaces.
		 *
		 * @param value  the input string
		 * @param length the length of the string to return if the input is null
		 * @return the original string, or a string of spaces if the input is null
		 */
		public static String getString(String value, int length) {
			if (value == null) {
				char[] chars = new char[length];
				for (int i = 0; i <= length - 1; ++i) {
					chars[i] = ' ';
				}
				value = new String(chars, 0, chars.length);
			}
			return value;
		}

		/**
		 * Finds the index of the first local host in the provided host names array.
		 *
		 * @param hostNames the array of host names to check
		 * @param length    the maximum index to consider
		 * @return the index of the first local host, or -1 if not found or invalid
		 */
		public static int localHostInList(String[] hostNames, int length) {
			int idx = -1;
			for (int i = 0; i < hostNames.length; i++) {
				String hostname = hostNames[i];
				if (hostname != null && isLocalhost(hostname) && idx == -1) {
					idx = i;
				}
			}
			if (idx > length)
				idx = -1;
			return idx;
		}

		public static boolean isIntranet(String ipAddress) {
			if (isLocalhost(ipAddress))
				return true;

			// v6 local
			String ipv6LinkLocalPrefix = "fe80:";
			if (ipAddress.toLowerCase().startsWith(ipv6LinkLocalPrefix)) {
				return true;
			}
			// other v6
			else if (ipAddress.indexOf(':') >= 0) {
				return false;
			}

			// v4 or others
			return isIntranetv4(ipAddress);
		}

		/**
		 * Initializes a lookup table for Base64 encoding, mapping characters to their
		 * corresponding values.
		 */
		private static byte[] base64Alphabet = new byte[255];
		static {
			for (int i = 0; i < 255; i++) {
				base64Alphabet[i] = (byte) -1;
			}
			for (int i = 'Z'; i >= 'A'; i--) {
				base64Alphabet[i] = (byte) (i - 'A');
			}
			for (int i = 'z'; i >= 'a'; i--) {
				base64Alphabet[i] = (byte) (i - 'a' + 26);
			}
			for (int i = '9'; i >= '0'; i--) {
				base64Alphabet[i] = (byte) (i - '0' + 52);
			}

			base64Alphabet['+'] = 62;
			base64Alphabet['/'] = 63;
		}

		/**
		 * Remove whitespace from a base-64 string.
		 *
		 * @param data The base-64 encoded string to remove whitespaces.
		 * @return The less whitespace result.
		 */
		static byte[] removeWhitespace(byte[] data) {
			byte data_new[] = new byte[data.length];
			int bytesCnt = 0;

			for (int i = 0; i < data.length; i++) {
				if (data[i] != (byte) ' ' && data[i] != (byte) '\n' && data[i] != (byte) '\r' && data[i] != (byte) '\t') {
					data_new[bytesCnt++] = data[i];
				}
			}

			byte data_res[] = new byte[bytesCnt];

			System.arraycopy(data_new, 0, data_res, 0, bytesCnt);

			return data_res;
		}

		/**
		 * Checks if the given domain is valid and potentially private, based on its
		 * format.
		 *
		 * @param domain  the domain name to check
		 * @param mayport flag indicating whether port numbers may be included
		 * @return true if the domain is valid and private, false otherwise
		 */
		public static boolean isDomainPrivate(String domain, boolean mayport) {
			if (domain == null) {
				return false;
			}

			String re = "^((?!-)[A-Za-z0-9-_]{1,32}(?<!-)\\.)+[A-Za-z]{2,11}";
			;
			if (!mayport)
				re += "$";

			boolean isOk = TextUtils.regexMatch(domain, re, false, false);
			if (isOk) {
				String tmp = domain.replaceAll("-", ".");
				for (String item : tmp.split("\\.")) {
					if (item.length() >= 32) {
						return false;
					}
				}
				return true;
			}
			return false;
		}

		/**
		 * Obtain clean domain string by removing the potential port.
		 *
		 * @param domain
		 * @return
		 */
		public static String clearDomainPort(String domain) {
			if (domain == null) {
				return null;
			}
			domain = domain.toLowerCase().trim();
			if (domain.startsWith("http://") || domain.startsWith("https://")) {
				try {
					domain = new URL(domain).getHost();
				} catch (MalformedURLException e) {
					return null;
				}
			} else { if (domain.contains(":")) {
					domain = domain.substring(0, domain.indexOf(":"));
				}
			}

			if (domain.endsWith(".")) {
				domain = domain.substring(0, domain.length() - 1);
			}

			if (domain == "")
				domain = "LOCALHOST";
			return domain;
		}

		/**
		 * Checks if the given string is a valid IPv4 address.
		 *
		 * @param ip the IP address string to check
		 * @return true if the IP is a valid IPv4 address, false otherwise
		 */
		private static boolean isv4addr(String ip) {

			if (ip == null) {
				return false;
			}
			if (ip.isEmpty()) {
				return false;
			}

			String[] parts = ip.split("\\.");
			if (parts.length != 4) {
				return false;
			}

			if (isLocalhost(ip))
				return true;

			for (String s : parts) {
				try {
					int i = Integer.parseInt(s);
					if ((i < 0) || (i > 255)) {
						return false;
					}
				} catch (NumberFormatException e) {
					return false;
				}
			}

			return !ip.endsWith(".");
		}

		/**
		 * Checks if the given IP address is an intranet IPv4 address.
		 *
		 * @param ipAddress the IP address to check
		 * @return true if the IP address is an intranet address, false otherwise
		 */
		public static boolean isIntranetv4(String ipAddress) {
			try {
				if (isLocalhost(ipAddress))
					return true;

				if (!isv4addr(ipAddress)) {
					return false;
				}

				String[] ipAddressArray = ipAddress.split("\\.");
				int[] ipParts = new int[ipAddressArray.length];
				for (int i = 0; i < ipAddressArray.length; i++) {
					ipParts[i] = Integer.parseInt(ipAddressArray[i].trim());
				}

				if (ipParts[0] == 10 || (ipParts[0] == 172 && ipParts[1] >= 16 && ipParts[1] < 32) || (ipParts[0] == 192 && ipParts[1] == 168) || (ipParts[0] == 169 && ipParts[1] == 254)) {
					return true;
				}
			} catch (Exception ex) {
				return false;
			}

			return false;
		}

		/**
		 * Checks if the given IPv4 address components represent a private address
		 * (127.0.0.0 or 169.254.x.x).
		 *
		 * @param a the first byte of the IPv4 address
		 * @param b the second byte of the IPv4 address
		 * @param c the third byte of the IPv4 address
		 * @param d the fourth byte of the IPv4 address
		 * @return true if the address is private (127.0.0.0 or 169.254.x.x), false
		 *         otherwise
		 */
		public static boolean isPrivatev4nonet_int(int a, int b, int c, int d) {
			if ((a == 127 && b == 0 && c == 0) || (a == 169 && b == 254)) {
				return true;
			}

			return false;
		}

		/**
		 * Checks if the given string is a valid port number (0-65535).
		 *
		 * @param port the string to check
		 * @return true if the string is a valid port number, false otherwise
		 */
		public static boolean isPort(String port) {
			try {
				int portInt = Integer.parseInt(port);
				if (portInt >= 0 && portInt <= 65535) {
					return true;
				}
			} catch (NumberFormatException e) {
				return false;
			}
			return false;
		}

		/**
		 * Parses the input string and splits it into two parts based on the first colon
		 * (":").
		 * Returns an array with two elements: the part before the colon and the part
		 * after.
		 *
		 * @param input the input string to parse
		 * @return a two-element array with the split parts, or an array of nulls if no
		 *         valid split is found
		 */
		private static String[] parseAndPort(String input) {
			if (input == null) {
				return null;
			}
			if (input.contains(":")) {
				String[] parts = input.split(":");
				if (parts.length == 2) {
					return parts;
				} else {
					return new String[] { null, null };
				}
			} else {
				return new String[] { null, null };
			}
		}

		/**
		 * Checks if the given IP address is a valid IPv4 address, optionally including
		 * a port.
		 *
		 * @param ip the IP address (and optionally port) to validate
		 * @return true if the IP is valid IPv4, and the port (if present) is valid;
		 *         false otherwise
		 */
		public static boolean isv4(String ip) {
			String[] parts = parseAndPort(ip);
			if (!isv4addr(parts[0])) {
				return false;
			}

			if (TextUtils.isNotEmpty(parts[1])) {
				return isPort(parts[1]);
			} else {
				return true;
			}
		}

		/**
		 * Checks if the given IP is a public IPv4 address, optionally with a valid
		 * port.
		 *
		 * @param ip the IP address (with optional port)
		 * @return true if the IP is a public IPv4 address, false otherwise
		 */
		public static boolean isPublicv4(String ip) {
			String[] parts = parseAndPort(ip);
			if (isv4addr(parts[0]) && !isIntranetv4(parts[0])) {
				if (TextUtils.isNotEmpty(parts[1])) {
					return isPort(parts[1]);
				} else {
					return true;
				}
			} else {
				return false;
			}
		}

		/**
		 * Checks if the given string is a valid subnet in either CIDR or range format.
		 *
		 * @param subnet the subnet string to validate
		 * @return true if the subnet is valid, false otherwise
		 */
		public static boolean isSubnet(String subnet) {
			if (subnet == null)
				return false;
			subnet = subnet.replaceAll(" ", "");

			if (subnet.contains("/")) {
				String[] parts = subnet.split("/");
				if (parts.length == 2) {
					String ippart = parts[0];
					if (!isv4addr(ippart)) {
						return false;
					}
					try {
						int num = Integer.parseInt(parts[1]);
						if (num > 0 && num < 32) {
							return true;
						}
					} catch (NumberFormatException e) {
						return false;
					}
				}
			} else if (subnet.contains("-")) {
				String[] parts = subnet.split("-");
				if (parts.length == 2) {
					String start = parts[0];
					String end = parts[1];
					if (isv4addr(start) && isv4addr(end)) {
						long startval = ipToLong(start);
						long endval = ipToLong(end);
						if (startval <= endval) {
							return true;
						}
					}
				}
			}
			return false;
		}

		/**
		 * Converts an IP address string to its corresponding long value.
		 *
		 * @param ipAddress the IP address to convert (in "xxx.xxx.xxx.xxx" format)
		 * @return the long representation of the IP address, or -1 if the input is
		 *         invalid
		 */
		public static long ipToLong(String ipAddress) {
			String[] ipParts = ipAddress.split("\\.");
			long ipLong = 0;
			for (int i = 0; i < 4; i++) {
				try {
					ipLong += Long.parseLong(ipParts[i]) << (24 - (8 * i));
				} catch (Exception e) {
					return -1;
				}
			}
			return ipLong;
		}
	}

	public static class TextUtils {
		protected static boolean isNotEmpty(CharSequence cs) {
			return !(cs == null || cs.length() == 0);
		}

		private static int strEndingIdx(String str) {
			if (str == null)
				return 0;
			return str.length() - 1;
		}

		/**
		 * subString implementation for the situation where a string is given to
		 * indicate the start/to location.
		 * Example: subString("abcdc","a","c",true)="bcd"
		 *
		 * @param src    the source string from which to extract the substring
		 * @param startS null while start from index=0
		 * @param toS    null while to index=src.length
		 * @param lstFlg false to stop once find the first
		 * @return the extracted substring, or null if any of the input strings is null,
		 *         or if the start/end points are invalid
		 */
		public static String subString(String src, String startS, String toS, boolean lstFlg) {
			int indexFrom = startS == null ? 0 : src.indexOf(startS);
			int indexTo;
			if (toS == null)
				indexTo = src.length();
			else
				indexTo = lstFlg ? src.lastIndexOf(toS) : src.indexOf(toS);
			
			if (indexFrom < 0 || indexTo < 0 || indexFrom > indexTo)
				return null;

			if (null != startS) {
				indexFrom += startS.length() >= 1 ? startS.length() : 0;
			}

			return src.substring(indexFrom, indexTo);
		}

		public static boolean equalsIgnoreCaseHash(String a, String b) {
			if (a == null) {
				return b == null;
			}
			return lowerHashCode(a) == lowerHashCode(b);
		}

		/**
		 * subString implementation for the situation where a string is given to
		 * indicate the start/to location.
		 * 
		 * @param src   the source string from which to extract the substring
		 * @param start null while start from index=0
		 * @param to    null while to index=src.length
		 * @return the extracted substring considering the last appearance, or null if
		 *         any of the input strings is null, or if the start/end points are
		 *         invalid
		 */
		public static String subString(String src, String start, String to) {
			return subString(src, start, to, false);
		}

		/**
		 * subString implementation for the situation where a string is given to
		 * indicate the start/to location.
		 * 
		 * @param src   the source string from which to extract the substring
		 * @param start null while start from index=0
		 * @return the extracted suffix substring considering the last appearance, or
		 *         null if any of the input strings is null, or if the start/end points
		 *         are invalid
		 */
		public static String subString(String src, String start) {
			return subString(src, start, null);
		}

		public static boolean isNumber(String str) {
			if (str == null || str.length() == 0) {
				return false;
			}
			int sz = TextUtils.strEndingIdx(str);
			boolean hasExp = false;
			boolean hasDecPoint = false;
			boolean allowSigns = false;
			boolean foundDigit = false;
			// handle possible sign up prefix
			int start = (str.charAt(0) == '-') ? 1 : 0;
			if (sz > start + 1) {
				if (str.charAt(start) == '0' && str.charAt(start + 1) == 'x') {
					int i = start + 2;
					if (i == sz) {
						return false; // "0x"
					}
					// hex
					for (; i < TextUtils.strEndingIdx(str); i++) {
						char ch = str.charAt(i);
						if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'f') && (ch < 'A' || ch > 'F')) {
							return false;
						}
					}
					return true;
				}
			}
			sz--;
			int i = start;
			// traverse the next to last char if needing a digit to formulate a number
			while (i < sz || (i < sz + 1 && allowSigns && !foundDigit)) {
				char ch = str.charAt(i);
				if (ch >= '0' && ch <= '9') {
					foundDigit = true;
					allowSigns = false;

				} else if (ch == '.') {
					if (hasDecPoint || hasExp) {
						return false;
					}
					hasDecPoint = true;
				} else if (ch == 'e' || ch == 'E') {
					if (hasExp) {
						// >1 'E'
						return false;
					}
					if (!foundDigit) {
						return false;
					}
					hasExp = true;
					allowSigns = true;
				} else if (ch == '+' || ch == '-') {
					if (!allowSigns) {
						return false;
					}
					allowSigns = false;
					foundDigit = false;
				} else { return false; }
				i++;
			}
			if (i < TextUtils.strEndingIdx(str)) {
				char ch = str.charAt(i);

				if (ch >= '0' && ch <= '9') {
					return true;
				}
				if (ch == 'e' || ch == 'E') {
					return false;
				}
				if (!allowSigns && (ch == 'd' || ch == 'D' || ch == 'f' || ch == 'F')) {
					return foundDigit;
				}
				if (ch == 'l' || ch == 'L') {
					return foundDigit && !hasExp;
				}
				// last character is illegal
				return false;
			}
			return !allowSigns && foundDigit;
		}

		public static String removeNameQuotes(String s) {
			if (s == null || s.length() <= 1) {
				return null;
			}
			int len = TextUtils.strEndingIdx(s);
			char c0 = s.charAt(0);
			char last = s.charAt(len - 1);

			if (c0 == last && (c0 == '`' || c0 == '\'' || c0 == '\"')) {
				return s.substring(1, len - 1);
			}
			return s;
		}

		/**
		 * Abbreviates a String using a given replacement marker. This will turn
		 * "Now is the time for all good men" into "...is the time for..." if "..." was
		 * defined as the replacement marker.
		 *
		 * This API works like `abbreviate(String, String, int)`, but allows specifying
		 * a "left edge" offset.
		 * Note that this left edge is not necessarily going to be the leftmost
		 * character
		 * in the result, or the first character following the replacement marker, but
		 * it
		 * will appear somewhere in the result.
		 *
		 * @param str          the String to check, may be null
		 * @param abbrevMarker the String used as replacement marker
		 * @param offset       left edge of source String
		 * @param maxWidth     maximum length of result String, must be at least 4
		 * @return abbreviated String, null if null String input or the width is too
		 *         small
		 */
		public String abbreviate(String str, String abbrevMarker, int offset, int maxWidth) {
			if (str != null && "".equals(abbrevMarker)) {
				return substring(str, 0, maxWidth);
			} else if (str == null || str.length() == 0 || abbrevMarker == null || abbrevMarker.length() == 0) {
				return str;
			}
			int abbrevMarkerLength = TextUtils.strEndingIdx(abbrevMarker);
			int minAbbrevWidthOffset = abbrevMarkerLength + abbrevMarkerLength + 1;

			if (maxWidth < minAbbrevWidthOffset) {
				return null;
			}
			int strLen = TextUtils.strEndingIdx(str);
			if (offset > strLen) {
				offset = strLen;
			}
			if (strLen <= maxWidth) {
				return str;
			}
			if (strLen - offset < maxWidth - abbrevMarkerLength) {
				offset = strLen - (maxWidth - abbrevMarkerLength);
			}
			if (offset <= abbrevMarkerLength + 1) {
				return str.substring(0, maxWidth - abbrevMarkerLength) + abbrevMarker;
			}
			if (offset + maxWidth - abbrevMarkerLength < strLen) {
				return abbrevMarker + abbreviate(str.substring(offset), abbrevMarker, 0, maxWidth - abbrevMarkerLength);
			}
			return abbrevMarker + str.substring(strLen - (maxWidth - abbrevMarkerLength));
		}

		/**
		 * Extracts a substring from the given string, ensuring that the start and end
		 * indices are valid.
		 *
		 * @param str   the string to extract the substring from
		 * @param start the starting index (inclusive)
		 * @param end   the ending index (exclusive)
		 * @return the extracted substring, or an empty string if indices are invalid
		 */
		private String substring(String str, int start, int end) {
			// check length next
			if (end >= TextUtils.strEndingIdx(str)) {
				end = TextUtils.strEndingIdx(str);
			}

			if (start < 0) {
				start = 0;
			}

			if (end < 0) {
				end = 0;
			}

			// if start is greater than end, return ""
			if (start > end) {
				return "";
			}

			return str.substring(start, end);
		}

		/**
		 * Computes a hash code for the given string, converting uppercase letters to
		 * lowercase.
		 *
		 * @param text the string to compute the hash code for
		 * @return the computed hash code, or -1 if the input string is null
		 */
		public static int lowerHashCode(String text) {
			if (text == null) {
				return -1;
			}
			int h = 0;
			for (int i = 0; i < TextUtils.strEndingIdx(text); ++i) {
				char ch = text.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}

				h = 31 * h + ch;
			}
			return h;
		}

		/**
		 * Green implementation of regionMatches.
		 *
		 * @param cs         the CharSequence to be processed
		 * @param ignoreCase whether or not to be case insensitive
		 * @param thisStart  the index to start on the cs CharSequence
		 * @param substring  the CharSequence to be looked for
		 * @param start      the index to start on the substring CharSequence
		 * @param length     character length of the region
		 * @return whether the region matched
		 */
		public boolean regionMatch(CharSequence cs, boolean ignoreCase, int thisStart,
				CharSequence substring, int start, int length) {
			if (cs instanceof String && substring instanceof String) {
				return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
			}
			int index1 = thisStart;
			int index2 = start;
			int tmpLen = length;

			// Extract these first so we detect NPEs the same as the java.lang.String
			// version
			int srcLen = cs.length() - thisStart;
			int otherLen = substring.length() - start;

			// Check for invalid parameters
			if (thisStart < 0 || start < 0 || length < 0) {
				return false;
			}

			// Check that the regions are long enough
			if (srcLen < length || otherLen < length) {
				return false;
			}

			while (tmpLen-- > 0) {
				char c1 = cs.charAt(index1++);
				char c2 = substring.charAt(index2++);
				if (c1 == c2) {
					continue;
				}
				if (!ignoreCase) {
					return false;
				}
				// The real same check as in String.regionMatches():
				char u1 = Character.toUpperCase(c1);
				char u2 = Character.toUpperCase(c2);
				if (u1 != u2 && Character.toLowerCase(u1) != Character.toLowerCase(u2)) {
					return false;
				}
			}

			return true;
		}

		public static String strLeftTrim(String s) {
			if (s == null) {
				return null;
			}
			int index = 0;
			int len = TextUtils.strEndingIdx(s);
			while (index < len) {
				if (s.charAt(index) != ' ') {
					break;
				} else {
					++index;
				}
			}
			if (index <= 0) {
				return s;
			} else {
				return s.substring(index);
			}
		}

		/**
		 * Calculate the longest common prefix for the given strings.
		 *
		 * @param seqs the strings.
		 * @return the identified longest possible prefix.
		 */
		public static String longestCommonPrefix(String[] strs) {
			String com;
			outterloop: 
				for (com = ""; true;) {
				String substr = null;
				for (String str : strs) {
					if (com.length() >= TextUtils.strEndingIdx(str)) {
						break outterloop;
					} else {
						if (substr == null) {
							substr = str.subSequence(0, com.length() + 1).toString();
						} else if (str.subSequence(0, com.length() + 1).toString().equals(substr)) {
							// identified a prefix
						} else {
							break outterloop;
						}
					}
				}
				if (substr == null) {
					break;
				} else {
					com = substr;
				}
			}
			return com;
		}

		/**
		 * Finds the index of the first occurrence of a character in the string,
		 * starting from a given offset.
		 *
		 * @param str    the string to search in
		 * @param offset the index to start the search from
		 * @param c      the character to search for
		 * @return the index of the character, or the string length if not found
		 */
		public static int indexOf_re(String str, int offset, char c) {
			int len = TextUtils.strEndingIdx(str), idx;
			for (idx = offset; idx < len; ++idx) {
				if (str.charAt(idx) == c) {
					break;
				}
			}
			return idx;
		}

		/**
		 * Matches the given text against the specified regular expression with optional
		 * case sensitivity
		 * and multiline support.
		 *
		 * @param text       the text to be matched
		 * @param re         the regular expression pattern
		 * @param caseAware  whether the match should be case-sensitive
		 * @param multiLines whether the match should support multiline mode
		 * @return true if the text matches the regex, false otherwise
		 */
		public static boolean regexMatch(String text, String re, boolean caseAware, boolean multiLines) {
			if (null == text || null == re) {
				return false;
			}

			int flg = 0;
			if (multiLines) {
				flg |= Pattern.DOTALL;
			}
			if (caseAware == false) {
				flg |= Pattern.CASE_INSENSITIVE;
			}

			Pattern pattern = Pattern.compile(re, flg);
			Matcher matcher = pattern.matcher(text);
			return matcher.matches();
		}
	}

	public static class DateTimeUtils {
		/**
		 * Parses a date string in "yyyyMMdd" format and returns a corresponding Date
		 * object.
		 *
		 * @param str the date string to parse
		 * @return the parsed Date, or null if the input is invalid
		 */

		public static Date parseDate(String str) {
			if (str == null || str.isEmpty() || str == new String("null")) {
				return null;
			}

			DateTimeFormatter formatter;
			formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate ldt = LocalDate.parse(str, formatter);
			long millis = getMillis(
					false,
					ldt.getYear(),
					ldt.getMonthValue(),
					ldt.getDayOfMonth(),
					0, 0, 0, 0);
			return new Date(millis);
		}

		/**
		 * Converts the given date and time to milliseconds since the epoch, with
		 * optional UTC or local timezone.
		 *
		 * @param UTC          whether to use UTC time zone
		 * @param year         the year of the date
		 * @param month        the month of the date (1-12)
		 * @param dom          the day of the month (1-31)
		 * @param hour         the hour of the day (0-23)
		 * @param minute       the minute of the hour (0-59)
		 * @param second       the second of the minute (0-59)
		 * @param nanoOfSecond the nanosecond of the second (0-999999999)
		 * @return the number of milliseconds since the epoch, or -1 if the date or time
		 *         is invalid
		 */
		public static long getMillis(boolean UTC, int year, int month, int dom, int hour, int minute, int second,
				int nanoOfSecond) {
			ZoneId zoneId = ZoneId.of("Asia/Hong_Kong");
			if (UTC) {
				zoneId = ZoneId.of("UTC");
			}

			long utcSeconds;
			{
				int DAYS_PER_CYCLE = 146097;
				long DAYS_0000_TO_1970 = (DAYS_PER_CYCLE * 5L) - (30L * 365L + 7L);

				long total = (365 * year)
						+ ((year + 3) / 4 - (year + 99) / 100 + (year + 399) / 400)
						+ ((367 * month - 362) / 12)
						+ (dom - 1);

				if (month > 2) {
					total--;
					boolean leapYear = (year & 3) == 0 && ((year % 100) != 0 || (year % 400) == 0);
					if (!leapYear) {
						total--;
					}
				}

				long epochDay = total - DAYS_0000_TO_1970;
				utcSeconds = epochDay * 86400
						+ hour * 3600
						+ minute * 60
						+ second;
			}

			int zoneOffsetTotalSeconds;

			if (zoneId == ZoneOffset.UTC || "UTC".equals(zoneId.getId())) {
				zoneOffsetTotalSeconds = 0;
			} else
				try {
					LocalDate localDate = LocalDate.of(year, month, dom);
					LocalTime localTime = LocalTime.of(hour, minute, second, nanoOfSecond);
					LocalDateTime ldt = LocalDateTime.of(localDate, localTime);
					ZoneOffset offset = zoneId.getRules().getOffset(ldt);
					zoneOffsetTotalSeconds = offset.getTotalSeconds();
				} catch (Exception e) {
					return -1;
				}

			long millis = (utcSeconds - zoneOffsetTotalSeconds) * 1000L;
			if (nanoOfSecond != 0) {
				millis += nanoOfSecond / 1000000;
			}
			return millis;
		}

		/**
		 * Converts a day of the month (DOM) into a string with the appropriate ordinal
		 * suffix.
		 *
		 * @param dom the day of the month (1-31)
		 * @return the DOM as a string with an ordinal suffix, or "(invalidDOM)" if out
		 *         of range
		 */
		public static String domStr(int dom) {
			String ans = "" + dom;
			if (dom >= 11 && dom <= 13)
				ans += "th";
			else if (dom % 10 == 1)
				ans += "st";
			else if (dom % 10 == 2)
				ans += "nd";
			else if (dom % 10 == 3)
				ans += "rd";
			else ans += "th";

			if (!(dom > 0 && dom <= 31))
				ans = "(invalidDOM)";
			return ans;
		}

		/**
		 * Splits a date-time string into its individual components based on the given
		 * pattern.
		 *
		 * @param str     the date-time string to split
		 * @param pattern the date-time format pattern (e.g., "yyyy-MM-dd HH:mm:ss" or
		 *                "yyyy/MM/dd HH:mm:ss")
		 * @return an array of characters representing the year, month, day, hour,
		 *         minute, and second,
		 *         or null if the input is invalid
		 */
		public static char[] splitMillis(String str, String pattern) {
			if (str == null) {
				return null;
			}

			if (pattern.length() != 19) {
				return null;
			}

			if (str.length() != 19) {
				return null;
			}

			char c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18;
			c0 = str.charAt(0);
			c1 = str.charAt(1);
			c2 = str.charAt(2);
			c3 = str.charAt(3);
			c4 = str.charAt(4);
			c5 = str.charAt(5);
			c6 = str.charAt(6);
			c7 = str.charAt(7);
			c8 = str.charAt(8);
			c9 = str.charAt(9);
			c10 = str.charAt(10);
			c11 = str.charAt(11);
			c12 = str.charAt(12);
			c13 = str.charAt(13);
			c14 = str.charAt(14);
			c15 = str.charAt(15);
			c16 = str.charAt(16);
			c17 = str.charAt(17);
			c18 = str.charAt(18);

			char y0, y1, y2, y3, m0, m1, d0, d1, h0, h1, i0, i1, s0, s1;
			if (pattern == "yyyy-MM-dd HH:mm:ss") {
				if (c4 != '-' || c7 != '-' || c10 != ' ' || c13 != ':' || c16 != ':') {
					return null;
				}
				y0 = c0;
				y1 = c1;
				y2 = c2;
				y3 = c3;

				m0 = c5;
				m1 = c6;

				d0 = c8;
				d1 = c9;

				h0 = c11;
				h1 = c12;

				i0 = c14;
				i1 = c15;

				s0 = c17;
				s1 = c18;
			} else if (pattern == "yyyy/MM/dd HH:mm:ss") {
				if (c4 != '/' || c7 != '/' || c10 != ' ' || c13 != ':' || c16 != ':') {
					return null;
				}
				y0 = c0;
				y1 = c1;
				y2 = c2;
				y3 = c3;

				m0 = c5;
				m1 = c6;

				d0 = c8;
				d1 = c9;

				h0 = c11;
				h1 = c12;

				i0 = c14;
				i1 = c15;

				s0 = c17;
				s1 = c18;
			} else return null;
			return new char[] { y0, y1, y2, y3, m0, m1, d0, d1, h0, h1, i0, i1, s0, s1 };
		}

		/**
		 * Returns the first date of the season (quarter) based on the given year and
		 * month.
		 *
		 * @param x the year
		 * @param y the month
		 * @return the first date of the season (e.g., "2023-01-01"), or an empty string
		 *         if month is invalid
		 */
		public static String thisSeason(int x, int y) {
			String dateString = "";
			if (y >= 1 && y <= 3) {
				dateString = x + "-" + "01" + "-" + "01";
			}
			if (y >= 4 && y <= 6) {
				dateString = x + "-" + "04" + "-" + "01";
			}
			if (y >= 7 && y <= 9) {
				dateString = x + "-" + "07" + "-" + "01";
			}
			if (y >= 10 && y <= 12) {
				dateString = x + "-" + "10" + "-" + "01";
			}
			return dateString;
		}

		/**
		 * Returns the end date of the season (quarter) based on the year and quarter
		 * number.
		 *
		 * @param x the year
		 * @param y the quarter (1-4)
		 * @return the end date of the quarter in "yyyy-MM-dd" format
		 */
		public static String thisSeasonEnd(int x, int y) {
			String dateString = "";
			if (y >= 1 && y <= 3) {
				dateString = x + "-" + "03" + "-" + "31";
			}
			if (y >= 4 && y <= 6) {
				dateString = x + "-" + "06" + "-" + "30";
			}
			if (y >= 7 && y <= 9) {
				dateString = x + "-" + "09" + "-" + "30";
			}
			if (y >= 10 && y <= 12) {
				dateString = x + "-" + "12" + "-" + "31";
			}
			return dateString;
		}

		/**
		 * Converts seconds into a human-readable string representing the largest time
		 * unit (years, weeks, days, hours, minutes, or seconds).
		 *
		 * @param sec the time in seconds to convert
		 * @return a string representing the converted time with the appropriate unit
		 */
		public static String secToString(long sec) {
			double converted;
			String type;
			if (sec >= 2.0 * 365.0 * 24.0 * 60.0 * 60.0) {
				converted = sec / 365.0 / 24.0 / 60.0 / 60.0;
				type = "y";
			} else if (sec >= 2 * 7 * 24 * 60 * 60) {
				converted = sec / 7.0 / 24.0 / 60.0 / 60.0;
				type = "w";
			} else if (sec >= 2 * 24 * 60 * 60) {
				converted = sec / 24.0 / 60.0 / 60.0;
				type = "d";
			} else if (sec >= 2 * 60 * 60) {
				converted = sec / 60.0 / 60.0;
				type = "h";
			} else if (sec >= 2 * 60) {
				converted = sec / 60.0;
				type = "m";
			} else { converted = sec;
				type = "s";
			}
			return Math.round(converted) + " " + type;
		}

		/**
		 * Adds 12 hours to a 2-digit hour (in 24-hour format) and returns the new time.
		 *
		 * @param h0 the first digit of the hour (tens place)
		 * @param h1 the second digit of the hour (ones place)
		 * @return a 2-character array representing the new hour, or null if the input
		 *         is invalid
		 */
		public static char[] hourplus12(char h0, char h1) {
			if (h0 == '0') {
				if (h1 == '0') {
					h0 = '1';
					h1 = '2';
				}
				if (h1 == '1') {
					h0 = '1';
					h1 = '3';
				}
				if (h1 == '2') {
					h0 = '1';
					h1 = '4';
				}
				if (h1 == '3') {
					h0 = '1';
					h1 = '5';
				}
				if (h1 == '4') {
					h0 = '1';
					h1 = '6';
				}
				if (h1 == '5') {
					h0 = '1';
					h1 = '7';
				}
				if (h1 == '6') {
					h0 = '1';
					h1 = '8';
				}
				if (h1 == '7') {
					h0 = '1';
					h1 = '9';
				}
				if (h1 == '8') {
					h0 = '2';
					h1 = '0';
				}
				if (h1 == '9') {
					h0 = '2';
					h1 = '1';
				}
			} else if (h0 == '1') {
				if (h1 == '0') {
					h0 = '2';
					h1 = '2';
				}
				if (h1 == '1') {
					h0 = '2';
					h1 = '3';
				}
				if (h1 == '2') {
					h0 = '2';
					h1 = '4';
				}
			} else return null;
			return new char[] { h0, h1 };
		}
	}
}