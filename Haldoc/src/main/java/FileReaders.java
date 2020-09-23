import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders extends Notification {
    public FileReaders(String info, String warning, String critical, String blocker) {
        super(info, warning, critical, blocker);
    }

    public void readFile(File logFile) throws IOException {
        logFile = new File("/Users/s0s03ha/Downloads/ConcurAct.pdf");
        BufferedReader br = new BufferedReader(new FileReader(logFile));
        while (br.readLine() != null) {

        }
    }
}
