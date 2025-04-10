
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
 * Class for pacs.004.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtRtr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.12")
public class MxPacs00400112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtRtr", required = true)
    protected PaymentReturnV12 pmtRtr;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails14 .class, AmountType4Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges12 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditTransferTransaction52 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader99 .class, Instruction4Code.class, InstructionForCreditorAgent3 .class, InstructionForNextAgent1 .class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData2Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxPacs00400112 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader18 .class, OriginalGroupInformation29 .class, OriginalTransactionReference36 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentReturnReason6 .class, PaymentReturnV12 .class, PaymentTransaction146 .class, PaymentTypeInformation27 .class, PaymentTypeInformation28 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, Priority3Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, ReturnReason5Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementDateTimeIndication1 .class, SettlementInstruction11 .class, SettlementMethod1Code.class, SettlementTimeRequest2 .class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxData1 .class, TaxInformation10 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransactionParties10 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.12";

    public MxPacs00400112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00400112(final String xml) {
        this();
        MxPacs00400112 tmp = parse(xml);
        pmtRtr = tmp.getPmtRtr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00400112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtRtr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnV12 }
     *     
     */
    public PaymentReturnV12 getPmtRtr() {
        return pmtRtr;
    }

    /**
     * Sets the value of the pmtRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnV12 }
     *     
     */
    public MxPacs00400112 setPmtRtr(PaymentReturnV12 value) {
        this.pmtRtr = value;
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
    public static MxPacs00400112 parse(String xml) {
        return ((MxPacs00400112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00400112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00400112 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00400112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00400112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00400112 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00400112) parserImpl.read(MxPacs00400112 .class, xml, _classes));
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
     * Creates an MxPacs00400112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00400112 message
     * @return
     *     a new instance of MxPacs00400112
     */
    public static final MxPacs00400112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00400112 .class);
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
