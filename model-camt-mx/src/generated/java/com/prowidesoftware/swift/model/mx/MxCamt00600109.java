
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
 * Class for camt.006.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrTx"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.09")
public class MxCamt00600109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrTx", required = true)
    protected ReturnTransactionV09 rtrTx;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, Amount3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancelledStatusReason1Code.class, CashAccount41 .class, CashAccountAndEntry4 .class, CashAccountType2Choice.class, CashEntry2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, EntryStatus1Code.class, ErrorHandling3Choice.class, ErrorHandling5 .class, FinalStatus1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, LongPaymentIdentification2 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader8 .class, MxCamt00600109 .class, NamePrefix2Code.class, NumberAndSumOfTransactions2 .class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, OtherContact1 .class, Pagination1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentCommon5 .class, PaymentIdentification6Choice.class, PaymentInstruction32 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatus6 .class, PaymentStatusCode6Choice.class, PaymentStatusReason1Choice.class, PaymentTransactionParty3 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority1Choice.class, Priority5Code.class, ProprietaryStatusJustification2 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QueueTransactionIdentification1 .class, RequestType4Choice.class, ReturnTransactionV09 .class, SecuritiesTransactionReferences1 .class, ShortPaymentIdentification2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SuspendedStatusReason1Code.class, System2 .class, Transaction74 .class, TransactionOrError5Choice.class, TransactionReport6 .class, TransactionReportOrError5Choice.class, Transactions9 .class, UnmatchedStatusReason1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.09";

    public MxCamt00600109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00600109(final String xml) {
        this();
        MxCamt00600109 tmp = parse(xml);
        rtrTx = tmp.getRtrTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00600109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrTx property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTransactionV09 }
     *     
     */
    public ReturnTransactionV09 getRtrTx() {
        return rtrTx;
    }

    /**
     * Sets the value of the rtrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTransactionV09 }
     *     
     */
    public MxCamt00600109 setRtrTx(ReturnTransactionV09 value) {
        this.rtrTx = value;
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
    public static MxCamt00600109 parse(String xml) {
        return ((MxCamt00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00600109 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00600109 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00600109) parserImpl.read(MxCamt00600109 .class, xml, _classes));
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
     * Creates an MxCamt00600109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00600109 message
     * @return
     *     a new instance of MxCamt00600109
     */
    public static final MxCamt00600109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00600109 .class);
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
