# BioTrack

## Project Description

In real-world lab environments, improper sample tracking can lead to:

Loss of valuable biological specimens

Confusion regarding storage conditions

Delayed experiments and research workflows

Inability to trace collection timelines

BioTrack addresses these issues using a simple but powerful digital inventory with persistent data storage using file handling (data.txt).

## Domain

Healthcare & Research (Bioengineering Application)

## Key Features
1. Add Sample

Register unique biological samples

Prevent duplicate Sample IDs

Store: Sample Type, Collection Date, Storage Temperature

2. Search Sample

Retrieve detailed sample information by ID

Helpful error messages for missing samples

3. Display All Samples

View samples in a tabular, readable format

Shows entire inventory at a glance

4. Remove Sample

Delete samples by ID

Confirmations for safe removal

5. Data Persistence

Saves all data into data.txt

Automatically loads inventory on startup

6. User-Friendly Console Interface

Menu-driven navigation

Input validation

Clean, professional formatting

## Real-World Application

This system is ideal for:

Academic Research Labs – tracking experimental samples

Hospital Pathology Departments – managing patient samples

Pharmaceutical Companies – storing research specimens

Biotech Startups – organizing cell culture stocks

Teaching Labs – introducing sample management workflows

## Technology Stack

Language: Core Java (JDK 8+)

File Storage: Text File (data.txt)

Design: OOP (modular class architecture)

No External Dependencies – Pure Java

## Project Structure
BioTrack-Project/
├── .git/                         
├── src/
│   ├── Main.java                  
│   ├── Sample.java                
│   └── InventoryManager.java      
├── screenshots/
│   ├── main_menu.png              
│   ├── add_sample.png             
│   └── view_all.png               
├── README.md                      
└── data.txt                       


README

## How to Run the Project
Prerequisites

JDK 8 or higher

Command Prompt / Terminal

Text editor or IDE (optional)

Steps
Step 1: Clone or Download
git clone https://github.com/SHINJANSAIN/BioTrack/tree/main
cd BioTrack-Project

Step 2: Navigate to src/
cd src

Step 3: Compile
javac Main.java Sample.java InventoryManager.java

Step 4: Run
java Main

Step 5: Use Menu

You can now:

Add Samples

Search Samples

View All Samples

Remove Samples

Exit (auto-save data)

## Usage Example
========================================
BioTrack: Lab Inventory System
1. Add Sample
2. Search Sample by ID
3. Display All Samples
4. Remove Sample
5. Exit
========================================
Enter your choice: 1

Example Input:
--- Add New Sample ---
Enter Sample ID: SAM001
Enter Sample Type: Blood
Enter Collection Date: 24-11-2024
Enter Storage Temperature: -20
✓ Sample added successfully!

Example data.txt Content:
SAM001,Blood,24-11-2024,-20.0
SAM002,Tissue,23-11-2024,-80.0
SAM003,DNA,22-11-2024,4.0


README

## Class Structure Explanation
### 1. Sample.java (Model Class)

Represents a biological specimen

Stores: ID, Type, Date, Temperature

Implements encapsulation with getters/setters

Provides toString() for clean display

### 2. InventoryManager.java (Business Logic)

Manages ArrayList of samples

Implements CRUD operations:

addSample()

searchSample()

displayAllSamples()

removeSample()

Handles file I/O: saving & loading

### 3. Main.java (Entry Point)

Runs menu loop

Handles user input

Calls InventoryManager methods

## Learning Outcomes

By completing this project, you learn:

OOP (Encapsulation, Abstraction)

Java File Handling (BufferedReader, BufferedWriter)

Dynamic Data Structures (ArrayList)

Exception Handling

Modular application design

User input handling

Data persistence

Documentation & Git usage

README

## Future Enhancements

Sample expiry tracking

Search by sample type

Sorting features

Backup system

User authentication

Report generation

Barcode integration

GUI using Java Swing

## Troubleshooting
Issue: "Cannot find symbol"

Ensure all .java files are inside src/

Compile all files together

Issue: Data not saving

Ensure program has write permission

Issue: FileNotFoundException

Normal on first run; program creates data.txt automatically

## Contributing

Fork repository

Create a feature branch

Commit changes

Push branch

Create pull request

## License

Educational use only. Free to modify and improve.

## Author

SHINJAN SAIN
GitHub: https://github.com/SHINJANSAIN/BioTrack/tree/main

Registration No: 24BOE10040
