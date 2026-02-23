interface Admin {
    Admin clone();
}

class SuperAdmin implements Admin {
    private String name;
    private String role;
    private String permissions;

    public SuperAdmin(String name, String role, String permissions) {
        this.name = name;
        this.role = role;
        this.permissions = permissions;
    }

    @Override
    public Admin clone() {
        return new SuperAdmin(name, role, permissions);
    }

    @Override
    public String toString() {
        return "SuperAdmin [name=" + name + ", role=" + role + ", permissions=" + permissions + "]";
    }
}

class Moderator implements Admin {
    private String name;
    private String role;
    private String section;

    public Moderator(String name, String role, String section) {
        this.name = name;
        this.role = role;
        this.section = section;
    }

    @Override
    public Admin clone() {
        return new Moderator(name, role, section);
    }

    @Override
    public String toString() {
        return "Moderator [name=" + name + ", role=" + role + ", section=" + section + "]";
    }
}

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
