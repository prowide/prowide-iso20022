
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for acmt.027.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.06")
public class MxAcmt02700106
    extends AbstractMX
{

    @XmlElement(name = "AcctSwtchInfReq", required = true)
    protected AccountSwitchInformationRequestV06 acctSwtchInfReq;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountSwitchDetails1 .class, AccountSwitchInformationRequestV06 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BalanceTransfer7 .class, BalanceTransferFundingLimit1 .class, BalanceTransferReference1 .class, BalanceTransferWindow1Code.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, BusinessDayConvention2Code.class, CashAccount40 .class, CashAccount43 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Cheque19 .class, ChequeDelivery1Code.class, ChequeDeliveryMethod1Choice.class, ChequeType2Code.class, CitizenshipInformation1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationAddress3 .class, Contact13 .class, CountryAndResidentialStatusType1 .class, CreditDebitCode.class, CreditTransferTransaction78 .class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, EndPoint2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency10Code.class, Frequency2 .class, Frequency37Choice.class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, Gender1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification44 .class, GenericIdentification47 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, IndividualPerson44 .class, IndividualPersonNameLong2 .class, InstructionForCreditorAgent3 .class, LocalInstrument2Choice.class, MessageIdentification1 .class, MxAcmt02700106 .class, NameAndAddress18 .class, NamePrefix2Code.class, NewAccount4 .class, Organisation43 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationLegalStatus1Code.class, OtherContact1 .class, OtherIdentification1Choice.class, Party52Choice.class, PartyIdentification272 .class, PaymentIdentification6 .class, PaymentTypeInformation26 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PersonIdentificationType5Code.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RegulatoryAuthority2 .class, RegulatoryReporting10 .class, RegulatoryReportingType1Choice.class, RegulatoryReportingType1Code.class, RemittanceAmount4 .class, RemittanceInformation26 .class, RemittanceLocation9 .class, RemittanceLocationMethod2Code.class, ResidentialStatus1Code.class, ResponseDetails1 .class, SecuritiesAttributes1 .class, ServiceLevel8Choice.class, SettlementMethod7Choice.class, StructuredRegulatoryReporting5 .class, StructuredRemittanceInformation22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRateMarker1Code.class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransferInstruction1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.027.001.06";

    public MxAcmt02700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02700106(final String xml) {
        this();
        MxAcmt02700106 tmp = parse(xml);
        acctSwtchInfReq = tmp.getAcctSwtchInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchInformationRequestV06 }
     *     
     */
    public AccountSwitchInformationRequestV06 getAcctSwtchInfReq() {
        return acctSwtchInfReq;
    }

    /**
     * Sets the value of the acctSwtchInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchInformationRequestV06 }
     *     
     */
    public MxAcmt02700106 setAcctSwtchInfReq(AccountSwitchInformationRequestV06 value) {
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
    public static MxAcmt02700106 parse(String xml) {
        return ((MxAcmt02700106) MxReadImpl.parse(MxAcmt02700106 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt02700106 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt02700106) MxReadImpl.parse(MxAcmt02700106 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02700106 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02700106) parserImpl.read(MxAcmt02700106 .class, xml, _classes));
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
     * Creates an MxAcmt02700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02700106 message
     * @return
     *     a new instance of MxAcmt02700106
     */
    public static final MxAcmt02700106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt02700106 .class);
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
