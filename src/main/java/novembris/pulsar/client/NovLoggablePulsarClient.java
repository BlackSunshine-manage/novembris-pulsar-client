package novembris.pulsar.client;

import org.apache.pulsar.client.api.*;
import org.apache.pulsar.client.api.transaction.TransactionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;
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

    ProducerBuilder<byte[]> newProducer() {
        return client.newProducer();
    };

    <T> ProducerBuilder<T> newProducer(Schema<T> schema) {
        return client.newProducer(schema);
    };

    ConsumerBuilder<byte[]> newConsumer() {
        return newConsumer();
    };

    <T> ConsumerBuilder<T> newConsumer(Schema<T> schema) {
        return client.newConsumer(schema);
    };

    ReaderBuilder<byte[]> newReader() {
        return client.newReader();
    };

    <T> ReaderBuilder<T> newReader(Schema<T> schema) {
        return client.newReader(schema);
    };

    /** @deprecated */
    @Deprecated
    <T> TableViewBuilder<T> newTableViewBuilder(Schema<T> schema) {
        return client.newTableViewBuilder(schema);
    };

    TableViewBuilder<byte[]> newTableView() {
        return client.newTableView();
    };

    <T> TableViewBuilder<T> newTableView(Schema<T> schema) {
        return client.newTableView(schema);
    };

    void updateServiceUrl(String serviceUrl) throws PulsarClientException {
        client.updateServiceUrl(serviceUrl);
    };

    /** @deprecated */
    @Deprecated
    CompletableFuture<List<String>> getPartitionsForTopic(String topic) {
        return client.getPartitionsForTopic(topic, true);
    }

    CompletableFuture<List<String>> getPartitionsForTopic(String topic, boolean metadataAutoCreationEnabled) {
        return client.getPartitionsForTopic(topic, metadataAutoCreationEnabled);
    };

    void close() throws PulsarClientException {
        client.close();
    };

    CompletableFuture<Void> closeAsync() {
        return client.closeAsync();
    };

    void shutdown() throws PulsarClientException {
        client.shutdown();
    };

    boolean isClosed() {
        return client.isClosed();
    };

    TransactionBuilder newTransaction() {
        return client.newTransaction();
    };
}