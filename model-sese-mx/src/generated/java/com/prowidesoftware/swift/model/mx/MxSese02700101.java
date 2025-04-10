
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
 * Class for sese.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.01")
public class MxSese02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
    protected SecuritiesTransactionCancellationRequestStatusAdviceV01 sctiesTxCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus1Choice.class, AcknowledgementReason1 .class, AcknowledgementReason1Choice.class, AcknowledgementReason3Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AmountAndDirection8 .class, CancellationReason2 .class, CancellationReason3Choice.class, CancellationStatus3Choice.class, CancelledStatusReason5Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus2Choice.class, DocumentIdentification11 .class, DocumentNumber1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity1Choice.class, GenericDocumentIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, IdentificationSource1Choice.class, MxSese02700101 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification14Choice.class, PartyIdentification36 .class, PartyIdentificationAndAccount16 .class, PendingReason2 .class, PendingReason2Choice.class, PendingReason6Code.class, PendingStatus4Choice.class, PostalAddress1 .class, ProcessingStatus2Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, References4Choice.class, RejectionAndRepairReason1Choice.class, RejectionOrRepairReason1 .class, RejectionOrRepairStatus6Choice.class, RejectionReason21Code.class, SecuritiesAccount13 .class, SecuritiesTransactionCancellationRequestStatusAdviceV01 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDate2Choice.class, SettlementDateCode2Choice.class, SettlementParties2 .class, SettlementTypeAndIdentification4 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails4 .class, TransactionIdentifications4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.01";

    public MxSese02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02700101(final String xml) {
        this();
        MxSese02700101 tmp = parse(xml);
        sctiesTxCxlReqStsAdvc = tmp.getSctiesTxCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV01 }
     *     
     */
    public SecuritiesTransactionCancellationRequestStatusAdviceV01 getSctiesTxCxlReqStsAdvc() {
        return sctiesTxCxlReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdviceV01 }
     *     
     */
    public MxSese02700101 setSctiesTxCxlReqStsAdvc(SecuritiesTransactionCancellationRequestStatusAdviceV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese02700101 parse(String xml) {
        return ((MxSese02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02700101 parse(String xml, MxRead parserImpl) {
        return ((MxSese02700101) parserImpl.read(MxSese02700101 .class, xml, _classes));
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
     * Creates an MxSese02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02700101 message
     * @return
     *     a new instance of MxSese02700101
     */
    public final static MxSese02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02700101 .class);
    }

}
