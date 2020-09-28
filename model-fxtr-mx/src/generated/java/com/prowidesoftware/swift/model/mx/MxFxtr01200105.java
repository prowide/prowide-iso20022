
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
 * Class for fxtr.012.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxOptnNtfctnV05"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.012.001.05")
public class MxFxtr01200105
    extends AbstractMX
{

    @XmlElement(name = "FXOptnNtfctnV05", required = true)
    protected ForeignExchangeOptionNotificationV05 fxOptnNtfctnV05;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate5 .class, ForeignExchangeOptionNotificationV05 .class, FundIdentification2 .class, MxFxtr01200105 .class, NameAndAddress8 .class, Option6 .class, OptionData4 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementData2 .class, SettlementStatus1Code.class, SettlementType1Code.class, TradePartyIdentification4 .class, TradeStatus1 .class, TradeStatus1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:fxtr.012.001.05";

    public MxFxtr01200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01200105(final String xml) {
        this();
        MxFxtr01200105 tmp = parse(xml);
        fxOptnNtfctnV05 = tmp.getFXOptnNtfctnV05();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxOptnNtfctnV05 property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeOptionNotificationV05 }
     *     
     */
    public ForeignExchangeOptionNotificationV05 getFXOptnNtfctnV05() {
        return fxOptnNtfctnV05;
    }

    /**
     * Sets the value of the fxOptnNtfctnV05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeOptionNotificationV05 }
     *     
     */
    public MxFxtr01200105 setFXOptnNtfctnV05(ForeignExchangeOptionNotificationV05 value) {
        this.fxOptnNtfctnV05 = value;
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
    public static MxFxtr01200105 parse(String xml) {
        return ((MxFxtr01200105) MxReadImpl.parse(MxFxtr01200105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01200105 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01200105) parserImpl.read(MxFxtr01200105 .class, xml, _classes));
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
     * Creates an MxFxtr01200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01200105 message
     * @return
     *     a new instance of MxFxtr01200105
     */
    public final static MxFxtr01200105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxFxtr01200105 .class);
    }

}
