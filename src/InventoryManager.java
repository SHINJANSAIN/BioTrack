// InventoryManager.java
import java.util.ArrayList;
import java.io.*;

public class InventoryManager {
private ArrayList<Sample> inventory;
private static final String FILE_NAME = "data.txt";

public InventoryManager() {
inventory = new ArrayList<>();
loadFromFile();
}

public boolean addSample(String sampleId, String sampleType, String collectionDate, double storageTemp) {
for (Sample sample : inventory) {
if (sample.getSampleId().equalsIgnoreCase(sampleId)) {
System.out.println("✗ Error: Sample ID already exists!");
return false;
}
}
Sample newSample = new Sample(sampleId, sampleType, collectionDate, storageTemp);
inventory.add(newSample);
saveToFile();
System.out.println("✓ Sample added successfully!");
return true;
}

public Sample searchSample(String sampleId) {
for (Sample sample : inventory) {
if (sample.getSampleId().equalsIgnoreCase(sampleId)) return sample;
}
return null;
}

public void displayAllSamples() {
if (inventory.isEmpty()) {
System.out.println("⚠ Inventory is empty. No samples to display.");
return;
}
System.out.println("\n========================================");
System.out.println(" LABORATORY INVENTORY");
System.out.println("========================================");
System.out.println("Sample ID | Type | Collection Date | Storage Temp");
System.out.println("------------------------------------------------------------------------");
for (Sample sample : inventory) System.out.println(sample.toString());
System.out.println("========================================");
System.out.println("Total Samples: " + inventory.size());
System.out.println("========================================\n");
}

public boolean removeSample(String sampleId) {
for (int i=0;i<inventory.size();i++) {
if (inventory.get(i).getSampleId().equalsIgnoreCase(sampleId)) {
inventory.remove(i);
saveToFile();
System.out.println("✓ Sample removed successfully!");
return true;
}
}
System.out.println("✗ Sample ID not found!");
return false;
}

private void saveToFile() {
try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME))) {
for (Sample sample:inventory) {
writer.write(sample.toFileString());
writer.newLine();
}
} catch(IOException e){ System.out.println("✗ Error saving data: "+e.getMessage()); }
}

private void loadFromFile() {
File file=new File(FILE_NAME);
if (!file.exists()) {
try { file.createNewFile(); }
catch(IOException e){}
return;
}

try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))) {
String line;
while((line=reader.readLine())!=null) {
String[] p=line.split(",");
if (p.length==4) {
Sample s=new Sample(p[0],p[1],p[2],Double.parseDouble(p[3]));
inventory.add(s);
}
}
} catch(IOException e){}
}

public int getTotalSamples(){ return inventory.size(); }
}
