
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
 * Class for cbrf.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "qRordrgNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.008.001.01")
public class MxCbrf00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "QRordrgNtfctn", required = true)
    protected QueueReorderingNotificationV01 qRordrgNtfctn;
    public final static transient String BUSINESS_PROCESS = "cbrf";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, Amount3Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancelledStatusReason1Code.class, CashAccount25 .class, CashAccountAndEntry1 .class, CashAccountType2Choice.class, CashEntry1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, EntryStatus1Code.class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, FinalStatus1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader58 .class, LongPaymentIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader5 .class, MxCbrf00800101 .class, NamePrefix1Code.class, NumberAndSumOfTransactions2 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PaymentCommon2 .class, PaymentIdentification4Choice.class, PaymentInstruction14 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentStatus2 .class, PaymentStatusCode6Choice.class, PaymentStatusReasonCode6Choice.class, PaymentTransactionParty2 .class, PaymentType3Code.class, PaymentType4Choice.class, PendingFailingSettlement1Code.class, PendingSettlement2Code.class, PendingStatus4Code.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority1Code.class, PriorityCode3Choice.class, ProprietaryStatusJustification.class, QueueReorderingNotificationV01 .class, QueueTransactionIdentificationDetails.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnTransactionCopy1 .class, ShortPaymentIdentification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SuspendedStatusReason1Code.class, System1 .class, Transaction33 .class, TransactionOrError2Choice.class, TransactionReport2 .class, TransactionReportOrError2Choice.class, Transactions6 .class, UnmatchedStatusReason1Code.class };
    public final static transient String NAMESPACE = "urn:cbrf:xsd:cbrf.008.001.01";

    public MxCbrf00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00800101(final String xml) {
        this();
        MxCbrf00800101 tmp = parse(xml);
        qRordrgNtfctn = tmp.getQRordrgNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the qRordrgNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link QueueReorderingNotificationV01 }
     *     
     */
    public QueueReorderingNotificationV01 getQRordrgNtfctn() {
        return qRordrgNtfctn;
    }

    /**
     * Sets the value of the qRordrgNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueReorderingNotificationV01 }
     *     
     */
    public MxCbrf00800101 setQRordrgNtfctn(QueueReorderingNotificationV01 value) {
        this.qRordrgNtfctn = value;
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
    public static MxCbrf00800101 parse(String xml) {
        return ((MxCbrf00800101) MxReadImpl.parse(MxCbrf00800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00800101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00800101) parserImpl.read(MxCbrf00800101 .class, xml, _classes));
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
     * Creates an MxCbrf00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00800101 message
     * @return
     *     a new instance of MxCbrf00800101
     */
    public final static MxCbrf00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf00800101 .class);
    }

}
