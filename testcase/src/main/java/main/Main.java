package main;

import de.sitefusion.workflows.spin.AbstractSFSpin;
import org.camunda.spin.xml.SpinXmlElement;

public class Main {

    public static void main(String[] args) {

        final SpinXmlElement xml = AbstractSFSpin.XML("<root></root>");
        System.out.println(xml);
    }
}
