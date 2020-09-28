
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
 * Class for setr.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sbcptOrdrV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.010.001.03")
public class MxSetr01000103
    extends AbstractMX
{

    @XmlElement(name = "SbcptOrdrV03", required = true)
    protected SubscriptionOrderV03 sbcptOrdrV03;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BranchData.class, CancellationRight1Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, Charge17 .class, ChargeType11Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission10 .class, CommissionType6Code.class, CommissionWaiver3 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, CreditTransfer6 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount3 .class, DeliveryReceiptType2Code.class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, Equalisation1 .class, Extension1 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms6 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType2 .class, FundOrderType3Code.class, FundOrderType5Code.class, FundSettlementParameters4 .class, GenericIdentification1 .class, GenericIdentification11 .class, IncomePreference1Code.class, IndividualPerson9 .class, Intermediary8 .class, InvestmentAccount20 .class, InvestmentAccount21 .class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown1 .class, MessageIdentification1 .class, MxSetr01000103 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument12Choice.class, PaymentTransaction23 .class, PersonIdentificationType2Code.class, PlaceOfTradeIdentification1Choice.class, PostalAddress1 .class, ReceivingPartiesAndAccount3 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SubscriptionMultipleOrder4 .class, SubscriptionOrder8 .class, SubscriptionOrderV03 .class, Tax16 .class, TaxCalculationInformation5 .class, TaxType10Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, WaivingInstruction1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.010.001.03";

    public MxSetr01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01000103(final String xml) {
        this();
        MxSetr01000103 tmp = parse(xml);
        sbcptOrdrV03 = tmp.getSbcptOrdrV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sbcptOrdrV03 property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrderV03 }
     *     
     */
    public SubscriptionOrderV03 getSbcptOrdrV03() {
        return sbcptOrdrV03;
    }

    /**
     * Sets the value of the sbcptOrdrV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrderV03 }
     *     
     */
    public MxSetr01000103 setSbcptOrdrV03(SubscriptionOrderV03 value) {
        this.sbcptOrdrV03 = value;
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
    public static MxSetr01000103 parse(String xml) {
        return ((MxSetr01000103) MxReadImpl.parse(MxSetr01000103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01000103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01000103) parserImpl.read(MxSetr01000103 .class, xml, _classes));
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
     * Creates an MxSetr01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01000103 message
     * @return
     *     a new instance of MxSetr01000103
     */
    public final static MxSetr01000103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr01000103 .class);
    }

}
