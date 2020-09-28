
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
 * Class for trea.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trea01100101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trea.011.001.01")
public class MxTrea01100101
    extends AbstractMX
{

    @XmlElement(name = "trea.011.001.01", required = true)
    protected Trea01100101 trea01100101;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate2 .class, FundIdentification1 .class, MxTrea01100101 .class, NameAndAddress5 .class, Option2 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification7Choice.class, PostalAddress1 .class, PremiumAmount1 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement2 .class, TradePartyIdentification2 .class, Trea01100101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trea.011.001.01";

    public MxTrea01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01100101(final String xml) {
        this();
        MxTrea01100101 tmp = parse(xml);
        trea01100101 = tmp.getTrea01100101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trea01100101 property.
     * 
     * @return
     *     possible object is
     *     {@link Trea01100101 }
     *     
     */
    public Trea01100101 getTrea01100101() {
        return trea01100101;
    }

    /**
     * Sets the value of the trea01100101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trea01100101 }
     *     
     */
    public MxTrea01100101 setTrea01100101(Trea01100101 value) {
        this.trea01100101 = value;
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
    public static MxTrea01100101 parse(String xml) {
        return ((MxTrea01100101) MxReadImpl.parse(MxTrea01100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01100101 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01100101) parserImpl.read(MxTrea01100101 .class, xml, _classes));
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
     * Creates an MxTrea01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01100101 message
     * @return
     *     a new instance of MxTrea01100101
     */
    public final static MxTrea01100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea01100101 .class);
    }

}
