import java.io.*;

class BackupData implements Serializable {
    String data = "User Backup Data";
}

public class BackupTest {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println("Backup ready: " + b.data);
    }
}
