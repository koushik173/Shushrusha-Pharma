
package shushrusha;

public class FilePath {
    String path;
    public String toFilePath(){
        java.io.File dir = new java.io.File("Customer");
        path = dir.getAbsolutePath();
        dir.mkdir();
        return path;
    }
    
}
