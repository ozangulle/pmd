/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.metrics.impl;

import java.util.Map;

import net.sourceforge.pmd.lang.java.metrics.api.JavaClassMetricKey;
import net.sourceforge.pmd.lang.java.metrics.api.JavaOperationMetricKey;
import net.sourceforge.pmd.lang.java.metrics.impl.ClassFanOutMetric.ClassFanOutOption;
import net.sourceforge.pmd.lang.metrics.MetricOption;

/**
 * @author Andreas Pabst
 */
public class CfoTestRule extends AbstractMetricTestRule {

    @Override
    protected JavaClassMetricKey getClassKey() {
        return JavaClassMetricKey.CFO;
    }


    @Override
    protected JavaOperationMetricKey getOpKey() {
        return JavaOperationMetricKey.CFO;
    }

    @Override
    protected Map<String, MetricOption> optionMappings() {
        Map<String, MetricOption> mappings = super.optionMappings();
        mappings.put(ClassFanOutOption.INCLUDE_JAVA_LANG.valueName(), ClassFanOutOption.INCLUDE_JAVA_LANG);
        return mappings;
    }
}
