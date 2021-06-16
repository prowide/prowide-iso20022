
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
 * Class for sese.029.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmAllgmtRmvlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.029.002.05")
public class MxSese02900205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmAllgmtRmvlAdvc", required = true)
    protected SecuritiesSettlementAllegementRemovalAdvice002V05 sctiesSttlmAllgmtRmvlAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountAndDirection67 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, Identification16 .class, IdentificationSource4Choice.class, MxSese02900205 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesSettlementAllegementRemovalAdvice002V05 .class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementParties90 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails139 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.029.002.05";

    public MxSese02900205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02900205(final String xml) {
        this();
        MxSese02900205 tmp = parse(xml);
        sctiesSttlmAllgmtRmvlAdvc = tmp.getSctiesSttlmAllgmtRmvlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02900205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementAllegementRemovalAdvice002V05 }
     *     
     */
    public SecuritiesSettlementAllegementRemovalAdvice002V05 getSctiesSttlmAllgmtRmvlAdvc() {
        return sctiesSttlmAllgmtRmvlAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementAllegementRemovalAdvice002V05 }
     *     
     */
    public MxSese02900205 setSctiesSttlmAllgmtRmvlAdvc(SecuritiesSettlementAllegementRemovalAdvice002V05 value) {
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
    public static MxSese02900205 parse(String xml) {
        return ((MxSese02900205) MxReadImpl.parse(MxSese02900205 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02900205 parse(String xml, MxRead parserImpl) {
        return ((MxSese02900205) parserImpl.read(MxSese02900205 .class, xml, _classes));
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
     * Creates an MxSese02900205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02900205 message
     * @return
     *     a new instance of MxSese02900205
     */
    public final static MxSese02900205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02900205 .class);
    }

}
