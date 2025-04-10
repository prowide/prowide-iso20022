
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
 * Class for camt.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00500103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.005.001.03")
public class MxCamt00500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.005.001.03", required = true)
    protected Camt00500103 camt00500103;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountCashEntryReturnCriteria2 .class, AccountCashEntrySearch2 .class, AccountIdentification1Choice.class, AccountIdentificationSearchCriteriaChoice.class, AmountRangeBoundary1 .class, AmountRangeChoice.class, Camt00500103 .class, CashClearingSystem1Code.class, CashPaymentStatus2Code.class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmountRange.class, DateAndDateTimeSearchChoice.class, DatePeriodDetails.class, DateSearchChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, EntryStatus1Code.class, FinalStatusCode.class, FromToAmountRange.class, ImpliedCurrencyAmountRangeChoice.class, ImpliedCurrencyAndAmountRange.class, Instruction1Code.class, InstructionStatusReturnCriteria.class, InstructionStatusSearch3 .class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00500103 .class, PaymentIdentification3Choice.class, PaymentInstructionReferenceDetails2 .class, PaymentInstructionReferenceDetails4 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentReturnCriteria2 .class, PaymentSearch3 .class, PaymentStatusCodeSearch2Choice.class, PaymentTransactionParty.class, PaymentType2Choice.class, PaymentType3Code.class, PendingStatus4Code.class, Priority1Code.class, PriorityCodeChoice.class, QueryType1Code.class, QueueTransactionIdentificationDetails.class, ReportIndicator1Code.class, SimpleIdentificationInformation.class, SystemReturnCriteria2 .class, SystemSearch2 .class, TransactionCriteria3 .class, TransactionCriteriaDefinition3Choice.class, TransactionQueryDefinition3 .class, TransactionReturnCriteria2 .class, TransactionSearchCriteria3 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.005.001.03";

    public MxCamt00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00500103(final String xml) {
        this();
        MxCamt00500103 tmp = parse(xml);
        camt00500103 = tmp.getCamt00500103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00500103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00500103 }
     *     
     */
    public Camt00500103 getCamt00500103() {
        return camt00500103;
    }

    /**
     * Sets the value of the camt00500103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00500103 }
     *     
     */
    public MxCamt00500103 setCamt00500103(Camt00500103 value) {
        this.camt00500103 = value;
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
    public static MxCamt00500103 parse(String xml) {
        return ((MxCamt00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00500103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00500103) parserImpl.read(MxCamt00500103 .class, xml, _classes));
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
     * Creates an MxCamt00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00500103 message
     * @return
     *     a new instance of MxCamt00500103
     */
    public static final MxCamt00500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00500103 .class);
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
