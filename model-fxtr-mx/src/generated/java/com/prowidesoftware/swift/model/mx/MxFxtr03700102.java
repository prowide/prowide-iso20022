
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
 * Class for fxtr.037.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.02")
public class MxFxtr03700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfStsAdvc", required = true)
    protected ForeignExchangeTradeConfirmationStatusAdviceV02 fxTradConfStsAdvc;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification30 .class, AccountInformationType1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReferences2 .class, AddressType2Code.class, AgreedRate3 .class, AlternateIdentification1 .class, ClearingMethod1Code.class, Confirmation1 .class, ConfirmationRequest1Code.class, DeliveryType4Code.class, ForeignExchangeTradeConfirmationStatusAdviceV02 .class, FundIdentification6 .class, GenericIdentification32 .class, Header23 .class, IdentificationSource1Choice.class, IdentificationType1Code.class, IdentificationType2Code.class, InstrumentLeg7 .class, MessageIdentification1 .class, MxFxtr03700102 .class, NameAndAddress8 .class, OptionParty1Code.class, OptionParty3Code.class, PartyIdentification251Choice.class, PartyIdentification265 .class, PartyIdentification78 .class, PartyIdentification90 .class, PartyIdentificationAndAccount119 .class, PartyIdentificationType1Code.class, PartyType3Code.class, PartyType4Code.class, PostalAddress1 .class, SecurityIdentification18 .class, SecurityIdentification38Choice.class, SettlementDate8Code.class, Side1Code.class, SimpleIdentificationInformation4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Trade10 .class, Trade8 .class, TradeConfirmationStatus1Code.class, TradePartyIdentification10 .class, TradePartyIdentification9 .class, TradingMethodType1Code.class, TradingModeType1Code.class, UnderlyingProductIdentifier1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.02";

    public MxFxtr03700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03700102(final String xml) {
        this();
        MxFxtr03700102 tmp = parse(xml);
        fxTradConfStsAdvc = tmp.getFXTradConfStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceV02 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV02 getFXTradConfStsAdvc() {
        return fxTradConfStsAdvc;
    }

    /**
     * Sets the value of the fxTradConfStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceV02 }
     *     
     */
    public MxFxtr03700102 setFXTradConfStsAdvc(ForeignExchangeTradeConfirmationStatusAdviceV02 value) {
        this.fxTradConfStsAdvc = value;
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
    public static MxFxtr03700102 parse(String xml) {
        return ((MxFxtr03700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03700102 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03700102) parserImpl.read(MxFxtr03700102 .class, xml, _classes));
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
     * Creates an MxFxtr03700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03700102 message
     * @return
     *     a new instance of MxFxtr03700102
     */
    public static final MxFxtr03700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03700102 .class);
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
