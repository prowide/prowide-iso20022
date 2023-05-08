
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
 * Class for setr.051.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdrConfCxlInstrV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.051.001.01")
public class MxSetr05100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RedOrdrConfCxlInstrV01", required = true)
    protected RedemptionOrderConfirmationCancellationInstructionV01 redOrdrConfCxlInstrV01;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 51;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BestExecution1Code.class, CancellationRight1Code.class, CashAccountIdentification1Choice.class, Charge18 .class, ChargeType11Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission10 .class, CommissionType6Code.class, CommissionWaiver3 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, CreditTransfer6 .class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUDividendStatus1Code.class, Equalisation1 .class, Extension1 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType3 .class, FundOrderType4Code.class, FundOrderType5Code.class, FundSettlementParameters4 .class, GenericIdentification1 .class, GenericIdentification11 .class, IncomePreference1Code.class, IndividualPerson12 .class, Intermediary9 .class, InvestmentAccount20 .class, InvestmentAccount21 .class, InvestmentFundOrderExecution1 .class, InvestmentFundOrderExecution2 .class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown1 .class, LateReport1Code.class, MessageIdentification1 .class, MxSetr05100101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentInstrument11Choice.class, PaymentTransaction22 .class, PersonIdentificationType2Code.class, PlaceOfTradeIdentification1Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss1Choice.class, ReceivingPartiesAndAccount3 .class, RedemptionExecution6 .class, RedemptionMultipleExecution3 .class, RedemptionOrderConfirmation1 .class, RedemptionOrderConfirmationCancellationInstructionV01 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, Tax14 .class, TaxCalculationInformation6 .class, TaxType11Code.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, TotalCharges3 .class, TotalCommissions3 .class, TotalTaxes3 .class, TradingCapacity2Code.class, TypeOfPrice10Code.class, UKTaxGroupUnitCode.class, UnitPrice10 .class, WaivingInstruction1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.051.001.01";

    public MxSetr05100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05100101(final String xml) {
        this();
        MxSetr05100101 tmp = parse(xml);
        redOrdrConfCxlInstrV01 = tmp.getRedOrdrConfCxlInstrV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdrConfCxlInstrV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderConfirmationCancellationInstructionV01 }
     *     
     */
    public RedemptionOrderConfirmationCancellationInstructionV01 getRedOrdrConfCxlInstrV01() {
        return redOrdrConfCxlInstrV01;
    }

    /**
     * Sets the value of the redOrdrConfCxlInstrV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderConfirmationCancellationInstructionV01 }
     *     
     */
    public MxSetr05100101 setRedOrdrConfCxlInstrV01(RedemptionOrderConfirmationCancellationInstructionV01 value) {
        this.redOrdrConfCxlInstrV01 = value;
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
    public static MxSetr05100101 parse(String xml) {
        return ((MxSetr05100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr05100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr05100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05100101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05100101) parserImpl.read(MxSetr05100101 .class, xml, _classes));
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
     * Creates an MxSetr05100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05100101 message
     * @return
     *     a new instance of MxSetr05100101
     */
    public static final MxSetr05100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05100101 .class);
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
