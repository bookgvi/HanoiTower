package Utils.UserInput;

import java.io.IOException;

public class GetInput extends GetString {
    public Integer getNumber() throws IOException {
        return Integer.parseInt(super.getString());
    }
}
