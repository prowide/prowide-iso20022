
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
 * Class for camt.098.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "audtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT3camt.098.001.01")
public class MxCamt09800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AudtTrlRpt", required = true)
    protected AuditTrailReportV01 audtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 98;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AuditTrail4 .class, AuditTrailApprovalStatus2 .class, AuditTrailBusinessItem2Choice.class, AuditTrailOrBusinessError5Choice.class, AuditTrailProcessingStatus1Choice.class, AuditTrailReport2 .class, AuditTrailReportOrError2Choice.class, AuditTrailReportV01 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditLineAuditTrail1 .class, CreditLineType1Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, LimitAuditTrail2 .class, LimitStatus1Choice.class, LimitStatus1Code.class, LimitType1Choice.class, LimitType3Code.class, MarketInfrastructureIdentification1Choice.class, MessageHeader11 .class, MxCamt09800101 .class, NoReasonCode.class, OriginalBusinessQuery1 .class, PaymentIdentification9 .class, PostalAddress24 .class, Priority1Choice.class, Priority5Code.class, RequestType4Choice.class, ReservationAuditTrail2 .class, ReservationStatus1Choice.class, ReservationStatus1Code.class, ReservationType1Choice.class, ReservationType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class, TransactionAuditTrail2 .class, UpdateLogActiveAmount1 .class, UpdateLogAmount1Choice.class, UpdateLogCreditLineType1 .class, UpdateLogDate1 .class, UpdateLogDateTime1 .class, UpdateLogDateTime1Choice.class, UpdateLogImpliedAmount1 .class, UpdateLogLimitStatus1 .class, UpdateLogProprietary1 .class, UpdateLogQueuePosition1 .class, UpdateLogReservationStatus1 .class, UpdateLogSettlementTimeRequest1 .class, UpdateLogTime1 .class, UpdateLogTransactionPriority1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT3camt.098.001.01";

    public MxCamt09800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt09800101(final String xml) {
        this();
        MxCamt09800101 tmp = parse(xml);
        audtTrlRpt = tmp.getAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt09800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the audtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailReportV01 }
     *     
     */
    public AuditTrailReportV01 getAudtTrlRpt() {
        return audtTrlRpt;
    }

    /**
     * Sets the value of the audtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailReportV01 }
     *     
     */
    public MxCamt09800101 setAudtTrlRpt(AuditTrailReportV01 value) {
        this.audtTrlRpt = value;
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
    public static MxCamt09800101 parse(String xml) {
        return ((MxCamt09800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt09800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt09800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt09800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt09800101) parserImpl.read(MxCamt09800101 .class, xml, _classes));
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
     * Creates an MxCamt09800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt09800101 message
     * @return
     *     a new instance of MxCamt09800101
     */
    public final static MxCamt09800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt09800101 .class);
    }

}
