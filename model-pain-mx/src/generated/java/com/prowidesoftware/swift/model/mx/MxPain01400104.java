
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
 * Class for pain.014.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cdtrPmtActvtnReqStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.014.001.04")
public class MxPain01400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CdtrPmtActvtnReqStsRpt", required = true)
    protected CreditorPaymentActivationRequestStatusReportV04 cdtrPmtActvtnReqStsRpt;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, Charges2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorPaymentActivationRequestStatusReportV04 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader46 .class, LocalInstrument2Choice.class, MxPain01400104 .class, NamePrefix1Code.class, NumberOfTransactionsPerStatus3 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation25 .class, OriginalPaymentInstruction14 .class, OriginalTransactionReference21 .class, Party11Choice.class, PartyIdentification43 .class, PaymentMethod4Code.class, PaymentTransaction59 .class, PaymentTypeInformation19 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount1 .class, RemittanceInformation6 .class, ServiceLevel8Choice.class, StatusReason6Choice.class, StatusReasonInformation9 .class, StructuredRemittanceInformation8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionGroupStatus3Code.class, TransactionIndividualStatus3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.014.001.04";

    public MxPain01400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain01400104(final String xml) {
        this();
        MxPain01400104 tmp = parse(xml);
        cdtrPmtActvtnReqStsRpt = tmp.getCdtrPmtActvtnReqStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain01400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cdtrPmtActvtnReqStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorPaymentActivationRequestStatusReportV04 }
     *     
     */
    public CreditorPaymentActivationRequestStatusReportV04 getCdtrPmtActvtnReqStsRpt() {
        return cdtrPmtActvtnReqStsRpt;
    }

    /**
     * Sets the value of the cdtrPmtActvtnReqStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorPaymentActivationRequestStatusReportV04 }
     *     
     */
    public MxPain01400104 setCdtrPmtActvtnReqStsRpt(CreditorPaymentActivationRequestStatusReportV04 value) {
        this.cdtrPmtActvtnReqStsRpt = value;
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
    public static MxPain01400104 parse(String xml) {
        return ((MxPain01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain01400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain01400104 parse(String xml, MxRead parserImpl) {
        return ((MxPain01400104) parserImpl.read(MxPain01400104 .class, xml, _classes));
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
     * Creates an MxPain01400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain01400104 message
     * @return
     *     a new instance of MxPain01400104
     */
    public final static MxPain01400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain01400104 .class);
    }

}
