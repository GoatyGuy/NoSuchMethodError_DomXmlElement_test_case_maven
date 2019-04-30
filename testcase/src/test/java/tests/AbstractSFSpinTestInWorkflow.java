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
package tests;

import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.runtimeService;

/**
 * I had problems building this test, so I kept it simple. So even if tests succeed, they actually aren't. Look at the logs, please.
 * <br><br>
 * Thank you very much in advance. :D
 */
public class AbstractSFSpinTestInWorkflow {

    @Rule
    public ProcessEngineRule rule = new ProcessEngineRule();

    /**
     * By checking the logs, one can see, that a {@link java.lang.NoSuchMethodException} occurs.
     */
    @Test
    @Deployment(resources = {"workflows/top.bpmn", "workflows/sub.bpmn"})
    public void abstractSFSpinTest_throwsException() {

        // Starting the process.
        runtimeService().startProcessInstanceByKey("top");
    }
}
