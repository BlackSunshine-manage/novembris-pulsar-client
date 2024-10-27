package novembris.pulsar.client;

import org.apache.pulsar.client.api.ClientBuilder;
import org.apache.pulsar.client.api.PulsarClient;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class NovPulsarClient implements QueueClient {
    final ClientBuilder client;
    final String hosts;

    public NovPulsarClient(String... hosts) {
        this.hosts = Arrays.stream(hosts)
                .filter(Objects::nonNull)
                .filter(Predicate.not(String::isBlank))
                .filter(host -> host.contains(":"))
                .collect(Collectors.joining(","));
        this.client = PulsarClient.builder()
                .serviceUrl("pulsar://" + this.hosts);
    }
}