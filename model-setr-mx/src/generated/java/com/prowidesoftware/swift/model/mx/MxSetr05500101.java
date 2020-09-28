
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.055.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "swtchOrdrConfCxlInstrV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.055.001.01")
public class MxSetr05500101
    extends AbstractMX
{

    @XmlElement(name = "SwtchOrdrConfCxlInstrV01", required = true)
    protected SwitchOrderConfirmationCancellationInstructionV01 swtchOrdrConfCxlInstrV01;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 55;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BestExecution1Code.class, BranchData.class, CardType1Code.class, CashAccountIdentification1Choice.class, CashInOrOut6Choice.class, Charge18 .class, ChargeType11Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission10 .class, CommissionType6Code.class, CommissionWaiver3 .class, CopyInformation2 .class, CreditTransfer6 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUDividendStatus1Code.class, Equalisation1 .class, Extension1 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundSettlementParameters3 .class, FundSettlementParameters4 .class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary9 .class, InvestmentAccount20 .class, InvestmentAccount21 .class, InvestmentFundOrderExecution1 .class, InvestmentFundOrderExecution2 .class, InvestmentFundRole2Code.class, LateReport1Code.class, MessageIdentification1 .class, MxSetr05500101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument11Choice.class, PaymentInstrument12Choice.class, PaymentTransaction26 .class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss1Choice.class, ReceivingPartiesAndAccount3 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SwitchExecution4 .class, SwitchOrderConfirmation1 .class, SwitchOrderConfirmationCancellationInstructionV01 .class, SwitchRedemptionLegExecution3 .class, SwitchSubscriptionLegExecution3 .class, Tax14 .class, TaxCalculationInformation6 .class, TaxType11Code.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, TotalCharges3 .class, TotalCommissions3 .class, TotalTaxes3 .class, TradingCapacity2Code.class, TypeOfPrice10Code.class, UKTaxGroupUnitCode.class, UnitPrice10 .class, WaivingInstruction1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.055.001.01";

    public MxSetr05500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05500101(final String xml) {
        this();
        MxSetr05500101 tmp = parse(xml);
        swtchOrdrConfCxlInstrV01 = tmp.getSwtchOrdrConfCxlInstrV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the swtchOrdrConfCxlInstrV01 property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderConfirmationCancellationInstructionV01 }
     *     
     */
    public SwitchOrderConfirmationCancellationInstructionV01 getSwtchOrdrConfCxlInstrV01() {
        return swtchOrdrConfCxlInstrV01;
    }

    /**
     * Sets the value of the swtchOrdrConfCxlInstrV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderConfirmationCancellationInstructionV01 }
     *     
     */
    public MxSetr05500101 setSwtchOrdrConfCxlInstrV01(SwitchOrderConfirmationCancellationInstructionV01 value) {
        this.swtchOrdrConfCxlInstrV01 = value;
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
    public static MxSetr05500101 parse(String xml) {
        return ((MxSetr05500101) MxReadImpl.parse(MxSetr05500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05500101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05500101) parserImpl.read(MxSetr05500101 .class, xml, _classes));
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
     * Creates an MxSetr05500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05500101 message
     * @return
     *     a new instance of MxSetr05500101
     */
    public final static MxSetr05500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr05500101 .class);
    }

}
