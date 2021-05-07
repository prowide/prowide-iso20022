
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
 * Class for sese.020.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.020.002.02")
public class MxSese02000202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReq", required = true)
    protected SecuritiesTransactionCancellationRequestV02Subset sctiesTxCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection12 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentNumber3Choice.class, FXCancellation2Choice.class, FinancialInstrumentQuantity15Choice.class, GenericDocumentIdentification3 .class, GenericIdentification25 .class, GenericIdentification34 .class, IdentificationSource3Choice.class, MxSese02000202 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification1 .class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification64Choice.class, PartyIdentification66Choice.class, PartyIdentification67Choice.class, PartyIdentificationAndAccount76 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, References17Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount17 .class, SecuritiesTransactionCancellationRequestV02Subset.class, SecurityIdentification14 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementParties22 .class, SettlementTypeAndIdentification7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails32 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.020.002.02";

    public MxSese02000202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02000202(final String xml) {
        this();
        MxSese02000202 tmp = parse(xml);
        sctiesTxCxlReq = tmp.getSctiesTxCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02000202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestV02Subset }
     *     
     */
    public SecuritiesTransactionCancellationRequestV02Subset getSctiesTxCxlReq() {
        return sctiesTxCxlReq;
    }

    /**
     * Sets the value of the sctiesTxCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestV02Subset }
     *     
     */
    public MxSese02000202 setSctiesTxCxlReq(SecuritiesTransactionCancellationRequestV02Subset value) {
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
    public static MxSese02000202 parse(String xml) {
        return ((MxSese02000202) MxReadImpl.parse(MxSese02000202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02000202 parse(String xml, MxRead parserImpl) {
        return ((MxSese02000202) parserImpl.read(MxSese02000202 .class, xml, _classes));
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
     * Creates an MxSese02000202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02000202 message
     * @return
     *     a new instance of MxSese02000202
     */
    public final static MxSese02000202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02000202 .class);
    }

}
