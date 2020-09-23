import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<String>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String uname = email.substring(0, i);
            String domainName = email.substring(i);
            if (uname.contains("+")) {
                uname = email.substring(0, email.indexOf('+'));
            }
            uname = uname.replaceAll("\\.", "");
            emailSet.add(uname + domainName);
        }
        return emailSet.size();
    }

    public static void main(String[] args) {
        int result=numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
        System.out.println(result);
    }
}
