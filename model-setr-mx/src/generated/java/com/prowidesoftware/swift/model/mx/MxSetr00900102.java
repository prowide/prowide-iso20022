
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
 * Class for setr.009.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr00900102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.009.001.02")
public class MxSetr00900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "setr.009.001.02", required = true)
    protected Setr00900102 setr00900102;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, AmountPrice1Choice.class, BICIdentification1 .class, CancellationRight1 .class, CancellationRight2Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, CashAccountType1 .class, Charge10 .class, ChargeType1 .class, ChargeType6Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission6 .class, CommissionType1 .class, CommissionType5Code.class, CommissionWaiver2 .class, CopyInformation1 .class, CountryAndResidentialStatusType1 .class, CreditTransfer3 .class, Creditor2 .class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, Debtor2 .class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DirectDebitMandate2 .class, DistributionPolicy1Code.class, EUCapitalGain1 .class, EUCapitalGain1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms4 .class, FormOfSecurity1Code.class, FundCashAccount1Code.class, FundOrderType1 .class, FundOrderType2Code.class, FundSettlementParameters3 .class, GenericIdentification1 .class, GenericIdentification8 .class, IdentificationType1 .class, IncomePreference1Code.class, IndividualPerson2 .class, Intermediary4 .class, InvestmentAccount13 .class, InvestmentAccount15 .class, MxSetr00900102 .class, NameAndAddress4 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument8Choice.class, PaymentTransaction16 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceType1 .class, PriceValue1 .class, ProfitAndLoss1Choice.class, ReceivingPartiesAndAccount3 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SecurityIdentification1Choice.class, Setr00900102 .class, SimpleIdentificationInformation.class, SubscriptionBulkExecution2 .class, SubscriptionExecution3 .class, Tax7 .class, TaxCalculationInformation3 .class, TaxExemptionReason1 .class, TaxType2 .class, TaxType5Code.class, TaxableIncomePerShareCalculated1 .class, TaxableIncomePerShareCalculated1Code.class, TaxationBasis1 .class, TaxationBasis3Code.class, TotalCharges2 .class, TotalCommissions2 .class, TotalTaxes2 .class, TypeOfPrice7Code.class, TypeOfPrice8Code.class, UnitPrice4 .class, UnitPrice5 .class, WaivingInstruction2Code.class, WaivingType1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.009.001.02";

    public MxSetr00900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00900102(final String xml) {
        this();
        MxSetr00900102 tmp = parse(xml);
        setr00900102 = tmp.getSetr00900102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr00900102 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr00900102 }
     *     
     */
    public Setr00900102 getSetr00900102() {
        return setr00900102;
    }

    /**
     * Sets the value of the setr00900102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr00900102 }
     *     
     */
    public MxSetr00900102 setSetr00900102(Setr00900102 value) {
        this.setr00900102 = value;
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
    public static MxSetr00900102 parse(String xml) {
        return ((MxSetr00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00900102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00900102) parserImpl.read(MxSetr00900102 .class, xml, _classes));
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
     * Creates an MxSetr00900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00900102 message
     * @return
     *     a new instance of MxSetr00900102
     */
    public static final MxSetr00900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00900102 .class);
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
