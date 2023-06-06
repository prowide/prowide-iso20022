
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
 * Class for setr.061.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "altrntvFndsSbcptOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.061.001.01")
public class MxSetr06100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AltrntvFndsSbcptOrdrConf", required = true)
    protected AlternativeFundsSubscriptionOrderConfirmationV01 altrntvFndsSbcptOrdrConf;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 61;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference4 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AlternativeFundsSubscriptionOrderConfirmationV01 .class, AmountRate1Choice.class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BeneficiaryInformation2 .class, Charge21 .class, ChargeType13Code.class, ChargeType1Choice.class, ContactInformation1 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, ERISAEligibility1Code.class, EUCapitalGain2Code.class, EUCapitalGainType1Choice.class, EUDividendStatus1Code.class, EUDividendStatusType1Choice.class, Equalisation2 .class, ExemptionReasonType1Choice.class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, GenericIdentification1 .class, GenericIdentification12 .class, GenericIdentification13 .class, HedgeFundOrderType1Code.class, IdentificationType1Choice.class, IndividualPerson15 .class, Intermediary16 .class, IntermediaryRoleChoice1 .class, InvestmentAccount30 .class, InvestmentFundRole4Code.class, MessageIdentification1 .class, MxSetr06100101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PersonIdentificationType2Code.class, PostalAddress1 .class, PriceValue1 .class, ProfitAndLoss1Choice.class, ResidentialStatus1Code.class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SidePocketInformation2 .class, SidePocketQuantityAndAmount1 .class, SimpleIdentificationInformation.class, SubAccount3 .class, SubscriptionExecution7 .class, Tax18 .class, TaxCalculationBasisType1Choice.class, TaxCalculationInformation7 .class, TaxDetailsType1Choice.class, TaxType11Code.class, TaxableIncomePerShareCalculated2Code.class, TaxableIncomePerShareCalculatedType1Choice.class, TaxationBasis2Code.class, TotalCharges4 .class, TotalTaxes4 .class, TypeOfPrice13Code.class, UnitPrice16 .class, UnitPriceType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.061.001.01";

    public MxSetr06100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr06100101(final String xml) {
        this();
        MxSetr06100101 tmp = parse(xml);
        altrntvFndsSbcptOrdrConf = tmp.getAltrntvFndsSbcptOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr06100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the altrntvFndsSbcptOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeFundsSubscriptionOrderConfirmationV01 }
     *     
     */
    public AlternativeFundsSubscriptionOrderConfirmationV01 getAltrntvFndsSbcptOrdrConf() {
        return altrntvFndsSbcptOrdrConf;
    }

    /**
     * Sets the value of the altrntvFndsSbcptOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeFundsSubscriptionOrderConfirmationV01 }
     *     
     */
    public MxSetr06100101 setAltrntvFndsSbcptOrdrConf(AlternativeFundsSubscriptionOrderConfirmationV01 value) {
        this.altrntvFndsSbcptOrdrConf = value;
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
    public static MxSetr06100101 parse(String xml) {
        return ((MxSetr06100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr06100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr06100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr06100101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr06100101) parserImpl.read(MxSetr06100101 .class, xml, _classes));
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
     * Creates an MxSetr06100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr06100101 message
     * @return
     *     a new instance of MxSetr06100101
     */
    public static final MxSetr06100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr06100101 .class);
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
