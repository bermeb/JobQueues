package dev.bermeb.jobqueues.domain.port.out;

import dev.bermeb.jobqueues.domain.model.Job;

public interface ProcessJobPort {

    /**
     * Returns the type of jobs the process can run
     */
    String getType();

    /**
     * Runs the domain-specific logic
     * @param job The job to process
     */
    void process(Job job) throws Exception;

}