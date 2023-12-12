package data.output;

import java.util.List;

public interface OutputDataProvider<T extends OutputParams> {
    void writeData(T params);
}
