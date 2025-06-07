
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
 * Class for trck.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trckrInvstgtnStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trck.005.001.02")
public class MxTrck00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrckrInvstgtnStsNtfctn", required = true)
    protected TrackerInvestigationStatusNotificationV02 trckrInvstgtnStsNtfctn;
    public final static transient String BUSINESS_PROCESS = "trck";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails14 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstitutionIdentification21 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InvestigationIdentification1 .class, InvestigationRequestStatus1Choice.class, InvestigationRequestStatusReason1Choice.class, InvestigationSubType1Choice.class, InvestigationType2Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData2Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxTrck00500102 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessInstruction4 .class, OriginalGroupInformation29 .class, OriginalTransactionReference35 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction11 .class, SettlementMethod1Code.class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TrackerHeader8 .class, TrackerInvestigationRequest2 .class, TrackerInvestigationRequestStatus2 .class, TrackerInvestigationStatusNotificationV02 .class, TrackerParty2Choice.class, TrackerPartyIdentification2 .class, UnderlyingData1Choice.class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction8 .class, UnderlyingPaymentTransaction7 .class, UnderlyingStatementEntry4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trck.005.001.02";

    public MxTrck00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrck00500102(final String xml) {
        this();
        MxTrck00500102 tmp = parse(xml);
        trckrInvstgtnStsNtfctn = tmp.getTrckrInvstgtnStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrck00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trckrInvstgtnStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerInvestigationStatusNotificationV02 }
     *     
     */
    public TrackerInvestigationStatusNotificationV02 getTrckrInvstgtnStsNtfctn() {
        return trckrInvstgtnStsNtfctn;
    }

    /**
     * Sets the value of the trckrInvstgtnStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerInvestigationStatusNotificationV02 }
     *     
     */
    public MxTrck00500102 setTrckrInvstgtnStsNtfctn(TrackerInvestigationStatusNotificationV02 value) {
        this.trckrInvstgtnStsNtfctn = value;
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
    public static MxTrck00500102 parse(String xml) {
        return ((MxTrck00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrck00500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrck00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrck00500102 parse(String xml, MxRead parserImpl) {
        return ((MxTrck00500102) parserImpl.read(MxTrck00500102 .class, xml, _classes));
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
     * Creates an MxTrck00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrck00500102 message
     * @return
     *     a new instance of MxTrck00500102
     */
    public final static MxTrck00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrck00500102 .class);
    }

}
