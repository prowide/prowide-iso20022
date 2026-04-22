
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
 * Class for semt.014.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.014.001.09")
public class MxSemt01400109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdviceV09 intraPosMvmntStsAdvc;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus34Choice.class, AcknowledgementReason11Code.class, AcknowledgementReason22 .class, AcknowledgementReason25Choice.class, BlockChainAddressWallet3 .class, CancellationReason22 .class, CancellationReason36Choice.class, CancellationStatus24Choice.class, CancelledStatusReason16Code.class, DateAndDateTime2Choice.class, FailingReason15 .class, FailingReason20Choice.class, FailingReason6Code.class, FailingStatus17Choice.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IntraPositionDetails60 .class, IntraPositionMovementStatusAdviceV09 .class, IntraPositionProcessingStatus11Choice.class, Linkages75 .class, MxSemt01400109 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification127Choice.class, PendingReason31Code.class, PendingReason34 .class, PendingReason75Choice.class, PendingStatus79Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectionAndRepairReason36Choice.class, RejectionOrRepairReason36 .class, RejectionOrRepairStatus41Choice.class, RejectionReason69Code.class, SecuritiesAccount19 .class, SecuritiesBalanceType13Code.class, SecuritiesBalanceType7Choice.class, SecurityIdentification19 .class, SettlementStatus34Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications29 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.014.001.09";

    public MxSemt01400109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400109(final String xml) {
        this();
        MxSemt01400109 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdviceV09 }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdviceV09 }
     *     
     */
    public MxSemt01400109 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdviceV09 value) {
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
    public static MxSemt01400109 parse(String xml) {
        return ((MxSemt01400109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01400109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01400109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01400109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01400109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400109 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400109) parserImpl.read(MxSemt01400109 .class, xml, _classes));
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
     * Creates an MxSemt01400109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400109 message
     * @return
     *     a new instance of MxSemt01400109
     */
    public static final MxSemt01400109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01400109 .class);
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
