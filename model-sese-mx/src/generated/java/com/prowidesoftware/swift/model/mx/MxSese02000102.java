
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
 * Class for sese.020.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.020.001.02")
public class MxSese02000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReq", required = true)
    protected SecuritiesTransactionCancellationRequestV02 sctiesTxCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection8 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentNumber1Choice.class, FXCancellation1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericDocumentIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, IdentificationSource3Choice.class, MxSese02000102 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount44 .class, PostalAddress1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, References2Choice.class, SecuritiesAccount13 .class, SecuritiesTransactionCancellationRequestV02 .class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementParties13 .class, SettlementTypeAndIdentification3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails29 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.020.001.02";

    public MxSese02000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02000102(final String xml) {
        this();
        MxSese02000102 tmp = parse(xml);
        sctiesTxCxlReq = tmp.getSctiesTxCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestV02 }
     *     
     */
    public SecuritiesTransactionCancellationRequestV02 getSctiesTxCxlReq() {
        return sctiesTxCxlReq;
    }

    /**
     * Sets the value of the sctiesTxCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestV02 }
     *     
     */
    public MxSese02000102 setSctiesTxCxlReq(SecuritiesTransactionCancellationRequestV02 value) {
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
    public static MxSese02000102 parse(String xml) {
        return ((MxSese02000102) MxReadImpl.parse(MxSese02000102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02000102 parse(String xml, MxRead parserImpl) {
        return ((MxSese02000102) parserImpl.read(MxSese02000102 .class, xml, _classes));
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
     * Creates an MxSese02000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02000102 message
     * @return
     *     a new instance of MxSese02000102
     */
    public final static MxSese02000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02000102 .class);
    }

}
