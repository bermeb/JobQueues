package dev.bermeb.jobqueues.domain.port.in;

import dev.bermeb.jobqueues.domain.model.Job;

public interface SubmitJob {

    /**
     * Submits a job for processing
     * @param job The job to be submitted for processing
     */
    void submit(Job job);

}