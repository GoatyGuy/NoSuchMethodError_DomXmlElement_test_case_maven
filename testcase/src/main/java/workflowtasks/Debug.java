package workflowtasks;

import de.sitefusion.workflows.spin.AbstractSFSpin;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.xml.SpinXmlElement;

/**
 * The service task parses a XML-String and saves it in the execution.
 */
public class Debug implements JavaDelegate {

    @Override
    public void execute(final DelegateExecution execution) {

        final SpinXmlElement xml = AbstractSFSpin.XML("<root></root>");
        execution.setVariable("xml", xml);
    }
}
