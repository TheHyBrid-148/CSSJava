import java.util.List;

public class ReportGenerator {
    private Subdivision subdivision;

    public ReportGenerator(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    public String generateLotReport() {
        StringBuilder report = new StringBuilder();
        report.append("Subdivision Lot Report:\n");
        report.append("-------------------------\n");

        for (Block block : subdivision.getBlocks()) {
            report.append("Block ").append(block.getBlockNumber()).append(":\n");
            for (Lot lot : block.getLots()) {
                report.append("  Lot ID: ").append(lot.getId())
                      .append(", Size: ").append(lot.getSize())
                      .append(", Price: ").append(lot.getPrice())
                      .append(", Location: ").append(lot.getLocation())
                      .append(", Status: ").append(lot.getStatus()).append("\n");
            }
        }
        return report.toString();
    }

    public String generateSummaryReport() {
        int totalLots = 0, availableLots = 0, reservedLots = 0, soldLots = 0;
        
        for (Block block : subdivision.getBlocks()) {
            for (Lot lot : block.getLots()) {
                totalLots++;
                switch (lot.getStatus().toLowerCase()) {
                    case "available": availableLots++; break;
                    case "reserved": reservedLots++; break;
                    case "sold": soldLots++; break;
                }
            }
        }
        
        return "Summary Report:\n" +
               "Total Lots: " + totalLots + "\n" +
               "Available: " + availableLots + "\n" +
               "Reserved: " + reservedLots + "\n" +
               "Sold: " + soldLots + "\n";
    }
}
