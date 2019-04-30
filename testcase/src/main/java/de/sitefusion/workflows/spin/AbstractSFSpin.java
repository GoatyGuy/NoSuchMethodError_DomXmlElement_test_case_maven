package de.sitefusion.workflows.spin;

import org.camunda.spin.Spin;
import org.camunda.spin.SpinFactory;
import org.camunda.spin.xml.SpinXmlElement;

/**
 * Eine für Sitefusion zugeschnittene Implementierung der Klasse {@link Spin} von Spin/Camunda.
 * <br>
 * Überschreibt die Methode {@link Spin#XML(Object)},
 * um aus dem übergebenen {@link Object} mit dem {@link SFDomXmlDataFormat} ein für Sitefusion zugeschnittenes {@link SpinXmlElement} zu erstellen.
 * <br>
 * Wird für das {@link SpinXmlElement} die Methode {@link SpinXmlElement#toString()} aufgerufen, so ist das XML im zurückgegebenen {@link String} nicht eingerückt.
 *
 * @param <T> Generischer Typ für die Erweiterung von {@link Spin}.
 */
public abstract class AbstractSFSpin<T extends Spin<?>> extends Spin<T> {

    /**
     * Erzeugt aus dem übergebenen Objekt ein für Sitefusion zugeschnittenes {@link SpinXmlElement}.
     * <br>
     * Wird für das {@link SpinXmlElement} die Methode {@link SpinXmlElement#toString()} aufgerufen, so ist das XML im zurückgegebenen {@link String} nicht eingerückt.
     *
     * @param input Das Objekt, welches in ein {@link SpinXmlElement} umgewandelt werden soll.
     * @return Das erstellte {@link SpinXmlElement}.
     */
    // @SuppressWarnings({"squid:S00100"}): Dieser Methodenname musste so übernommen werden,
    // da die gleichnamige Methode in der Super Klasse von dieser ersetzt werden soll.
    @SuppressWarnings({"squid:S00100"})
    public static SpinXmlElement XML(final Object input) {

        return SpinFactory.INSTANCE.createSpin(input, SFDomXmlDataFormatProvider.SF_DATA_FORMAT_NAME);
    }
}
