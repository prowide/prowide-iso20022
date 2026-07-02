
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
 * Class for sese.039.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.039.002.03")
public class MxSese03900203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
    protected SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 sctiesSttlmTxModReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 39;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus15Choice.class, AcknowledgementReason10Choice.class, AcknowledgementReason6Code.class, AcknowledgementReason8 .class, AmountAndDirection12 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason11Choice.class, DeniedReason6Code.class, DeniedReason8 .class, DeniedStatus13Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification65 .class, Identification4 .class, IdentificationSource4Choice.class, ModificationProcessingStatus6Choice.class, ModificationReason3 .class, ModificationReason3Choice.class, ModificationStatus3Choice.class, ModifiedStatusReason1Code.class, MxSese03900203 .class, NameAndAddress12 .class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingProcessingReason3Code.class, PendingProcessingReason6 .class, PendingProcessingReason6Choice.class, PendingProcessingStatus8Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, RejectionReason12Choice.class, RejectionReason14 .class, RejectionReason31Code.class, RejectionStatus10Choice.class, RepairReason4Code.class, RepairReason6Choice.class, RepairReason7 .class, RepairStatus9Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount17 .class, SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 .class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementParties21 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails46 .class, TransactionIdentifications26 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.039.002.03";

    public MxSese03900203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03900203(final String xml) {
        this();
        MxSese03900203 tmp = parse(xml);
        sctiesSttlmTxModReqStsAdvc = tmp.getSctiesSttlmTxModReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03900203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 getSctiesSttlmTxModReqStsAdvc() {
        return sctiesSttlmTxModReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 }
     *     
     */
    public MxSese03900203 setSctiesSttlmTxModReqStsAdvc(SecuritiesSettlementTransactionModificationRequestStatusAdvice002V03 value) {
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
    public static MxSese03900203 parse(String xml) {
        return ((MxSese03900203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03900203 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03900203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03900203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03900203 parse(String xml, MxRead parserImpl) {
        return ((MxSese03900203) parserImpl.read(MxSese03900203 .class, xml, _classes));
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
     * Creates an MxSese03900203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03900203 message
     * @return
     *     a new instance of MxSese03900203
     */
    public final static MxSese03900203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03900203 .class);
    }

}
