package data.input;

import java.util.List;

public interface InputDataProvider<T extends InputParams> {
    List<String> readData(T params);
}
