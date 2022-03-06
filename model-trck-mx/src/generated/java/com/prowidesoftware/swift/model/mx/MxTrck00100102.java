
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
 * Class for trck.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtStsTrckrUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trck.001.001.02")
public class MxTrck00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtStsTrckrUpd", required = true)
    protected PaymentStatusTrackerUpdateV02 pmtStsTrckrUpd;
    public final static transient String BUSINESS_PROCESS = "trck";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, Charges7 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditTransferTransaction46 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyExchange13 .class, CurrencyExchange15 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstitutionIdentification21 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Instruction4Code.class, InstructionForCreditorAgent3 .class, InstructionForNextAgent1 .class, LocalInstrument2Choice.class, MxTrck00100102 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessInstruction4 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentIdentification10 .class, PaymentRejectReturnReason1 .class, PaymentStatusReason1 .class, PaymentStatusTrackerUpdateV02 .class, PaymentTypeInformation28 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, Priority3Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation16 .class, RemittanceLocation7 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, ReturnReason5Choice.class, ServiceLevel8Choice.class, SettlementDateTimeIndication1 .class, SettlementInstruction9 .class, SettlementMethod1Code.class, SettlementTimeRequest2 .class, StatusReason6Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxInformation8 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, TrackerData6 .class, TrackerHeader6 .class, TrackerParty2Choice.class, TrackerPartyIdentification2 .class, TrackerPaymentTransaction10 .class, TrackerRecord4 .class, TrackerStatus1 .class, TrackerStatusAndTransaction12 .class, TransactionParties8 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:trck.001.001.02";

    public MxTrck00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrck00100102(final String xml) {
        this();
        MxTrck00100102 tmp = parse(xml);
        pmtStsTrckrUpd = tmp.getPmtStsTrckrUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrck00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtStsTrckrUpd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusTrackerUpdateV02 }
     *     
     */
    public PaymentStatusTrackerUpdateV02 getPmtStsTrckrUpd() {
        return pmtStsTrckrUpd;
    }

    /**
     * Sets the value of the pmtStsTrckrUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusTrackerUpdateV02 }
     *     
     */
    public MxTrck00100102 setPmtStsTrckrUpd(PaymentStatusTrackerUpdateV02 value) {
        this.pmtStsTrckrUpd = value;
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
    public static MxTrck00100102 parse(String xml) {
        return ((MxTrck00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrck00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrck00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrck00100102 parse(String xml, MxRead parserImpl) {
        return ((MxTrck00100102) parserImpl.read(MxTrck00100102 .class, xml, _classes));
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
     * Creates an MxTrck00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrck00100102 message
     * @return
     *     a new instance of MxTrck00100102
     */
    public final static MxTrck00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrck00100102 .class);
    }

}
