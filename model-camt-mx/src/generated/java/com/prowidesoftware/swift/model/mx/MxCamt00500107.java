
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
 * Class for camt.005.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getTx"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.005.001.07")
public class MxCamt00500107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetTx", required = true)
    protected GetTransactionV07 getTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCashEntryReturnCriteria3 .class, AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, ActiveAmountRange3Choice.class, ActiveCurrencyAndAmountRange3 .class, ActiveOrHistoricAmountRange2Choice.class, ActiveOrHistoricCurrencyAndAmountRange2 .class, AddressType2Code.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccountEntrySearch5 .class, CashPaymentStatus2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTimeSearch3Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, EntryStatus1Code.class, FinalStatusCode.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FromToAmountRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GetTransactionV07 .class, ImpliedCurrencyAmountRange1Choice.class, ImpliedCurrencyAndAmountRange1 .class, Instruction1Code.class, InstructionStatusReturnCriteria1 .class, InstructionStatusSearch4 .class, LongPaymentIdentification1 .class, MessageHeader9 .class, MxCamt00500107 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party34Choice.class, PartyIdentification125 .class, PaymentIdentification5Choice.class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentReturnCriteria4 .class, PaymentSearch7 .class, PaymentStatusCodeSearch2Choice.class, PaymentTransactionParty2 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingStatus4Code.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority1Code.class, PriorityCode3Choice.class, QueryType2Code.class, QueueTransactionIdentification1 .class, ReportIndicator1Code.class, RequestType4Choice.class, ShortPaymentIdentification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemReturnCriteria2 .class, SystemSearch3 .class, TransactionCriteria4Choice.class, TransactionCriteria7 .class, TransactionQuery4 .class, TransactionReturnCriteria5 .class, TransactionSearchCriteria7 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.005.001.07";

    public MxCamt00500107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00500107(final String xml) {
        this();
        MxCamt00500107 tmp = parse(xml);
        getTx = tmp.getGetTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00500107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getTx property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionV07 }
     *     
     */
    public GetTransactionV07 getGetTx() {
        return getTx;
    }

    /**
     * Sets the value of the getTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionV07 }
     *     
     */
    public MxCamt00500107 setGetTx(GetTransactionV07 value) {
        this.getTx = value;
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
    public static MxCamt00500107 parse(String xml) {
        return ((MxCamt00500107) MxReadImpl.parse(MxCamt00500107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00500107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00500107) parserImpl.read(MxCamt00500107 .class, xml, _classes));
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
     * Creates an MxCamt00500107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00500107 message
     * @return
     *     a new instance of MxCamt00500107
     */
    public final static MxCamt00500107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00500107 .class);
    }

}
