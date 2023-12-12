package data.input;

public class FileInputParams extends InputParams {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileInputParams(String fileName) {
        this.fileName = fileName;
    }
}
