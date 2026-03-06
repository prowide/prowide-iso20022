
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
 * Class for semt.034.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT6semt.034.001.01")
public class MxSemt03400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPdgRpt", required = true)
    protected IntraPositionMovementPendingReportV01 intraPosMvmntPdgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 34;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice1 .class, CancellationReason19Choice1 .class, CancellationReason91 .class, CancellationStatus14Choice1 .class, CancelledStatusReason13Code.class, DateAndDateTime2Choice1 .class, DateAndDateTime2Choice2 .class, DocumentNumber5Choice1 .class, EventFrequency7Code1Draft.class, FailingReason3Code1 .class, FailingReason71 .class, FailingReason7Choice1 .class, FailingStatus9Choice1 .class, FinancialInstrumentQuantity1Choice1 .class, Frequency22Choice1Draft.class, GenericIdentification301Draft.class, GenericIdentification302Draft.class, GenericIdentification371 .class, IntraPositionMovementPendingReportV01 .class, IntraPositionPending71 .class, IntraPositionPending81 .class, IntraPositionReport71 .class, Linkages571Draft.class, Max4AlphaNumericTextFixed.class, Max4AlphaNumericTextFixed1 .class, MxSemt03400101 .class, NoReasonCode.class, Pagination1 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2 .class, PartyIdentification127Choice1 .class, PartyIdentification1361 .class, PartyIdentification1362 .class, PendingReason10Code1 .class, PendingReason141 .class, PendingReason26Choice1 .class, PendingStatus36Choice1 .class, PendingStatusAndReason21 .class, PriorityNumeric4Choice1 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice1 .class, ProcessingStatus66Choice1 .class, References34Choice1Draft.class, SecuritiesAccount191 .class, SecuritiesBalanceType11Code1 .class, SecuritiesBalanceType6Choice1Semt034Draft.class, SecuritiesSubBalanceTypeAndQuantityBreakdown31Draft.class, SecurityIdentification191 .class, SettlementStatus16Choice1 .class, StatementUpdateType1Code.class, SystemPartyIdentification81 .class, UpdateType15Choice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT6semt.034.001.01";

    public MxSemt03400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt03400101(final String xml) {
        this();
        MxSemt03400101 tmp = parse(xml);
        intraPosMvmntPdgRpt = tmp.getIntraPosMvmntPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt03400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPendingReportV01 }
     *     
     */
    public IntraPositionMovementPendingReportV01 getIntraPosMvmntPdgRpt() {
        return intraPosMvmntPdgRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPendingReportV01 }
     *     
     */
    public MxSemt03400101 setIntraPosMvmntPdgRpt(IntraPositionMovementPendingReportV01 value) {
        this.intraPosMvmntPdgRpt = value;
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
    public static MxSemt03400101 parse(String xml) {
        return ((MxSemt03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt03400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt03400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt03400101) parserImpl.read(MxSemt03400101 .class, xml, _classes));
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
     * Creates an MxSemt03400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt03400101 message
     * @return
     *     a new instance of MxSemt03400101
     */
    public static final MxSemt03400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt03400101 .class);
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
