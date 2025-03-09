import java.util.ArrayList;
import java.util.List;

public class Subdivision {
    private List<Block> blocks;

    public Subdivision() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public Lot searchLot(int id) {
        for (Block block : blocks) {
            for (Lot lot : block.getLots()) {
                if (lot.getId() == id) {
                    return lot;
                }
            }
        }
        return null; // Lot not found
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Subdivision Report:\n");
        for (Block block : blocks) {
            report.append("Block ").append(block.getBlockNumber()).append(":\n");
            for (Lot lot : block.getLots()) {
                report.append("  Lot ID: ").append(lot.getId())
                      .append(", Status: ").append(lot.getStatus())
                      .append(", Price: ").append(lot.getPrice())
                      .append(", Location: ").append(lot.getLocation())
                      .append("\n");
            }
        }
        return report.toString();
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
