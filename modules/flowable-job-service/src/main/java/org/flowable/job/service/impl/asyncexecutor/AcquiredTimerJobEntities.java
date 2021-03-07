/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.job.service.impl.asyncexecutor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.flowable.job.service.impl.persistence.entity.TimerJobEntity;

/**
 * @author Tijs Rademakers
 */
public class AcquiredTimerJobEntities {

    protected List<TimerJobEntity> acquiredJobs;

    public AcquiredTimerJobEntities() {
        this.acquiredJobs = new ArrayList<>();
    }

    public AcquiredTimerJobEntities(List<TimerJobEntity> acquiredJobs) {
        this.acquiredJobs = acquiredJobs;
    }

    public void addJob(TimerJobEntity job) {
        acquiredJobs.add(job);
    }

    public Collection<TimerJobEntity> getJobs() {
        return acquiredJobs;
    }

    public int size() {
        return acquiredJobs.size();
    }
}
