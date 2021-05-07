
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
 * Class for setr.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr01400102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.014.001.02")
public class MxSetr01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "setr.014.001.02", required = true)
    protected Setr01400102 setr01400102;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, CancellationRight1 .class, CancellationRight2Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, CashAccountType1 .class, CashInOrOut4Choice.class, Charge8 .class, ChargeType1 .class, ChargeType6Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission6 .class, CommissionType1 .class, CommissionType5Code.class, CommissionWaiver2 .class, CopyInformation1 .class, CreditTransfer3 .class, CreditTransfer4 .class, Creditor2 .class, CurrencyAndAmount.class, Debtor2 .class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DirectDebitMandate2 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity3Choice.class, FinancialInstrumentQuantity4Choice.class, ForeignExchangeTerms5 .class, FormOfSecurity1Code.class, FundCashAccount1Code.class, FundSettlementParameters3 .class, FundSettlementParameters4 .class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary4 .class, InvestmentAccount13 .class, InvestmentAccount15 .class, MxSetr01400102 .class, NameAndAddress4 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument10Choice.class, PaymentInstrument7Choice.class, PaymentTransaction20 .class, PostalAddress1 .class, ReceivingPartiesAndAccount3 .class, SecurityIdentification1Choice.class, Setr01400102 .class, SimpleIdentificationInformation.class, SwitchOrder2 .class, SwitchOrderInstruction1 .class, SwitchRedemptionLegOrder2 .class, SwitchSubscriptionLegOrder2 .class, Tax6 .class, TaxCalculationInformation1 .class, TaxExemptionReason1 .class, TaxType1 .class, TaxType7Code.class, TaxationBasis1 .class, TaxationBasis3Code.class, UKTaxGroupUnitCode.class, WaivingInstruction2Code.class, WaivingType1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.014.001.02";

    public MxSetr01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01400102(final String xml) {
        this();
        MxSetr01400102 tmp = parse(xml);
        setr01400102 = tmp.getSetr01400102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr01400102 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr01400102 }
     *     
     */
    public Setr01400102 getSetr01400102() {
        return setr01400102;
    }

    /**
     * Sets the value of the setr01400102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr01400102 }
     *     
     */
    public MxSetr01400102 setSetr01400102(Setr01400102 value) {
        this.setr01400102 = value;
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
    public static MxSetr01400102 parse(String xml) {
        return ((MxSetr01400102) MxReadImpl.parse(MxSetr01400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01400102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01400102) parserImpl.read(MxSetr01400102 .class, xml, _classes));
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
     * Creates an MxSetr01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01400102 message
     * @return
     *     a new instance of MxSetr01400102
     */
    public final static MxSetr01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01400102 .class);
    }

}
