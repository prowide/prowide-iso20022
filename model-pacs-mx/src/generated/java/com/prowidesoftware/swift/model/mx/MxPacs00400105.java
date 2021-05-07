
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
 * Class for pacs.004.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtRtr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.05")
public class MxPacs00400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtRtr", required = true)
    protected PaymentReturnV05 pmtRtr;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails10 .class, AmountType4Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Charges2 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency21Choice.class, Frequency6Code.class, FrequencyPeriod1 .class, Garnishment1 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader54 .class, LocalInstrument2Choice.class, MandateRelatedInformation10 .class, MandateSetupReason1Choice.class, MxPacs00400105 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader2 .class, OriginalGroupInformation3 .class, OriginalTransactionReference20 .class, Party11Choice.class, PartyIdentification43 .class, PaymentMethod4Code.class, PaymentReturnReason1 .class, PaymentReturnV05 .class, PaymentTransaction50 .class, PaymentTypeInformation25 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Priority3Code.class, ReferredDocumentInformation6 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceInformation10 .class, ReturnReason5Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction1 .class, SettlementMethod1Code.class, StructuredRemittanceInformation12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation4 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.05";

    public MxPacs00400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00400105(final String xml) {
        this();
        MxPacs00400105 tmp = parse(xml);
        pmtRtr = tmp.getPmtRtr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtRtr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnV05 }
     *     
     */
    public PaymentReturnV05 getPmtRtr() {
        return pmtRtr;
    }

    /**
     * Sets the value of the pmtRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnV05 }
     *     
     */
    public MxPacs00400105 setPmtRtr(PaymentReturnV05 value) {
        this.pmtRtr = value;
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
    public static MxPacs00400105 parse(String xml) {
        return ((MxPacs00400105) MxReadImpl.parse(MxPacs00400105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00400105 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00400105) parserImpl.read(MxPacs00400105 .class, xml, _classes));
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
     * Creates an MxPacs00400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00400105 message
     * @return
     *     a new instance of MxPacs00400105
     */
    public final static MxPacs00400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00400105 .class);
    }

}
