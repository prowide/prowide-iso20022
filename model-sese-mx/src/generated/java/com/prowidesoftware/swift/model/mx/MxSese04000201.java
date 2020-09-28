
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
 * Class for sese.040.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxCtrPtyRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.040.002.01")
public class MxSese04000201
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxCtrPtyRspn", required = true)
    protected SecuritiesSettlementTransactionCounterpartyResponse002V01 sctiesSttlmTxCtrPtyRspn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection12 .class, ConsentOrRejectionReason3Choice.class, ConsentReason3 .class, ConsentStatus3Choice.class, CounterpartyResponseStatusReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, IdentificationSource4Choice.class, MxSese04000201 .class, NameAndAddress12 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingStatus20Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, RejectionReason13 .class, RejectionStatus9Choice.class, ResponseStatus4Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount17 .class, SecuritiesSettlementTransactionCounterpartyResponse002V01 .class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementParties21 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails42 .class, TransactionIdentification3 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.040.002.01";

    public MxSese04000201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese04000201(final String xml) {
        this();
        MxSese04000201 tmp = parse(xml);
        sctiesSttlmTxCtrPtyRspn = tmp.getSctiesSttlmTxCtrPtyRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese04000201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponse002V01 }
     *     
     */
    public SecuritiesSettlementTransactionCounterpartyResponse002V01 getSctiesSttlmTxCtrPtyRspn() {
        return sctiesSttlmTxCtrPtyRspn;
    }

    /**
     * Sets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponse002V01 }
     *     
     */
    public MxSese04000201 setSctiesSttlmTxCtrPtyRspn(SecuritiesSettlementTransactionCounterpartyResponse002V01 value) {
        this.sctiesSttlmTxCtrPtyRspn = value;
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
    public static MxSese04000201 parse(String xml) {
        return ((MxSese04000201) MxReadImpl.parse(MxSese04000201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese04000201 parse(String xml, MxRead parserImpl) {
        return ((MxSese04000201) parserImpl.read(MxSese04000201 .class, xml, _classes));
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
     * Creates an MxSese04000201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese04000201 message
     * @return
     *     a new instance of MxSese04000201
     */
    public final static MxSese04000201 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese04000201 .class);
    }

}
