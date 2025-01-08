
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
 * Class for pacs.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiToFICstmrDrctDbt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.02")
public class MxPacs00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FIToFICstmrDrctDbt", required = true)
    protected FIToFICustomerDirectDebitV02 fiToFICstmrDrctDbt;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails6 .class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargesInformation5 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DirectDebitTransaction6 .class, DirectDebitTransactionInformation10 .class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, FIToFICustomerDirectDebitV02 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, Frequency1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader34 .class, LocalInstrument2Choice.class, MandateRelatedInformation6 .class, MxPacs00300102 .class, NameAndAddress10 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Party6Choice.class, PartyIdentification32 .class, PaymentIdentification3 .class, PaymentTypeInformation22 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount1 .class, RemittanceInformation5 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, SequenceType1Code.class, ServiceLevel8Choice.class, SettlementInformation14 .class, SettlementMethod2Code.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.02";

    public MxPacs00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00300102(final String xml) {
        this();
        MxPacs00300102 tmp = parse(xml);
        fiToFICstmrDrctDbt = tmp.getFIToFICstmrDrctDbt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fiToFICstmrDrctDbt property.
     * 
     * @return
     *     possible object is
     *     {@link FIToFICustomerDirectDebitV02 }
     *     
     */
    public FIToFICustomerDirectDebitV02 getFIToFICstmrDrctDbt() {
        return fiToFICstmrDrctDbt;
    }

    /**
     * Sets the value of the fiToFICstmrDrctDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFICustomerDirectDebitV02 }
     *     
     */
    public MxPacs00300102 setFIToFICstmrDrctDbt(FIToFICustomerDirectDebitV02 value) {
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
    public static MxPacs00300102 parse(String xml) {
        return ((MxPacs00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00300102 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00300102) parserImpl.read(MxPacs00300102 .class, xml, _classes));
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
     * Creates an MxPacs00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00300102 message
     * @return
     *     a new instance of MxPacs00300102
     */
    public static final MxPacs00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00300102 .class);
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
