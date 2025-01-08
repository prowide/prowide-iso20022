
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
 * Class for secl.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmOblgtnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.010.001.03")
public class MxSecl01000103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmOblgtnRpt", required = true)
    protected SettlementObligationReportV03 sttlmOblgtnRpt;
    public static final transient String BUSINESS_PROCESS = "secl";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1 .class, AccountIdentification26 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AmountAndDirection27 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat11Choice.class, DateType1Code.class, DeliveringPartiesAndAccount11 .class, DeliveringPartiesAndAccount7 .class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSecl01000103 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, ObligationType1Choice.class, ObligationType1Code.class, OtherIdentification1 .class, Pagination.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount102 .class, PartyIdentificationAndAccount31 .class, PartyIdentificationAndAccount32 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceiveDelivery1Code.class, ReceivingPartiesAndAccount11 .class, ReceivingPartiesAndAccount7 .class, Reference19 .class, Report5 .class, ReportParameters4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat7Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, SettlementObligation5 .class, SettlementObligation8 .class, SettlementObligationReportV03 .class, SettlementParties2Choice.class, SettlementParties4Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation4 .class, SubAccount1 .class, SubAccount4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate3Choice.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.010.001.03";

    public MxSecl01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl01000103(final String xml) {
        this();
        MxSecl01000103 tmp = parse(xml);
        sttlmOblgtnRpt = tmp.getSttlmOblgtnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmOblgtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligationReportV03 }
     *     
     */
    public SettlementObligationReportV03 getSttlmOblgtnRpt() {
        return sttlmOblgtnRpt;
    }

    /**
     * Sets the value of the sttlmOblgtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligationReportV03 }
     *     
     */
    public MxSecl01000103 setSttlmOblgtnRpt(SettlementObligationReportV03 value) {
        this.sttlmOblgtnRpt = value;
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
    public static MxSecl01000103 parse(String xml) {
        return ((MxSecl01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl01000103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl01000103 parse(String xml, MxRead parserImpl) {
        return ((MxSecl01000103) parserImpl.read(MxSecl01000103 .class, xml, _classes));
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
     * Creates an MxSecl01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl01000103 message
     * @return
     *     a new instance of MxSecl01000103
     */
    public static final MxSecl01000103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl01000103 .class);
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
