package de.sitefusion.workflows.spin;

import org.camunda.spin.impl.xml.dom.format.DomXmlDataFormatWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

/**
 * Eine für Sitefusion zugeschnittene Implementierung der Klasse {@link DomXmlDataFormatWriter} von Spin/Camunda.
 * <br>
 * Überschreibt die Methode {@link DomXmlDataFormatWriter#getTransformer()}, damit der zurückgegebene Transformer keine Einrückungen im XML erzeugt.
 */
public class SFDomXmlDataFormatWriter extends DomXmlDataFormatWriter {

    /** {@inheritDoc} */
    SFDomXmlDataFormatWriter(final SFDomXmlDataFormat sfDomXmlDataFormat) {

        super(sfDomXmlDataFormat);
    }

    /**
     * {@inheritDoc}
     * <br>
     * Der Transformer erzeugt keine Einrückungen im XML.
     */
    @Override
    protected Transformer getTransformer() {

        final TransformerFactory transformerFactory = domXmlDataFormat.getTransformerFactory();
        try {
            final Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            return transformer;
        } catch (final TransformerConfigurationException e) {
            throw LOG.unableToCreateTransformer(e);
        }
    }
}
