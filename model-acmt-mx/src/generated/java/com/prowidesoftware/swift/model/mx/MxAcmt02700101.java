
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
 * Class for acmt.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.01")
public class MxAcmt02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctSwtchInfReq", required = true)
    protected AccountSwitchInformationRequestV01 acctSwtchInfReq;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountSwitchDetails1 .class, AccountSwitchInformationRequestV01 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BalanceTransfer1 .class, BalanceTransferFundingLimit1 .class, BalanceTransferReference1 .class, BalanceTransferWindow1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessDayConvention1Code.class, CashAccount24 .class, CashAccount36 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Cheque7 .class, ChequeDelivery1Code.class, ChequeDeliveryMethod1Choice.class, ChequeType2Code.class, CitizenshipInformation1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationAddress3 .class, ContactDetails2 .class, CountryAndResidentialStatusType1 .class, CreditDebitCode.class, CreditTransferTransaction27 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EndPoint1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency1 .class, Frequency10Code.class, Frequency37Choice.class, Gender1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification44 .class, GenericIdentification47 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, IndividualPerson19 .class, IndividualPersonNameLong1 .class, Instruction3Code.class, InstructionForCreditorAgent1 .class, LocalInstrument2Choice.class, MessageIdentification1 .class, MxAcmt02700101 .class, NameAndAddress10 .class, NamePrefix1Code.class, NamePrefix2Choice.class, NewAccount1 .class, Organisation20 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationLegalStatus1Code.class, OtherIdentification1Choice.class, Party34Choice.class, PartyIdentification125 .class, PaymentIdentification1 .class, PaymentTypeInformation19 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PersonIdentificationType5Code.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceInformation14 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, ResidentialStatus1Code.class, ResponseDetails1 .class, ServiceLevel8Choice.class, SettlementMethod1Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation6 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRateMarker1Code.class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, TransferInstruction1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.01";

    public MxAcmt02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02700101(final String xml) {
        this();
        MxAcmt02700101 tmp = parse(xml);
        acctSwtchInfReq = tmp.getAcctSwtchInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchInformationRequestV01 }
     *     
     */
    public AccountSwitchInformationRequestV01 getAcctSwtchInfReq() {
        return acctSwtchInfReq;
    }

    /**
     * Sets the value of the acctSwtchInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchInformationRequestV01 }
     *     
     */
    public MxAcmt02700101 setAcctSwtchInfReq(AccountSwitchInformationRequestV01 value) {
        this.acctSwtchInfReq = value;
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
    public static MxAcmt02700101 parse(String xml) {
        return ((MxAcmt02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02700101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02700101) parserImpl.read(MxAcmt02700101 .class, xml, _classes));
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
     * Creates an MxAcmt02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02700101 message
     * @return
     *     a new instance of MxAcmt02700101
     */
    public static final MxAcmt02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt02700101 .class);
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
