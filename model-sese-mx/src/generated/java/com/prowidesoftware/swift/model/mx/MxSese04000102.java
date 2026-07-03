
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
 * Class for sese.040.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxCtrPtyRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.040.001.02")
public class MxSese04000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxCtrPtyRspn", required = true)
    protected SecuritiesSettlementTransactionCounterpartyResponseV02 sctiesSttlmTxCtrPtyRspn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, ConsentOrRejectionReason4Choice.class, ConsentReason4 .class, ConsentStatus4Choice.class, CounterpartyResponseStatusReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSese04000102 .class, NameAndAddress5 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification91 .class, PartyIdentification93Choice.class, PartyIdentification99 .class, PartyIdentificationAndAccount117 .class, PendingStatus20Choice.class, PostalAddress1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, RejectionReason29 .class, RejectionStatus20Choice.class, ResponseStatus6Choice.class, SecuritiesAccount19 .class, SecuritiesSettlementTransactionCounterpartyResponseV02 .class, SecurityIdentification19 .class, SettlementDate10Choice.class, SettlementDateCode8Choice.class, SettlementParties40 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate5Choice.class, TradeDateCode3Choice.class, TransactionDetails82 .class, TransactionIdentification6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.040.001.02";

    public MxSese04000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese04000102(final String xml) {
        this();
        MxSese04000102 tmp = parse(xml);
        sctiesSttlmTxCtrPtyRspn = tmp.getSctiesSttlmTxCtrPtyRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese04000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponseV02 }
     *     
     */
    public SecuritiesSettlementTransactionCounterpartyResponseV02 getSctiesSttlmTxCtrPtyRspn() {
        return sctiesSttlmTxCtrPtyRspn;
    }

    /**
     * Sets the value of the sctiesSttlmTxCtrPtyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionCounterpartyResponseV02 }
     *     
     */
    public MxSese04000102 setSctiesSttlmTxCtrPtyRspn(SecuritiesSettlementTransactionCounterpartyResponseV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese04000102 parse(String xml) {
        return ((MxSese04000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese04000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese04000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese04000102 parse(String xml, MxRead parserImpl) {
        return ((MxSese04000102) parserImpl.read(MxSese04000102 .class, xml, _classes));
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
     * Creates an MxSese04000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese04000102 message
     * @return
     *     a new instance of MxSese04000102
     */
    public final static MxSese04000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese04000102 .class);
    }

}
