
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
 * Class for semt.015.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.015.002.02")
public class MxSemt01500202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntConf", required = true)
    protected IntraPositionMovementConfirmationV02Subset intraPosMvmntConf;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AdditionalParameters9 .class, AmountAndDirection24 .class, ClassificationType3Choice.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, EventFrequency3Code.class, FinancialInstrumentAttributes26 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource3Choice.class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, IntraPositionDetails13 .class, IntraPositionMovementConfirmationV02Subset.class, MarketIdentification2Choice.class, MarketIdentification9 .class, MarketType5Choice.class, MarketType5Code.class, MxSemt01500202 .class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherIdentification2 .class, OtherIdentification3 .class, PartialSettlement1Code.class, PartyIdentification51Choice.class, PaymentDirection3Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityBreakdown6 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType5Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecurityIdentification15 .class, SecurityIdentification16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.015.002.02";

    public MxSemt01500202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01500202(final String xml) {
        this();
        MxSemt01500202 tmp = parse(xml);
        intraPosMvmntConf = tmp.getIntraPosMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01500202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementConfirmationV02Subset }
     *     
     */
    public IntraPositionMovementConfirmationV02Subset getIntraPosMvmntConf() {
        return intraPosMvmntConf;
    }

    /**
     * Sets the value of the intraPosMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementConfirmationV02Subset }
     *     
     */
    public MxSemt01500202 setIntraPosMvmntConf(IntraPositionMovementConfirmationV02Subset value) {
        this.intraPosMvmntConf = value;
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
    public static MxSemt01500202 parse(String xml) {
        return ((MxSemt01500202) MxReadImpl.parse(MxSemt01500202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01500202 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01500202) parserImpl.read(MxSemt01500202 .class, xml, _classes));
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
     * Creates an MxSemt01500202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01500202 message
     * @return
     *     a new instance of MxSemt01500202
     */
    public final static MxSemt01500202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01500202 .class);
    }

}
