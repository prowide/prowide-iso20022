
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
 * Class for sese.039.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.002.06")
public class MxSese03900206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
    protected SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 sctiesSttlmTxModReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 39;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus30Choice.class, AcknowledgementReason18 .class, AcknowledgementReason21Choice.class, AcknowledgementReason6Code.class, AmountAndDirection67 .class, BlockChainAddressWallet7 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason17 .class, DeniedReason24Choice.class, DeniedReason6Code.class, DeniedStatus19Choice.class, FinancialInstrumentQuantity36Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, ModificationProcessingStatus11Choice.class, ModificationReason5 .class, ModificationReason5Choice.class, ModificationStatus5Choice.class, ModifiedStatusReason1Code.class, MxSese03900206 .class, NameAndAddress12 .class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount215 .class, PendingProcessingReason13 .class, PendingProcessingReason15Choice.class, PendingProcessingReason3Code.class, PendingProcessingStatus16Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity54Choice.class, ReceiveDelivery1Code.class, RejectionReason48Choice.class, RejectionReason63 .class, RejectionReason72Code.class, RejectionStatus42Choice.class, RepairReason13 .class, RepairReason14Choice.class, RepairReason4Code.class, RepairStatus17Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 .class, SecurityIdentification20 .class, SettlementDate32Choice.class, SettlementDateCode11Choice.class, SettlementParties109 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails158 .class, TransactionIdentifications37 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.039.002.06";

    public MxSese03900206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03900206(final String xml) {
        this();
        MxSese03900206 tmp = parse(xml);
        sctiesSttlmTxModReqStsAdvc = tmp.getSctiesSttlmTxModReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03900206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 getSctiesSttlmTxModReqStsAdvc() {
        return sctiesSttlmTxModReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 }
     *     
     */
    public MxSese03900206 setSctiesSttlmTxModReqStsAdvc(SecuritiesSettlementTransactionModificationRequestStatusAdvice002V06 value) {
        this.sctiesSttlmTxModReqStsAdvc = value;
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
    public static MxSese03900206 parse(String xml) {
        return ((MxSese03900206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03900206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03900206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03900206 parse(String xml, MxRead parserImpl) {
        return ((MxSese03900206) parserImpl.read(MxSese03900206 .class, xml, _classes));
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
     * Creates an MxSese03900206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03900206 message
     * @return
     *     a new instance of MxSese03900206
     */
    public static final MxSese03900206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03900206 .class);
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
