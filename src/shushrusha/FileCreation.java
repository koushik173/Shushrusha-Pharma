
package shushrusha;

public class FileCreation {
    String path;
    public void CreateFile(){
    java.io.File dir = new java.io.File("Customer");
        path = dir.getAbsolutePath();
        dir.mkdir();
}
}
