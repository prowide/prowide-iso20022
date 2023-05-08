
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
 * Class for reda.058.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stgSttlmInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.058.001.01")
public class MxReda05800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StgSttlmInstrStsAdvc", required = true)
    protected StandingSettlementInstructionStatusAdviceV01 stgSttlmInstrStsAdvc;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 58;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptedReason7Choice.class, AcceptedReason8Choice.class, AcceptedStatusReason7 .class, AccountIdentification26 .class, AddressType2Code.class, ClassificationType1Choice.class, EffectiveDate1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketIdentification87 .class, MarketIdentificationOrCashPurpose1Choice.class, MxReda05800101 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification63 .class, PartyIdentification75Choice.class, PartyOrCurrency1Choice.class, PendingProcessingReason8Choice.class, PendingProcessingReason9Choice.class, PendingProcessingStatusReason1 .class, PostalAddress1 .class, ProcessingStatus43Choice.class, ProprietaryReason1Choice.class, ProprietaryStatusAndReason5 .class, Purpose3Choice.class, ReceivedReason1Choice.class, ReceivedReason2Choice.class, ReceivedStatusReason1 .class, RejectedReason7Choice.class, RejectedReason8Choice.class, RejectedStatusReason12 .class, SimpleIdentificationInformation4 .class, StandingSettlementInstructionStatusAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.058.001.01";

    public MxReda05800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda05800101(final String xml) {
        this();
        MxReda05800101 tmp = parse(xml);
        stgSttlmInstrStsAdvc = tmp.getStgSttlmInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda05800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stgSttlmInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstructionStatusAdviceV01 }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 getStgSttlmInstrStsAdvc() {
        return stgSttlmInstrStsAdvc;
    }

    /**
     * Sets the value of the stgSttlmInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstructionStatusAdviceV01 }
     *     
     */
    public MxReda05800101 setStgSttlmInstrStsAdvc(StandingSettlementInstructionStatusAdviceV01 value) {
        this.stgSttlmInstrStsAdvc = value;
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
    public static MxReda05800101 parse(String xml) {
        return ((MxReda05800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda05800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda05800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda05800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda05800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda05800101 parse(String xml, MxRead parserImpl) {
        return ((MxReda05800101) parserImpl.read(MxReda05800101 .class, xml, _classes));
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
     * Creates an MxReda05800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda05800101 message
     * @return
     *     a new instance of MxReda05800101
     */
    public static final MxReda05800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda05800101 .class);
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
