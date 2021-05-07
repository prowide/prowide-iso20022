
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
 * Class for sese.031.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.07")
public class MxSese03100107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdviceV07 sctiesSttlmCondModStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, AutoBorrowing2Code.class, AutomaticBorrowing7Choice.class, DeniedReason10 .class, DeniedReason15Choice.class, DeniedReason6Code.class, DeniedStatus15Choice.class, DocumentNumber5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, HoldIndicator6 .class, Identification14 .class, LinkageType1Code.class, LinkageType3Choice.class, Linkages39 .class, MatchingDenied3Choice.class, MatchingProcess1Code.class, MxSese03100107 .class, NoReasonCode.class, PartyIdentification92Choice.class, PartyIdentification98 .class, PendingReason16 .class, PendingReason28Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, PriorityNumeric4Choice.class, ProcessingPosition4Code.class, ProcessingPosition8Choice.class, ProcessingStatus50Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, References18 .class, References46Choice.class, Registration10Choice.class, Registration2Code.class, RegistrationReason5 .class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus31Choice.class, RejectionReason27Code.class, RequestDetails15 .class, SecuritiesAccount19 .class, SecuritiesRTGS4Choice.class, SecuritiesSettlementConditionModificationStatusAdviceV07 .class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit3Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.07";

    public MxSese03100107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100107(final String xml) {
        this();
        MxSese03100107 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV07 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV07 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV07 }
     *     
     */
    public MxSese03100107 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdviceV07 value) {
        this.sctiesSttlmCondModStsAdvc = value;
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
    public static MxSese03100107 parse(String xml) {
        return ((MxSese03100107) MxReadImpl.parse(MxSese03100107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100107 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100107) parserImpl.read(MxSese03100107 .class, xml, _classes));
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
     * Creates an MxSese03100107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100107 message
     * @return
     *     a new instance of MxSese03100107
     */
    public final static MxSese03100107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100107 .class);
    }

}
