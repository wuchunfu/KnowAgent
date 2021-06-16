package com.didichuxing.datachannel.swan.agent.engine.metrics.source;

import com.didichuxing.datachannel.metrics.MetricsBuilder;
import com.didichuxing.datachannel.metrics.MetricsSource;
import com.didichuxing.datachannel.metrics.lib.MetricsRegistry;
import com.didichuxing.datachannel.swan.agent.engine.metrics.MetricService;
import com.didichuxing.tunnel.util.log.ILog;
import com.didichuxing.tunnel.util.log.LogFactory;

/**
 * @author jinbinbin
 * @version $Id: ReceiveInstrumentation.java, v 0.1 2017年10月01日 22:54 jinbinbin Exp $
 */
public class AbstractStatistics implements MetricsSource {

    private static final ILog LOGGER = LogFactory.getLog(AbstractStatistics.class.getName());

    protected String          name;
    protected MetricsRegistry metricsRegistry;

    public AbstractStatistics(String name) {
        super();
        this.name = MetricService.NAME + "_" + name + "_MBean";
        metricsRegistry = new MetricsRegistry(name);
    }

    public void init() {
        LOGGER.info("init metric " + this.name);
        // 只会根据metricSetName注册一次，第二次无效
        MetricService.registerSrc(name, null, this);
        LOGGER.info("init metric " + this.name + " success!");
    }

    public void destory() {
        LOGGER.info("destory metric " + this.name);
        MetricService.unRegisterSrc(name);
        LOGGER.info("destroy metric " + this.name + " success!");
    }

    @Override
    public void getMetrics(MetricsBuilder builder, boolean all) {
        metricsRegistry.snapshot(builder.addRecord(metricsRegistry.name()), true);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractStatistics other = (AbstractStatistics) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}