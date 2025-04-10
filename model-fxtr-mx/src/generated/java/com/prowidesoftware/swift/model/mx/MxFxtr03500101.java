
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
 * Class for fxtr.035.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfReqAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01")
public class MxFxtr03500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfReqAmdmntReq", required = true)
    protected ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 fxTradConfReqAmdmntReq;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 35;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification30 .class, AccountInformationType1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AlternateIdentification1 .class, ClearingMethod1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateFormat18Choice.class, DateType8Code.class, ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 .class, FundIdentification3 .class, GenericIdentification32 .class, Header23 .class, IdentificationSource1Choice.class, IdentificationType1Code.class, IdentificationType2Code.class, InstrumentLeg6 .class, MessageIdentification1 .class, MxFxtr03500101 .class, NameAndAddress8 .class, OptionParty1Code.class, OptionParty3Code.class, PartyIdentification19Choice.class, PartyIdentification44 .class, PartyIdentification78 .class, PartyIdentification90 .class, PartyIdentificationAndAccount119 .class, PartyIdentificationType1Code.class, PartyType3Code.class, PartyType4Code.class, Period4 .class, PostalAddress1 .class, QueryTradeStatus1Code.class, SecurityIdentification18 .class, SecurityIdentification22Choice.class, SettlementDateCode.class, Side1Code.class, SimpleIdentificationInformation4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Trade2 .class, Trade3 .class, TradePartyIdentification7 .class, TradingMethodType1Code.class, TradingModeType1Code.class, UnderlyingProductIdentifier1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01";

    public MxFxtr03500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03500101(final String xml) {
        this();
        MxFxtr03500101 tmp = parse(xml);
        fxTradConfReqAmdmntReq = tmp.getFXTradConfReqAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfReqAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 getFXTradConfReqAmdmntReq() {
        return fxTradConfReqAmdmntReq;
    }

    /**
     * Sets the value of the fxTradConfReqAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 }
     *     
     */
    public MxFxtr03500101 setFXTradConfReqAmdmntReq(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 value) {
        this.fxTradConfReqAmdmntReq = value;
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
    public static MxFxtr03500101 parse(String xml) {
        return ((MxFxtr03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03500101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03500101) parserImpl.read(MxFxtr03500101 .class, xml, _classes));
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
     * Creates an MxFxtr03500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03500101 message
     * @return
     *     a new instance of MxFxtr03500101
     */
    public static final MxFxtr03500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03500101 .class);
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
