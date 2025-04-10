
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
 * Class for camt.086.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkSvcsBllgStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.03")
public class MxCamt08600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkSvcsBllgStmt", required = true)
    protected BankServicesBillingStatementV03 bkSvcsBllgStmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 86;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLevel1Code.class, AccountLevel2Code.class, AccountSchemeName1Choice.class, AccountTax1 .class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmountAndDirection34 .class, BalanceAdjustment1 .class, BalanceAdjustmentType1Code.class, BankServicesBillingStatementV03 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BillingBalance1 .class, BillingBalanceType1Choice.class, BillingChargeMethod1Code.class, BillingCompensation1 .class, BillingCompensationType1Choice.class, BillingCurrencyType1Code.class, BillingCurrencyType2Code.class, BillingMethod1 .class, BillingMethod1Choice.class, BillingMethod2 .class, BillingMethod3 .class, BillingMethod4 .class, BillingPrice1 .class, BillingRate1 .class, BillingRateIdentification1Choice.class, BillingService2 .class, BillingServiceAdjustment1 .class, BillingServiceCommonIdentification1 .class, BillingServiceIdentification2 .class, BillingServiceIdentification3 .class, BillingServiceParameters2 .class, BillingServiceParameters3 .class, BillingServicesAmount1 .class, BillingServicesAmount2 .class, BillingServicesAmount3 .class, BillingServicesTax1 .class, BillingServicesTax2 .class, BillingServicesTax3 .class, BillingStatement3 .class, BillingStatementStatus1Code.class, BillingSubServiceIdentification1 .class, BillingSubServiceQualifier1Choice.class, BillingSubServiceQualifier1Code.class, BillingTaxCalculationMethod1Code.class, BillingTaxIdentification2 .class, BillingTaxRegion2 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountCharacteristics3 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CompensationMethod1Code.class, Contact4 .class, CurrencyExchange6 .class, DatePeriod1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstitutionIdentification19 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, MxCamt08600103 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Pagination1 .class, ParentCashAccount3 .class, Party43Choice.class, PartyIdentification138 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProprietaryBankTransactionCodeStructure1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, ReportHeader6 .class, ResidenceLocation1Choice.class, ServiceAdjustmentType1Code.class, ServicePaymentMethod1Code.class, ServiceTaxDesignation1 .class, ServiceTaxDesignation1Code.class, StatementGroup3 .class, TaxCalculation1 .class, TaxReason1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.03";

    public MxCamt08600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08600103(final String xml) {
        this();
        MxCamt08600103 tmp = parse(xml);
        bkSvcsBllgStmt = tmp.getBkSvcsBllgStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkSvcsBllgStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankServicesBillingStatementV03 }
     *     
     */
    public BankServicesBillingStatementV03 getBkSvcsBllgStmt() {
        return bkSvcsBllgStmt;
    }

    /**
     * Sets the value of the bkSvcsBllgStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankServicesBillingStatementV03 }
     *     
     */
    public MxCamt08600103 setBkSvcsBllgStmt(BankServicesBillingStatementV03 value) {
        this.bkSvcsBllgStmt = value;
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
    public static MxCamt08600103 parse(String xml) {
        return ((MxCamt08600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt08600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt08600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08600103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08600103) parserImpl.read(MxCamt08600103 .class, xml, _classes));
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
     * Creates an MxCamt08600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08600103 message
     * @return
     *     a new instance of MxCamt08600103
     */
    public static final MxCamt08600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08600103 .class);
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
