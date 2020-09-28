
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
 * Class for setr.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr00800102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.008.001.02")
public class MxSetr00800102
    extends AbstractMX
{

    @XmlElement(name = "setr.008.001.02", required = true)
    protected Setr00800102 setr00800102;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, CancellationRight1 .class, CancellationRight2Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, CashAccountType1 .class, Charge8 .class, ChargeType1 .class, ChargeType6Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission6 .class, CommissionType1 .class, CommissionType5Code.class, CommissionWaiver2 .class, CopyInformation1 .class, CountryAndResidentialStatusType1 .class, CreditTransfer4 .class, Creditor2 .class, Debtor2 .class, DeliveringPartiesAndAccount3 .class, DirectDebitMandate2 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms5 .class, FormOfSecurity1Code.class, FundCashAccount1Code.class, FundOrderType1 .class, FundOrderType2Code.class, FundSettlementParameters4 .class, GenericIdentification1 .class, GenericIdentification8 .class, IdentificationType1 .class, IncomePreference1Code.class, IndividualPerson2 .class, Intermediary4 .class, InvestmentAccount13 .class, InvestmentAccount15 .class, MxSetr00800102 .class, NameAndAddress4 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument9Choice.class, PaymentTransaction17 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, ReceivingPartiesAndAccount3 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SecurityIdentification1Choice.class, Setr00800102 .class, SimpleIdentificationInformation.class, SubscriptionBulkOrder2 .class, SubscriptionBulkOrderInstruction1 .class, SubscriptionOrder3 .class, Tax6 .class, TaxCalculationInformation1 .class, TaxExemptionReason1 .class, TaxType1 .class, TaxType7Code.class, TaxationBasis1 .class, TaxationBasis3Code.class, WaivingInstruction2Code.class, WaivingType1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.008.001.02";

    public MxSetr00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00800102(final String xml) {
        this();
        MxSetr00800102 tmp = parse(xml);
        setr00800102 = tmp.getSetr00800102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr00800102 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr00800102 }
     *     
     */
    public Setr00800102 getSetr00800102() {
        return setr00800102;
    }

    /**
     * Sets the value of the setr00800102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr00800102 }
     *     
     */
    public MxSetr00800102 setSetr00800102(Setr00800102 value) {
        this.setr00800102 = value;
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
    public static MxSetr00800102 parse(String xml) {
        return ((MxSetr00800102) MxReadImpl.parse(MxSetr00800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00800102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00800102) parserImpl.read(MxSetr00800102 .class, xml, _classes));
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
     * Creates an MxSetr00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00800102 message
     * @return
     *     a new instance of MxSetr00800102
     */
    public final static MxSetr00800102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr00800102 .class);
    }

}
