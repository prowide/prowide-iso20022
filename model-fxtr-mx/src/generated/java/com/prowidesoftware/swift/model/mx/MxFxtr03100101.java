
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
 * Class for fxtr.031.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradCaptrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01")
public class MxFxtr03100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradCaptrRpt", required = true)
    protected ForeignExchangeTradeCaptureReportV01 fxTradCaptrRpt;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification30 .class, AccountInformationType1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReferences.class, AddressType2Code.class, AgreedRate3 .class, AlternateIdentification1 .class, AmountsAndValueDate4 .class, ClearingMethod1Code.class, CurrencyAndAmount.class, DataType1Code.class, DerivativeExerciseStatus1Code.class, ForeignExchangeTradeCaptureReportV01 .class, FundIdentification3 .class, GenericIdentification32 .class, Header23 .class, IdentificationSource1Choice.class, IdentificationType1Code.class, IdentificationType2Code.class, InstrumentLeg6 .class, MessageIdentification1 .class, MxFxtr03100101 .class, NameAndAddress8 .class, Option10 .class, OptionParty1Code.class, OptionParty3Code.class, OptionPayoutType1Code.class, OptionStyle2Code.class, OptionType1Code.class, OrderStatus8Code.class, PartyIdentification.class, PartyIdentification19Choice.class, PartyIdentification44 .class, PartyIdentification78 .class, PartyIdentification90 .class, PartyIdentificationAndAccount119 .class, PartyIdentificationType1Code.class, PartyType3Code.class, PartyType4Code.class, PostalAddress1 .class, PremiumAmount3 .class, PremiumQuote1Choice.class, SecurityIdentification18 .class, SecurityIdentification22Choice.class, SettlementDateCode.class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Trade1 .class, Trade3 .class, TradePartyIdentification7 .class, TradingMethodType1Code.class, TradingModeType1Code.class, UnderlyingProductIdentifier1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01";

    public MxFxtr03100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03100101(final String xml) {
        this();
        MxFxtr03100101 tmp = parse(xml);
        fxTradCaptrRpt = tmp.getFXTradCaptrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradCaptrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeCaptureReportV01 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 getFXTradCaptrRpt() {
        return fxTradCaptrRpt;
    }

    /**
     * Sets the value of the fxTradCaptrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeCaptureReportV01 }
     *     
     */
    public MxFxtr03100101 setFXTradCaptrRpt(ForeignExchangeTradeCaptureReportV01 value) {
        this.fxTradCaptrRpt = value;
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
    public static MxFxtr03100101 parse(String xml) {
        return ((MxFxtr03100101) MxReadImpl.parse(MxFxtr03100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03100101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03100101) parserImpl.read(MxFxtr03100101 .class, xml, _classes));
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
     * Creates an MxFxtr03100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03100101 message
     * @return
     *     a new instance of MxFxtr03100101
     */
    public final static MxFxtr03100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03100101 .class);
    }

}
