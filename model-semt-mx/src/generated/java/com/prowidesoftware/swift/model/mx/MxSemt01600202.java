
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
 * Class for semt.016.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.016.002.02")
public class MxSemt01600202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPstngRpt", required = true)
    protected IntraPositionMovementPostingReportV02Subset intraPosMvmntPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection24 .class, ClassificationType3Choice.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, EventFrequency3Code.class, EventFrequency4Code.class, FinancialInstrumentAttributes27 .class, FinancialInstrumentDetails7 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, Frequency6Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, IntraPositionDetails18 .class, IntraPositionMovementDetails6 .class, IntraPositionMovementPostingReportV02Subset.class, MarketIdentification2Choice.class, MarketIdentification9 .class, MarketType5Choice.class, MarketType5Code.class, MxSemt01600202 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherIdentification2 .class, Pagination.class, PartyIdentification51Choice.class, PaymentDirection3Choice.class, Period2 .class, Period2Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityBreakdown6 .class, References21Choice.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType5Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecurityIdentification15 .class, Statement22 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.016.002.02";

    public MxSemt01600202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01600202(final String xml) {
        this();
        MxSemt01600202 tmp = parse(xml);
        intraPosMvmntPstngRpt = tmp.getIntraPosMvmntPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01600202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPostingReportV02Subset }
     *     
     */
    public IntraPositionMovementPostingReportV02Subset getIntraPosMvmntPstngRpt() {
        return intraPosMvmntPstngRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPostingReportV02Subset }
     *     
     */
    public MxSemt01600202 setIntraPosMvmntPstngRpt(IntraPositionMovementPostingReportV02Subset value) {
        this.intraPosMvmntPstngRpt = value;
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
    public static MxSemt01600202 parse(String xml) {
        return ((MxSemt01600202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01600202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01600202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01600202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01600202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01600202 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01600202) parserImpl.read(MxSemt01600202 .class, xml, _classes));
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
     * Creates an MxSemt01600202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01600202 message
     * @return
     *     a new instance of MxSemt01600202
     */
    public static final MxSemt01600202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01600202 .class);
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
