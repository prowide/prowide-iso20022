
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
 * Class for sese.031.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.08")
public class MxSese03100108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdviceV08 sctiesSttlmCondModStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, AutoBorrowing2Code.class, AutomaticBorrowing7Choice.class, DeniedReason10 .class, DeniedReason15Choice.class, DeniedReason6Code.class, DeniedStatus15Choice.class, DocumentNumber5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, HoldIndicator6 .class, Identification14 .class, LinkageType1Code.class, LinkageType3Choice.class, Linkages53 .class, MatchingDenied3Choice.class, MatchingProcess1Code.class, MxSese03100108 .class, NoReasonCode.class, PartyIdentification127Choice.class, PartyIdentification144 .class, PendingReason16 .class, PendingReason28Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, PriorityNumeric4Choice.class, ProcessingPosition4Code.class, ProcessingPosition8Choice.class, ProcessingStatus50Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, References23 .class, References65Choice.class, Registration10Choice.class, Registration2Code.class, RegistrationReason5 .class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus31Choice.class, RejectionReason27Code.class, RequestDetails20 .class, RestrictionIdentification1 .class, RestrictionReference1Code.class, SecuritiesAccount19 .class, SecuritiesRTGS4Choice.class, SecuritiesSettlementConditionModificationStatusAdviceV08 .class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit3Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.08";

    public MxSese03100108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100108(final String xml) {
        this();
        MxSese03100108 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV08 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV08 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV08 }
     *     
     */
    public MxSese03100108 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdviceV08 value) {
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
    public static MxSese03100108 parse(String xml) {
        return ((MxSese03100108) MxReadImpl.parse(MxSese03100108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100108 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100108) parserImpl.read(MxSese03100108 .class, xml, _classes));
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
     * Creates an MxSese03100108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100108 message
     * @return
     *     a new instance of MxSese03100108
     */
    public final static MxSese03100108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100108 .class);
    }

}
