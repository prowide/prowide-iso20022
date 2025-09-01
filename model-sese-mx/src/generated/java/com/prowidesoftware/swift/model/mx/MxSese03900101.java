
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.039.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.01")
public class MxSese03900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
    protected SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 sctiesSttlmTxModReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 39;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus14Choice.class, AcknowledgementReason6Code.class, AcknowledgementReason7 .class, AcknowledgementReason9Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection8 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus6Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, IdentificationSource3Choice.class, ModificationProcessingStatus2Choice.class, ModificationReason2 .class, ModificationReason2Choice.class, ModificationStatus2Choice.class, ModifiedStatusReason1Code.class, MxSese03900101 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount44 .class, PendingProcessingReason3Code.class, PendingProcessingReason5 .class, PendingProcessingReason5Choice.class, PendingProcessingStatus7Choice.class, PostalAddress1 .class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, RejectionReason11 .class, RejectionReason11Choice.class, RejectionReason31Code.class, RejectionStatus8Choice.class, RepairReason1Choice.class, RepairReason4Code.class, RepairReason6 .class, RepairStatus8Choice.class, SecuritiesAccount13 .class, SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 .class, SecurityIdentification14 .class, SettlementDate2Choice.class, SettlementDateCode2Choice.class, SettlementParties13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails45 .class, TransactionIdentifications18 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.01";

    public MxSese03900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03900101(final String xml) {
        this();
        MxSese03900101 tmp = parse(xml);
        sctiesSttlmTxModReqStsAdvc = tmp.getSctiesSttlmTxModReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 getSctiesSttlmTxModReqStsAdvc() {
        return sctiesSttlmTxModReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 }
     *     
     */
    public MxSese03900101 setSctiesSttlmTxModReqStsAdvc(SecuritiesSettlementTransactionModificationRequestStatusAdviceV01 value) {
        this.sctiesSttlmTxModReqStsAdvc = value;
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
    public static MxSese03900101 parse(String xml) {
        return ((MxSese03900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03900101 parse(String xml, MxRead parserImpl) {
        return ((MxSese03900101) parserImpl.read(MxSese03900101 .class, xml, _classes));
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
     * Creates an MxSese03900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03900101 message
     * @return
     *     a new instance of MxSese03900101
     */
    public final static MxSese03900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03900101 .class);
    }

}
