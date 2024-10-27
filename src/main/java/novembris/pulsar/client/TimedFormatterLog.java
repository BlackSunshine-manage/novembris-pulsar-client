package novembris.pulsar.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class TimedFormatterLog extends Formatter {
    @Override
    public String format(LogRecord record) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String logTime = sdf.format(new Date(record.getMillis()));
        String className = record.getSourceClassName();
        return "[" + logTime + "]    " + className + " :  " + record.getMessage() + "\n";
    }
}