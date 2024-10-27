package novembris.pulsar.client;

import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;

import java.util.logging.Level;

public final class NovLoggablePulsarClient extends NovPulsarClient {
    private final PulsarClient client;
    private final PulsarClientNovLogger logger;

    public NovLoggablePulsarClient(String logFileName, String... hosts) {
        super(hosts);
        logger = new PulsarClientNovLogger(logFileName);
        try {
            this.client = super.client.build();
        } catch (PulsarClientException e) {
            logger.log(Level.SEVERE, "Fatal error pulsar client can't be initialize, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}