
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
 * Class for camt.006.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrTx"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.006.001.05")
public class MxCamt00600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrTx", required = true)
    protected ReturnTransactionV05 rtrTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, Amount3Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancelledStatusReason1Code.class, CashAccount25 .class, CashAccountAndEntry1 .class, CashAccountType2Choice.class, CashEntry1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, EntryStatus1Code.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, FinalStatus1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, LongPaymentIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader5 .class, MxCamt00600105 .class, NamePrefix1Code.class, NumberAndSumOfTransactions2 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PaymentCommon1 .class, PaymentIdentification4Choice.class, PaymentInstruction1 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatus1 .class, PaymentStatusCode5Choice.class, PaymentStatusReasonCode5Choice.class, PaymentTransactionParty2 .class, PaymentType3Choice.class, PaymentType3Code.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority1Code.class, PriorityCodeChoice.class, ProprietaryStatusJustification.class, QueueTransactionIdentificationDetails.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnTransactionV05 .class, ShortPaymentIdentification1 .class, SuspendedStatusReason1Code.class, System1 .class, Transaction24 .class, TransactionOrError1Choice.class, TransactionReport1 .class, TransactionReportOrError1Choice.class, Transactions5 .class, UnmatchedStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.006.001.05";

    public MxCamt00600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00600105(final String xml) {
        this();
        MxCamt00600105 tmp = parse(xml);
        rtrTx = tmp.getRtrTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrTx property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTransactionV05 }
     *     
     */
    public ReturnTransactionV05 getRtrTx() {
        return rtrTx;
    }

    /**
     * Sets the value of the rtrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTransactionV05 }
     *     
     */
    public MxCamt00600105 setRtrTx(ReturnTransactionV05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt00600105 parse(String xml) {
        return ((MxCamt00600105) MxReadImpl.parse(MxCamt00600105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00600105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00600105) parserImpl.read(MxCamt00600105 .class, xml, _classes));
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
     * Creates an MxCamt00600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00600105 message
     * @return
     *     a new instance of MxCamt00600105
     */
    public final static MxCamt00600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00600105 .class);
    }

}
