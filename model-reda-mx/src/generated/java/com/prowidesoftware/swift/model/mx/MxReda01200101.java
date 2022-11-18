
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
 * Class for reda.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.012.001.01")
public class MxReda01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctyRpt", required = true)
    protected SecurityReportV01 sctyRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType1Code.class, AddressType2Code.class, AmountOrPercentageRange1 .class, Appearance1Code.class, Appearance3Choice.class, AssignmentMethod1Code.class, AssignmentMethod2Choice.class, BenchmarkCurve6 .class, BenchmarkCurveName1Code.class, BenchmarkCurveName7Choice.class, BusinessError4 .class, CalculationType1Code.class, CalculationType3Choice.class, CallType1Code.class, CallType3Choice.class, ClassificationType2 .class, CommonFinancialInstrumentAttributes11 .class, CommunicationAddress3 .class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, DateTimePeriod2 .class, Debt5 .class, Derivative4 .class, DistributionPolicy1Code.class, DistributionPolicy2Choice.class, Equity3 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, FinancialInstrument97 .class, FinancialInstrumentForm2 .class, FinancialInstrumentIdentificationValidity3 .class, FinancialInstrumentName2 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity8Choice.class, Frequency35Choice.class, Frequency5Code.class, Future4 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GlobalNote1Code.class, GlobalNote2Choice.class, IdentificationSource3Choice.class, InitialPhysicalForm1Code.class, InitialPhysicalForm2Code.class, InitialPhysicalForm3Choice.class, InitialPhysicalForm4Choice.class, InstrumentSubStructureType1Code.class, InstrumentSubStructureType2Choice.class, InterestType3Code.class, InvestorRestrictionType1Code.class, InvestorRestrictionType3Choice.class, InvestorType1Code.class, InvestorType3Choice.class, Issuance6 .class, IssuanceAccount2 .class, Jurisdiction1 .class, LegalRestrictions1Code.class, LegalRestrictions2Code.class, LegalRestrictions4Choice.class, LegalRestrictions5Choice.class, MaturityRedemptionType1Code.class, MaturityRedemptionType3Choice.class, MessageHeader12 .class, MxReda01200101 .class, NameAndAddress4 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option15 .class, OptionParty1Code.class, OptionParty3Choice.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, OptionType8Choice.class, Organisation38 .class, OriginalBusinessInstruction1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentification177Choice.class, PostalAddress1 .class, PostalAddress3 .class, PreferenceToIncome1Code.class, PreferenceToIncome5Choice.class, Price8 .class, PriceRateOrAmount3Choice.class, PriceValue1 .class, PriceValueType3Code.class, PutType1Code.class, PutType3Choice.class, RateAndAmountFormat1Choice.class, RateOrAbsoluteValue1Choice.class, RateType12Code.class, RateType12FormatChoice.class, RestrictionType1Code.class, SecuritiesAccount19 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesTransactionType11Code.class, SecuritiesTransactionType31Choice.class, SecurityAttributes11 .class, SecurityCSDLink7 .class, SecurityIdentification39 .class, SecurityOrBusinessError4Choice.class, SecurityOrOperationalError4Choice.class, SecurityReportV01 .class, SecurityRestriction3 .class, SecurityRestrictionType2Choice.class, SecurityStatus2Code.class, SecurityStatus3Choice.class, SecurityWithHoldingTax1 .class, SettleStyle1Code.class, SettleStyle2Choice.class, SettlementInformation17 .class, SettlementType1Code.class, SettlementType3Choice.class, SettlementUnitType1Code.class, SettlementUnitType3Choice.class, Standardisation1Code.class, Standardisation3Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification2Choice.class, SystemPartyIdentification8 .class, TEFRARules1Code.class, TEFRARules3Choice.class, Term1 .class, TimeUnit1Code.class, TimeUnit3Choice.class, TradeTransactionCondition2Code.class, TradeTransactionCondition7Choice.class, TradingParameters2 .class, TypeOfPrice1Code.class, UnderlyingAttributes4 .class, UnitOfMeasure7Choice.class, UnitOfMeasure9Code.class, UnitOrFaceAmount1Choice.class, Warrant4 .class, WarrantStyle1Code.class, WarrantStyle3Choice.class, YieldCalculation6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.012.001.01";

    public MxReda01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01200101(final String xml) {
        this();
        MxReda01200101 tmp = parse(xml);
        sctyRpt = tmp.getSctyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityReportV01 }
     *     
     */
    public SecurityReportV01 getSctyRpt() {
        return sctyRpt;
    }

    /**
     * Sets the value of the sctyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityReportV01 }
     *     
     */
    public MxReda01200101 setSctyRpt(SecurityReportV01 value) {
        this.sctyRpt = value;
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
    public static MxReda01200101 parse(String xml) {
        return ((MxReda01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda01200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01200101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01200101) parserImpl.read(MxReda01200101 .class, xml, _classes));
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
     * Creates an MxReda01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01200101 message
     * @return
     *     a new instance of MxReda01200101
     */
    public final static MxReda01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01200101 .class);
    }

}
