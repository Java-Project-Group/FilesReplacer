import java.io.File;

public class FilesUtils {

    public String replaceFileNameByFolder(String folderName, String ReplaceFrom, String ReplaceWith) {
        try {
            File folder = new File(folderName);
            File[] filesList = folder.listFiles();
            if (filesList != null) {
                for (File aFilesList : filesList) {
                    String newName = (aFilesList.toString().replaceAll(ReplaceFrom, ReplaceWith));
                    aFilesList.renameTo(new File(newName));
                }
                return "Successfully renamed " + filesList.length + " files.";
            } else {
                return "Folder is empty!";
            }
        } catch (Exception e) {
            return (e.getMessage());
        }
    }

    public static void main(String[] args) {
        FilesUtils filesUtils = new FilesUtils();
        String result = filesUtils.replaceFileNameByFolder("D:\\User Backup\\Desktop\\TestRename\\AllFiles\\ggggggg\\ggggggg", "-", "_");
        System.out.println(result);
    }
}
