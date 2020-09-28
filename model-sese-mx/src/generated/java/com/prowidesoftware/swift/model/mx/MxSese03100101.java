
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
 * Class for sese.031.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.01")
public class MxSese03100101
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdviceV01 sctiesSttlmCondModStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus3Choice.class, AcknowledgementReason3 .class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, AddressType2Code.class, AutoBorrowing2Code.class, AutomaticBorrowing2Choice.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus2Choice.class, DocumentIdentification11 .class, DocumentNumber1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, LinkageType1Choice.class, LinkageType1Code.class, Linkages3 .class, MatchingDenied1Choice.class, MatchingProcess1Code.class, MxSese03100101 .class, NameAndAddress5 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason6Code.class, PendingStatus4Choice.class, PostalAddress1 .class, PriorityNumeric1Choice.class, ProcessingPosition1Code.class, ProcessingPosition2Choice.class, ProcessingStatus5Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, References1 .class, References6Choice.class, RejectionAndRepairReason3Choice.class, RejectionOrRepairReason3 .class, RejectionOrRepairStatus4Choice.class, RejectionReason23Code.class, RequestDetails1 .class, SecuritiesAccount13 .class, SecuritiesRTGS1Choice.class, SecuritiesSettlementConditionModificationStatusAdviceV01 .class, SecuritiesTransactionType5Code.class, UnilateralSplit1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.01";

    public MxSese03100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100101(final String xml) {
        this();
        MxSese03100101 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV01 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV01 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV01 }
     *     
     */
    public MxSese03100101 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdviceV01 value) {
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
    public static MxSese03100101 parse(String xml) {
        return ((MxSese03100101) MxReadImpl.parse(MxSese03100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100101 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100101) parserImpl.read(MxSese03100101 .class, xml, _classes));
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
     * Creates an MxSese03100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100101 message
     * @return
     *     a new instance of MxSese03100101
     */
    public final static MxSese03100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese03100101 .class);
    }

}
