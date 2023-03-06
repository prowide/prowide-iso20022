
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.006.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrTx"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.006.001.07")
public class MxCamt00600107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrTx", required = true)
    protected ReturnTransactionV07 rtrTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, Amount3Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancelledStatusReason1Code.class, CashAccount36 .class, CashAccountAndEntry2 .class, CashAccountType2Choice.class, CashEntry2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, EntryStatus1Code.class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, FinalStatus1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, LongPaymentIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader8 .class, MxCamt00600107 .class, NamePrefix1Code.class, NumberAndSumOfTransactions2 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Pagination1 .class, Party34Choice.class, PartyIdentification125 .class, PaymentCommon3 .class, PaymentIdentification5Choice.class, PaymentInstruction26 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatus3 .class, PaymentStatusCode6Choice.class, PaymentStatusReasonCode7Choice.class, PaymentTransactionParty2 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority1Code.class, PriorityCode3Choice.class, ProprietaryStatusJustification1 .class, QueueTransactionIdentification1 .class, RequestType4Choice.class, ReturnTransactionV07 .class, SecuritiesTransactionReferences1 .class, ShortPaymentIdentification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SuspendedStatusReason1Code.class, System1 .class, Transaction59 .class, TransactionOrError3Choice.class, TransactionReport4 .class, TransactionReportOrError3Choice.class, Transactions7 .class, UnmatchedStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.006.001.07";

    public MxCamt00600107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00600107(final String xml) {
        this();
        MxCamt00600107 tmp = parse(xml);
        rtrTx = tmp.getRtrTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00600107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrTx property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTransactionV07 }
     *     
     */
    public ReturnTransactionV07 getRtrTx() {
        return rtrTx;
    }

    /**
     * Sets the value of the rtrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTransactionV07 }
     *     
     */
    public MxCamt00600107 setRtrTx(ReturnTransactionV07 value) {
        this.rtrTx = value;
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
    public static MxCamt00600107 parse(String xml) {
        return ((MxCamt00600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00600107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00600107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00600107) parserImpl.read(MxCamt00600107 .class, xml, _classes));
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
     * Creates an MxCamt00600107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00600107 message
     * @return
     *     a new instance of MxCamt00600107
     */
    public final static MxCamt00600107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00600107 .class);
    }

}
