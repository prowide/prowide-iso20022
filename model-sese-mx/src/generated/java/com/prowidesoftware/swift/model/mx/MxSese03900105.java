
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
 * Class for sese.039.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.05")
public class MxSese03900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
    protected SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 sctiesSttlmTxModReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 39;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus23Choice.class, AcknowledgementReason11 .class, AcknowledgementReason14Choice.class, AcknowledgementReason6Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason10 .class, DeniedReason15Choice.class, DeniedReason6Code.class, DeniedStatus15Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification14 .class, IdentificationSource3Choice.class, ModificationProcessingStatus7Choice.class, ModificationReason4 .class, ModificationReason4Choice.class, ModificationStatus4Choice.class, ModifiedStatusReason1Code.class, MxSese03900105 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentification149 .class, PartyIdentificationAndAccount170 .class, PendingProcessingReason10 .class, PendingProcessingReason12Choice.class, PendingProcessingReason3Code.class, PendingProcessingStatus13Choice.class, PostalAddress1 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, RejectionReason24Choice.class, RejectionReason26 .class, RejectionReason31Code.class, RejectionStatus18Choice.class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason9 .class, RepairStatus13Choice.class, SecuritiesAccount19 .class, SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 .class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementParties78 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionDetails137 .class, TransactionIdentifications33 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.05";

    public MxSese03900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03900105(final String xml) {
        this();
        MxSese03900105 tmp = parse(xml);
        sctiesSttlmTxModReqStsAdvc = tmp.getSctiesSttlmTxModReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 getSctiesSttlmTxModReqStsAdvc() {
        return sctiesSttlmTxModReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 }
     *     
     */
    public MxSese03900105 setSctiesSttlmTxModReqStsAdvc(SecuritiesSettlementTransactionModificationRequestStatusAdviceV05 value) {
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
    public static MxSese03900105 parse(String xml) {
        return ((MxSese03900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03900105 parse(String xml, MxRead parserImpl) {
        return ((MxSese03900105) parserImpl.read(MxSese03900105 .class, xml, _classes));
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
     * Creates an MxSese03900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03900105 message
     * @return
     *     a new instance of MxSese03900105
     */
    public static final MxSese03900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03900105 .class);
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
