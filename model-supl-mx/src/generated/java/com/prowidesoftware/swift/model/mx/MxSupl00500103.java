
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoDerivSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.005.001.03")
public class MxSupl00500103
    extends AbstractMX
{

    @XmlElement(name = "DTCCCANODerivSD1", required = true)
    protected DTCCCANODerivativeSD1V03 dtcccanoDerivSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionNotificationSD2 .class, DTCCCANODerivativeSD1V03 .class, DerivativeWorkflowStatus1Code.class, MxSupl00500103 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.005.001.03";

    public MxSupl00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00500103(final String xml) {
        this();
        MxSupl00500103 tmp = parse(xml);
        dtcccanoDerivSD1 = tmp.getDTCCCANODerivSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoDerivSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANODerivativeSD1V03 }
     *     
     */
    public DTCCCANODerivativeSD1V03 getDTCCCANODerivSD1() {
        return dtcccanoDerivSD1;
    }

    /**
     * Sets the value of the dtcccanoDerivSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANODerivativeSD1V03 }
     *     
     */
    public MxSupl00500103 setDTCCCANODerivSD1(DTCCCANODerivativeSD1V03 value) {
        this.dtcccanoDerivSD1 = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSupl00500103 parse(String xml) {
        return ((MxSupl00500103) MxReadImpl.parse(MxSupl00500103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00500103 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00500103) parserImpl.read(MxSupl00500103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSupl00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00500103 message
     * @return
     *     a new instance of MxSupl00500103
     */
    public final static MxSupl00500103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl00500103 .class);
    }

}
