
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
 * Class for trea.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cclFXOptnV02"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.011.001.02")
public class MxTrea01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CclFXOptnV02", required = true)
    protected CancelForeignExchangeOptionV02 cclFXOptnV02;
    public static final transient String BUSINESS_PROCESS = "trea";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate2 .class, CancelForeignExchangeOptionV02 .class, FundIdentification2 .class, MxTrea01100102 .class, NameAndAddress8 .class, Option3 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement2 .class, TradePartyIdentification4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.011.001.02";

    public MxTrea01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01100102(final String xml) {
        this();
        MxTrea01100102 tmp = parse(xml);
        cclFXOptnV02 = tmp.getCclFXOptnV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cclFXOptnV02 property.
     * 
     * @return
     *     possible object is
     *     {@link CancelForeignExchangeOptionV02 }
     *     
     */
    public CancelForeignExchangeOptionV02 getCclFXOptnV02() {
        return cclFXOptnV02;
    }

    /**
     * Sets the value of the cclFXOptnV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelForeignExchangeOptionV02 }
     *     
     */
    public MxTrea01100102 setCclFXOptnV02(CancelForeignExchangeOptionV02 value) {
        this.cclFXOptnV02 = value;
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
    public static MxTrea01100102 parse(String xml) {
        return ((MxTrea01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrea01100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrea01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01100102 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01100102) parserImpl.read(MxTrea01100102 .class, xml, _classes));
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
     * Creates an MxTrea01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01100102 message
     * @return
     *     a new instance of MxTrea01100102
     */
    public static final MxTrea01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea01100102 .class);
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
