package org.hobbit.controller.kubernetes.fabric8;

import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;


public interface Deployer {

    Deployment loadDeployment(String yaml_file);

    Deployment loadDeployment(String name, String namespace);

    Deployment createDeployment(String name, String deployLabel1, String deployLabel2,
                                String container, String image, String specLabel1, String specLabel2,
                                String namespace, int replicaCount);

    Deployment createOrReplace(Deployment deployObj, String namespace);


    //Deployment createOrReplace(Deployment deployObj, String namespace, int replicas, List<String> labels, List<String> specLabels);

    DeploymentList getDeployments(String namespace);

    DeploymentList getDeployments(String namespace, String label1, String label2);

    Deployment scaleReplicas(String name, String namespace, int replicas);

    Boolean deleteDeployment(String namespace, String name );

    void scaleDeployment(String namespace, String name, int scale);

    void getDeploymentLogs(String namespace, String name);


}
