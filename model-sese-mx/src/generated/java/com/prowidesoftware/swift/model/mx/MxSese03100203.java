
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
 * Class for sese.031.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.031.002.03")
public class MxSese03100203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdvice002V03 sctiesSttlmCondModStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AutoBorrowing2Code.class, AutomaticBorrowing3Choice.class, DeniedReason4 .class, DeniedReason4Code.class, DeniedReason6Choice.class, DeniedStatus9Choice.class, DocumentNumber3Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification34 .class, HoldIndicator5 .class, Identification4 .class, LinkageType1Code.class, LinkageType2Choice.class, Linkages23 .class, MatchingDenied2Choice.class, MatchingProcess1Code.class, MxSese03100203 .class, NoReasonCode.class, PartyIdentification51Choice.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus24Choice.class, PriorityNumeric2Choice.class, ProcessingPosition1Code.class, ProcessingPosition4Choice.class, ProcessingStatus24Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, References13 .class, References31Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationReason4 .class, RejectionAndRepairReason16Choice.class, RejectionOrRepairReason16 .class, RejectionOrRepairStatus20Choice.class, RejectionReason27Code.class, RequestDetails9 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesSettlementConditionModificationStatusAdvice002V03 .class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.031.002.03";

    public MxSese03100203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100203(final String xml) {
        this();
        MxSese03100203 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdvice002V03 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdvice002V03 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdvice002V03 }
     *     
     */
    public MxSese03100203 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdvice002V03 value) {
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
    public static MxSese03100203 parse(String xml) {
        return ((MxSese03100203) MxReadImpl.parse(MxSese03100203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100203 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100203) parserImpl.read(MxSese03100203 .class, xml, _classes));
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
     * Creates an MxSese03100203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100203 message
     * @return
     *     a new instance of MxSese03100203
     */
    public final static MxSese03100203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100203 .class);
    }

}
