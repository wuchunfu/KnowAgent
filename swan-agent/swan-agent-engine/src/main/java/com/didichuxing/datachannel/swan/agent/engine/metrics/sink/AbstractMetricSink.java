package com.didichuxing.datachannel.swan.agent.engine.metrics.sink;

import org.apache.commons.configuration.SubsetConfiguration;

import com.didichuxing.datachannel.metrics.MetricsSink;
import com.didichuxing.datachannel.swan.agent.common.configs.v2.MetricConfig;
import com.didichuxing.tunnel.util.log.ILog;
import com.didichuxing.tunnel.util.log.LogFactory;

/**
 * @author jinbinbin
 * @version $Id: AbstractMetricSink.java, v 0.1 2017年05月16日 20:19 jinbinbin Exp $
 */
public abstract class AbstractMetricSink implements MetricsSink {

    private static final ILog LOGGER = LogFactory.getLog(AbstractMetricSink.class.getName());

    protected MetricConfig    metricConfig;

    public AbstractMetricSink(MetricConfig metricConfig) {
        this.metricConfig = metricConfig;
    }

    @Override
    public void init(SubsetConfiguration conf) {
    }

    @Override
    public void flush() {
    }

    public abstract void sendMetrics(String content);

    public abstract void stop();

    public abstract void onChange(MetricConfig metricConfig);
}
