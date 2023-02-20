package PVSv.files;

import fileworks.DataExport;

import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        DataExport de = new DataExport("filesResources\\output\\out.txt");
        
        de.finishExport();
    }
}
