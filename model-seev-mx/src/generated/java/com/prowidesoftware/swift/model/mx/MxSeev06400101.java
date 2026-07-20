
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for seev.064.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "buyrPrtcnInstrAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.064.001.01")
public class MxSeev06400101
    extends AbstractMX
{

    @XmlElement(name = "BuyrPrtcnInstrAllgmtNtfctn", required = true)
    protected BuyerProtectionInstructionAllegementNotificationV01 buyrPrtcnInstrAllgmtNtfctn;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 64;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection110 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, BuyerProtectionInstructionAllegementNotificationV01 .class, CorporateActionElection4 .class, CorporateActionEventType125Choice.class, CorporateActionEventType41Code.class, CorporateActionGeneralInformation195 .class, CorporateActionOption18Code.class, CorporateActionOption47Choice.class, CorporateActionPrice99 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MxSeev06400101 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification122Choice.class, PartyIdentification143 .class, PercentagePrice1 .class, PostalAddress1 .class, PriceFormat50Choice.class, PriceFormat66Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, Quantity51Choice.class, ReceiveDelivery1Code.class, RelatedSettlementInstruction3 .class, SecuritiesAccountIdentification1Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate8Choice.class, TradeDateCode3Choice.class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.064.001.01";

    public MxSeev06400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev06400101(final String xml) {
        this();
        MxSeev06400101 tmp = parse(xml);
        buyrPrtcnInstrAllgmtNtfctn = tmp.getBuyrPrtcnInstrAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev06400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the buyrPrtcnInstrAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionInstructionAllegementNotificationV01 }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 getBuyrPrtcnInstrAllgmtNtfctn() {
        return buyrPrtcnInstrAllgmtNtfctn;
    }

    /**
     * Sets the value of the buyrPrtcnInstrAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionInstructionAllegementNotificationV01 }
     *     
     */
    public MxSeev06400101 setBuyrPrtcnInstrAllgmtNtfctn(BuyerProtectionInstructionAllegementNotificationV01 value) {
        this.buyrPrtcnInstrAllgmtNtfctn = value;
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
    public static MxSeev06400101 parse(String xml) {
        return ((MxSeev06400101) MxReadImpl.parse(MxSeev06400101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev06400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev06400101) MxReadImpl.parse(MxSeev06400101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev06400101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev06400101) parserImpl.read(MxSeev06400101 .class, xml, _classes));
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
     * Creates an MxSeev06400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev06400101 message
     * @return
     *     a new instance of MxSeev06400101
     */
    public static final MxSeev06400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev06400101 .class);
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
