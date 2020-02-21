package Utils.UserInput;

import java.io.IOException;

public interface Input<T> {
    T getString() throws IOException;
}
