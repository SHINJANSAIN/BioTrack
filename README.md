# BioTrack: Laboratory Sample Inventory System

## Project Description

**BioTrack** is a console-based Laboratory Sample Inventory Management System designed to solve the challenge of manually tracking biological samples in research laboratories. The system provides an efficient, organized way for lab managers to manage samples such as blood, tissue, DNA, and cell cultures.

In real-world research environments, improper sample tracking can lead to:
- Loss of valuable biological specimens
- Confusion about sample storage conditions
- Delays in research due to misplaced samples
- Inability to trace sample collection dates

BioTrack addresses these problems by providing a simple yet effective digital inventory system that persists data using file handling, ensuring samples are never lost and can be easily retrieved by their unique identifiers.

## Domain

**Healthcare & Research** (Bioengineering Application)

## Key Features

### 1. Add Sample
- Register new biological samples with unique IDs
- Capture essential information: Sample Type, Collection Date, Storage Temperature
- Supported sample types: Blood, Tissue, DNA, Cell Culture
- Automatic validation to prevent duplicate sample IDs

### 2. Search Sample
- Quick retrieval of sample information using unique Sample ID
- Displays complete sample details when found
- User-friendly error messages for non-existent samples

### 3. Display All Samples
- View complete inventory of all stored samples
- Organized tabular format for easy reading
- Shows all critical information at a glance

### 4. Remove Sample
- Delete samples from the inventory using Sample ID
- Confirmation messages for successful removal
- Safe handling of non-existent sample removal attempts

### 5. Data Persistence
- Automatic save functionality using file I/O
- Data stored in `data.txt` file
- Samples remain available even after program closure
- Automatic loading of existing inventory on program startup

### 6. User-Friendly Console Interface
- Simple menu-driven navigation
- Clear prompts and instructions
- Input validation and error handling
- Professional formatting for better readability

## Real-World Application

This system is directly applicable to:
- **Academic Research Labs**: Track samples for ongoing experiments
- **Hospital Pathology Departments**: Manage patient tissue and blood samples
- **Pharmaceutical Companies**: Monitor biological specimens during drug development
- **Biotech Startups**: Organize cell culture inventories
- **Teaching Labs**: Educational tool for students learning inventory management

## Technology Stack

- **Language**: Core Java (JDK 8 or higher)
- **Data Storage**: File I/O (Text file handling)
- **Design Pattern**: Object-Oriented Programming with modular class structure
- **No External Dependencies**: Pure Java implementation



## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Command line interface (Terminal/Command Prompt)
- Text editor or IDE (optional, for viewing/modifying code)

### Step 1: Clone or Download the Repository
git clone https://github.com/SHINJANSAIN/BioTrack/tree/main
cd BioTrack-Project

### Step 2: Navigate to the Source Directory
cd src

### Step 3: Compile the Java Files
javac Main.java Sample.java InventoryManager.java

### Step 4: Run the Application
java Main

### Step 5: Use the Application
Follow the on-screen menu to:
1. Add new samples
2. Search for samples by ID
3. View all samples
4. Remove samples
5. Exit (data auto-saves)

## Usage Example

```text
========================================
    BioTrack: Lab Inventory System
========================================
1. Add Sample
2. Search Sample by ID
3. Display All Samples
4. Remove Sample
5. Exit
========================================
Enter your choice: 1

--- Add New Sample ---
Enter Sample ID: SAM001
Enter Sample Type (Blood/Tissue/DNA/Cell): Blood
Enter Collection Date (DD-MM-YYYY): 24-11-2024
Enter Storage Temperature (°C): -20

✓ Sample added successfully!
```

## Sample Data Format

The `data.txt` file stores data in CSV format:
```
SAM001,Blood,24-11-2024,-20.0
SAM002,Tissue,23-11-2024,-80.0
SAM003,DNA,22-11-2024,4.0
```

## Class Structure Explanation

### 1. Sample.java (Model Class)
- Represents a single biological sample
- Contains attributes: sampleId, sampleType, collectionDate, storageTemp
- Implements getters and setters for encapsulation
- Provides toString() method for easy display

### 2. InventoryManager.java (Business Logic Class)
- Manages the collection of Sample objects using ArrayList
- Implements CRUD operations:
  - **addSample()**: Adds new sample with duplicate checking
  - **searchSample()**: Finds sample by ID
  - **displayAllSamples()**: Shows all inventory
  - **removeSample()**: Deletes sample by ID
- Handles file I/O operations:
  - **saveToFile()**: Writes inventory to data.txt
  - **loadFromFile()**: Reads inventory from data.txt on startup

### 3. Main.java (Entry Point)
- Contains the main() method
- Displays user menu in a loop
- Handles user input and calls appropriate InventoryManager methods
- Ensures data is saved before exit

## Learning Outcomes

By building and understanding this project, you will learn:
- **OOP Concepts**: Classes, Objects, Encapsulation, Abstraction
- **File Handling**: Reading and writing data using FileReader, FileWriter, BufferedReader, BufferedWriter
- **Data Structures**: ArrayList for dynamic data management
- **Exception Handling**: Try-catch blocks for robust error handling
- **User Input**: Scanner class for console input
- **Modular Design**: Separation of concerns with multiple classes
- **Data Persistence**: Saving and loading application state

## Future Enhancements

Potential improvements for advanced learning:
- Add sample expiry date tracking
- Implement search by sample type
- Add sorting functionality (by date, type, temperature)
- Create backup functionality
- Add user authentication
- Generate reports (samples by type, low stock alerts)
- Implement barcode integration
- Add GUI using Java Swing

## Troubleshooting

### Issue: "Cannot find symbol" error during compilation
**Solution**: Ensure all three .java files are in the same directory and compile them together.

### Issue: Data not saving between runs
**Solution**: Check that the program has write permissions in the directory. The data.txt file should be in the project root.

### Issue: FileNotFoundException
**Solution**: This is normal on first run. The program creates data.txt automatically if it doesn't exist.

## Contributing

Contributions are welcome! To contribute:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License

This project is created for educational purposes. Feel free to use and modify for learning.

## Author

SHINJAN SAIN
- GitHub: https://github.com/SHINJANSAIN


## Acknowledgments

- Inspired by real-world laboratory management needs
- Built as part of bioengineering coursework
- Thanks to the Java community for excellent documentation

---

**Note**: This is a console-based application designed for simplicity and educational purposes. For production use in actual laboratories, consider adding database integration, enhanced security, and GUI interface.
