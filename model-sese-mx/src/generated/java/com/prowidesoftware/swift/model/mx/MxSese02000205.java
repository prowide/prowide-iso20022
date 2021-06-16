
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.020.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.020.002.05")
public class MxSese02000205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReq", required = true)
    protected SecuritiesTransactionCancellationRequest002V05 sctiesTxCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection67 .class, CancellationReason19 .class, CancellationReason24Choice.class, CancelledStatusReason13Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentNumber16Choice.class, FXCancellation4Choice.class, FinancialInstrumentQuantity15Choice.class, GenericDocumentIdentification6 .class, GenericIdentification163 .class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, MxSese02000205 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification104Choice.class, PartyIdentification108 .class, PartyIdentification109 .class, PartyIdentification110 .class, PartyIdentification114Choice.class, PartyIdentification115Choice.class, PartyIdentification58Choice.class, PartyIdentificationAndAccount146 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, References60Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesTransactionCancellationRequest002V05 .class, SecurityIdentification20 .class, SettlementDate12Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementParties49 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate6Choice.class, TradeDateCode4Choice.class, TransactionDetails83 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.020.002.05";

    public MxSese02000205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02000205(final String xml) {
        this();
        MxSese02000205 tmp = parse(xml);
        sctiesTxCxlReq = tmp.getSctiesTxCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02000205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequest002V05 }
     *     
     */
    public SecuritiesTransactionCancellationRequest002V05 getSctiesTxCxlReq() {
        return sctiesTxCxlReq;
    }

    /**
     * Sets the value of the sctiesTxCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequest002V05 }
     *     
     */
    public MxSese02000205 setSctiesTxCxlReq(SecuritiesTransactionCancellationRequest002V05 value) {
        this.sctiesTxCxlReq = value;
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
    public static MxSese02000205 parse(String xml) {
        return ((MxSese02000205) MxReadImpl.parse(MxSese02000205 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02000205 parse(String xml, MxRead parserImpl) {
        return ((MxSese02000205) parserImpl.read(MxSese02000205 .class, xml, _classes));
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
     * Creates an MxSese02000205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02000205 message
     * @return
     *     a new instance of MxSese02000205
     */
    public final static MxSese02000205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02000205 .class);
    }

}
