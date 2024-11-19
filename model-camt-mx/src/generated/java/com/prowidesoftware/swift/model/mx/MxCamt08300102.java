
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
 * Class for camt.083.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntCxlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.083.001.02")
public class MxCamt08300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntCxlRpt", required = true)
    protected IntraBalanceMovementCancellationReportV02 intraBalMvmntCxlRpt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 83;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason12 .class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CancellationReason10 .class, CancellationReason21Choice.class, CancellationStatus15Choice.class, CancelledStatusReason5Code.class, CashAccount40 .class, CashAccountType2Choice.class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DeniedReason11 .class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedStatus16Choice.class, DocumentIdentification51 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, EventFrequency7Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FinancialInstrumentQuantity1Choice.class, Frequency22Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IntraBalance5 .class, IntraBalanceCancellation7 .class, IntraBalanceCancellation8 .class, IntraBalanceMovementCancellationReportV02 .class, IntraBalanceOrOperationalError10Choice.class, IntraBalanceReport5 .class, MovementResponseType1Code.class, MxCamt08300102 .class, NameAndAddress5 .class, NoReasonCode.class, Number3Choice.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PendingReason17 .class, PendingReason30Choice.class, PendingReason9Code.class, PendingStatus39Choice.class, Period2 .class, Period7Choice.class, PostalAddress1 .class, PostalAddress27 .class, PriorityNumeric4Choice.class, ProcessingStatus69Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, References14 .class, RejectionAndRepairReason33Choice.class, RejectionOrRepairReason33 .class, RejectionOrRepairStatus39Choice.class, RejectionReason34Code.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, UpdateType15Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.083.001.02";

    public MxCamt08300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08300102(final String xml) {
        this();
        MxCamt08300102 tmp = parse(xml);
        intraBalMvmntCxlRpt = tmp.getIntraBalMvmntCxlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntCxlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementCancellationReportV02 }
     *     
     */
    public IntraBalanceMovementCancellationReportV02 getIntraBalMvmntCxlRpt() {
        return intraBalMvmntCxlRpt;
    }

    /**
     * Sets the value of the intraBalMvmntCxlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementCancellationReportV02 }
     *     
     */
    public MxCamt08300102 setIntraBalMvmntCxlRpt(IntraBalanceMovementCancellationReportV02 value) {
        this.intraBalMvmntCxlRpt = value;
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
    public static MxCamt08300102 parse(String xml) {
        return ((MxCamt08300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt08300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt08300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08300102) parserImpl.read(MxCamt08300102 .class, xml, _classes));
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
     * Creates an MxCamt08300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08300102 message
     * @return
     *     a new instance of MxCamt08300102
     */
    public static final MxCamt08300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08300102 .class);
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
