package dev.bermeb.jobqueues.domain.port.in;

import dev.bermeb.jobqueues.domain.model.Job;

public interface ProcessJob {

    /**
     * Process a job
     * @param job The job to be processed
     * @param messageId The ID of the Broker Message
     */
    void process(Job job, String messageId);

}