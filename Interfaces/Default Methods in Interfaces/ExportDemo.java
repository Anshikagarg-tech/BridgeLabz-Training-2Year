interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting to JSON (default method added later).");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Data exported as CSV.");
    }
    public void exportToPDF() {
        System.out.println("Data exported as PDF.");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter r = new ReportExporter();
        r.exportToCSV();
        r.exportToJSON();
    }
}
