
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrCcyXchgRate"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.017.001.02")
public class MxCamt01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrCcyXchgRate", required = true)
    protected ReturnCurrencyExchangeRateV02 rtrCcyXchgRate;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CurrencyExchangeDetails.class, CurrencyExchangeInformation2 .class, CurrencyExchangeReport2 .class, CurrencyReferenceDetails.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, MessageIdentification.class, MxCamt01700102 .class, QueryReference.class, ReturnCurrencyExchangeRateV02 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.017.001.02";

    public MxCamt01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01700102(final String xml) {
        this();
        MxCamt01700102 tmp = parse(xml);
        rtrCcyXchgRate = tmp.getRtrCcyXchgRate();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrCcyXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCurrencyExchangeRateV02 }
     *     
     */
    public ReturnCurrencyExchangeRateV02 getRtrCcyXchgRate() {
        return rtrCcyXchgRate;
    }

    /**
     * Sets the value of the rtrCcyXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCurrencyExchangeRateV02 }
     *     
     */
    public MxCamt01700102 setRtrCcyXchgRate(ReturnCurrencyExchangeRateV02 value) {
        this.rtrCcyXchgRate = value;
        return this;
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
    public static MxCamt01700102 parse(String xml) {
        return ((MxCamt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01700102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01700102) parserImpl.read(MxCamt01700102 .class, xml, _classes));
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
     * Creates an MxCamt01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01700102 message
     * @return
     *     a new instance of MxCamt01700102
     */
    public static final MxCamt01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01700102 .class);
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

}
