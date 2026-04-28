
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
 * Class for camt.086.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkSvcsBllgStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.02")
public class MxCamt08600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkSvcsBllgStmt", required = true)
    protected BankServicesBillingStatementV02 bkSvcsBllgStmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 86;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLevel1Code.class, AccountLevel2Code.class, AccountSchemeName1Choice.class, AccountTax1 .class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection34 .class, BalanceAdjustment1 .class, BalanceAdjustmentType1Code.class, BankServicesBillingStatementV02 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BillingBalance1 .class, BillingBalanceType1Choice.class, BillingChargeMethod1Code.class, BillingCompensation1 .class, BillingCompensationType1Choice.class, BillingCurrencyType1Code.class, BillingCurrencyType2Code.class, BillingMethod1 .class, BillingMethod1Choice.class, BillingMethod2 .class, BillingMethod3 .class, BillingMethod4 .class, BillingPrice1 .class, BillingRate1 .class, BillingRateIdentification1Choice.class, BillingService2 .class, BillingServiceAdjustment1 .class, BillingServiceCommonIdentification1 .class, BillingServiceIdentification2 .class, BillingServiceIdentification3 .class, BillingServiceParameters2 .class, BillingServiceParameters3 .class, BillingServicesAmount1 .class, BillingServicesAmount2 .class, BillingServicesAmount3 .class, BillingServicesTax1 .class, BillingServicesTax2 .class, BillingServicesTax3 .class, BillingStatement2 .class, BillingStatementStatus1Code.class, BillingSubServiceIdentification1 .class, BillingSubServiceQualifier1Choice.class, BillingSubServiceQualifier1Code.class, BillingTaxCalculationMethod1Code.class, BillingTaxIdentification1 .class, BillingTaxRegion1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountCharacteristics2 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CompensationMethod1Code.class, ContactDetails3 .class, CurrencyExchange6 .class, DatePeriod1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstitutionIdentification9 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, MxCamt08600102 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Pagination.class, ParentCashAccount2 .class, Party13Choice.class, PartyIdentification58 .class, PostalAddress11 .class, PostalAddress6 .class, PreferredContactMethod1Code.class, ProprietaryBankTransactionCodeStructure1 .class, ReportHeader3 .class, ResidenceLocation1Choice.class, ServiceAdjustmentType1Code.class, ServicePaymentMethod1Code.class, ServiceTaxDesignation1 .class, ServiceTaxDesignation1Code.class, StatementGroup2 .class, TaxCalculation1 .class, TaxReason1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.02";

    public MxCamt08600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08600102(final String xml) {
        this();
        MxCamt08600102 tmp = parse(xml);
        bkSvcsBllgStmt = tmp.getBkSvcsBllgStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkSvcsBllgStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankServicesBillingStatementV02 }
     *     
     */
    public BankServicesBillingStatementV02 getBkSvcsBllgStmt() {
        return bkSvcsBllgStmt;
    }

    /**
     * Sets the value of the bkSvcsBllgStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankServicesBillingStatementV02 }
     *     
     */
    public MxCamt08600102 setBkSvcsBllgStmt(BankServicesBillingStatementV02 value) {
        this.bkSvcsBllgStmt = value;
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
    public static MxCamt08600102 parse(String xml) {
        return ((MxCamt08600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt08600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt08600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08600102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08600102) parserImpl.read(MxCamt08600102 .class, xml, _classes));
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
     * Creates an MxCamt08600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08600102 message
     * @return
     *     a new instance of MxCamt08600102
     */
    public final static MxCamt08600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08600102 .class);
    }

}
