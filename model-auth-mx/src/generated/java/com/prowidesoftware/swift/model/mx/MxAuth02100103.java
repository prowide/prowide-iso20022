
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
 * Class for auth.021.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.021.001.03")
public class MxAuth02100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CtrctRegnAmdmntReq", required = true)
    protected ContractRegistrationAmendmentRequestV03 ctrctRegnAmdmntReq;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BenchmarkCurveName2Code.class, BenchmarkCurveName4Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashCollateral5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, ContractBalance1 .class, ContractBalanceType1Choice.class, ContractCollateral1 .class, ContractRegistrationAmendmentRequestV03 .class, CreditDebit3Code.class, CurrencyControlHeader4 .class, DateAndPlaceOfBirth1 .class, DepositType1Code.class, DocumentGeneralInformation5 .class, DocumentIdentification22 .class, ExchangeRate1 .class, ExchangeRateType1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FloatingInterestRate4 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InterestPaymentDateRange1 .class, InterestPaymentSchedule1 .class, InterestRate2Choice.class, InterestRateContractTerm1 .class, LegalOrganisation2 .class, LoanContract3 .class, LoanContractTranche1 .class, MxAuth02100103 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PaymentSchedule1 .class, PaymentScheduleType2Choice.class, PaymentScheduleType2Code.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, RateBasis1Code.class, RegisteredContract13 .class, RegisteredContract14 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SignatureEnvelopeReference.class, SpecialCondition1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SyndicatedLoan2 .class, TaxExemptionReasonFormat1Choice.class, TaxParty4 .class, TradeContract3 .class, TradeParty5 .class, UnderlyingContract3Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.021.001.03";

    public MxAuth02100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02100103(final String xml) {
        this();
        MxAuth02100103 tmp = parse(xml);
        ctrctRegnAmdmntReq = tmp.getCtrctRegnAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationAmendmentRequestV03 }
     *     
     */
    public ContractRegistrationAmendmentRequestV03 getCtrctRegnAmdmntReq() {
        return ctrctRegnAmdmntReq;
    }

    /**
     * Sets the value of the ctrctRegnAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationAmendmentRequestV03 }
     *     
     */
    public MxAuth02100103 setCtrctRegnAmdmntReq(ContractRegistrationAmendmentRequestV03 value) {
        this.ctrctRegnAmdmntReq = value;
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
    public static MxAuth02100103 parse(String xml) {
        return ((MxAuth02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02100103 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02100103) parserImpl.read(MxAuth02100103 .class, xml, _classes));
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
     * Creates an MxAuth02100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02100103 message
     * @return
     *     a new instance of MxAuth02100103
     */
    public static final MxAuth02100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02100103 .class);
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
