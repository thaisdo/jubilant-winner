# Simple Java ETL

> This is a beginner-friendly Java ETL (Extract, Transform, Load) project. It reads a CSV file, transforms the name field to uppercase, and writes the result to a new CSV file.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Project Structure

``` bash
simple-java-etl/
├── data/
│   └── input.csv
├── output/
│   └── output.csv
├── src/
│   └── SimpleETL.class
│   └── SimpleETL.java
├── README.md
```

## How to Run

1. Open your terminal and navigate to the project root folder:
```bash
cd simple-java-etl
```

2. Compile the Java source:
```bash
javac src/SimpleETL.java
```

3. Run the program:
```bash
java -cp src SimpleETL
```

> Make sure your working directory is the root folder when you run the program.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).