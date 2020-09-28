
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
 * Class for tsmt.054.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcPmtRcncltnSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01")
public class MxTsmt05400101
    extends AbstractMX
{

    @XmlElement(name = "InvcPmtRcncltnSts", required = true)
    protected InvoicePaymentReconciliationStatusV01 invcPmtRcncltnSts;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 54;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Adjustment5 .class, AdjustmentDirection1Code.class, Algorithm5Code.class, AlgorithmAndDigest1 .class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification4 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessLetter1 .class, CashAccount16 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, Contacts3 .class, CopyDuplicate1Code.class, CountrySubdivision1Choice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, EncapsulatedBusinessMessage1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FinancialInstitutionIdentification8 .class, FinancialItem1 .class, FinancialItemParameters1Tsmt05400101 .class, FinancingAllowedSummary1 .class, FinancingDateDetails1 .class, FinancingInformationAndStatus1 .class, FinancingRateOrAmountChoice.class, FinancingResult1 .class, FinancingStatusReason1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification3 .class, GenericIdentification4 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules2 .class, Instalment2 .class, InstalmentFinancingInformation1 .class, InvoiceFinancingDetails1 .class, InvoicePaymentReconciliationStatusV01 .class, InvoiceTotals1 .class, LegalOrganisation1 .class, LocalInstrument2Choice.class, Location1 .class, MxTsmt05400101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification2 .class, OrganisationIdentification6 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalInvoiceInformation1 .class, Party10Choice.class, Party2Choice.class, Party8Choice.class, Party9Choice.class, PartyIdentification2Choice.class, PartyIdentification42 .class, PartyIdentification45 .class, PartyIdentification8 .class, PaymentIdentification1 .class, PaymentMeans1 .class, PaymentMethod4Code.class, PaymentPeriod1 .class, PaymentTerms6 .class, PaymentTime1Code.class, PaymentTypeInformation19 .class, PersonIdentification3 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress6 .class, Priority2Code.class, Priority3Code.class, QualifiedDocumentInformation1 .class, QualifiedPartyAndXMLSignature1 .class, QualifiedPartyIdentification1 .class, ReconciliationList1Tsmt05400101 .class, RequestStatus1Code.class, ServiceLevel8Choice.class, SignatureEnvelope.class, SimpleIdentificationInformation2 .class, SingleQualifiedPartyIdentification1 .class, StatusReason4Choice.class, StrictPayload.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TechnicalValidationStatus1Code.class, TradeMarket1Choice.class, TradeParty1 .class, ValidationStatusInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01";

    public MxTsmt05400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt05400101(final String xml) {
        this();
        MxTsmt05400101 tmp = parse(xml);
        invcPmtRcncltnSts = tmp.getInvcPmtRcncltnSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt05400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcPmtRcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePaymentReconciliationStatusV01 }
     *     
     */
    public InvoicePaymentReconciliationStatusV01 getInvcPmtRcncltnSts() {
        return invcPmtRcncltnSts;
    }

    /**
     * Sets the value of the invcPmtRcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePaymentReconciliationStatusV01 }
     *     
     */
    public MxTsmt05400101 setInvcPmtRcncltnSts(InvoicePaymentReconciliationStatusV01 value) {
        this.invcPmtRcncltnSts = value;
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
    public static MxTsmt05400101 parse(String xml) {
        return ((MxTsmt05400101) MxReadImpl.parse(MxTsmt05400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt05400101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt05400101) parserImpl.read(MxTsmt05400101 .class, xml, _classes));
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
     * Creates an MxTsmt05400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt05400101 message
     * @return
     *     a new instance of MxTsmt05400101
     */
    public final static MxTsmt05400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt05400101 .class);
    }

}
