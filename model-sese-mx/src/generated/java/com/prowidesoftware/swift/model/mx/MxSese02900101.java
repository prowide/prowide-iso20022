
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
 * Class for sese.029.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmAllgmtRmvlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.029.001.01")
public class MxSese02900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmAllgmtRmvlAdvc", required = true)
    protected SecuritiesSettlementAllegementRemovalAdviceV01 sctiesSttlmAllgmtRmvlAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AmountAndDirection8 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentIdentification11 .class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, IdentificationSource1Choice.class, MxSese02900101 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification14Choice.class, PartyIdentification36 .class, PartyIdentificationAndAccount16 .class, PostalAddress1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, SecuritiesAccount13 .class, SecuritiesSettlementAllegementRemovalAdviceV01 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementParties2 .class, SettlementTypeAndIdentification3 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails10 .class, TransactionDetails13 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.029.001.01";

    public MxSese02900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02900101(final String xml) {
        this();
        MxSese02900101 tmp = parse(xml);
        sctiesSttlmAllgmtRmvlAdvc = tmp.getSctiesSttlmAllgmtRmvlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV01 }
     *     
     */
    public SecuritiesSettlementAllegementRemovalAdviceV01 getSctiesSttlmAllgmtRmvlAdvc() {
        return sctiesSttlmAllgmtRmvlAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV01 }
     *     
     */
    public MxSese02900101 setSctiesSttlmAllgmtRmvlAdvc(SecuritiesSettlementAllegementRemovalAdviceV01 value) {
        this.sctiesSttlmAllgmtRmvlAdvc = value;
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
    public static MxSese02900101 parse(String xml) {
        return ((MxSese02900101) MxReadImpl.parse(MxSese02900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02900101 parse(String xml, MxRead parserImpl) {
        return ((MxSese02900101) parserImpl.read(MxSese02900101 .class, xml, _classes));
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
     * Creates an MxSese02900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02900101 message
     * @return
     *     a new instance of MxSese02900101
     */
    public final static MxSese02900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02900101 .class);
    }

}
