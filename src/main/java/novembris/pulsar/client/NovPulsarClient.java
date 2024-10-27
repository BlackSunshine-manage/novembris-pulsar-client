package novembris.pulsar.client;

import org.apache.pulsar.client.api.ClientBuilder;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;

class NovPulsarClient implements QueueClient {
    final ClientBuilder client;

    public NovPulsarClient(String... hosts) {
            this.client = PulsarClient.builder()
                    .serviceUrl("pulsar://localhost:6650");
    }
}