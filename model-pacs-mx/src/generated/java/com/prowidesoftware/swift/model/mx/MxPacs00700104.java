
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
 * Class for pacs.007.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiToFIPmtRvsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.04")
public class MxPacs00700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FIToFIPmtRvsl", required = true)
    protected FIToFIPaymentReversalV04 fiToFIPmtRvsl;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails8 .class, AmountType3Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Charges2 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EquivalentAmount2 .class, FIToFIPaymentReversalV04 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency6Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader57 .class, LocalInstrument2Choice.class, MandateRelatedInformation8 .class, MxPacs00700104 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader3 .class, OriginalTransactionReference16 .class, Party11Choice.class, PartyIdentification43 .class, PaymentMethod4Code.class, PaymentReversalReason7 .class, PaymentTransaction45 .class, PaymentTypeInformation25 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount2 .class, RemittanceInformation7 .class, ReversalReason4Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction1 .class, SettlementInstruction4 .class, SettlementMethod1Code.class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.04";

    public MxPacs00700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00700104(final String xml) {
        this();
        MxPacs00700104 tmp = parse(xml);
        fiToFIPmtRvsl = tmp.getFIToFIPmtRvsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fiToFIPmtRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link FIToFIPaymentReversalV04 }
     *     
     */
    public FIToFIPaymentReversalV04 getFIToFIPmtRvsl() {
        return fiToFIPmtRvsl;
    }

    /**
     * Sets the value of the fiToFIPmtRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFIPaymentReversalV04 }
     *     
     */
    public MxPacs00700104 setFIToFIPmtRvsl(FIToFIPaymentReversalV04 value) {
        this.fiToFIPmtRvsl = value;
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
    public static MxPacs00700104 parse(String xml) {
        return ((MxPacs00700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00700104 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00700104) parserImpl.read(MxPacs00700104 .class, xml, _classes));
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
     * Creates an MxPacs00700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00700104 message
     * @return
     *     a new instance of MxPacs00700104
     */
    public static final MxPacs00700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00700104 .class);
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
