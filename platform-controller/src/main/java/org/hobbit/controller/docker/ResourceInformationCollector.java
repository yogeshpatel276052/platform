package org.hobbit.controller.docker;

import org.hobbit.controller.data.SetupHardwareInformation;
import org.hobbit.core.data.usage.ResourceUsageInformation;
import com.spotify.docker.client.messages.swarm.Service.Criteria;

/**
 * A class that can collect resource usage information.
 *
 * @author Michael R&ouml;der (michael.roeder@uni-paderborn.de)
 *
 */
public interface ResourceInformationCollector {

    public ResourceUsageInformation getSystemUsageInformation();

    public ResourceUsageInformation getUsageInformation(Criteria criteria);

    public SetupHardwareInformation getHardwareInformation();

}
