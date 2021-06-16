
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
 * Class for semt.014.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.014.001.03")
public class MxSemt01400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdviceV03 intraPosMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus7Choice.class, AcknowledgementReason3 .class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, CancellationReason12Choice.class, CancellationReason5 .class, CancellationStatus7Choice.class, CancelledStatusReason13Code.class, DateAndDateTimeChoice.class, FailingReason3Code.class, FailingReason4 .class, FailingReason4Choice.class, FailingStatus4Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IntraPositionDetails19 .class, IntraPositionMovementStatusAdviceV03 .class, IntraPositionProcessingStatus3Choice.class, MxSemt01400103 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification36Choice.class, PendingReason10Code.class, PendingReason16Choice.class, PendingReason8 .class, PendingStatus12Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, RejectionAndRepairReason14Choice.class, RejectionOrRepairReason14 .class, RejectionOrRepairStatus15Choice.class, RejectionReason29Code.class, SecuritiesAccount13 .class, SecuritiesBalanceType13Code.class, SecuritiesBalanceType2Choice.class, SecurityIdentification14 .class, SettlementStatus9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications15 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.014.001.03";

    public MxSemt01400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400103(final String xml) {
        this();
        MxSemt01400103 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdviceV03 }
     *     
     */
    public IntraPositionMovementStatusAdviceV03 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdviceV03 }
     *     
     */
    public MxSemt01400103 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdviceV03 value) {
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
    public static MxSemt01400103 parse(String xml) {
        return ((MxSemt01400103) MxReadImpl.parse(MxSemt01400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400103) parserImpl.read(MxSemt01400103 .class, xml, _classes));
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
     * Creates an MxSemt01400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400103 message
     * @return
     *     a new instance of MxSemt01400103
     */
    public final static MxSemt01400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01400103 .class);
    }

}
