
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
 * Class for sese.040.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxCtrPtyRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.040.002.03")
public class MxSese04000203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxCtrPtyRspn", required = true)
    protected SecuritiesSettlementTransactionCounterpartyResponse002V03 sctiesSttlmTxCtrPtyRspn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection67 .class, ConsentOrRejectionReason5Choice.class, ConsentReason5 .class, ConsentStatus5Choice.class, CounterpartyResponseStatusReason1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, MxSese04000203 .class, NameAndAddress12 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, PendingStatus20Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, RejectionReason40 .class, RejectionStatus27Choice.class, ResponseStatus8Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesSettlementTransactionCounterpartyResponse002V03 .class, SecurityIdentification20 .class, SettlementDate32Choice.class, SettlementDateCode11Choice.class, SettlementParties90 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails146 .class, TransactionIdentification7 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.040.002.03";

    public MxSese04000203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese04000203(final String xml) {
        this();
        MxSese04000203 tmp = parse(xml);
        sctiesSttlmTxCtrPtyRspn = tmp.getSctiesSttlmTxCtrPtyRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese04000203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponse002V03 }
     *     
     */
    public SecuritiesSettlementTransactionCounterpartyResponse002V03 getSctiesSttlmTxCtrPtyRspn() {
        return sctiesSttlmTxCtrPtyRspn;
    }

    /**
     * Sets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponse002V03 }
     *     
     */
    public MxSese04000203 setSctiesSttlmTxCtrPtyRspn(SecuritiesSettlementTransactionCounterpartyResponse002V03 value) {
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
    public static MxSese04000203 parse(String xml) {
        return ((MxSese04000203) MxReadImpl.parse(MxSese04000203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese04000203 parse(String xml, MxRead parserImpl) {
        return ((MxSese04000203) parserImpl.read(MxSese04000203 .class, xml, _classes));
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
     * Creates an MxSese04000203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese04000203 message
     * @return
     *     a new instance of MxSese04000203
     */
    public final static MxSese04000203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese04000203 .class);
    }

}
