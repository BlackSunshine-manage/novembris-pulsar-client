package novembris.pulsar.client;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

final class PulsarClientNovLogger {
    private final Logger logger = Logger.getLogger("novembris.pulsar.client.NovLoggablePulsarClient");
    private final String pulsarClientTraceId;
    PulsarClientNovLogger(String fileName, String pulsarClientTraceId) {
        this.pulsarClientTraceId = pulsarClientTraceId;
        try {
            FileHandler fh = new FileHandler(fileName + "." + pulsarClientTraceId +  ".log");
            logger.addHandler(fh);
            fh.setFormatter(new TimedFormatterLog());
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public void log(Level level, String message) {
        logger.log(level, "<" + pulsarClientTraceId + "> {" + level.getName() + "} ", message);
    }
}