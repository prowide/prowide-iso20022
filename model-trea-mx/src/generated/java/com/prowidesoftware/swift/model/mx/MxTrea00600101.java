
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
 * Class for trea.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trea00600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trea.006.001.01")
public class MxTrea00600101
    extends AbstractMX
{

    @XmlElement(name = "trea.006.001.01", required = true)
    protected Trea00600101 trea00600101;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, FundIdentification1 .class, MxTrea00600101 .class, NameAndAddress5 .class, PartyIdentification7Choice.class, PostalAddress1 .class, TradeAgreement2 .class, TradePartyIdentification1 .class, Trea00600101 .class, ValuationData1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trea.006.001.01";

    public MxTrea00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00600101(final String xml) {
        this();
        MxTrea00600101 tmp = parse(xml);
        trea00600101 = tmp.getTrea00600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trea00600101 property.
     * 
     * @return
     *     possible object is
     *     {@link Trea00600101 }
     *     
     */
    public Trea00600101 getTrea00600101() {
        return trea00600101;
    }

    /**
     * Sets the value of the trea00600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trea00600101 }
     *     
     */
    public MxTrea00600101 setTrea00600101(Trea00600101 value) {
        this.trea00600101 = value;
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
    public static MxTrea00600101 parse(String xml) {
        return ((MxTrea00600101) MxReadImpl.parse(MxTrea00600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00600101 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00600101) parserImpl.read(MxTrea00600101 .class, xml, _classes));
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
     * Creates an MxTrea00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00600101 message
     * @return
     *     a new instance of MxTrea00600101
     */
    public final static MxTrea00600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea00600101 .class);
    }

}
