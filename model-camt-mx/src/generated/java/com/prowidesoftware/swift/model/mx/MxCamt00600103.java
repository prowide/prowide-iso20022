
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
 * Class for camt.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00600103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.006.001.03")
public class MxCamt00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.006.001.03", required = true)
    protected Camt00600103 camt00600103;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCashEntryDetails3 .class, AccountIdentification1Choice.class, AmountChoice.class, Camt00600103 .class, CancelledStatusReason1Code.class, CashAccountType2Code.class, CashClearingSystem1Code.class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, EntryStatus1Code.class, ErrorHandling2 .class, FinalStatusCode.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00600103 .class, Pagination.class, PaymentCommonDetails3 .class, PaymentDetails6 .class, PaymentIdentification3Choice.class, PaymentInstructionReferenceDetails2 .class, PaymentInstructionReferenceDetails4 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatusCode3Choice.class, PaymentStatusDetails3 .class, PaymentStatusReasonCode3Choice.class, PaymentTransactionParty.class, PaymentType2Choice.class, PaymentType3Code.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, Priority1Code.class, PriorityCodeChoice.class, ProprietaryStatusJustification.class, QueryReference.class, QueueTransactionIdentificationDetails.class, SimpleIdentificationInformation.class, SuspendedStatusReason1Code.class, SystemDetails2 .class, Transaction4 .class, TransactionReportDetails4 .class, Transactions3 .class, UnmatchedStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.006.001.03";

    public MxCamt00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00600103(final String xml) {
        this();
        MxCamt00600103 tmp = parse(xml);
        camt00600103 = tmp.getCamt00600103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00600103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00600103 }
     *     
     */
    public Camt00600103 getCamt00600103() {
        return camt00600103;
    }

    /**
     * Sets the value of the camt00600103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00600103 }
     *     
     */
    public MxCamt00600103 setCamt00600103(Camt00600103 value) {
        this.camt00600103 = value;
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
    public static MxCamt00600103 parse(String xml) {
        return ((MxCamt00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00600103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00600103) parserImpl.read(MxCamt00600103 .class, xml, _classes));
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
     * Creates an MxCamt00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00600103 message
     * @return
     *     a new instance of MxCamt00600103
     */
    public final static MxCamt00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00600103 .class);
    }

}
