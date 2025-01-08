
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
 * Class for pacs.008.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiToFICstmrCdtTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
public class MxPacs00800108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FIToFICstmrCdtTrf", required = true)
    protected FIToFICustomerCreditTransferV08 fiToFICstmrCdtTrf;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Charges7 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditTransferTransaction39 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, FIToFICustomerCreditTransferV08 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader93 .class, Instruction3Code.class, Instruction4Code.class, InstructionForCreditorAgent1 .class, InstructionForNextAgent1 .class, LocalInstrument2Choice.class, MxPacs00800108 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PaymentIdentification7 .class, PaymentTypeInformation28 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, Priority3Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation16 .class, RemittanceLocation7 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, ServiceLevel8Choice.class, SettlementDateTimeIndication1 .class, SettlementInstruction7 .class, SettlementMethod1Code.class, SettlementTimeRequest2 .class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxInformation8 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08";

    public MxPacs00800108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00800108(final String xml) {
        this();
        MxPacs00800108 tmp = parse(xml);
        fiToFICstmrCdtTrf = tmp.getFIToFICstmrCdtTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00800108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fiToFICstmrCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link FIToFICustomerCreditTransferV08 }
     *     
     */
    public FIToFICustomerCreditTransferV08 getFIToFICstmrCdtTrf() {
        return fiToFICstmrCdtTrf;
    }

    /**
     * Sets the value of the fiToFICstmrCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFICustomerCreditTransferV08 }
     *     
     */
    public MxPacs00800108 setFIToFICstmrCdtTrf(FIToFICustomerCreditTransferV08 value) {
        this.fiToFICstmrCdtTrf = value;
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
    public static MxPacs00800108 parse(String xml) {
        return ((MxPacs00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00800108 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00800108 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00800108) parserImpl.read(MxPacs00800108 .class, xml, _classes));
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
     * Creates an MxPacs00800108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00800108 message
     * @return
     *     a new instance of MxPacs00800108
     */
    public static final MxPacs00800108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00800108 .class);
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
