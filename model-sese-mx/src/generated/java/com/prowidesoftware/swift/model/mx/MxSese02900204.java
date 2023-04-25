
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
 * Class for sese.029.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmAllgmtRmvlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.029.002.04")
public class MxSese02900204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmAllgmtRmvlAdvc", required = true)
    protected SecuritiesSettlementAllegementRemovalAdvice002V04 sctiesSttlmAllgmtRmvlAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountAndDirection67 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, Identification16 .class, IdentificationSource4Choice.class, MxSese02900204 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification104Choice.class, PartyIdentification108 .class, PartyIdentification109 .class, PartyIdentification110 .class, PartyIdentification114Choice.class, PartyIdentification115Choice.class, PartyIdentification58Choice.class, PartyIdentificationAndAccount146 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount30 .class, SecuritiesSettlementAllegementRemovalAdvice002V04 .class, SecurityIdentification20 .class, SettlementDate12Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementParties49 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate6Choice.class, TradeDateCode4Choice.class, TransactionDetails83 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.029.002.04";

    public MxSese02900204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02900204(final String xml) {
        this();
        MxSese02900204 tmp = parse(xml);
        sctiesSttlmAllgmtRmvlAdvc = tmp.getSctiesSttlmAllgmtRmvlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02900204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementAllegementRemovalAdvice002V04 }
     *     
     */
    public SecuritiesSettlementAllegementRemovalAdvice002V04 getSctiesSttlmAllgmtRmvlAdvc() {
        return sctiesSttlmAllgmtRmvlAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementAllegementRemovalAdvice002V04 }
     *     
     */
    public MxSese02900204 setSctiesSttlmAllgmtRmvlAdvc(SecuritiesSettlementAllegementRemovalAdvice002V04 value) {
        this.sctiesSttlmAllgmtRmvlAdvc = value;
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
    public static MxSese02900204 parse(String xml) {
        return ((MxSese02900204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02900204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02900204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02900204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02900204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02900204 parse(String xml, MxRead parserImpl) {
        return ((MxSese02900204) parserImpl.read(MxSese02900204 .class, xml, _classes));
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
     * Creates an MxSese02900204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02900204 message
     * @return
     *     a new instance of MxSese02900204
     */
    public static final MxSese02900204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02900204 .class);
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
