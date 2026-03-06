
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
 * Class for semt.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxQryRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT9semt.027.001.01")
public class MxSemt02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxQryRspn", required = true)
    protected SecuritiesSettlementTransactionQueryResponseV01 sctiesSttlmTxQryRspn;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice1 .class, AmountAndDirection201 .class, BeneficialOwnership4Choice1 .class, CancellationReason221 .class, CancellationReason36Choice1 .class, CancellationStatus24Choice1 .class, CancelledStatusReason16Code.class, CreditDebitCode.class, DateAndDateTime2Choice1Draft.class, DeliveryReceiptType2Code.class, DocumentNumber5Choice1 .class, FailingReason2Code1 .class, FailingReason81 .class, FailingReason8Choice1 .class, FailingStatus10Choice1Draft.class, FinancialInstrumentQuantity1Choice1 .class, GenericIdentification301Draft.class, GenericIdentification361 .class, HoldIndicator61 .class, InstructionProcessingStatus37Choice1 .class, Linkages571 .class, MarketIdentification1Choice1 .class, MarketIdentification841 .class, MarketType2Code.class, MarketType8Choice1 .class, MatchingStatus24Choice1 .class, MxSemt02700101 .class, NameAndAddress51 .class, NoReasonCode.class, Pagination1 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2 .class, PartyIdentification120Choice3 .class, PartyIdentification122Choice1 .class, PartyIdentification127Choice1 .class, PartyIdentification1361 .class, PartyIdentification1362 .class, PartyIdentification1481 .class, PartyIdentificationAndAccount1701Draft.class, PartyIdentificationAndAccount1702Semt027Draft.class, PendingReason151 .class, PendingReason161 .class, PendingReason27Choice1 .class, PendingReason28Choice1 .class, PendingReason2Code1 .class, PendingReason6Code1 .class, PendingStatus37Choice1 .class, PendingStatus38Choice1 .class, PlaceOfClearingIdentification21 .class, PlaceOfTradeIdentification11 .class, PriorityNumeric4Choice1 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice1 .class, ProprietaryReason41 .class, ReceiveDelivery1Code.class, References34Choice1 .class, Registration10Choice1 .class, Registration2Code.class, RegistrationReason51 .class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount191 .class, SecuritiesReport21 .class, SecuritiesSettlementTransactionQueryResponseV01 .class, SecuritiesSettlementTransactions41 .class, SecuritiesTransactionType27Code1 .class, SecuritiesTransactionType48Choice1 .class, SecurityIdentification191 .class, SettlementDate19Choice1 .class, SettlementDetails1821 .class, SettlementOrCorporateActionEvent26Choice1 .class, SettlementParties781 .class, SettlementQueryType1Code.class, SettlementStatus17Choice1 .class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice1Draft.class, SettlementTransactionCondition5Code.class, StatusAndReason381 .class, SystemPartyIdentification81 .class, TradeDate8Choice1Draft.class, Transaction731 .class, TransactionActivity1CodeFixed.class, TransactionActivity3Choice1 .class, TransactionDetails1251 .class, UnmatchedStatus16Choice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT9semt.027.001.01";

    public MxSemt02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02700101(final String xml) {
        this();
        MxSemt02700101 tmp = parse(xml);
        sctiesSttlmTxQryRspn = tmp.getSctiesSttlmTxQryRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxQryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionQueryResponseV01 }
     *     
     */
    public SecuritiesSettlementTransactionQueryResponseV01 getSctiesSttlmTxQryRspn() {
        return sctiesSttlmTxQryRspn;
    }

    /**
     * Sets the value of the sctiesSttlmTxQryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionQueryResponseV01 }
     *     
     */
    public MxSemt02700101 setSctiesSttlmTxQryRspn(SecuritiesSettlementTransactionQueryResponseV01 value) {
        this.sctiesSttlmTxQryRspn = value;
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
    public static MxSemt02700101 parse(String xml) {
        return ((MxSemt02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02700101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02700101) parserImpl.read(MxSemt02700101 .class, xml, _classes));
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
     * Creates an MxSemt02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02700101 message
     * @return
     *     a new instance of MxSemt02700101
     */
    public static final MxSemt02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02700101 .class);
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
