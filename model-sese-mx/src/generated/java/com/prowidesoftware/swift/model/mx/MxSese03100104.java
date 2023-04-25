
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
 * Class for sese.031.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.04")
public class MxSese03100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdviceV04 sctiesSttlmCondModStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus7Choice.class, AcknowledgementReason3 .class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, AutoBorrowing2Code.class, AutomaticBorrowing2Choice.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus6Choice.class, DocumentNumber1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, HoldIndicator4 .class, Identification1 .class, LinkageType1Choice.class, LinkageType1Code.class, Linkages27 .class, MatchingDenied1Choice.class, MatchingProcess1Code.class, MxSese03100104 .class, NoReasonCode.class, PartyIdentification36Choice.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason6Code.class, PendingStatus13Choice.class, PriorityNumeric1Choice.class, ProcessingPosition4Code.class, ProcessingPosition5Choice.class, ProcessingStatus18Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, References24Choice.class, References9 .class, Registration2Code.class, Registration7Choice.class, RegistrationReason3 .class, RejectionAndRepairReason13Choice.class, RejectionOrRepairReason13 .class, RejectionOrRepairStatus14Choice.class, RejectionReason27Code.class, RequestDetails11 .class, SecuritiesAccount13 .class, SecuritiesRTGS1Choice.class, SecuritiesSettlementConditionModificationStatusAdviceV04 .class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.04";

    public MxSese03100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100104(final String xml) {
        this();
        MxSese03100104 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV04 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV04 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV04 }
     *     
     */
    public MxSese03100104 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdviceV04 value) {
        this.sctiesSttlmCondModStsAdvc = value;
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
    public static MxSese03100104 parse(String xml) {
        return ((MxSese03100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100104 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100104) parserImpl.read(MxSese03100104 .class, xml, _classes));
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
     * Creates an MxSese03100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100104 message
     * @return
     *     a new instance of MxSese03100104
     */
    public static final MxSese03100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100104 .class);
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
