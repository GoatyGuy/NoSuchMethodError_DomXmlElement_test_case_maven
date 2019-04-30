package de.sitefusion.workflows.spin;

import org.camunda.spin.impl.xml.dom.format.DomXmlDataFormat;
import org.camunda.spin.impl.xml.dom.format.DomXmlDataFormatMapper;
import org.camunda.spin.impl.xml.dom.format.DomXmlDataFormatReader;

/**
 * Eine für Sitefusion zugeschnittene Implementierung der Klasse {@link DomXmlDataFormat} von Spin/Camunda.
 * <br>
 * Überschreibt die Methode {@link DomXmlDataFormat#init()}, um als Writer die Klasse {@link SFDomXmlDataFormatWriter} zu setzen.
 */
public class SFDomXmlDataFormat extends DomXmlDataFormat {

    /** {@inheritDoc} */
    SFDomXmlDataFormat(final String name) {

        super(name);
    }

    /**
     * Implementiert als Writer die Klasse {@link SFDomXmlDataFormatWriter} anstatt {@link org.camunda.spin.impl.xml.dom.format.DomXmlDataFormatWriter}.
     */
    @Override
    protected void init() {

        this.reader = new DomXmlDataFormatReader(this);
        this.writer = new SFDomXmlDataFormatWriter(this);
        this.mapper = new DomXmlDataFormatMapper(this);
    }
}
