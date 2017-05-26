package common;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.naming.*;
import javax.naming.directory.*;
import javax.naming.ldap.*;
import com.sun.security.auth.callback.TextCallbackHandler;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import org.apache.commons.lang3.StringEscapeUtils;

public class lu {
     public static String oneVal(ArrayList<String> vals) {
         if (vals == null)
	     return null;
	 if (vals.size() == 0)
	     return null;
	 return vals.get(0);
     }

     public static boolean hasVal(ArrayList<String> vals) {
	 if (vals == null)
	     return false;
	 if (vals.size() == 0)
	     return false;
	 return true;
     }

     public static ArrayList<String> valList(ArrayList<String> vals) {
	 if (vals == null)
	     return new ArrayList<String>();
	 else
	     return vals;
     }
     public static String esc(String s) {
	 return StringEscapeUtils.escapeHtml4(s);
     }

     public static String dn2user(String s) {
	 if (s == null)
	     return "";
	 if (s.startsWith("uid=")) {
	     s = s.substring(4);
	     int i = s.indexOf(",");
	     if (i > 0)
		 s = s.substring(0, i);
	 }
	 return s;
     }
	 
     public static String dn2cn(String s) {
	 if (s == null)
	     return "";
	 if (s.startsWith("cn=")) {
	     s = s.substring(3);
	     int i = s.indexOf(",");
	     if (i > 0)
		 s = s.substring(0, i);
	 }
	 return s;
     }

}
