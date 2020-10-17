import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Simplejava {

	public static void main(String[] args) throws IOException 
	{
		String a[] = {"2","failed"};
		writeCSV("C:\\Users\\abbalmoo\\Downloads\\output.csv",a,false);
	}
	
	public static void writeCSV(String path,String[] data,boolean deleteFlag) throws IOException
	{
		System.out.println("Writing Started.");
        File file = new File(path);
        FileWriter fileWriter = null;
    	CSVWriter csvwriter = null;
    	if(deleteFlag)
    	{
	    	file.delete();
	    	System.out.println("File Deleted..");
    	}
        try {
	       if(file.exists())
	       {
	    	   fileWriter= new FileWriter(file,true);
	    	   csvwriter = new CSVWriter(fileWriter);   
	    	   System.out.println("Appending the data");
	       }
	       else
	       {
	    	  System.out.println("Creating a new file and adding the data");
	    	  fileWriter = new FileWriter(file); 
	    	  csvwriter= new CSVWriter(fileWriter);   
	    	  String[] header = {"TestCaseID", "Reason"};
	    	  csvwriter.writeNext(header,false);
	       }  
	       csvwriter.writeNext(data, false);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally 
        {
        	csvwriter.close();	
        	System.out.println("Writing Completed..");
		}
	}

}
