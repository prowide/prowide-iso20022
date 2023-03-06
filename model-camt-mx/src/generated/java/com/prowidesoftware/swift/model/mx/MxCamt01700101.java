
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01700101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.017.001.01")
public class MxCamt01700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.017.001.01", required = true)
    protected Camt01700101 camt01700101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt01700101 .class, CurrencyExchangeDetails.class, CurrencyExchangeInformation.class, CurrencyExchangeReport.class, CurrencyReferenceDetails.class, ErrorHandling2 .class, MessageIdentification.class, MxCamt01700101 .class, QueryReference.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.017.001.01";

    public MxCamt01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01700101(final String xml) {
        this();
        MxCamt01700101 tmp = parse(xml);
        camt01700101 = tmp.getCamt01700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01700101 }
     *     
     */
    public Camt01700101 getCamt01700101() {
        return camt01700101;
    }

    /**
     * Sets the value of the camt01700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01700101 }
     *     
     */
    public MxCamt01700101 setCamt01700101(Camt01700101 value) {
        this.camt01700101 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt01700101 parse(String xml) {
        return ((MxCamt01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01700101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01700101) parserImpl.read(MxCamt01700101 .class, xml, _classes));
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
     * Creates an MxCamt01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01700101 message
     * @return
     *     a new instance of MxCamt01700101
     */
    public final static MxCamt01700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01700101 .class);
    }

}
