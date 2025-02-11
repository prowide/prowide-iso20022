
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
 * Class for pacs.003.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiToFICstmrDrctDbt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.11")
public class MxPacs00300111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FIToFICstmrDrctDbt", required = true)
    protected FIToFICustomerDirectDebitV11 fiToFICstmrDrctDbt;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails15 .class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges16 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DirectDebitTransaction12 .class, DirectDebitTransactionInformation31 .class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, FIToFICustomerDirectDebitV11 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader125 .class, LocalInstrument2Choice.class, MandateRelatedInformation16 .class, MandateSetupReason1Choice.class, MxPacs00300111 .class, NameAndAddress18 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PaymentIdentification13 .class, PaymentTypeInformation27 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, Priority3Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount4 .class, RemittanceInformation22 .class, RemittanceLocation8 .class, RemittanceLocationData2 .class, RemittanceLocationMethod2Code.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementDateTimeIndication1 .class, SettlementInstruction14 .class, SettlementMethod2Code.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.11";

    public MxPacs00300111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00300111(final String xml) {
        this();
        MxPacs00300111 tmp = parse(xml);
        fiToFICstmrDrctDbt = tmp.getFIToFICstmrDrctDbt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00300111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fiToFICstmrDrctDbt property.
     * 
     * @return
     *     possible object is
     *     {@link FIToFICustomerDirectDebitV11 }
     *     
     */
    public FIToFICustomerDirectDebitV11 getFIToFICstmrDrctDbt() {
        return fiToFICstmrDrctDbt;
    }

    /**
     * Sets the value of the fiToFICstmrDrctDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFICustomerDirectDebitV11 }
     *     
     */
    public MxPacs00300111 setFIToFICstmrDrctDbt(FIToFICustomerDirectDebitV11 value) {
        this.fiToFICstmrDrctDbt = value;
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
    public static MxPacs00300111 parse(String xml) {
        return ((MxPacs00300111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00300111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00300111 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00300111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00300111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00300111 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00300111) parserImpl.read(MxPacs00300111 .class, xml, _classes));
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
     * Creates an MxPacs00300111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00300111 message
     * @return
     *     a new instance of MxPacs00300111
     */
    public static final MxPacs00300111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00300111 .class);
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
