
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
 * Class for trea.012.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxOptnNtfctnV04"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.012.001.04")
public class MxTrea01200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXOptnNtfctnV04", required = true)
    protected ForeignExchangeOptionNotificationV04 fxOptnNtfctnV04;
    public static final transient String BUSINESS_PROCESS = "trea";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate5 .class, ForeignExchangeOptionNotificationV04 .class, FundIdentification2 .class, MxTrea01200104 .class, NameAndAddress8 .class, Option6 .class, OptionData4 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementData2 .class, SettlementStatus1Code.class, SettlementType1Code.class, TradePartyIdentification4 .class, TradeStatus1 .class, TradeStatus1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.012.001.04";

    public MxTrea01200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01200104(final String xml) {
        this();
        MxTrea01200104 tmp = parse(xml);
        fxOptnNtfctnV04 = tmp.getFXOptnNtfctnV04();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxOptnNtfctnV04 property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeOptionNotificationV04 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 getFXOptnNtfctnV04() {
        return fxOptnNtfctnV04;
    }

    /**
     * Sets the value of the fxOptnNtfctnV04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeOptionNotificationV04 }
     *     
     */
    public MxTrea01200104 setFXOptnNtfctnV04(ForeignExchangeOptionNotificationV04 value) {
        this.fxOptnNtfctnV04 = value;
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
    public static MxTrea01200104 parse(String xml) {
        return ((MxTrea01200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrea01200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrea01200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea01200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01200104 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01200104) parserImpl.read(MxTrea01200104 .class, xml, _classes));
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
     * Creates an MxTrea01200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01200104 message
     * @return
     *     a new instance of MxTrea01200104
     */
    public static final MxTrea01200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea01200104 .class);
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
