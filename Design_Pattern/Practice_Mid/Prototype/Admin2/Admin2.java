package Design_Pattern.Practice_Mid.Prototype.Admin2;

public class Admin2 {
    public static void main(String[] args) {
        Admin sa = new SuperAdmin("John", "SuperAdmin", "All Access");
        Admin mod = new Moderator("Jane", "Moderator", "Tech Forum");

        Admin sa2 = sa.clone();
        Admin mod2 = mod.clone();

        System.out.println(sa);
        System.out.println(mod);
        System.out.println(sa2);
        System.out.println(mod2);
    }
}
