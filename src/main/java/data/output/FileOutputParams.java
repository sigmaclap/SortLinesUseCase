package data.output;


import java.util.List;
import java.util.Map;

public class FileOutputParams extends OutputParams {
    private String fileName;
    private List<String> lines;
    private Map<String, Integer> countLines;

    public Map<String, Integer> getCountLines() {
        return countLines;
    }

    public void setCountLines(Map<String, Integer> countLines) {
        this.countLines = countLines;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileOutputParams(String fileName, List<String> lines, Map<String, Integer> countLines) {
        this.fileName = fileName;
        this.lines = lines;
        this.countLines = countLines;
    }
}
