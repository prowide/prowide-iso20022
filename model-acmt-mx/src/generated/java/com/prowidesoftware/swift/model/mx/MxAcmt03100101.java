
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
 * Class for acmt.031.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchReqBalTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.031.001.01")
public class MxAcmt03100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctSwtchReqBalTrf", required = true)
    protected AccountSwitchRequestBalanceTransferV01 acctSwtchReqBalTrf;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountSwitchDetails1 .class, AccountSwitchRequestBalanceTransferV01 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BalanceTransfer1 .class, BalanceTransferFundingLimit1 .class, BalanceTransferReference1 .class, BalanceTransferWindow1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessDayConvention1Code.class, CashAccount24 .class, CashAccount36 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Cheque7 .class, ChequeDelivery1Code.class, ChequeDeliveryMethod1Choice.class, ChequeType2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditTransferTransaction27 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EndPoint1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency1 .class, Frequency10Code.class, Frequency37Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Instruction3Code.class, InstructionForCreditorAgent1 .class, LocalInstrument2Choice.class, MessageIdentification1 .class, MxAcmt03100101 .class, NameAndAddress10 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party34Choice.class, PartyIdentification125 .class, PaymentIdentification1 .class, PaymentTypeInformation19 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceInformation14 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, ResponseDetails1 .class, ServiceLevel8Choice.class, SettlementMethod1Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation6 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRateMarker1Code.class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, TransferInstruction1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.031.001.01";

    public MxAcmt03100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt03100101(final String xml) {
        this();
        MxAcmt03100101 tmp = parse(xml);
        acctSwtchReqBalTrf = tmp.getAcctSwtchReqBalTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt03100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchReqBalTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchRequestBalanceTransferV01 }
     *     
     */
    public AccountSwitchRequestBalanceTransferV01 getAcctSwtchReqBalTrf() {
        return acctSwtchReqBalTrf;
    }

    /**
     * Sets the value of the acctSwtchReqBalTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchRequestBalanceTransferV01 }
     *     
     */
    public MxAcmt03100101 setAcctSwtchReqBalTrf(AccountSwitchRequestBalanceTransferV01 value) {
        this.acctSwtchReqBalTrf = value;
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
    public static MxAcmt03100101 parse(String xml) {
        return ((MxAcmt03100101) MxReadImpl.parse(MxAcmt03100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt03100101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt03100101) parserImpl.read(MxAcmt03100101 .class, xml, _classes));
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
     * Creates an MxAcmt03100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt03100101 message
     * @return
     *     a new instance of MxAcmt03100101
     */
    public final static MxAcmt03100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt03100101 .class);
    }

}
