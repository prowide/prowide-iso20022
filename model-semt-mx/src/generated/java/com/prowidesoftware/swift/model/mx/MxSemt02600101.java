
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
 * Class for semt.026.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT7semt.026.001.01")
public class MxSemt02600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxQry", required = true)
    protected SecuritiesSettlementTransactionQueryV01 sctiesSttlmTxQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 26;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice1 .class, AccountIdentificationSearchCriteria2Choice1 .class, ActiveCurrencyAndAmountRange31 .class, AmountRangeBoundary11 .class, CreditDebitCode.class, DateAndDateTimeSearch5Choice1 .class, DatePeriod21 .class, DatePeriodSearch1Choice1 .class, DateTimePeriod11 .class, DateTimeSearch2Choice1 .class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantitySearch2Choice1 .class, FromToAmountRange11 .class, FromToQuantityRange11 .class, GenericAccountIdentification11 .class, ImpliedCurrencyAmountRange1Choice1 .class, MatchingStatus1Code.class, MatchingStatus27Choice1 .class, MxSemt02600101 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2 .class, PartyIdentification122Choice1 .class, PartyIdentification1361 .class, PartyIdentification1362 .class, PartyIdentification1481 .class, PartyIdentificationAndAccount1701 .class, PartyIdentificationAndAccount1702 .class, PriorityNumeric4Choice1 .class, ProcessingStatus70Choice1 .class, ProprietaryReason41 .class, QuantityRange1Choice1 .class, QuantityRangeBoundary11 .class, QuantitySearch2Choice1 .class, ReceiveDelivery1Code.class, References67Choice1 .class, SecuritiesAccount191 .class, SecuritiesSettlementStatus1Code.class, SecuritiesSettlementTransactionQueryV01 .class, SecuritiesTransactionType27Code1 .class, SecuritiesTransactionType48Choice1 .class, SecurityIdentification191 .class, SettlementInstructionQueryCriteria31 .class, SettlementInstructionQueryDefinition31 .class, SettlementInstructionQueryStatus31 .class, SettlementParties781Semt026Draft.class, SettlementQueryType1Code.class, SettlementStatus26Choice1 .class, SettlementTransactionCondition10Code1 .class, SettlementTransactionCondition16Choice1 .class, SettlementTransactionCondition5Code.class, SettlementTransactionStatusType21 .class, SystemPartyIdentification81 .class, TradeTransactionCondition1Code1 .class, TransactionProcessingStatus4Code1 .class };
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
        return ((MxSemt02600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
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
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02600101 .class);
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
