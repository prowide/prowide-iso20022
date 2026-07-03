
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
 * Class for camt.006.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrTx"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.11")
public class MxCamt00600111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrTx", required = true)
    protected ReturnTransactionV11 rtrTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, Amount3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CancelledStatusReason1Code.class, CashAccount43 .class, CashAccountAndEntry5 .class, CashAccountType2Choice.class, CashEntry2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, EntryStatus1Code.class, ErrorHandling3Choice.class, ErrorHandling5 .class, FinalStatus1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, LongPaymentIdentification4 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader8 .class, MxCamt00600111 .class, NamePrefix2Code.class, NumberAndSumOfTransactions2 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, OtherContact1 .class, Pagination1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PaymentCommon6 .class, PaymentIdentification8Choice.class, PaymentInstruction47 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatus6 .class, PaymentStatusCode6Choice.class, PaymentStatusReason1Choice.class, PaymentTransactionParty4 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority1Choice.class, Priority5Code.class, ProprietaryStatusJustification2 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QueueTransactionIdentification1 .class, RequestType4Choice.class, ReturnTransactionV11 .class, SecuritiesTransactionReferences1 .class, ShortPaymentIdentification4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SuspendedStatusReason1Code.class, System3 .class, Transaction159 .class, TransactionOrError6Choice.class, TransactionReport8 .class, TransactionReportOrError7Choice.class, Transactions11 .class, UnmatchedStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.11";

    public MxCamt00600111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00600111(final String xml) {
        this();
        MxCamt00600111 tmp = parse(xml);
        rtrTx = tmp.getRtrTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00600111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrTx property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTransactionV11 }
     *     
     */
    public ReturnTransactionV11 getRtrTx() {
        return rtrTx;
    }

    /**
     * Sets the value of the rtrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTransactionV11 }
     *     
     */
    public MxCamt00600111 setRtrTx(ReturnTransactionV11 value) {
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
    public static MxCamt00600111 parse(String xml) {
        return ((MxCamt00600111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00600111 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00600111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00600111 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00600111) parserImpl.read(MxCamt00600111 .class, xml, _classes));
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
     * Creates an MxCamt00600111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00600111 message
     * @return
     *     a new instance of MxCamt00600111
     */
    public final static MxCamt00600111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00600111 .class);
    }

}
