package novembris.pulsar.client;

import org.apache.pulsar.client.api.*;
import org.apache.pulsar.client.api.transaction.TransactionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;

public final class NovTracedPulsarClient extends NovLoggablePulsarClient {
    public NovTracedPulsarClient(String logFileName,
                                 String pulsarClientTraceId,
                                 String... hosts) {
        super(logFileName, pulsarClientTraceId, hosts);
    }

    @Override
    ProducerBuilder<byte[]> newProducer() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newProducer()'");
        ProducerBuilder<byte[]> returned = super.newProducer();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newProducer()'" + returned.toString());
        return returned;
    }

    @Override
    <T> ProducerBuilder<T> newProducer(Schema<T> schema) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newProducer(Schema<T> schema)'");
        ProducerBuilder<T> returned = super.newProducer(schema);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newProducer(Schema<T> schema)'" + returned.toString());
        return returned;
    }

    @Override
    ConsumerBuilder<byte[]> newConsumer() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newConsumer()'");
        ConsumerBuilder<byte[]> returned = super.newConsumer();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newConsumer()'" + returned.toString());
        return returned;
    }

    @Override
    <T> ConsumerBuilder<T> newConsumer(Schema<T> schema) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newConsumer(Schema<T> schema)'");
        ConsumerBuilder<T> returned = super.newConsumer(schema);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newConsumer(Schema<T> schema)'" + returned.toString());
        return returned;
    }

    @Override
    ReaderBuilder<byte[]> newReader() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newReader()'");
        ReaderBuilder<byte[]> returned = super.newReader();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newReader()'" + returned.toString());
        return returned;
    }

    @Override
    <T> ReaderBuilder<T> newReader(Schema<T> schema) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newReader(Schema<T> schema)'");
        ReaderBuilder<T> returned = super.newReader(schema);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newReader(Schema<T> schema)'" + returned.toString());
        return returned;
    }

    @Override
    <T> TableViewBuilder<T> newTableViewBuilder(Schema<T> schema) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newTableViewBuilder(Schema<T> schema)'");
        TableViewBuilder<T> returned = super.newTableViewBuilder(schema);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newTableViewBuilder(Schema<T> schema)'" + returned.toString());
        return returned;
    }

    @Override
    TableViewBuilder<byte[]> newTableView() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newTableView()'");
        TableViewBuilder<byte[]> returned = super.newTableView();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newTableView()'" + returned.toString());
        return returned;
    }

    @Override
    <T> TableViewBuilder<T> newTableView(Schema<T> schema) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newTableView(Schema<T> schema)'");
        TableViewBuilder<T> returned = super.newTableView(schema);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newTableView(Schema<T> schema)'" + returned.toString());
        return returned;
    }

    @Override
    void updateServiceUrl(String serviceUrl) throws PulsarClientException {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'updateServiceUrl(String serviceUrl)'");
        super.updateServiceUrl(serviceUrl);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'updateServiceUrl(String serviceUrl)'");
    }

    @Override
    CompletableFuture<List<String>> getPartitionsForTopic(String topic) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'getPartitionsForTopic(String topic)'");
        CompletableFuture<List<String>> returned = super.getPartitionsForTopic(topic);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'getPartitionsForTopic(String topic)'" + returned.toString());
        return returned;
    }

    @Override
    CompletableFuture<List<String>> getPartitionsForTopic(String topic, boolean metadataAutoCreationEnabled) {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'getPartitionsForTopic(String topic, boolean metadataAutoCreationEnabled)'");
        CompletableFuture<List<String>> returned = super.getPartitionsForTopic(topic, metadataAutoCreationEnabled);
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'getPartitionsForTopic(String topic, boolean metadataAutoCreationEnabled)'" + returned.toString());
        return returned;
    }

    @Override
    void close() throws PulsarClientException {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'close()'");
        super.close();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'close()'");
    }

    @Override
    CompletableFuture<Void> closeAsync() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'closeAsync()'");
        var Void = super.closeAsync();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'closeAsync()'");
        return Void;
    }

    @Override
    void shutdown() throws PulsarClientException {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'shutdown()'");
        super.shutdown();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'shutdown()'");
    }

    @Override
    boolean isClosed() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'isClosed()'");
        boolean returned = super.isClosed();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'isClosed()'" + returned);
        return returned;
    }

    @Override
    TransactionBuilder newTransaction() {
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] call a 'newTransaction()'");
        TransactionBuilder returned = super.newTransaction();
        logger.log(Level.INFO, "Pulsar client with hosts: [" + hosts + "] return call a 'newTransaction()'" + returned);
        return returned;
    }
}