
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
 * Class for sese.020.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.020.001.07")
public class MxSese02000107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReq", required = true)
    protected SecuritiesTransactionCancellationRequestV07 sctiesTxCxlReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 20;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, BlockChainAddressWallet3 .class, CancellationReason23 .class, CancellationReason36Choice.class, CancelledStatusReason16Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentNumber5Choice.class, FXCancellation3Choice.class, FinancialInstrumentQuantity33Choice.class, GenericDocumentIdentification4 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSese02000107 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentification149 .class, PartyIdentificationAndAccount195 .class, PostalAddress1 .class, Quantity51Choice.class, ReceiveDelivery1Code.class, References45Choice.class, SecuritiesAccount19 .class, SecuritiesTransactionCancellationRequestV07 .class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementParties97 .class, SettlementTypeAndIdentification18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionDetails151 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.020.001.07";

    public MxSese02000107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02000107(final String xml) {
        this();
        MxSese02000107 tmp = parse(xml);
        sctiesTxCxlReq = tmp.getSctiesTxCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02000107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestV07 }
     *     
     */
    public SecuritiesTransactionCancellationRequestV07 getSctiesTxCxlReq() {
        return sctiesTxCxlReq;
    }

    /**
     * Sets the value of the sctiesTxCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestV07 }
     *     
     */
    public MxSese02000107 setSctiesTxCxlReq(SecuritiesTransactionCancellationRequestV07 value) {
        this.sctiesTxCxlReq = value;
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
    public static MxSese02000107 parse(String xml) {
        return ((MxSese02000107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02000107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02000107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02000107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02000107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02000107 parse(String xml, MxRead parserImpl) {
        return ((MxSese02000107) parserImpl.read(MxSese02000107 .class, xml, _classes));
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
     * Creates an MxSese02000107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02000107 message
     * @return
     *     a new instance of MxSese02000107
     */
    public static final MxSese02000107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02000107 .class);
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
