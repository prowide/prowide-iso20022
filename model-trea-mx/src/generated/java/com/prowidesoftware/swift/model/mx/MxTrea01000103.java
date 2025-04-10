
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
 * Class for trea.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "amdFXOptnV03"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.010.001.03")
public class MxTrea01000103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AmdFXOptnV03", required = true)
    protected AmendForeignExchangeOptionV03 amdFXOptnV03;
    public static final transient String BUSINESS_PROCESS = "trea";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmendForeignExchangeOptionV03 .class, AmountsAndValueDate4 .class, FundIdentification2 .class, MxTrea01000103 .class, NameAndAddress8 .class, Option5 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement2 .class, TradePartyIdentification4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.010.001.03";

    public MxTrea01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01000103(final String xml) {
        this();
        MxTrea01000103 tmp = parse(xml);
        amdFXOptnV03 = tmp.getAmdFXOptnV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the amdFXOptnV03 property.
     * 
     * @return
     *     possible object is
     *     {@link AmendForeignExchangeOptionV03 }
     *     
     */
    public AmendForeignExchangeOptionV03 getAmdFXOptnV03() {
        return amdFXOptnV03;
    }

    /**
     * Sets the value of the amdFXOptnV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendForeignExchangeOptionV03 }
     *     
     */
    public MxTrea01000103 setAmdFXOptnV03(AmendForeignExchangeOptionV03 value) {
        this.amdFXOptnV03 = value;
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
    public static MxTrea01000103 parse(String xml) {
        return ((MxTrea01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrea01000103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrea01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01000103 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01000103) parserImpl.read(MxTrea01000103 .class, xml, _classes));
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
     * Creates an MxTrea01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01000103 message
     * @return
     *     a new instance of MxTrea01000103
     */
    public static final MxTrea01000103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea01000103 .class);
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
