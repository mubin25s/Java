public class DBconnection {
    private static DBconnection instance;
    private DBconnection(){
        System.out.println("Database connection established");
    }
    public static DBconnection getInstance(){
        if(instance == null){
            instance = new DBconnection();
        }
        return instance;
    }
    public void query(String sql){
        System.out.println("Executing query: " + sql);
    }
    public static void main(String[] args) {
        DBconnection db1 = DBconnection.getInstance();
        DBconnection db2 = DBconnection.getInstance();
        db1.query("SELECT * FROM users");
        db2.query("SELECT * FROM products");
    }
}