
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
 * Class for camt.005.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getTx"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.005.001.11")
public class MxCamt00500111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetTx", required = true)
    protected GetTransactionV11 getTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCashEntryReturnCriteria3 .class, AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, ActiveAmountRange3Choice.class, ActiveCurrencyAndAmountRange3 .class, ActiveOrHistoricAmountRange2Choice.class, ActiveOrHistoricCurrencyAndAmountRange2 .class, AddressType2Code.class, AddressType3Choice.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccountEntrySearch8 .class, CashPaymentStatus2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, DateAndDateTimeSearch3Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, EntryStatus1Code.class, FinalStatusCode.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FromToAmountRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GetTransactionV11 .class, ImpliedCurrencyAmountRange1Choice.class, ImpliedCurrencyAndAmountRange1 .class, Instruction1Code.class, InstructionStatusReturnCriteria1 .class, InstructionStatusSearch5 .class, LongPaymentIdentification4 .class, MessageHeader9 .class, MxCamt00500111 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PaymentIdentification8Choice.class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentReturnCriteria4 .class, PaymentSearch10 .class, PaymentStatusCodeSearch2Choice.class, PaymentTransactionParty4 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingStatus4Code.class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority1Choice.class, Priority5Code.class, QueryType2Code.class, QueueTransactionIdentification1 .class, ReportIndicator1Code.class, RequestType4Choice.class, ShortPaymentIdentification4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemReturnCriteria2 .class, SystemSearch5 .class, TransactionCriteria11 .class, TransactionCriteria8Choice.class, TransactionQuery8 .class, TransactionReturnCriteria5 .class, TransactionSearchCriteria11 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.005.001.11";

    public MxCamt00500111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00500111(final String xml) {
        this();
        MxCamt00500111 tmp = parse(xml);
        getTx = tmp.getGetTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00500111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getTx property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionV11 }
     *     
     */
    public GetTransactionV11 getGetTx() {
        return getTx;
    }

    /**
     * Sets the value of the getTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionV11 }
     *     
     */
    public MxCamt00500111 setGetTx(GetTransactionV11 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00500111 parse(String xml) {
        return ((MxCamt00500111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00500111 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00500111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00500111 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00500111) parserImpl.read(MxCamt00500111 .class, xml, _classes));
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
     * Creates an MxCamt00500111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00500111 message
     * @return
     *     a new instance of MxCamt00500111
     */
    public final static MxCamt00500111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00500111 .class);
    }

}
