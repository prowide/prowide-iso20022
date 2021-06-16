
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
 * Class for semt.014.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.014.002.01")
public class MxSemt01400201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdvice002V01 intraPosMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus6Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AlternateIdentification2 .class, CancellationReason4 .class, CancellationReason8Choice.class, CancellationStatus6Choice.class, CancelledStatusReason9Code.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification16 .class, Extension2 .class, ExtensionEnvelope1 .class, FailingReason1Code.class, FailingReason2 .class, FailingReason2Choice.class, FailingStatus2Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, IdentificationSource2Choice.class, IntraPositionDetails5 .class, IntraPositionMovementStatusAdvice002V01 .class, IntraPositionProcessingStatus2Choice.class, MxSemt01400201 .class, NameAndAddress12 .class, NoReasonCode.class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, PendingReason10Choice.class, PendingReason1Code.class, PendingReason4 .class, PendingStatus8Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason8Choice.class, RejectionOrRepairReason8 .class, RejectionOrRepairStatus3Choice.class, RejectionReason22Code.class, SecuritiesAccount17 .class, SecuritiesBalanceType13Code.class, SecuritiesBalanceType4Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementStatus4Choice.class, TransactionIdentifications5 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.014.002.01";

    public MxSemt01400201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400201(final String xml) {
        this();
        MxSemt01400201 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdvice002V01 }
     *     
     */
    public IntraPositionMovementStatusAdvice002V01 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdvice002V01 }
     *     
     */
    public MxSemt01400201 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdvice002V01 value) {
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
    public static MxSemt01400201 parse(String xml) {
        return ((MxSemt01400201) MxReadImpl.parse(MxSemt01400201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400201) parserImpl.read(MxSemt01400201 .class, xml, _classes));
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
     * Creates an MxSemt01400201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400201 message
     * @return
     *     a new instance of MxSemt01400201
     */
    public final static MxSemt01400201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01400201 .class);
    }

}
