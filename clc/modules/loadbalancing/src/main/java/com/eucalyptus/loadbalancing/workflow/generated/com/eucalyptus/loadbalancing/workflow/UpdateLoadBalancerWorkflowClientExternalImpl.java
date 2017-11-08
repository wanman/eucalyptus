/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternalBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class UpdateLoadBalancerWorkflowClientExternalImpl extends WorkflowClientExternalBase implements UpdateLoadBalancerWorkflowClientExternal {

    public UpdateLoadBalancerWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, 
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

    @Override
    public void updateLoadBalancer(String accountId, String loadbalancer) { 
        updateLoadBalancer(accountId, loadbalancer, null);
    }

    @Override
    public void updateLoadBalancer(String accountId, String loadbalancer, StartWorkflowOptions startOptionsOverride) {
    
        Object[] _arguments_ = new Object[2]; 
        _arguments_[0] = accountId;
        _arguments_[1] = loadbalancer;
        dynamicWorkflowClient.startWorkflowExecution(_arguments_, startOptionsOverride);
    }

    @Override
    public void updateImmediately() {
        Object[] _arguments_ = new Object[0];
        dynamicWorkflowClient.signalWorkflowExecution("updateImmediately", _arguments_);
    }

}