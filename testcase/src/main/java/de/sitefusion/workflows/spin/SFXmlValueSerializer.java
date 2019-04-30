package de.sitefusion.workflows.spin;

import org.camunda.spin.plugin.impl.XmlValueSerializer;

/**
 * Eine für Sitefusion zugeschnittene Implementierung der Klasse {@link XmlValueSerializer} von Spin/Camunda.
 * <br>
 * Dieser Serialzer serialisiert das Datenformat {@link SFDomXmlDataFormat}.
 * Es muss keine Änderung gegenüber der Serialisierung der Superklasse vorgenommen werden, da die Inhalte gleich verarbeitet werden.
 * Es ist nur eine Verbindung zwischen dem Serializer und dem oben genannten Datenformat nötig.
 */
public class SFXmlValueSerializer extends XmlValueSerializer {

    /**
     * Konstruktor, der das {@link SFDomXmlDataFormat} an den Konstruktor des {@link XmlValueSerializer} übergibt.
     */
    public SFXmlValueSerializer() {

        super(new SFDomXmlDataFormat(SFDomXmlDataFormatProvider.SF_DATA_FORMAT_NAME));
    }
}
