
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
 * Class for camt.110.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstgtnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.110.001.01")
public class MxCamt11000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvstgtnReq", required = true)
    protected InvestigationRequestV01 invstgtnReq;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 110;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalRequestData1Choice.class, AddressType2Code.class, AddressType3Choice.class, AdjustmentRequest1 .class, AmendmentInformationDetails14 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancellationReason33Choice.class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, CompensationRequest1 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriod5 .class, DebitAuthorisation3 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, Document12 .class, DocumentAdjustment1 .class, DocumentFormat1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FileData1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InvestigationActionReason1 .class, InvestigationActionReason1Choice.class, InvestigationLocationData1 .class, InvestigationLocationMethod1Code.class, InvestigationReason1Choice.class, InvestigationReason2 .class, InvestigationReasonSubType1Choice.class, InvestigationRequest2 .class, InvestigationRequestAction1 .class, InvestigationRequestAction1Choice.class, InvestigationRequestV01 .class, InvestigationServiceLevel1Choice.class, InvestigationSubType1Choice.class, InvestigationType1Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData2Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxCamt11000101 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation29 .class, OriginalTransactionReference35 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyAndSignature3 .class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RelatedInvestigationData1 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction11 .class, SettlementMethod1Code.class, SkipPayload.class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, UnderlyingData2Choice.class, UnderlyingGroupInformation1 .class, UnderlyingInvestigationInstrument1Choice.class, UnderlyingPaymentInstruction8 .class, UnderlyingPaymentTransaction7 .class, UnderlyingStatementEntry5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.110.001.01";

    public MxCamt11000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt11000101(final String xml) {
        this();
        MxCamt11000101 tmp = parse(xml);
        invstgtnReq = tmp.getInvstgtnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt11000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestV01 }
     *     
     */
    public InvestigationRequestV01 getInvstgtnReq() {
        return invstgtnReq;
    }

    /**
     * Sets the value of the invstgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestV01 }
     *     
     */
    public MxCamt11000101 setInvstgtnReq(InvestigationRequestV01 value) {
        this.invstgtnReq = value;
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
    public static MxCamt11000101 parse(String xml) {
        return ((MxCamt11000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt11000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt11000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt11000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt11000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt11000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt11000101) parserImpl.read(MxCamt11000101 .class, xml, _classes));
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
     * Creates an MxCamt11000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt11000101 message
     * @return
     *     a new instance of MxCamt11000101
     */
    public final static MxCamt11000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt11000101 .class);
    }

}
