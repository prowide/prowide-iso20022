
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
 * Class for tsin.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcAssgnmtSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01")
public class MxTsin00700101
    extends AbstractMX
{

    @XmlElement(name = "InvcAssgnmtSts", required = true)
    protected InvoiceAssignmentStatusV01 invcAssgnmtSts;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Adjustment5 .class, AdjustmentDirection1Code.class, AgreedRate1 .class, Algorithm5Code.class, AlgorithmAndDigest1 .class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification4 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessLetter1 .class, CashAccount16 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, Contacts3 .class, CopyDuplicate1Code.class, CountrySubdivision1Choice.class, CreditDebitCode.class, DateAndPlaceOfBirth.class, EncapsulatedBusinessMessage1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FinancialInstitutionIdentification8 .class, FinancialItem1Tsin00700101 .class, FinancialItemParameters1Tsin00700101 .class, FinancingAllowedSummary1 .class, FinancingDateDetails1 .class, FinancingInformationAndStatus1 .class, FinancingItemList1Tsin00700101 .class, FinancingNotificationParties1Tsin00700101 .class, FinancingRateOrAmountChoice.class, FinancingResult1 .class, FinancingStatusReason1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification3 .class, GenericIdentification4 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules2 .class, Instalment2 .class, InstalmentFinancingInformation1 .class, InvoiceAssignmentStatusV01 .class, InvoiceFinancingDetails1 .class, InvoiceTotals1 .class, LegalOrganisation1 .class, LocalInstrument2Choice.class, Location1 .class, MxTsin00700101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification2 .class, OrganisationIdentification6 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalInvoiceInformation1 .class, Party10Choice.class, Party2Choice.class, Party8Choice.class, Party9Choice.class, PartyIdentification2Choice.class, PartyIdentification42 .class, PartyIdentification45 .class, PartyIdentification8 .class, PaymentMeans1 .class, PaymentMethod4Code.class, PaymentTypeInformation19 .class, PersonIdentification3 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress6 .class, Priority2Code.class, Priority3Code.class, QualifiedDocumentInformation1 .class, QualifiedPartyAndXMLSignature1 .class, QualifiedPartyIdentification1 .class, RequestStatus1Code.class, ServiceLevel8Choice.class, SignatureEnvelope.class, SimpleIdentificationInformation2 .class, SingleQualifiedPartyIdentification1 .class, StatusReason4Choice.class, StrictPayload.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TechnicalValidationStatus1Code.class, TradeMarket1Choice.class, TradeParty1 .class, ValidationStatusInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01";

    public MxTsin00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00700101(final String xml) {
        this();
        MxTsin00700101 tmp = parse(xml);
        invcAssgnmtSts = tmp.getInvcAssgnmtSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcAssgnmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAssignmentStatusV01 }
     *     
     */
    public InvoiceAssignmentStatusV01 getInvcAssgnmtSts() {
        return invcAssgnmtSts;
    }

    /**
     * Sets the value of the invcAssgnmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAssignmentStatusV01 }
     *     
     */
    public MxTsin00700101 setInvcAssgnmtSts(InvoiceAssignmentStatusV01 value) {
        this.invcAssgnmtSts = value;
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
    public static MxTsin00700101 parse(String xml) {
        return ((MxTsin00700101) MxReadImpl.parse(MxTsin00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00700101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00700101) parserImpl.read(MxTsin00700101 .class, xml, _classes));
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
     * Creates an MxTsin00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00700101 message
     * @return
     *     a new instance of MxTsin00700101
     */
    public final static MxTsin00700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsin00700101 .class);
    }

}
