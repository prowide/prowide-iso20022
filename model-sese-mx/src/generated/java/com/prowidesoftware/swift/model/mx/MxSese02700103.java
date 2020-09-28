
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
 * Class for sese.027.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.03")
public class MxSese02700103
    extends AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
    protected SecuritiesTransactionCancellationRequestStatusAdviceV03 sctiesTxCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus12Choice.class, AcknowledgementReason1 .class, AcknowledgementReason1Choice.class, AcknowledgementReason3Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection8 .class, CancellationReason2 .class, CancellationReason3Choice.class, CancellationStatus9Choice.class, CancelledStatusReason5Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus6Choice.class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericDocumentIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, IdentificationSource3Choice.class, MxSese02700103 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount44 .class, PendingReason15Choice.class, PendingReason7 .class, PendingReason9Code.class, PendingStatus11Choice.class, PostalAddress1 .class, ProcessingStatus20Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, References22Choice.class, RejectionAndRepairReason13Choice.class, RejectionAndRepairReason18Choice.class, RejectionOrRepairReason13 .class, RejectionOrRepairReason18 .class, RejectionOrRepairStatus14Choice.class, RejectionOrRepairStatus25Choice.class, RejectionReason27Code.class, RejectionReason32Code.class, SecuritiesAccount13 .class, SecuritiesTransactionCancellationRequestStatusAdviceV03 .class, SecurityIdentification14 .class, SettlementDate2Choice.class, SettlementDateCode2Choice.class, SettlementParties13 .class, SettlementTypeAndIdentification13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails30 .class, TransactionIdentifications17 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.03";

    public MxSese02700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02700103(final String xml) {
        this();
        MxSese02700103 tmp = parse(xml);
        sctiesTxCxlReqStsAdvc = tmp.getSctiesTxCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV03 }
     *     
     */
    public SecuritiesTransactionCancellationRequestStatusAdviceV03 getSctiesTxCxlReqStsAdvc() {
        return sctiesTxCxlReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV03 }
     *     
     */
    public MxSese02700103 setSctiesTxCxlReqStsAdvc(SecuritiesTransactionCancellationRequestStatusAdviceV03 value) {
        this.sctiesTxCxlReqStsAdvc = value;
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
    public static MxSese02700103 parse(String xml) {
        return ((MxSese02700103) MxReadImpl.parse(MxSese02700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02700103 parse(String xml, MxRead parserImpl) {
        return ((MxSese02700103) parserImpl.read(MxSese02700103 .class, xml, _classes));
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
     * Creates an MxSese02700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02700103 message
     * @return
     *     a new instance of MxSese02700103
     */
    public final static MxSese02700103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02700103 .class);
    }

}
