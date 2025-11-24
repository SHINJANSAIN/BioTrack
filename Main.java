// Main.java
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
InventoryManager manager=new InventoryManager();
displayWelcome();
boolean running=true;

while(running){
displayMenu();
System.out.print("Enter your choice: ");
int choice;
try{
choice=scanner.nextInt();
scanner.nextLine();
} catch(Exception e){
scanner.nextLine();
System.out.println("✗ Invalid input! Enter number 1-5.\n");
continue;
}

switch(choice){
case 1: addSampleMenu(scanner,manager); break;
case 2: searchSampleMenu(scanner,manager); break;
case 3: manager.displayAllSamples(); break;
case 4: removeSampleMenu(scanner,manager); break;
case 5:
System.out.println("Thank you for using BioTrack!"); running=false; break;
default: System.out.println("✗ Invalid choice!\n");
}
}
scanner.close();
}

private static void displayWelcome(){
System.out.println("WELCOME TO BIOTRACK");
}

private static void displayMenu(){
System.out.println("1. Add Sample\n2. Search Sample\n3. Display All Samples\n4. Remove Sample\n5. Exit");
}

private static void addSampleMenu(Scanner scanner, InventoryManager manager){
System.out.print("Enter Sample ID: "); String id=scanner.nextLine();
System.out.print("Enter Type: "); String type=scanner.nextLine();
System.out.print("Enter Date: "); String date=scanner.nextLine();
System.out.print("Enter Temp: ");
double temp;
try { temp=scanner.nextDouble(); scanner.nextLine(); }
catch(Exception e){ scanner.nextLine(); return; }
manager.addSample(id,type,date,temp);
}

private static void searchSampleMenu(Scanner sc,InventoryManager m){
System.out.print("Enter Sample ID: "); String id=sc.nextLine();
Sample s=m.searchSample(id);
if(s!=null){
System.out.println("Sample Found:\nID: "+s.getSampleId());
} else System.out.println("Not Found");
}

private static void removeSampleMenu(Scanner sc,InventoryManager m){
System.out.print("Enter Sample ID to remove: "); String id=sc.nextLine();
m.removeSample(id);
}
}
