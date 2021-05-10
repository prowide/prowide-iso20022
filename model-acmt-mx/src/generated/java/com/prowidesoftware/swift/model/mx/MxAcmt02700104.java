
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
 * Class for acmt.027.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04")
public class MxAcmt02700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctSwtchInfReq", required = true)
    protected AccountSwitchInformationRequestV04 acctSwtchInfReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountSwitchDetails1 .class, AccountSwitchInformationRequestV04 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BalanceTransfer4 .class, BalanceTransferFundingLimit1 .class, BalanceTransferReference1 .class, BalanceTransferWindow1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, BusinessDayConvention1Code.class, CashAccount40 .class, CashAccount41 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Cheque11 .class, ChequeDelivery1Code.class, ChequeDeliveryMethod1Choice.class, ChequeType2Code.class, CitizenshipInformation1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationAddress3 .class, Contact4 .class, CountryAndResidentialStatusType1 .class, CreditDebitCode.class, CreditTransferTransaction51 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EndPoint1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency1 .class, Frequency10Code.class, Frequency37Choice.class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, Gender1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification44 .class, GenericIdentification47 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, IndividualPerson36 .class, IndividualPersonNameLong2 .class, InstructionForCreditorAgent3 .class, LocalInstrument2Choice.class, MessageIdentification1 .class, MxAcmt02700104 .class, NameAndAddress16 .class, NamePrefix2Code.class, NewAccount3 .class, Organisation35 .class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationLegalStatus1Code.class, OtherContact1 .class, OtherIdentification1Choice.class, Party38Choice.class, PartyIdentification135 .class, PaymentIdentification6 .class, PaymentTypeInformation26 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PersonIdentificationType5Code.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, RemittanceLocation6 .class, RemittanceLocationMethod2Code.class, ResidentialStatus1Code.class, ResponseDetails1 .class, ServiceLevel8Choice.class, SettlementMethod4Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxData1 .class, TaxInformation10 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRateMarker1Code.class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransferInstruction1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04";

    public MxAcmt02700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02700104(final String xml) {
        this();
        MxAcmt02700104 tmp = parse(xml);
        acctSwtchInfReq = tmp.getAcctSwtchInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchInformationRequestV04 }
     *     
     */
    public AccountSwitchInformationRequestV04 getAcctSwtchInfReq() {
        return acctSwtchInfReq;
    }

    /**
     * Sets the value of the acctSwtchInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchInformationRequestV04 }
     *     
     */
    public MxAcmt02700104 setAcctSwtchInfReq(AccountSwitchInformationRequestV04 value) {
        this.acctSwtchInfReq = value;
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
    public static MxAcmt02700104 parse(String xml) {
        return ((MxAcmt02700104) MxReadImpl.parse(MxAcmt02700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02700104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02700104) parserImpl.read(MxAcmt02700104 .class, xml, _classes));
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
     * Creates an MxAcmt02700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02700104 message
     * @return
     *     a new instance of MxAcmt02700104
     */
    public final static MxAcmt02700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt02700104 .class);
    }

}
