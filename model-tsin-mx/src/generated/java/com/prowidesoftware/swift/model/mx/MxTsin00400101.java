
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
 * Class for tsin.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.004.001.01")
public class MxTsin00400101
    extends AbstractMX
{

    @XmlElement(name = "FinInvc", required = true)
    protected FinancialInvoiceV01 finInvc;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountingAccount1 .class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation1 .class, AdditionalInformation6 .class, AddressType2Code.class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ChargeType17Code.class, ChargeType8Code.class, ChargeTypeFormat3Choice.class, ChargesDetails2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Consignment2 .class, Contacts3 .class, CountryCodeAndName1 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmount.class, CurrencyReference2 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateFormat4Choice.class, DateType6Code.class, DiscountOrChargeType1Choice.class, DiscountType1Code.class, DiscountTypeFormat1Choice.class, DocumentAdjustment2 .class, DocumentGeneralInformation2 .class, DocumentIdentification22 .class, DocumentIdentification23 .class, DocumentIdentification7 .class, DocumentType3Code.class, ExchangeRateInformation1 .class, ExchangeRateType1Code.class, FinancialCard1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FinancialInvoiceV01 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Incoterms3 .class, Incoterms4Choice.class, InformationType1Choice.class, InformationType1Code.class, InvoiceHeader1 .class, LegalOrganisation1 .class, LineItem10 .class, LineItemAllowanceCharge1 .class, LineItemMonetarySummation1 .class, LineItemTax1 .class, LocalInstrument2Choice.class, MxTsin00400101 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, Packaging1 .class, Party8Choice.class, PartyIdentification45 .class, PaymentMeans1 .class, PaymentMethod4Code.class, PaymentPeriod1 .class, PaymentTerms3 .class, PaymentTime1Code.class, PaymentTypeInformation19 .class, Period1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductCharacteristics2 .class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity3 .class, Quantity4 .class, ServiceLevel8Choice.class, SettlementAllowanceCharge1 .class, SettlementMonetarySummation1 .class, SettlementSubTotalCalculatedTax1 .class, SettlementTax1 .class, TaxExemptionReason1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TaxType15Code.class, TaxTypeFormat1Choice.class, TradeAgreement6 .class, TradeDelivery1 .class, TradeParty1 .class, TradeProduct1 .class, TradeSettlement1 .class, TransportMeans3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.004.001.01";

    public MxTsin00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00400101(final String xml) {
        this();
        MxTsin00400101 tmp = parse(xml);
        finInvc = tmp.getFinInvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInvoiceV01 }
     *     
     */
    public FinancialInvoiceV01 getFinInvc() {
        return finInvc;
    }

    /**
     * Sets the value of the finInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInvoiceV01 }
     *     
     */
    public MxTsin00400101 setFinInvc(FinancialInvoiceV01 value) {
        this.finInvc = value;
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
    public static MxTsin00400101 parse(String xml) {
        return ((MxTsin00400101) MxReadImpl.parse(MxTsin00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00400101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00400101) parserImpl.read(MxTsin00400101 .class, xml, _classes));
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
     * Creates an MxTsin00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00400101 message
     * @return
     *     a new instance of MxTsin00400101
     */
    public final static MxTsin00400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsin00400101 .class);
    }

}
