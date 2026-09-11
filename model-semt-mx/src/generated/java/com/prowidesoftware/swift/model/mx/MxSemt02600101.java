
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for semt.026.001.01 ISO 20022 message.
 * <p><strong>DRAFT</strong>: generated from an ISO 20022 draft schema (not yet officially registered).
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT7semt.026.001.01")
public class MxSemt02600101
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxQry", required = true)
    protected SecuritiesSettlementTransactionQueryV01 sctiesSttlmTxQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 26;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmountRange3 .class, AddressType2Code.class, AmountRangeBoundary1 .class, CreditDebitCode.class, DateAndDateTimeSearch5Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimeSearch2Choice.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantitySearch2 .class, FinancialInstrumentQuantitySearch2Choice.class, FromToAmountRange1 .class, FromToQuantityRange1 .class, GenericAccountIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRange1Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, MxSemt02600101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification136 .class, PartyIdentification148 .class, PartyIdentificationAndAccount170 .class, PostalAddress1 .class, PriorityNumeric4Choice.class, ProcessingStatus70Choice.class, ProprietaryReason4 .class, QuantityRange1Choice.class, QuantityRangeBoundary1 .class, QuantitySearch2Choice.class, ReceiveDelivery1Code.class, References67Choice.class, Registration10Choice.class, Registration2Code.class, SecuritiesAccount19 .class, SecuritiesSettlementStatus1Code.class, SecuritiesSettlementTransactionQueryV01 .class, SecuritiesTransactionType27Code.class, SecuritiesTransactionType48Choice.class, SecurityIdentification19 .class, SettlementInstructionQueryCriteria3 .class, SettlementInstructionQueryDefinition3 .class, SettlementInstructionQueryStatus3 .class, SettlementParties78 .class, SettlementQueryType1Code.class, SettlementStatus26Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionStatusType2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, TradeTransactionCondition1Code.class, TransactionProcessingStatus4Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT7semt.026.001.01";

    public MxSemt02600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02600101(final String xml) {
        this();
        MxSemt02600101 tmp = parse(xml);
        sctiesSttlmTxQry = tmp.getSctiesSttlmTxQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionQueryV01 }
     *     
     */
    public SecuritiesSettlementTransactionQueryV01 getSctiesSttlmTxQry() {
        return sctiesSttlmTxQry;
    }

    /**
     * Sets the value of the sctiesSttlmTxQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionQueryV01 }
     *     
     */
    public MxSemt02600101 setSctiesSttlmTxQry(SecuritiesSettlementTransactionQueryV01 value) {
        this.sctiesSttlmTxQry = value;
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
    public static MxSemt02600101 parse(String xml) {
        return ((MxSemt02600101) MxReadImpl.parse(MxSemt02600101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02600101) MxReadImpl.parse(MxSemt02600101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02600101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02600101) parserImpl.read(MxSemt02600101 .class, xml, _classes));
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
     * Creates an MxSemt02600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02600101 message
     * @return
     *     a new instance of MxSemt02600101
     */
    public static final MxSemt02600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt02600101 .class);
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
