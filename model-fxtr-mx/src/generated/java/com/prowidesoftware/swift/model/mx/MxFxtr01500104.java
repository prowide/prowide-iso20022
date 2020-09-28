
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
 * Class for fxtr.015.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradInstrAmdmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.04")
public class MxFxtr01500104
    extends AbstractMX
{

    @XmlElement(name = "FXTradInstrAmdmnt", required = true)
    protected ForeignExchangeTradeInstructionAmendmentV04 fxTradInstrAmdmnt;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AgreementConditions1 .class, AllocationIndicator1Code.class, AmountsAndValueDate1 .class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, ContactInformation1 .class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting1 .class, DateAndDateTimeChoice.class, ForeignExchangeTradeInstructionAmendmentV04 .class, FundIdentification4 .class, GeneralInformation5 .class, IdentificationSource3Choice.class, MatchingSystemReference1Choice.class, MxFxtr01500104 .class, NDFOpeningFixing1Choice.class, NameAndAddress8 .class, NonDeliverableForwardConditions1 .class, OpeningConditions1 .class, OtherIdentification1 .class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification60 .class, PartyIdentification73Choice.class, PostalAddress1 .class, RegulatoryReporting6 .class, SecurityIdentification19 .class, SettlementParties29 .class, SettlementRateSource1 .class, SideIndicator1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAgreement15 .class, TradePartyIdentification6 .class, Trading1MethodCode.class, TradingSideTransactionReporting1 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.04";

    public MxFxtr01500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01500104(final String xml) {
        this();
        MxFxtr01500104 tmp = parse(xml);
        fxTradInstrAmdmnt = tmp.getFXTradInstrAmdmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradInstrAmdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeInstructionAmendmentV04 }
     *     
     */
    public ForeignExchangeTradeInstructionAmendmentV04 getFXTradInstrAmdmnt() {
        return fxTradInstrAmdmnt;
    }

    /**
     * Sets the value of the fxTradInstrAmdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeInstructionAmendmentV04 }
     *     
     */
    public MxFxtr01500104 setFXTradInstrAmdmnt(ForeignExchangeTradeInstructionAmendmentV04 value) {
        this.fxTradInstrAmdmnt = value;
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
    public static MxFxtr01500104 parse(String xml) {
        return ((MxFxtr01500104) MxReadImpl.parse(MxFxtr01500104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01500104 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01500104) parserImpl.read(MxFxtr01500104 .class, xml, _classes));
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
     * Creates an MxFxtr01500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01500104 message
     * @return
     *     a new instance of MxFxtr01500104
     */
    public final static MxFxtr01500104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxFxtr01500104 .class);
    }

}
