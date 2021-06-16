
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
 * Class for camt.086.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkSvcsBllgStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.01")
public class MxCamt08600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkSvcsBllgStmt", required = true)
    protected BankServicesBillingStatementV01 bkSvcsBllgStmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 86;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLevel1Code.class, AccountLevel2Code.class, AccountSchemeName1Choice.class, AccountTax1 .class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection34 .class, BalanceAdjustment1 .class, BalanceAdjustmentType1Code.class, BankServicesBillingStatementV01 .class, BillingBalance1 .class, BillingBalanceType1Choice.class, BillingChargeMethod1Code.class, BillingCompensation1 .class, BillingCompensationType1Choice.class, BillingCurrencyType1Code.class, BillingCurrencyType2Code.class, BillingMethod1 .class, BillingMethod1Choice.class, BillingMethod2 .class, BillingMethod3 .class, BillingMethod4 .class, BillingPrice1 .class, BillingRate1 .class, BillingRateIdentification1Choice.class, BillingService1 .class, BillingServiceAdjustment1 .class, BillingServiceCommonIdentification1 .class, BillingServiceIdentification1 .class, BillingServiceIdentification2 .class, BillingServiceParameters1 .class, BillingServiceParameters2 .class, BillingServicesAmount1 .class, BillingServicesAmount2 .class, BillingServicesAmount3 .class, BillingServicesTax1 .class, BillingServicesTax2 .class, BillingServicesTax3 .class, BillingStatement1 .class, BillingStatementStatus1Code.class, BillingSubServiceIdentification1 .class, BillingSubServiceQualifier1Choice.class, BillingSubServiceQualifier1Code.class, BillingTaxCalculationMethod1Code.class, BillingTaxIdentification1 .class, BillingTaxRegion1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount16 .class, CashAccountCharacteristics1 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CompensationMethod1Code.class, ContactDetails3 .class, CurrencyExchange6 .class, DatePeriod1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstitutionIdentification9 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, MxCamt08600101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Pagination.class, ParentCashAccount1 .class, Party13Choice.class, PartyIdentification58 .class, PostalAddress11 .class, PostalAddress6 .class, PreferredContactMethod1Code.class, ReportHeader3 .class, ResidenceLocation1Choice.class, ServiceAdjustmentType1Code.class, ServicePaymentMethod1Code.class, ServiceTaxDesignation1 .class, ServiceTaxDesignation1Code.class, StatementGroup1 .class, TaxCalculation1 .class, TaxReason1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.01";

    public MxCamt08600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08600101(final String xml) {
        this();
        MxCamt08600101 tmp = parse(xml);
        bkSvcsBllgStmt = tmp.getBkSvcsBllgStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkSvcsBllgStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankServicesBillingStatementV01 }
     *     
     */
    public BankServicesBillingStatementV01 getBkSvcsBllgStmt() {
        return bkSvcsBllgStmt;
    }

    /**
     * Sets the value of the bkSvcsBllgStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankServicesBillingStatementV01 }
     *     
     */
    public MxCamt08600101 setBkSvcsBllgStmt(BankServicesBillingStatementV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt08600101 parse(String xml) {
        return ((MxCamt08600101) MxReadImpl.parse(MxCamt08600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08600101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08600101) parserImpl.read(MxCamt08600101 .class, xml, _classes));
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
     * Creates an MxCamt08600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08600101 message
     * @return
     *     a new instance of MxCamt08600101
     */
    public final static MxCamt08600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08600101 .class);
    }

}
