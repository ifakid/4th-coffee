import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private Chunk chunk;
    private String chunkDataFilename;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunkDataFilename = chunkDataFilename;
        this.chunk = chunk;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
        try {
            CSVReader reader = new CSVReader(chunkDataFilename,",");
            reader.setSkipHeader(true);

            List<String[]> read = reader.read();
            for (String[] row: read){
                chunk.addTree(new Position(Integer.parseInt(row[0]),Integer.parseInt(row[1])));
            }
        } catch (IOException e) {

        }
    }
}