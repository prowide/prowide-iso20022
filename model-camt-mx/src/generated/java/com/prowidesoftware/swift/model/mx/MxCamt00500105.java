
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
 * Class for camt.005.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getTx"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.005.001.05")
public class MxCamt00500105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetTx", required = true)
    protected GetTransactionV05 getTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCashEntryReturnCriteria2 .class, AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, ActiveAmountRange1Choice.class, ActiveCurrencyAndAmountRange1 .class, ActiveOrHistoricAmountRange1Choice.class, ActiveOrHistoricCurrencyAndAmountRange1 .class, AddressType2Code.class, AmountRange2Choice.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccountEntrySearch3 .class, CashPaymentStatus2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, CurrencyAndAmountRange2 .class, DateAndDateTimeSearchChoice.class, DatePeriodDetails.class, DateSearchChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, EntryStatus1Code.class, FinalStatusCode.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FromToAmountRange.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetTransactionV05 .class, ImpliedCurrencyAmountRangeChoice.class, ImpliedCurrencyAndAmountRange.class, Instruction1Code.class, InstructionStatusReturnCriteria.class, InstructionStatusSearch3 .class, LongPaymentIdentification1 .class, MessageHeader2 .class, MxCamt00500105 .class, PaymentIdentification4Choice.class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentReturnCriteria3 .class, PaymentSearch4 .class, PaymentStatusCodeSearch2Choice.class, PaymentTransactionParty2 .class, PaymentType3Choice.class, PaymentType3Code.class, PendingStatus4Code.class, PostalAddress6 .class, Priority1Code.class, PriorityCode2Choice.class, QueryType2Code.class, QueueTransactionIdentificationDetails.class, ReportIndicator1Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ShortPaymentIdentification1 .class, SystemReturnCriteria2 .class, SystemSearch3 .class, TransactionCriteria1Choice.class, TransactionCriteria4 .class, TransactionQuery1 .class, TransactionReturnCriteria3 .class, TransactionSearchCriteria4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.005.001.05";

    public MxCamt00500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00500105(final String xml) {
        this();
        MxCamt00500105 tmp = parse(xml);
        getTx = tmp.getGetTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getTx property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionV05 }
     *     
     */
    public GetTransactionV05 getGetTx() {
        return getTx;
    }

    /**
     * Sets the value of the getTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionV05 }
     *     
     */
    public MxCamt00500105 setGetTx(GetTransactionV05 value) {
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
    public static MxCamt00500105 parse(String xml) {
        return ((MxCamt00500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00500105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00500105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00500105) parserImpl.read(MxCamt00500105 .class, xml, _classes));
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
     * Creates an MxCamt00500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00500105 message
     * @return
     *     a new instance of MxCamt00500105
     */
    public final static MxCamt00500105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00500105 .class);
    }

}
