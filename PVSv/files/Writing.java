package PVSv.files;

import fileworks.DataExport;

import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        DataExport de = new DataExport("filesResources\\output\\out.txt");
        de.writeLine("New line, new text");
        de.writeString("Hello");
        de.writeString(" World!");
        de.writeNewLine();
        de.writeString("And another niew line");
        de.finishExport();
    }
}
