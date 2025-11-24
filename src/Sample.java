// Sample.java
public class Sample {
private String sampleId;
private String sampleType;
private String collectionDate;
private double storageTemp;

public Sample(String sampleId, String sampleType, String collectionDate, double storageTemp) {
this.sampleId = sampleId;
this.sampleType = sampleType;
this.collectionDate = collectionDate;
this.storageTemp = storageTemp;
}

public String getSampleId() { return sampleId; }
public String getSampleType() { return sampleType; }
public String getCollectionDate() { return collectionDate; }
public double getStorageTemp() { return storageTemp; }

public void setSampleType(String sampleType) { this.sampleType = sampleType; }
public void setCollectionDate(String collectionDate) { this.collectionDate = collectionDate; }
public void setStorageTemp(double storageTemp) { this.storageTemp = storageTemp; }

@Override
public String toString() {
return String.format("%-12s | %-15s | %-15s | %.1f°C",
sampleId, sampleType, collectionDate, storageTemp);
}

public String toFileString() {
return sampleId + "," + sampleType + "," + collectionDate + "," + storageTemp;
}
}
