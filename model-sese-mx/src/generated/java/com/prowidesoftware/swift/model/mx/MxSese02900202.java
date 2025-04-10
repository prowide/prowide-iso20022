
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
 * Class for sese.029.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmAllgmtRmvlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.029.002.02")
public class MxSese02900202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmAllgmtRmvlAdvc", required = true)
    protected SecuritiesSettlementAllegementRemovalAdviceV02Subset sctiesSttlmAllgmtRmvlAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountAndDirection12 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, Identification4 .class, IdentificationSource3Choice.class, MxSese02900202 .class, NameAndAddress12 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification1 .class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount68 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount17 .class, SecuritiesSettlementAllegementRemovalAdviceV02Subset.class, SecurityIdentification14 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementParties19 .class, SettlementTypeAndIdentification7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails31 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.029.002.02";

    public MxSese02900202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02900202(final String xml) {
        this();
        MxSese02900202 tmp = parse(xml);
        sctiesSttlmAllgmtRmvlAdvc = tmp.getSctiesSttlmAllgmtRmvlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02900202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV02Subset }
     *     
     */
    public SecuritiesSettlementAllegementRemovalAdviceV02Subset getSctiesSttlmAllgmtRmvlAdvc() {
        return sctiesSttlmAllgmtRmvlAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV02Subset }
     *     
     */
    public MxSese02900202 setSctiesSttlmAllgmtRmvlAdvc(SecuritiesSettlementAllegementRemovalAdviceV02Subset value) {
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
    public static MxSese02900202 parse(String xml) {
        return ((MxSese02900202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02900202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02900202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02900202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02900202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02900202 parse(String xml, MxRead parserImpl) {
        return ((MxSese02900202) parserImpl.read(MxSese02900202 .class, xml, _classes));
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
     * Creates an MxSese02900202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02900202 message
     * @return
     *     a new instance of MxSese02900202
     */
    public static final MxSese02900202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02900202 .class);
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
