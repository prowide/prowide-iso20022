
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
 * Class for semt.014.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.014.002.05")
public class MxSemt01400205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdvice002V05 intraPosMvmntStsAdvc;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, CancellationReason14 .class, CancellationReason24Choice.class, CancellationStatus17Choice.class, CancelledStatusReason13Code.class, DateAndDateTimeChoice.class, FailingReason10Choice.class, FailingReason3Code.class, FailingReason9 .class, FailingStatus11Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, IdentificationSource4Choice.class, IntraPositionDetails42 .class, IntraPositionMovementStatusAdvice002V05 .class, IntraPositionProcessingStatus6Choice.class, MxSemt01400205 .class, NoReasonCode.class, OtherIdentification2 .class, PartyIdentification103Choice.class, PendingReason10Code.class, PendingReason19 .class, PendingReason36Choice.class, PendingStatus45Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, RejectionAndRepairReason27Choice.class, RejectionOrRepairReason27 .class, RejectionOrRepairStatus33Choice.class, RejectionReason29Code.class, SecuritiesAccount30 .class, SecuritiesBalanceType11Choice.class, SecuritiesBalanceType13Code.class, SecurityIdentification20 .class, SettlementStatus20Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications34 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.014.002.05";

    public MxSemt01400205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400205(final String xml) {
        this();
        MxSemt01400205 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdvice002V05 }
     *     
     */
    public IntraPositionMovementStatusAdvice002V05 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdvice002V05 }
     *     
     */
    public MxSemt01400205 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdvice002V05 value) {
        this.intraPosMvmntStsAdvc = value;
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
    public static MxSemt01400205 parse(String xml) {
        return ((MxSemt01400205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01400205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01400205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01400205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01400205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400205 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400205) parserImpl.read(MxSemt01400205 .class, xml, _classes));
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
     * Creates an MxSemt01400205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400205 message
     * @return
     *     a new instance of MxSemt01400205
     */
    public static final MxSemt01400205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01400205 .class);
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
