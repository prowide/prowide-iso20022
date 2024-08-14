
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
 * Class for camt.081.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntModRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.081.001.02")
public class MxCamt08100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntModRpt", required = true)
    protected IntraBalanceMovementModificationReportV02 intraBalMvmntModRpt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 81;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DeniedReason11 .class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedStatus16Choice.class, DocumentIdentification51 .class, DocumentNumber5Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, EventFrequency7Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FinancialInstrumentQuantity1Choice.class, Frequency22Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IntraBalance5 .class, IntraBalanceModification7 .class, IntraBalanceModification8 .class, IntraBalanceMovementModificationReportV02 .class, IntraBalanceOrOperationalError12Choice.class, IntraBalanceReport5 .class, LinkageType1Code.class, LinkageType3Choice.class, Linkages57 .class, MovementResponseType1Code.class, MxCamt08100102 .class, NameAndAddress5 .class, NoReasonCode.class, Number3Choice.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PendingReason16 .class, PendingReason28Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, Period2 .class, Period7Choice.class, PostalAddress1 .class, PostalAddress27 .class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProcessingStatus71Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, References14 .class, References34Choice.class, RejectionAndRepairReason33Choice.class, RejectionAndRepairReason34Choice.class, RejectionOrRepairReason33 .class, RejectionOrRepairReason34 .class, RejectionOrRepairStatus39Choice.class, RejectionOrRepairStatus40Choice.class, RejectionReason34Code.class, RejectionReason35Code.class, RequestDetails22 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, UpdateType15Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.081.001.02";

    public MxCamt08100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08100102(final String xml) {
        this();
        MxCamt08100102 tmp = parse(xml);
        intraBalMvmntModRpt = tmp.getIntraBalMvmntModRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntModRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementModificationReportV02 }
     *     
     */
    public IntraBalanceMovementModificationReportV02 getIntraBalMvmntModRpt() {
        return intraBalMvmntModRpt;
    }

    /**
     * Sets the value of the intraBalMvmntModRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementModificationReportV02 }
     *     
     */
    public MxCamt08100102 setIntraBalMvmntModRpt(IntraBalanceMovementModificationReportV02 value) {
        this.intraBalMvmntModRpt = value;
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
    public static MxCamt08100102 parse(String xml) {
        return ((MxCamt08100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt08100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt08100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt08100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08100102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08100102) parserImpl.read(MxCamt08100102 .class, xml, _classes));
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
     * Creates an MxCamt08100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08100102 message
     * @return
     *     a new instance of MxCamt08100102
     */
    public static final MxCamt08100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08100102 .class);
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
