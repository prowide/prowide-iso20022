
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
 * Class for sese.027.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.06")
public class MxSese02700106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
    protected SecuritiesTransactionCancellationRequestStatusAdviceV06 sctiesTxCxlReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason12 .class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, CancellationReason10 .class, CancellationReason21Choice.class, CancellationStatus15Choice.class, CancelledStatusReason5Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason10 .class, DeniedReason15Choice.class, DeniedReason6Code.class, DeniedStatus15Choice.class, DocumentNumber5Choice.class, FinancialInstrumentQuantity1Choice.class, GenericDocumentIdentification4 .class, GenericIdentification30 .class, GenericIdentification36 .class, Identification14 .class, IdentificationSource3Choice.class, MxSese02700106 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentification149 .class, PartyIdentificationAndAccount170 .class, PendingReason17 .class, PendingReason30Choice.class, PendingReason9Code.class, PendingStatus39Choice.class, PostalAddress1 .class, ProcessingStatus54Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, References44Choice.class, RejectionAndRepairReason24Choice.class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason24 .class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus30Choice.class, RejectionOrRepairStatus31Choice.class, RejectionReason27Code.class, RejectionReason32Code.class, SecuritiesAccount19 .class, SecuritiesTransactionCancellationRequestStatusAdviceV06 .class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementParties78 .class, SettlementTypeAndIdentification18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionDetails136 .class, TransactionIdentifications30 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.06";

    public MxSese02700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02700106(final String xml) {
        this();
        MxSese02700106 tmp = parse(xml);
        sctiesTxCxlReqStsAdvc = tmp.getSctiesTxCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV06 }
     *     
     */
    public SecuritiesTransactionCancellationRequestStatusAdviceV06 getSctiesTxCxlReqStsAdvc() {
        return sctiesTxCxlReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV06 }
     *     
     */
    public MxSese02700106 setSctiesTxCxlReqStsAdvc(SecuritiesTransactionCancellationRequestStatusAdviceV06 value) {
        this.sctiesTxCxlReqStsAdvc = value;
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
    public static MxSese02700106 parse(String xml) {
        return ((MxSese02700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02700106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02700106 parse(String xml, MxRead parserImpl) {
        return ((MxSese02700106) parserImpl.read(MxSese02700106 .class, xml, _classes));
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
     * Creates an MxSese02700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02700106 message
     * @return
     *     a new instance of MxSese02700106
     */
    public static final MxSese02700106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02700106 .class);
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
