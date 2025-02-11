
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
 * Class for sese.027.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.002.06")
public class MxSese02700206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
    protected SecuritiesTransactionCancellationRequestStatusAdvice002V06 sctiesTxCxlReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus31Choice.class, AcknowledgementReason19 .class, AcknowledgementReason22Choice.class, AcknowledgementReason3Code.class, AmountAndDirection67 .class, CancellationReason18 .class, CancellationReason28Choice.class, CancellationStatus20Choice.class, CancelledStatusReason5Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason17 .class, DeniedReason24Choice.class, DeniedReason6Code.class, DeniedStatus19Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, GenericDocumentIdentification5 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, Identification16 .class, IdentificationSource4Choice.class, MxSese02700206 .class, NameAndAddress12 .class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, PendingReason25 .class, PendingReason42Choice.class, PendingReason9Code.class, PendingStatus51Choice.class, ProcessingStatus65Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, References59Choice.class, RejectionAndRepairReason28Choice.class, RejectionAndRepairReason29Choice.class, RejectionOrRepairReason28 .class, RejectionOrRepairReason29 .class, RejectionOrRepairStatus34Choice.class, RejectionOrRepairStatus35Choice.class, RejectionReason27Code.class, RejectionReason32Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesTransactionCancellationRequestStatusAdvice002V06 .class, SecurityIdentification20 .class, SettlementDate32Choice.class, SettlementDateCode11Choice.class, SettlementParties90 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails143 .class, TransactionIdentifications39 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.027.002.06";

    public MxSese02700206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02700206(final String xml) {
        this();
        MxSese02700206 tmp = parse(xml);
        sctiesTxCxlReqStsAdvc = tmp.getSctiesTxCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02700206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdvice002V06 }
     *     
     */
    public SecuritiesTransactionCancellationRequestStatusAdvice002V06 getSctiesTxCxlReqStsAdvc() {
        return sctiesTxCxlReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdvice002V06 }
     *     
     */
    public MxSese02700206 setSctiesTxCxlReqStsAdvc(SecuritiesTransactionCancellationRequestStatusAdvice002V06 value) {
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
    public static MxSese02700206 parse(String xml) {
        return ((MxSese02700206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02700206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02700206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02700206 parse(String xml, MxRead parserImpl) {
        return ((MxSese02700206) parserImpl.read(MxSese02700206 .class, xml, _classes));
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
     * Creates an MxSese02700206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02700206 message
     * @return
     *     a new instance of MxSese02700206
     */
    public static final MxSese02700206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02700206 .class);
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
