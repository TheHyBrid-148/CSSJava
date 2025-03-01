import java.util.ArrayList;
import java.util.List;

public class Subdivision {
    private List<Block> blocks; 

    public Subdivision() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(Block block) {
        if (block != null) {
            blocks.add(block);
        }
    }


    public Lot searchLot(int id) {
        for (Block block : blocks) {
            Lot foundLot = block.findLotById(id);
            if (foundLot != null) {
                return foundLot; 
            }
        }
        return null; 
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Subdivision Report:\n");
        report.append("------------------\n");

        for (Block block : blocks) {
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

   
    public List<Block> getBlocks() {
        return blocks;
    }
}



