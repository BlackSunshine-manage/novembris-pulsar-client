package novembris.pulsar.client;

import org.junit.jupiter.api.Test;

class NovPulsarClientTest {
    @Test
    void createWithMultipleHosts_correctlyCreateWithOne() {
        var client = new NovPulsarClient("localhost:8080");
        assert client.hosts.equals("localhost:8080");
    }

    @Test
    void createWithMultipleHosts_correctlyCreateWithMultipleHosts() {
        var client = new NovPulsarClient("localhost:8080", "127.0.0.1:8090");
        assert client.hosts.equals("localhost:8080,127.0.0.1:8090");
    }

    @Test
    void createWithMultipleHosts_correctlyCreateWithMultipleHostsAndNull() {
        var client = new NovPulsarClient("localhost:8080", null, "127.0.0.1:8090");
        assert client.hosts.equals("localhost:8080,127.0.0.1:8090");
    }

    @Test
    void createWithMultipleHosts_correctlyCreateWithMultipleHostsAndBlank() {
        var client = new NovPulsarClient("localhost:8080", "  ", "127.0.0.1:8090");
        assert client.hosts.equals("localhost:8080,127.0.0.1:8090");
    }

    @Test
    void createWithMultipleHosts_correctlyCreateWithMultipleHostsAndNotContainSemicolon() {
        var client = new NovPulsarClient("localhost:8080", "127.0.0.1 8030", "127.0.0.1:8090");
        assert client.hosts.equals("localhost:8080,127.0.0.1:8090");
    }
}