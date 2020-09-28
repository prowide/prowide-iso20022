
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.019.001.01")
public class MxAuth01900101
    extends AbstractMX
{

    @XmlElement(name = "CtrctRegnConf", required = true)
    protected ContractRegistrationConfirmationV01 ctrctRegnConf;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName4Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashCollateral5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod4Code.class, ContactDetails2 .class, ContractBalance1 .class, ContractBalanceType1Choice.class, ContractClosureReason1Choice.class, ContractCollateral1 .class, ContractRegistrationConfirmationV01 .class, CreditDebit3Code.class, CurrencyControlHeader2 .class, DateAndPlaceOfBirth.class, DepositType1Code.class, DocumentGeneralInformation3 .class, DocumentIdentification22 .class, DocumentIdentification28 .class, DocumentIdentification29 .class, ExchangeRate1 .class, ExchangeRateType1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FloatingInterestRate4 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InterestPaymentDateRange1 .class, InterestPaymentDateRange2 .class, InterestPaymentSchedule1Choice.class, InterestRate2Choice.class, InterestRateContractTerm1 .class, LegalOrganisation2 .class, LoanContract1 .class, LoanContractTranche1 .class, MxAuth01900101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification77 .class, PaymentDateRange1 .class, PaymentDateRange2 .class, PaymentSchedule1Choice.class, PaymentScheduleType1Choice.class, PaymentScheduleType1Code.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress19 .class, PostalAddress6 .class, RateBasis1Code.class, RegisteredContract4 .class, RegisteredContractAmendment1 .class, RegisteredContractCommunication1 .class, RegisteredContractJournal1 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SignatureEnvelopeReference.class, SpecialCondition1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SyndicatedLoan1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TradeContract1 .class, TradeParty2 .class, UnderlyingContract1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.019.001.01";

    public MxAuth01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01900101(final String xml) {
        this();
        MxAuth01900101 tmp = parse(xml);
        ctrctRegnConf = tmp.getCtrctRegnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnConf property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationConfirmationV01 }
     *     
     */
    public ContractRegistrationConfirmationV01 getCtrctRegnConf() {
        return ctrctRegnConf;
    }

    /**
     * Sets the value of the ctrctRegnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationConfirmationV01 }
     *     
     */
    public MxAuth01900101 setCtrctRegnConf(ContractRegistrationConfirmationV01 value) {
        this.ctrctRegnConf = value;
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
    public static MxAuth01900101 parse(String xml) {
        return ((MxAuth01900101) MxReadImpl.parse(MxAuth01900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01900101) parserImpl.read(MxAuth01900101 .class, xml, _classes));
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
     * Creates an MxAuth01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01900101 message
     * @return
     *     a new instance of MxAuth01900101
     */
    public final static MxAuth01900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth01900101 .class);
    }

}
