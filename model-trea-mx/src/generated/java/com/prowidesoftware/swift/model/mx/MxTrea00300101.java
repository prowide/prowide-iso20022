
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
 * Class for trea.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trea00300101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trea.003.001.01")
public class MxTrea00300101
    extends AbstractMX
{

    @XmlElement(name = "trea.003.001.01", required = true)
    protected Trea00300101 trea00300101;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, FundIdentification1 .class, MxTrea00300101 .class, NameAndAddress5 .class, NonDeliverableForwardValuationConditions1 .class, PartyIdentification7Choice.class, PostalAddress1 .class, TradeAgreement2 .class, TradePartyIdentification1 .class, Trea00300101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trea.003.001.01";

    public MxTrea00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00300101(final String xml) {
        this();
        MxTrea00300101 tmp = parse(xml);
        trea00300101 = tmp.getTrea00300101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trea00300101 property.
     * 
     * @return
     *     possible object is
     *     {@link Trea00300101 }
     *     
     */
    public Trea00300101 getTrea00300101() {
        return trea00300101;
    }

    /**
     * Sets the value of the trea00300101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trea00300101 }
     *     
     */
    public MxTrea00300101 setTrea00300101(Trea00300101 value) {
        this.trea00300101 = value;
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
    public static MxTrea00300101 parse(String xml) {
        return ((MxTrea00300101) MxReadImpl.parse(MxTrea00300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00300101 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00300101) parserImpl.read(MxTrea00300101 .class, xml, _classes));
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
     * Creates an MxTrea00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00300101 message
     * @return
     *     a new instance of MxTrea00300101
     */
    public final static MxTrea00300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea00300101 .class);
    }

}
