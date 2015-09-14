package week3.homework3;

import java.io.*;

/**
 * Created by Home on 11.09.2015.
 */
public class Cmd {
    private File homeDir = null;

    public Cmd() {
        homeDir = new File("C:\\dir");
    }

    public String filesInDir() {
        StringBuilder builder = new StringBuilder();
        File[] filesInDir = homeDir.listFiles();
        for (int i = 0; i < filesInDir.length; i++) {
            builder.append(filesInDir[i].getName() + "\n");
        }
        return builder.toString();
    }

    public void changeDir(String path) {
        homeDir = new File(path);
    }

    public boolean makeDir(String folderName) {
        File dir = new File(homeDir.getAbsolutePath() + "\\" + folderName);
        return dir.mkdir();
    }
    public boolean remove(String folderName) {
        File dir = new File(homeDir.getAbsolutePath() + "\\" + folderName);
        return dir.delete();
    }

    public String showFile(String fileName) {
        StringBuilder builder = new StringBuilder();
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader
                    (homeDir.getAbsolutePath() + "\\" + fileName));
            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return "File not found";
        }
        return builder.toString();
    }

    public File getHomeDir() {
        return homeDir;
    }
}
