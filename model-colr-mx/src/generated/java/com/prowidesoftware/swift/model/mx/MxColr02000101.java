
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.020.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollTxInstrPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.020.001.01")
public class MxColr02000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollTxInstrPrcgStsAdvc", required = true)
    protected TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 trptyCollTxInstrPrcgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection44 .class, AmountAndDirection49 .class, BlockChainAddressWallet3 .class, CancellationReason29 .class, CancellationReason38Choice.class, CancellationStatus29Choice.class, CancellationStatus30Choice.class, CancelledStatusReason17Code.class, CashAccountIdentification5Choice.class, CashMovement7 .class, ClosingDate4Choice.class, CollateralAmount14 .class, CollateralDate2 .class, CollateralParameters12 .class, CollateralParties8 .class, CollateralRole1Code.class, CollateralTransactionType1Choice.class, CollateralTransactionType1Code.class, CreditDebit3Code.class, CreditDebitCode.class, Date3Choice.class, DateAndDateTime2Choice.class, DateType2Code.class, DealTransactionDetails7 .class, ExposureType14Code.class, ExposureType23Choice.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MatchingStatus33Choice.class, MxColr02000101 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentificationAndAccount193 .class, PartyIdentificationAndAccount202 .class, PartyIdentificationAndAccount203 .class, PendingReason17Code.class, PendingReason27 .class, PendingReason52Choice.class, PendingStatus56Choice.class, PostalAddress1 .class, ProcessingStatus82Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity51Choice.class, ReceiveDelivery1Code.class, RejectionReason39Choice.class, RejectionReason40Choice.class, RejectionReason54 .class, RejectionReason55 .class, RejectionReason62Code.class, RejectionReason63Code.class, RejectionStatus33Choice.class, RejectionStatus34Choice.class, SecuritiesAccount19 .class, SecuritiesMovement8 .class, SecuritiesMovementStatus1Choice.class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity7Code.class, TradingPartyCapacity5Choice.class, TransactionIdentifications46 .class, TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 .class, TypeOfIdentification1Code.class, UnmatchedReason15Code.class, UnmatchedReason21 .class, UnmatchedReason30Choice.class, UnmatchedStatus22Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.020.001.01";

    public MxColr02000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr02000101(final String xml) {
        this();
        MxColr02000101 tmp = parse(xml);
        trptyCollTxInstrPrcgStsAdvc = tmp.getTrptyCollTxInstrPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr02000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollTxInstrPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 }
     *     
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 getTrptyCollTxInstrPrcgStsAdvc() {
        return trptyCollTxInstrPrcgStsAdvc;
    }

    /**
     * Sets the value of the trptyCollTxInstrPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 }
     *     
     */
    public MxColr02000101 setTrptyCollTxInstrPrcgStsAdvc(TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 value) {
        this.trptyCollTxInstrPrcgStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr02000101 parse(String xml) {
        return ((MxColr02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr02000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr02000101 parse(String xml, MxRead parserImpl) {
        return ((MxColr02000101) parserImpl.read(MxColr02000101 .class, xml, _classes));
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
     * Creates an MxColr02000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr02000101 message
     * @return
     *     a new instance of MxColr02000101
     */
    public final static MxColr02000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr02000101 .class);
    }

}
