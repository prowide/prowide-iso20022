
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.014.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.014.002.06")
public class MxSemt01400206
    extends AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdvice002V06 intraPosMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, CancellationReason24 .class, CancellationReason37Choice.class, CancellationStatus25Choice.class, CancelledStatusReason16Code.class, DateAndDateTime2Choice.class, FailingReason10Choice.class, FailingReason3Code.class, FailingReason9 .class, FailingStatus11Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, IntraPositionDetails50 .class, IntraPositionMovementStatusAdvice002V06 .class, IntraPositionProcessingStatus8Choice.class, MxSemt01400206 .class, NoReasonCode.class, OtherIdentification2 .class, PartyIdentification136Choice.class, PendingReason10Code.class, PendingReason19 .class, PendingReason36Choice.class, PendingStatus45Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, RejectionAndRepairReason27Choice.class, RejectionOrRepairReason27 .class, RejectionOrRepairStatus33Choice.class, RejectionReason29Code.class, SecuritiesAccount30 .class, SecuritiesBalanceType11Choice.class, SecuritiesBalanceType13Code.class, SecurityIdentification20 .class, SettlementStatus20Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications34 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.014.002.06";

    public MxSemt01400206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400206(final String xml) {
        this();
        MxSemt01400206 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdvice002V06 }
     *     
     */
    public IntraPositionMovementStatusAdvice002V06 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdvice002V06 }
     *     
     */
    public MxSemt01400206 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdvice002V06 value) {
        this.intraPosMvmntStsAdvc = value;
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
    public static MxSemt01400206 parse(String xml) {
        return ((MxSemt01400206) MxReadImpl.parse(MxSemt01400206 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400206 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400206) parserImpl.read(MxSemt01400206 .class, xml, _classes));
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
     * Creates an MxSemt01400206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400206 message
     * @return
     *     a new instance of MxSemt01400206
     */
    public final static MxSemt01400206 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt01400206 .class);
    }

}
