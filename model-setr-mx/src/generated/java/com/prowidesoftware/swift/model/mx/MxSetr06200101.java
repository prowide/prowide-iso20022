
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.062.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "altrntvFndsRedOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.062.001.01")
public class MxSetr06200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AltrntvFndsRedOrdrConf", required = true)
    protected AlternativeFundsRedemptionOrderConfirmationV01 altrntvFndsRedOrdrConf;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 62;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference4 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AlternativeFundsRedemptionOrderConfirmationV01 .class, AmountRate1Choice.class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, Charge21 .class, ChargeType13Code.class, ChargeType1Choice.class, ContactInformation1 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, EUCapitalGain2Code.class, EUCapitalGainType1Choice.class, EUDividendStatus1Code.class, EUDividendStatusType1Choice.class, Equalisation2 .class, ExemptionReasonType1Choice.class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, GenericIdentification1 .class, GenericIdentification12 .class, GenericIdentification13 .class, HedgeFundOrderType2Code.class, HoldBackInformation1 .class, IdentificationType1Choice.class, IndividualPerson15 .class, Intermediary16 .class, IntermediaryRoleChoice1 .class, InvestmentAccount30 .class, InvestmentFundRole4Code.class, LotDetails1 .class, MessageIdentification1 .class, MxSetr06200101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PersonIdentificationType2Code.class, PostalAddress1 .class, PriceValue1 .class, ProfitAndLoss1Choice.class, RedemptionExecution10 .class, ResidentialStatus1Code.class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SidePocketInformation2 .class, SidePocketQuantityAndAmount1 .class, SimpleIdentificationInformation.class, SubAccount3 .class, Tax18 .class, TaxCalculationBasisType1Choice.class, TaxCalculationInformation7 .class, TaxDetailsType1Choice.class, TaxType11Code.class, TaxableIncomePerShareCalculated2Code.class, TaxableIncomePerShareCalculatedType1Choice.class, TaxationBasis2Code.class, TotalCharges4 .class, TotalTaxes4 .class, TypeOfPrice13Code.class, UnitPrice16 .class, UnitPriceType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.062.001.01";

    public MxSetr06200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr06200101(final String xml) {
        this();
        MxSetr06200101 tmp = parse(xml);
        altrntvFndsRedOrdrConf = tmp.getAltrntvFndsRedOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr06200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the altrntvFndsRedOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeFundsRedemptionOrderConfirmationV01 }
     *     
     */
    public AlternativeFundsRedemptionOrderConfirmationV01 getAltrntvFndsRedOrdrConf() {
        return altrntvFndsRedOrdrConf;
    }

    /**
     * Sets the value of the altrntvFndsRedOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeFundsRedemptionOrderConfirmationV01 }
     *     
     */
    public MxSetr06200101 setAltrntvFndsRedOrdrConf(AlternativeFundsRedemptionOrderConfirmationV01 value) {
        this.altrntvFndsRedOrdrConf = value;
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
    public static MxSetr06200101 parse(String xml) {
        return ((MxSetr06200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr06200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr06200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr06200101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr06200101) parserImpl.read(MxSetr06200101 .class, xml, _classes));
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
     * Creates an MxSetr06200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr06200101 message
     * @return
     *     a new instance of MxSetr06200101
     */
    public final static MxSetr06200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr06200101 .class);
    }

}
