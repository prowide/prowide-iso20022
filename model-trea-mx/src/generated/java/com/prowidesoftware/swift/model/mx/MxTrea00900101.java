
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for trea.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trea00900101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trea.009.001.01")
public class MxTrea00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "trea.009.001.01", required = true)
    protected Trea00900101 trea00900101;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate2 .class, FundIdentification1 .class, MxTrea00900101 .class, NameAndAddress5 .class, Option2 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification7Choice.class, PostalAddress1 .class, PremiumAmount1 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement1 .class, TradePartyIdentification2 .class, Trea00900101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trea.009.001.01";

    public MxTrea00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00900101(final String xml) {
        this();
        MxTrea00900101 tmp = parse(xml);
        trea00900101 = tmp.getTrea00900101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trea00900101 property.
     * 
     * @return
     *     possible object is
     *     {@link Trea00900101 }
     *     
     */
    public Trea00900101 getTrea00900101() {
        return trea00900101;
    }

    /**
     * Sets the value of the trea00900101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trea00900101 }
     *     
     */
    public MxTrea00900101 setTrea00900101(Trea00900101 value) {
        this.trea00900101 = value;
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
    public static MxTrea00900101 parse(String xml) {
        return ((MxTrea00900101) MxReadImpl.parse(MxTrea00900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00900101 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00900101) parserImpl.read(MxTrea00900101 .class, xml, _classes));
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
     * Creates an MxTrea00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00900101 message
     * @return
     *     a new instance of MxTrea00900101
     */
    public final static MxTrea00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea00900101 .class);
    }

}
