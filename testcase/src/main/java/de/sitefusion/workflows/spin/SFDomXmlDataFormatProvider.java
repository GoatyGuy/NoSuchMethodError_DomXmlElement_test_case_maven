package de.sitefusion.workflows.spin;

import org.camunda.spin.impl.xml.dom.format.DomXmlDataFormatProvider;
import org.camunda.spin.spi.DataFormat;

/**
 * Eine für Sitefusion zugeschnittene Implementierung der Klasse {@link DomXmlDataFormatProvider} von Spin/Camunda.
 * <br>
 * Überschreibt die Methoden...
 * <br>
 * - {@link DomXmlDataFormatProvider#getDataFormatName()}: Gibt den individuellen Bezeichner {@link SFDomXmlDataFormatProvider#SF_DATA_FORMAT_NAME} zurück.
 * <br>
 * - {@link DomXmlDataFormatProvider#createInstance()}: Erstellt eine neue Instanz der Klasse {@link SFDomXmlDataFormat} mit deren eindeutigen Bezeichner.
 */
public class SFDomXmlDataFormatProvider extends DomXmlDataFormatProvider {

    /**
     * Der eindeutige Bezeichner für das {@link SFDomXmlDataFormat}.
     */
    static final String SF_DATA_FORMAT_NAME = "sitefusion/xml";

    /**
     * Gibt den individuellen Bezeichner {@link SFDomXmlDataFormatProvider#SF_DATA_FORMAT_NAME} zurück.
     *
     * @return {@link SFDomXmlDataFormatProvider#SF_DATA_FORMAT_NAME}.
     */
    @Override
    public String getDataFormatName() {

        return SF_DATA_FORMAT_NAME;
    }

    /**
     * Erstellt eine neue Instanz der Klasse {@link SFDomXmlDataFormat} mit deren eindeutigen Bezeichner.
     *
     * @return Eine neue Instanz der Klasse {@link SFDomXmlDataFormat}.
     */
    @Override
    public DataFormat<?> createInstance() {

        return new SFDomXmlDataFormat(SF_DATA_FORMAT_NAME);
    }
}
