
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
 * Class for sese.020.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.020.002.06")
public class MxSese02000206
    extends AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReq", required = true)
    protected SecuritiesTransactionCancellationRequest002V06 sctiesTxCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection67 .class, CancellationReason27 .class, CancellationReason37Choice.class, CancelledStatusReason16Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentNumber16Choice.class, FXCancellation4Choice.class, FinancialInstrumentQuantity15Choice.class, GenericDocumentIdentification6 .class, GenericIdentification163 .class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, MxSese02000206 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, References60Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesTransactionCancellationRequest002V06 .class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementParties90 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails120 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.020.002.06";

    public MxSese02000206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02000206(final String xml) {
        this();
        MxSese02000206 tmp = parse(xml);
        sctiesTxCxlReq = tmp.getSctiesTxCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02000206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequest002V06 }
     *     
     */
    public SecuritiesTransactionCancellationRequest002V06 getSctiesTxCxlReq() {
        return sctiesTxCxlReq;
    }

    /**
     * Sets the value of the sctiesTxCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequest002V06 }
     *     
     */
    public MxSese02000206 setSctiesTxCxlReq(SecuritiesTransactionCancellationRequest002V06 value) {
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
    public static MxSese02000206 parse(String xml) {
        return ((MxSese02000206) MxReadImpl.parse(MxSese02000206 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02000206 parse(String xml, MxRead parserImpl) {
        return ((MxSese02000206) parserImpl.read(MxSese02000206 .class, xml, _classes));
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
     * Creates an MxSese02000206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02000206 message
     * @return
     *     a new instance of MxSese02000206
     */
    public final static MxSese02000206 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02000206 .class);
    }

}
